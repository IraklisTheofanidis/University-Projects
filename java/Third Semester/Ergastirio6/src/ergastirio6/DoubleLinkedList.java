/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio6;

/**
 *
 * @author Lalik
 */
public class DoubleLinkedList implements List{
    private DoubleNode firstNode, lastNode;
    private int size;
    
    public DoubleLinkedList( ) {
        firstNode = lastNode = null;
        size = 0;
    }
    public DoubleNode getFirst( ) {
        return firstNode;
    }
    public DoubleNode getLast( ) {
        return lastNode;
    }
    public boolean isEmpty( ) {
        return(firstNode == null);
    }
    public int size( ) {
        return size;
    }
    public void insertFirst(Object newItem) {
        if (isEmpty( ))
            firstNode = lastNode = new DoubleNode(newItem, null, null);
        else {
            DoubleNode B = new DoubleNode(newItem, firstNode, null);
            firstNode.setPrevious(B);
            firstNode = B;
        }
        size++;
    }
    public void insertLast(Object newItem) {
        if (isEmpty( ))
            firstNode = lastNode = new DoubleNode(newItem, null, null);
        else {
            DoubleNode B = new DoubleNode(newItem, null, lastNode);
            lastNode.setNext(B);
            lastNode = B;
        }
        size++;
    }
    
    public Object removeFirst( ) throws ListEmptyException
    {
        Object removeItem;
        if (isEmpty( ))
            throw new ListEmptyException("Empty List!!!");
        removeItem = firstNode.getItem( );
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else {
            DoubleNode B = firstNode.getNext( );
            firstNode.setNext(null); //χρειάζεται?
            B.setPrevious(null);
            firstNode = B;
    }
    size--;
    return removeItem;
    }

    public Object removeLast( ) throws ListEmptyException
    {
        Object removeItem;
        if (isEmpty( ))
            throw new ListEmptyException("Empty List!!!");
        removeItem = lastNode.getItem();
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else {
            DoubleNode B = lastNode.getPrevious( );
            lastNode.setPrevious(null); //?
            B.setNext(null);
            lastNode = B;
    }
    size--;
    return removeItem;
    }
    
    
    public void printList() throws ListEmptyException{
		if(isEmpty())
			throw new ListEmptyException("List is Empty.");
		for(DoubleNode position = firstNode; position != null; position = position.getNext())
			System.out.println(position.getItem());
	}

    @Override
    public void insert(int position, Object data) throws NoSuchListPosition {
      // eisagwgi stoixeiou se n thesi
        if(position< 0 || position> size())
        {
            throw new NoSuchListPosition("Den exei tetoio position auti i lista");
        }
         else if(position==0)
        {
            insertFirst(data);
        }
         else if(position==size())
        {
            insertLast(data);
        }
        else
        {
          DoubleNode nNode=new DoubleNode (data,null,null);  
          DoubleNode current = firstNode;
          for(int i=1;i < position; i++)
          {
             current= current.getNext();
           }

          nNode.setPrevious(current);
          nNode.setNext(current.getNext());
          current.getNext().setPrevious(nNode);
          current.setNext(nNode);
          size++;
    
    }
  }

    @Override
    public Object remove(int position) throws ListEmptyException, NoSuchListPosition {
        //diagrafi stoixeio se n thesi
        
    Object temp;
    if(position< 0 || position>=size())
    {
        throw new NoSuchListPosition("Den exei tetoio position auti i lista");
    }
     else if(position==0)
    {
        temp = removeFirst();


    }
     else if(position==size()-1)
    {
        temp = removeLast();
    }
    else
     {
        DoubleNode current = firstNode;
        for(int i=1;i < position; i++)
        {
            
            
         current= current.getNext();
         
        }  
               temp = current.getNext().getItem();
               current.getNext().getNext().setPrevious(current);
              current.setNext(current.getNext().getNext());
              size--;
      }
    
    return temp;
    }
}

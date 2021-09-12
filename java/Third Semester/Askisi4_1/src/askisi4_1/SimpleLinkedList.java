/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi4_1;

/**
 *
 * @author Lalik
 */
public class SimpleLinkedList implements List
{
    private SLListNode firstNode, lastNode;

    public SimpleLinkedList() {
        firstNode = lastNode = null;
    }
    

    public SLListNode getFirstNode() {
        return firstNode;
    }

    public SLListNode getLastNode() {
        return lastNode;
    }
    
    @Override
    public boolean isEmpty() {
        return(firstNode == null);
    }
    
    public int size() {
		int size = 0;
		for(SLListNode position = firstNode; position != null; position = position.getNextNode())
			size++;
		return size;
	}

    
    @Override
    public void insertFirst(Object newItem) {
        if(isEmpty( ))
            firstNode = lastNode = new SLListNode(newItem, null);
        else
            firstNode = new SLListNode(newItem, firstNode);
    }
    
    @Override
    public void insertLast(Object newItem) {
        if(isEmpty())
            firstNode = lastNode = new SLListNode(newItem, null);
        else
            lastNode.setNextNode(new SLListNode(newItem, null));
            lastNode = lastNode.getNextNode();
    }
    @Override
    public Object removeFirst() throws ListEmptyException
    {
        
        if (isEmpty( ))
                throw new ListEmptyException("Empty List!!!");
      Object removeItem= firstNode.getData();
       if(firstNode== lastNode) 
            firstNode= lastNode= null;
        else
            firstNode= firstNode.getNextNode();
       return removeItem;
    }
    
    @Override
    public Object removeLast() throws ListEmptyException
    {
        if (isEmpty( ))
                throw new ListEmptyException("Empty List!!!");
       Object removeItem= lastNode.getData(); 
       if(firstNode== lastNode)
            firstNode= lastNode= null;
       else
        {
            SLListNode current = firstNode;
            while(current.getNextNode()!= lastNode)
                current = current.getNextNode();
            lastNode= current;
            current.setNextNode(null);
            current = current.getNextNode();
        }
        return removeItem;
    }
    
    public void printList() throws ListEmptyException{
		if(isEmpty())
			throw new ListEmptyException("List is Empty.");
		for(SLListNode position = firstNode; position != null; position = position.getNextNode())
			System.out.println(position.getData());
	}
   
}

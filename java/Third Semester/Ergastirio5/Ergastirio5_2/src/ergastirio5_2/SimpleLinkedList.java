/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio5_2;

/**
 *
 * @author Lalik
 */
public class SimpleLinkedList implements List {
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
    
    public boolean isEmpty( ) {
        return(firstNode == null);
    }
    
     public int size() {
		int size = 0;
		for(SLListNode position = firstNode; position != null; position = position.getNextNode())
			size++;
		return size;
	}
    
    public void insertFirst(Object newItem) {
        if(isEmpty( ))
            firstNode = lastNode = new SLListNode(newItem, null);
        else
            firstNode = new SLListNode(newItem, firstNode);
    }
    
    public void insertLast(Object newItem) {
        if(isEmpty())
            firstNode = lastNode = new SLListNode(newItem, null);
        else
        {
            SLListNode temp = new SLListNode(newItem, null);
            lastNode.setNextNode(temp);
            lastNode = temp;
        }
    }
    public Object removeFirst() 
    {
      if(isEmpty())
          throw new ListEmptyException("Empty List");
         
        Object removeItem= firstNode.getData();
       if(firstNode== lastNode) 
            firstNode= lastNode= null;
        else
            firstNode= firstNode.getNextNode();
       return removeItem;
    }
    
    public Object removeLast()
    {
        
        if(isEmpty())
        {
            throw new ListEmptyException("Empty List");
        }
                
                
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
}

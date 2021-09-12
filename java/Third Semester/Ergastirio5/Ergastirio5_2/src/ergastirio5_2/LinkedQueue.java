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
public class LinkedQueue implements Queue {
    private SimpleLinkedList Q;
    public LinkedQueue() {
        Q=new SimpleLinkedList();
    }
    public int size() {
        return Q.size();
    }
    public boolean isEmpty() {
        return Q.isEmpty();
    }
    public Object front() throws QueueEmptyException {
        try {
            Object frontObject = Q.removeLast();
            Q.insertLast(frontObject);
            return frontObject; 
        }
        catch (ListEmptyException e) {
            throw new QueueEmptyException("Queue is Empty.");
        }           
    }
    
   public void enqueue(Object item)  throws QueueFullException {
           Q.insertLast(item);
    }
   
  
   
    public Object dequeue() throws QueueEmptyException {
        try {
            return Q.removeFirst();
        }
        catch (ListEmptyException e) {
            throw new QueueEmptyException("Queue is Empty.");
        }
    }

   
}
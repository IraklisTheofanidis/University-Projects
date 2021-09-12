/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi3_2;

/**
 *
 * @author Lalik
 */
public interface Queue 
{
    public int size();

    public boolean isEmpty();

    //public boolean isFull();
    
    // Returns the first element of the queue
    public Object front() throws QueueEmptyException;


    // Adds an element at the end of the queue
    public void enqueue(Object item)  throws QueueFullException;


    // Removes and returns the first element of the queue
    public Object dequeue() throws QueueEmptyException;
}

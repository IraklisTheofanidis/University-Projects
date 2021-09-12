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
public class ArrayQueue implements Queue
{
    private int capacity;
    private Object[] Q;
    private int first=0;
    private int last=0;
    public ArrayQueue(int cap)
    {
        capacity=cap;
        Q=new Object[capacity];
    }
    
    public int size()
    {
        return (last-first);
    }
    
    @Override
    public boolean isEmpty()
    {
        return (first==last);
    }
    
    @Override
    public Object front() throws QueueEmptyException
    {
      if(isEmpty())
      {
          throw new QueueEmptyException("Queue is empty");
      }
      else
      {
            return Q[first];
      }
    }
    
    @Override
    public void enqueue(Object item) throws QueueFullException
    {
        if (last == capacity) /* Εικονική Υπερχείλιση?? */
	{
            throw new QueueFullException("Queue overflow");
	}
        else
	{
		Q[last++]=  item;  //(Student)
	}
    }

    @Override
    public Object dequeue() throws QueueEmptyException
    {
       Object item;
	if (isEmpty())
	{
            throw new QueueEmptyException("Queue is empty");
	}
	else
	{
        	item=Q[first];
		Q[first++]=null;
		return item;
	}
    }
    
    public void parousiologio()
    {
        for(int i=0; i<Q.length; i++)
	{
            System.out.println(Q[i]);
	}
    }
    
    
}

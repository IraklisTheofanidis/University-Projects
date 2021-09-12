/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio5_1;

/**
 *
 * @author Lalik
 */
public class LinkedStack implements Stack {
    private SimpleLinkedList S;
    
    public LinkedStack()
    {
        S = new SimpleLinkedList();
    }
    public int size() {
        return S.size();
        }

    public boolean isEmpty() {
        return S.isEmpty();
    }   
    
     public boolean isFull(){
        return false;
    }
    
    

    public Object top( ) throws stackEmptyException{
        if (S.isEmpty())
            throw new stackEmptyException("Empty Stack!");
        Object temp = S.removeFirst();
        S.insertFirst(temp);
        return temp;
    }
    
    public void push(Object item) throws stackFullException {
        S.insertFirst(item);
    }
    
    public Object pop( ) throws stackEmptyException {
        try 
        {
            return S.removeFirst();
        }
        catch (ListEmptyException str) {
            throw new stackEmptyException("EmptyStack");
        }
    }

   

    

    
}

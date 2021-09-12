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
public interface Stack {
    // Returns the size of the Stack
	public int size();

	// Returns true if the Stack is empty
	public boolean isEmpty();

	// Returns true if the Stack is full
	public boolean isFull();

	// Returns the top item of the Stack
	public Object top() throws stackEmptyException;

	// Adds a new item into the Stack
	public void push(Object item) throws stackFullException;

	// Removes the top item of the Stack
	public Object pop() throws stackEmptyException;
}

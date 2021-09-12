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
public interface List {
    public boolean isEmpty( );
    public int size( );
    public void insertFirst(Object data);
    public void insertLast(Object data);
    public Object removeFirst( ) throws ListEmptyException;
    public Object removeLast( ) throws ListEmptyException;
}

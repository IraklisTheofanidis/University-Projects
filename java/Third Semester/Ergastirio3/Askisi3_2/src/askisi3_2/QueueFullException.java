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
public class QueueFullException extends  RuntimeException{
    public QueueFullException(String err)
	{
		super(err);
	}
}

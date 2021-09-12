package ergastirio6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lalik
 */
public class ListEmptyException extends RuntimeException {
    public ListEmptyException(String err)
	{
		super(err);
	}
}

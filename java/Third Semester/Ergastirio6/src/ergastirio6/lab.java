/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio6;

/**
 *
 * @author Lalik
 */
public class lab {
    private String name;
    private DoubleLinkedList lab;
    
    public boolean foundDoubleLab(Student S[])
    {
        int size=lab.size();
        for(int i=0;i<size;i++)
        {
            Student st = (Student)lab.removeFirst();
            lab.insertLast(st);
            if(S[i].getArithmos_mitroou()==st.getArithmos_mitroou())
			return true;
            
        }
        return false;
        
        
        
    }
}

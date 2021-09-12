/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klironomikotita;

/**
 *
 * @author Lalik
 */
public class Subclass1 extends Superclass1
{
    String name = "Roulis";
    public void display()
    {
        System.out.println("Ypoklasi "+name);
    }
    public void A_method()
    {
        Subclass1 s = new Subclass1();
        s.display();
        super.display();
        System.out.println("Ypoklasi: To onoma= "+ s.name);
        System.out.println("Ypoklasi xrisi tis super: To onoma= "+ super.name); 
    }
    public static void main(String args[])
    {
    Subclass1 obj = new Subclass1();
    obj.A_method();
    }
}


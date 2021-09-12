/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package klironomikotita;

public class Superclass 
{
    String Gender;
    int age;
    public Superclass(String g,int a)
    {
        Gender =g ;
        age = a;
    }
    public void getGenderAndAge()
    {
        System.out.println("uperklasi: To genos = " + Gender +"H ilikia= " + age);
    }
}

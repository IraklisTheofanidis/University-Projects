/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Errikos
 */
public class bird implements iBird {

    int age;
    double weight;
    
    public bird(double weight,int age){
        this.age=age;
        this.weight=weight;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public int getAge(){
        return age;
    }
 
    @Override
    public void chirp() {
        System.out.println("Chirp...");
    }

    @Override
    public void fly() {
        System.out.println("Fly...High....");
    }

     public String toString(){
        return "===Bird==="+
                "\nWeight : "+weight+
                "\nAge : "+age;
    }
}


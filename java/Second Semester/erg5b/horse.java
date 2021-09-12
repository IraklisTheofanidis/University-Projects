/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Errikos
 */
public class horse {
    
    double weight;
    int age;
    
    public horse(double weight,int age){
        this.weight=weight;
        this.age=age;
    }
    
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
    public void whinny(){
        System.out.println("Whinyyy...");
    }
    
    public void gallop(){
        System.out.println("Gallop...");
    }
    
    public String toString(){
        return "===Horse==="+
                "\nWeight : "+weight+
                "\nAge : "+age;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Errikos
 */
public class pegasus extends horse implements iBird {
    

    
    public pegasus(double weight,int age){
        super(weight,age);
    }

   
  
    @Override
    public void gallop() {
        super.gallop(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void whinny() {
        super.whinny(); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
    //public void chirp() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    @Override
    public void fly() {
        System.out.println("Fly... High...");
    }
    
    public String toString(){
         return "===Pegasus==="+
                "\nWeight : "+weight+
                "\nAge : "+age; 
    }

    @Override
    public void chirp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

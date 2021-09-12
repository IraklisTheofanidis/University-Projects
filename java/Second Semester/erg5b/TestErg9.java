/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Errikos
 */
public class TestErg9 {
    
    public static void main(String args[]){
        
        horse ranch[]=new horse[4];
        bird aviary[]=new bird[4];
   
        
         for (int i = 0; i < ranch.length; i++) {
            if (i < (int) (ranch.length * 0.5))
                ranch[i] = new horse(30,10);

            else if (i >= (int) (ranch.length * 0.5) )
                ranch[i] = new pegasus(10, 10);
          //  else
            //    ranch[i] = new pegasus(20, 10);
        }
        
         for (int i=0;i<ranch.length;i++){
             System.out.println(ranch[i].toString());
             
             if(ranch[i] instanceof horse){
                 ranch[i].gallop();
                 ranch[i].whinny();
             }
             if(ranch[i] instanceof pegasus){
                 ((pegasus)ranch[i]).fly();
             }
         }
         
         
         for (int i=0; i<aviary.length;i++){
              //if (i<(int)(aviary.length*0.5))  
                  aviary[i]=new bird(20,39);

              
             }    
         
         for (int i=0; i<aviary.length;i++){
             System.out.println(aviary[i].toString());   
             aviary[i].fly();
             aviary[i].chirp();}
   
    
     
  
     
     
     
          
     
  
  
   
   
   
}
    
}

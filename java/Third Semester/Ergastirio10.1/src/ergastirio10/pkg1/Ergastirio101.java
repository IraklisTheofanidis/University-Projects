/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio10.pkg1;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Lalik
 */
public class Ergastirio101 {

   public static int hash(int am){
        int hashcode;
        hashcode= ((am-12001)*64);
        
        return hashcode;
    }
    public static void main(String[] args) {
        try
        {
            RandomAccessFile FT1out = new RandomAccessFile("DOMES","rw");
            for(int i=0;i<20;i++)
            {
                FileStudent S = new FileStudent(12001+i,"","");
                S.write(FT1out);    
            }
            
          //auto einai i emfanisi ton 20 eggrafwn pou den to zitouse 
             for(int i = 0; i < 20; i++)
            {
                FileStudent S = new FileStudent(12001+i,"","");
                   FT1out.seek(hash(12001+i));
                   S.read(FT1out);
                   System.out.println(S.toString());
            }
            
            FT1out.close();
            
             RandomAccessFile FT1 = new RandomAccessFile("DOMES","rw");
             FileStudent S1 = new FileStudent(12004,"iraklis","theofanidis");
             FT1.seek(hash(12004));
            
             S1.write(FT1);
             
             FileStudent S2 = new FileStudent(12002,"errikos","kaltsopoulos");
             FT1.seek(hash(12002));
             S2.write(FT1);
             
             
             FileStudent S = new FileStudent();
             FT1.seek(hash(12004));
             S.read(FT1);
             System.out.println(S.toString());
             FT1.seek(hash(12002));
             S.read(FT1);
             
             System.out.println(S.toString());
         }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}

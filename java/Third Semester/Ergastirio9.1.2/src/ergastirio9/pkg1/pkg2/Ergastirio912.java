/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio9.pkg1.pkg2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Lalik
 */


//taksinomisi otan leei stin ekfonisi ennoouse na einai idi etima taksinomimena stous pinakes....
//stin ousia apla ithele na valw ta stoixeia tou prwtou kai tou deuterou pinaka se enan trito.. (IPOTHETW)

public class Ergastirio912 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] data = {443,488,777,566,844,3355,63,25,74,22,77,55,11,41};
        int[] data2 = {333,555,222,332,33333,55555,66666,234234};
        
        try
        {
             FileOutputStream file = new FileOutputStream("onoma");
             BufferedOutputStream b = new BufferedOutputStream(file);
             DataOutputStream d = new DataOutputStream(b);
             FileOutputStream file2 = new FileOutputStream("onoma2");
             BufferedOutputStream b2 = new BufferedOutputStream(file2);
             DataOutputStream d2 = new DataOutputStream(b2);
             
             for(int i=0;i<data.length;i++)
             {
                 d.writeInt(data[i]);
             
               
             }
              for(int i=0;i<data2.length;i++)
             {
                 d2.writeInt(data2[i]);
             }
             
             
             
             d.close();
            d2.close();
                
        }
        catch(IOException e)
        {
            System.out.print("Error--" +e.toString());
        }
               
       
        try{
            FileInputStream file = new FileInputStream("onoma");
             BufferedInputStream b = new BufferedInputStream(file);
             DataInputStream d = new DataInputStream(b);
              FileInputStream file2 = new FileInputStream("onoma2");
             BufferedInputStream b2 = new BufferedInputStream(file2);
             DataInputStream d2 = new DataInputStream(b2);
             FileOutputStream file3 = new FileOutputStream("onoma3");
             BufferedOutputStream b3 = new BufferedOutputStream(file3);
             DataOutputStream d3 = new DataOutputStream(b3);
             
             try
             {
                 while(true)
                 {
                     d3.writeInt(d.readInt());
                 }
             }
             catch(IOException e)
             {
               d.close();
            }
             
              try
             {
                 while(true)
                 {
                     d3.writeInt(d2.readInt());
                 }
             }
             catch(IOException e)
             {
               d2.close();
            }
              
              d3.close();
            
        }
        
        
         catch(IOException e)
        {
            System.out.print("Error--" +e.toString());
        }
        
     try
        {
            FileInputStream file3 = new FileInputStream("onoma3");
             BufferedInputStream b3 = new BufferedInputStream(file3);
            DataInputStream d3 = new DataInputStream(b3);
              

            try
            {
                while(true)
                {
                    System.out.println(d3.readInt());
                }
            }
            catch(IOException e)
            {
                d3.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
   
       
       
    }
    
}

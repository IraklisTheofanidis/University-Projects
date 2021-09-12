/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Ergastirio9 {

    
    
    
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
             
             
             System.out.println("Arxeio1:");
             for(int i=0;i<data.length;i++)
             {
                System.out.println(d.readInt());
             
               
             }
             System.out.println();
             System.out.println("Arxeio2:");
              for(int i=0;i<data2.length;i++)
             {
                System.out.println(d2.readInt());
               
             }
             d.close();
             d2.close();
        }
        catch(IOException ex)
        {
            System.out.print("Error--" +ex.toString());
        }
        
   
        
             
    }
 
    
}

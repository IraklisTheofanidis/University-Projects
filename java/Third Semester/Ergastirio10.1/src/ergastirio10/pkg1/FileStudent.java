/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio10.pkg1;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user
 */
public class FileStudent extends StudentMini{

    public FileStudent(int am, String onoma, String epitheto) {
        super(am, onoma, epitheto);
    }
     public FileStudent(){
          super();   
    }
     
     public FileStudent read(RandomAccessFile File)throws IOException
     {
         setAM(File.readInt());
         setOnoma(cutString15(File));
         setEpitheto(cutString15(File));
         return this;
     }
     
     private String cutString15(RandomAccessFile File)throws IOException
     {
         char stringName[] = new char[15];
         for(int i=0;i<stringName.length;i++)
         {
             stringName[i] = File.readChar();
             
         }
         return new String(stringName).replace('\0',' ');
     }
     public void write(RandomAccessFile File)throws IOException
     {
         File.writeInt(getAM());
         putString15(File, getOnoma());
         putString15(File,getEpitheto());
     }
     
     private void putString15(RandomAccessFile File,String s)throws IOException
     {
         StringBuffer buf=null;
         if(s!=null)
         {
             buf=new StringBuffer(s);
             
         }
         else
             buf= new StringBuffer(15);
         buf.setLength(15);
         
         File.writeChars(buf.toString());
     }
     
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio7;

/**
 *
 * @author user
 */
public class Ergastirio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int matrix[ ] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 }; 
             BSTree tree = new BSTree( ); 
             for (int i=0; i<matrix.length; i++)  
                        tree.insertElement(matrix[i]); 
             tree.inOrderTraversal( ); //aristero ,root ,deksi (vgainei taksinomisi me auton ton tropo(anadromika))
             tree.preOrderTraversal( ); //riza- aristera ,deksia kai meta deksia stin riza emfanizei aristera kai deksia
             tree.postOrderTraversal( );//aristera , deksia ,riza 
             
          
    }
    
}
//11,3,2,15,20

// in 2,3,A,15,B,20

//20,b,15,A,2,3,11


//stin soro to 20 tha itan panw panw aristera tha itan to 15 kai deksia to 11  ,katw apo to 15 aristera to 2 kai deksia to 3 (mporousame to 11 kai to 15 na ta valoume anapoda)genikos prepei na einai apla apo katw pio mikra
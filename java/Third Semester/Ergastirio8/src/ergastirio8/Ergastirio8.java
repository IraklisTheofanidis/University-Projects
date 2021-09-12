/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio8;

/**
 *
 * @author user
 */
public class Ergastirio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student matrix[]= new Student[6];
        matrix[0]= new Student(164665,"iraklis","theofanidis",19,'a',0,10);
         matrix[1]= new Student(164664,"iraklis","theofanidis",19,'a',0,10);
          matrix[2]= new Student(164666,"iraklis","theofanidis",19,'a',0,10);
            matrix[3]= new Student(164661,"iraklis","theofanidis",19,'a',0,10);
             matrix[4]= new Student(164660,"iraklis","theofanidis",19,'a',0,10);
             matrix[5]= new Student(164667,"iraklis","theofanidis",19,'a',0,10);
           BSTree tree = new BSTree( ); 
           for (int i=0; i<matrix.length; i++)
           {
                        tree.insertElement(matrix[i]);
                        
           }
             tree.inOrderTraversal( ); //aristero ,root ,deksi (vgainei taksinomisi me auton ton tropo(anadromika))
             tree.preOrderTraversal( ); //riza- aristera ,deksia kai meta deksia stin riza emfanizei aristera kai deksia
             tree.postOrderTraversal( );//aristera , deksia ,riza
             System.out.println("To ipsos tou dentrou einai " +tree.treeHeight());
         //    System.out.println("To ipsos tou deksiou ipodentrou einai " +tree.treeHeightDeksi(matrix[1]));
             System.out.println("O arithmos ton komvon sto dentro einai " +tree.numberOfNodes());
        
        
        
        
        
    }
}

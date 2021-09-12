/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi4_1;

/**
 *
 * @author Lalik
 */
public class Askisi4_1 {

    
    public static void main(String[] args) {
       
        SimpleLinkedList list = new SimpleLinkedList();
        int choise=0;
        System.out.println("********** LINKED LIST MANAGEMENT **********");
        System.out.println("1- INSERT ELEMENT AT THE BEGINNING OF THE LIST");
        System.out.println("2- INSERT ELEMENT AT THE END OF THE LIST");
        System.out.println("3- DELETE FROM THE BEGINNING OF THE LIST");
        System.out.println("4- DELETE FROM THE END OF THE LIST");
        System.out.println("5- LIST LENGTH");
        System.out.println("6- IS THE LIST EMPTY");
        System.out.println("7- PRINT LIST");
        System.out.println("8- EXIT");
        Student[] stud = new Student[100];
        int i=0;
        while(choise!=8)
        {
          
            System.out.println("INPUT YOUR CHOICE");
            choise = UserInput.getInteger();
            System.out.println();
            if(choise==1)//eisagwgi sto prwto stoixeio tis listas
            {
                System.out.println("Dwse AM: ");
                int am = UserInput.getInteger();
                System.out.println("Dwse to onoma: ");
		String on = UserInput.getString();
		System.out.println("Dwse to epitheto: ");
		String ep = UserInput.getString();
		System.out.println("Dwse ilikia: ");
		double il = UserInput.getDouble();
		System.out.println("Dwse filo(A gia Antra kai G gia ginaika: ");
		char fi = UserInput.getChar();
		System.out.println("Dwse apousies: ");
		int ap = UserInput.getInteger();
		System.out.println("Dwse vathmo: ");
		double va = UserInput.getDouble();
                stud[i] = new Student(am,on,ep,il,fi,ap,va);
                list.insertFirst(stud[i]);
                i++;
            }
            else if(choise==2)//eisagwgi sto teleuteo stoixeio tis listas
            {
                System.out.println("Dwse AM: ");
                int am = UserInput.getInteger();
                System.out.println("Dwse to onoma: ");
		String on = UserInput.getString();
		System.out.println("Dwse to epitheto: ");
		String ep = UserInput.getString();
		System.out.println("Dwse ilikia: ");
		double il = UserInput.getDouble();
		System.out.println("Dwse filo(A gia Antra kai G gia ginaika): ");
		char fi = UserInput.getChar();
		System.out.println("Dwse apousies: ");
		int ap = UserInput.getInteger();
		System.out.println("Dwse vathmo: ");
		double va = UserInput.getDouble();
                stud[i] = new Student(am,on,ep,il,fi,ap,va);
                list.insertLast(stud[i]);
                i++;
            }
            else if(choise==3)//diagrafi to prwto stoixio tis listas
            {
                list.removeFirst();
                i--;
            }
            else if(choise==4)//diagrafi to teleuteo stoixeio tis listas
            {
                list.removeLast();
                i--;
            }
            else if(choise==5)
            {
                System.out.println(list.size());
            }
            else if(choise==6)
            {
                System.out.println(list.isEmpty());
            }
            else if(choise==7)//parousiologio
            {
                list.printList();
            }
            else//eksodos ta ipolipa tha ta kanw alli stigmi 
            {
                System.out.println("Telos Programmatos");
            }
            
        }
    }   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio6;

/**
 *
 * @author Lalik
 */
public class Ergastirio6 {

    
    public static void main(String[] args)  throws NoSuchListPosition,ListEmptyException{
       lab l = new lab();
Student s[] = new Student[3];
s[0]= new Student(164664,"iraklis","theofanidis",19,'a',0,10);
s[1]= new Student(164664,"iraklis","theofanidis",19,'a',0,10);
s[2]= new Student(164644464,"irarrklis","therrrofanidis",139,'a',20,110);

boolean a=l.foundDoubleLab(s);


//        int choise=0;
//        System.out.println("**********DOUBLE LINKED LIST MANAGEMENT **********");
//        System.out.println("1- INSERT ELEMENT AT THE BEGINNING OF THE LIST");
//        System.out.println("2- INSERT ELEMENT AT THE END OF THE LIST");
//        System.out.println("3- INSERT ELEMENT AT POSITION N OF THE LIST");
//        System.out.println("4- DELETE FROM THE BEGINNING OF THE LIST");
//        System.out.println("5- DELETE FROM THE END OF THE LIST");
//        System.out.println("6- DELETE ELEMENT FROM POSITION N OF THE LIST");
//        System.out.println("7- LIST LENGTH");
//        System.out.println("8- IS THE LIST EMPTY");
//        System.out.println("9- PRINT LIST");
//        System.out.println("10- EXIT");
//        Student[] stud = new Student[100];
//        int i=0;
//        while(choise!=10)
//        {
//          
//            System.out.println("INPUT YOUR CHOICE");
//            choise = UserInput.getInteger();
//            System.out.println();
//            if(choise==1)//eisagwgi sto prwto stoixeio tis listas
//            {
//                System.out.println("Dwse AM: ");
//                int am = UserInput.getInteger();
//                System.out.println("Dwse to onoma: ");
//		String on = UserInput.getString();
//		System.out.println("Dwse to epitheto: ");
//		String ep = UserInput.getString();
//		System.out.println("Dwse ilikia: ");
//		double il = UserInput.getDouble();
//		System.out.println("Dwse filo(A gia Antra kai G gia ginaika: ");
//		char fi = UserInput.getChar();
//		System.out.println("Dwse apousies: ");
//		int ap = UserInput.getInteger();
//		System.out.println("Dwse vathmo: ");
//		double va = UserInput.getDouble();
//                stud[i] = new Student(am,on,ep,il,fi,ap,va);
//                list.insertFirst(stud[i]);
//                i++;
//            }
//            else if(choise==2)//eisagwgi sto teleuteo stoixeio tis listas
//            {
//                System.out.println("Dwse AM: ");
//                int am = UserInput.getInteger();
//                System.out.println("Dwse to onoma: ");
//		String on = UserInput.getString();
//		System.out.println("Dwse to epitheto: ");
//		String ep = UserInput.getString();
//		System.out.println("Dwse ilikia: ");
//		double il = UserInput.getDouble();
//		System.out.println("Dwse filo(A gia Antra kai G gia ginaika): ");
//		char fi = UserInput.getChar();
//		System.out.println("Dwse apousies: ");
//		int ap = UserInput.getInteger();
//		System.out.println("Dwse vathmo: ");
//		double va = UserInput.getDouble();
//                stud[i] = new Student(am,on,ep,il,fi,ap,va);
//                list.insertLast(stud[i]);
//                i++;
//            }
//            else if(choise==3) //eisagwgi stin thesi position 
//            {
//                 System.out.println("Dwse AM: ");
//                int am = UserInput.getInteger();
//                System.out.println("Dwse to onoma: ");
//		String on = UserInput.getString();
//		System.out.println("Dwse to epitheto: ");
//		String ep = UserInput.getString();
//		System.out.println("Dwse ilikia: ");
//		double il = UserInput.getDouble();
//		System.out.println("Dwse filo(A gia Antra kai G gia ginaika): ");
//		char fi = UserInput.getChar();
//		System.out.println("Dwse apousies: ");
//		int ap = UserInput.getInteger();
//		System.out.println("Dwse vathmo: ");
//		double va = UserInput.getDouble();
//                stud[i] = new Student(am,on,ep,il,fi,ap,va);
//                list.insert(2,stud[i]);
//                i++;
//            }
//            else if(choise==4)//diagrafi to prwto stoixio tis listas
//            {
//                list.removeFirst();
//                i--;
//            }
//            else if(choise==5)//diagrafi to teleuteo stoixeio tis listas
//            {
//                list.removeLast();
//                i--;
//            }
//            else if(choise==6)//diagrafi apo tin thesi position
//            {
//                list.remove(2);
//                i--;
//                
//            }
//            else if(choise==7)
//            {
//                System.out.println(list.size());
//            }
//            else if(choise==8)
//            {
//                System.out.println(list.isEmpty());
//            }
//            else if(choise==9)//parousiologio
//            {
//                list.printList();
//            }
//            else//eksodos ta ipolipa tha ta kanw alli stigmi 
//            {
//                System.out.println("Telos Programmatos");
//            }
            
 //       }
    }
    
    
}

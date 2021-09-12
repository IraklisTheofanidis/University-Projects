/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio5_2;

/**
 *
 * @author Lalik                           
 */
public class Ergastirio5_2 {

    public static void swap(LinkedQueue lista){
        
        LinkedQueue temp=new LinkedQueue();                
        int size=lista.size();
        String tablet;
        for(int i=0;i<size;i++){     
    
            int k=i+1;
            temp.enqueue(lista.dequeue());       
            tablet=((Car)temp.front()).getArithmos_pinakidas();
            System.out.println("TO amaksi auto einai "+ k +"o stin seira: "+tablet);
            
            
           
        }
        
        for(int i=0;i<size;i++)
        {
            lista.enqueue(temp.dequeue());
        }
        System.out.println(lista.size());
    }
    public static void main(String[] args) {
         LinkedQueue capacity = new LinkedQueue();
        
        int choise=0;
        int p=0;
       System.out.println("********** LINKED LIST MANAGEMENT **********");
        System.out.println("1- Eisagwgi amaksiou sto telos tis ouras ");
        System.out.println("2- Diagrafi amaksiou apo tin arxi tis ouras");
        System.out.println("3- Emfanise me tin seira ta amaksia pou perimenoun stin oura");
        System.out.println("4- Telos programmatos");
        System.out.println();
        Car[] car = new Car[100];
        while(choise!=4 )
       {
           System.out.println("Input your choise");
           choise = UserInput.getInteger();
            if(choise==1)
            {
                System.out.println("Dwse arithmo pinakidas");
                String arithmos = UserInput.getString();
                System.out.println("Dwse tin marka tou amaksiou");
                String marka = UserInput.getString();
                car[p]= new Car(arithmos,marka);
                capacity.enqueue(car[p]);
                p++;
                
            }
            else if(choise==2)
            {
                System.out.println("To amaksi pou apoxorei efoson einai prosto sti lista einai: " );
                System.out.println(capacity.dequeue());
                p--;
            }
            
            else if(choise==3)
            {
                 swap(capacity);
            }
            else
            {
                System.out.println("Telos Programmatos");
            }
            
            
        }
       
        
        
        
    }
}
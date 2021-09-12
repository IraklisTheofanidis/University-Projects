/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi3_2;

/**
 *
 * @author Lalik
 */
public class Askisi3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue capacity = new ArrayQueue(5);
        
        int choise;
        int p=0;
        System.out.println("Gia eisagwgi patise 1, gia diagrafi patise 2 , gia na deis to teleuteo stixeio pata 3 alliws pata 4");
        choise = 1;
        Car[] car = new Car[100];
        while(choise!=4 )
       {
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
                capacity.dequeue();
                p--;
            }
            
            else 
            {
                System.out.println(capacity.front());
            }
            System.out.println("Gia eisagwgi patise 1, gia diagrafi patise 2 , gia na deis to teleuteo stixeio pata 3 alliws pata 4");
            choise = UserInput.getInteger();
        }
        System.out.println("Telos programmatos");
        System.out.println("a");
    }
   
}

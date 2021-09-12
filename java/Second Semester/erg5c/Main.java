package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        account acc[] = new account[3];
        acc[0] = new debit("Papadopoulos", 1500, 500);
        acc[1] = new credit("Giannoy", 2000, 500);
        acc[2] = new metafora("Papazoglou",3000,1000);

        for (int i = 0; i < acc.length; i++) {
            System.out.println(acc[i].toString());


            if (acc[i] instanceof debit) {
                debit.debit("Nikos", acc[i].getBalance(), 500);
            }
            if (acc[i] instanceof credit) {
                credit.credit("Petros", acc[i].getBalance(), 500);
            }

            if (acc[i] instanceof metafora) {
                metafora.metafora("Giorgos", acc[i].getBalance(), 1000);
            }
        }




    }
}

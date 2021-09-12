package com.company;

/**
 * Created by Errikos on 5/27/2017.
 */
public class credit extends  account implements iCredit {
    private double poso;

    public credit(String eponymia, double balance, double poso) {
        super(eponymia, balance);
        this.poso = poso;
    }

    static   void credit(String name,double balance,double poso){
        double ypoloipo =balance+poso;
        System.out.println("Egine Pistwsh....");
        System.out.println("Pistwsh : "+poso + " // Me onoma : "+name+" // Trexwn Ypoloipo : "+ypoloipo);
    }
}

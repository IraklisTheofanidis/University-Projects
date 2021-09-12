package com.company;

/**
 * Created by Errikos on 5/27/2017.
 */
public class debit extends account implements iDebit {

    private double poso;

    public debit(String eponymia,double balance,double poso){
        super(eponymia, balance);
        this.poso=poso;
    }



    public static   void debit(String name, double balance, double poso){
        double ypoloipo =balance-poso;
        System.out.println("Egine Xrewsh....");
        System.out.println("Xrewsh : "+poso + " // Me onoma : "+name+" // Trexwn Ypoloipo : "+ypoloipo);

    }


}

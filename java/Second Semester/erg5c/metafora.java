package com.company;

/**
 * Created by Errikos on 5/27/2017.
 */
public class metafora extends account implements iMetafora {
    private double poso;

    public metafora(String eponymia, double balance, double poso) {
        super(eponymia, balance);
        this.poso = poso;
    }

    static void metafora(String name,double balance,double poso){
        double ypoloipo =balance-poso;
        System.out.println("Egine metafora....");
        System.out.println("Xrewsh : "+poso + " // Me onoma : "+name+"  // Trexwn Ypoloipo : "+ypoloipo);
    }
}

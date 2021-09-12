package com.company;

/**
 * Created by Errikos on 5/27/2017.
 */
public  class account {
    private String eponymia;
    private double balance;

    public account(String eponymia,double balance){
        this.eponymia=eponymia;
        this.balance=balance;
    }

    public String getEponymia(){
        return eponymia;
    }

    public  double getBalance(){
        return balance;
    }

    public String toString(){
        return "\nEponymo : "+eponymia +
                "\nBalance : "+balance;
    }



}

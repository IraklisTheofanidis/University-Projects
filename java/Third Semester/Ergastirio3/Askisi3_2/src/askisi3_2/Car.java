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
public class Car {
private String arithmos_pinakidas;
private String marka_autokinitou;

    public Car(String arithmos_pinakidas, String marka_autokinitou) {
        this.arithmos_pinakidas = arithmos_pinakidas;
        this.marka_autokinitou = marka_autokinitou;
    }

    public String getArithmos_pinakidas() {
        return arithmos_pinakidas;
    }

    public String getMarka_autokinitou() {
        return marka_autokinitou;
    }
    
    

    @Override
    public String toString() {
        return "Car{" + "arithmos_pinakidas=" + arithmos_pinakidas + ", marka_autokinitou=" + marka_autokinitou + '}';
    }
    
    

    
}

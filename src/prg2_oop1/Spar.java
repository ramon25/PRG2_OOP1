/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop1;

/**
 *
 * @author ramon
 */
public class Spar extends Konto {
    private double maxOut;
    
    public Spar (double saldo, double rate, double maxOut) {
        this.saldo = saldo;
        this.rate = rate;
        this.maxOut = maxOut;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void payOut(double wert) {
        
    }
    
    public void print() {
        System.out.println("Number: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Zinssatz: " + rate);
        System.out.println("Maximale Auszahlung: " + maxOut);
    }
}

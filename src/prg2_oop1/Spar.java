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
        super(saldo, rate);
        this.maxOut = maxOut;
    }
    
    @Override
    public void payOut(double wert) {
        if (wert <= maxOut) {
            this.saldo -= wert;
        }
    }
    
    @Override
    public void print() {
        System.out.println("Number: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Zinssatz: " + rate);
        System.out.println("Maximale Auszahlung: " + maxOut);
        System.out.println();
    }
}

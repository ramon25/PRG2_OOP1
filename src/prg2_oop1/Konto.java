/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prg2_oop1;

/**
 *
 * @author ramon
 */
public class Konto {

    private static int count = 0;
    protected int no;
    protected double saldo;
    protected double rate;
    
    public Konto() {
        count++;
        this.no = count;
    }
    
    public Konto (double saldo, double rate) {
        this();
        this.saldo = saldo;
        this.rate = rate;
    }
    
    public void payIn(double wert) {
        this.saldo += wert;
    }
    
    public void payOut(double wert) {
        this.saldo -= wert;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public void print() {
        System.out.println("Number: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Zinssatz: " + rate);
        System.out.println();
    }
}

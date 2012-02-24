/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop1;

/**
 *
 * @author ramon
 */
public class Giro extends Konto {
    private double creditLimit;
    private double creditRate;
    
    public Giro (double saldo, double creditLimit) {
        super();
        this.saldo = saldo;
        this.creditLimit = creditLimit;
    }
    
    @Override
    public void print() {
        System.out.println("Number: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Kreditrate: " + creditRate);
        System.out.println("Kreditlimite: " + creditLimit);
        System.out.println();
    }
}

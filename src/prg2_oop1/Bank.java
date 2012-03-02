/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ramon
 */
public class Bank {
    private String name;
    ArrayList<Konto> accountList = new ArrayList<Konto>();
    
    public Bank(String name) {
        this.name = name;
    }
    
    public void openKonto(double saldo, double rate) {
        Konto myKonto = new Konto(saldo, rate);
        accountList.add(myKonto);
    }
    
    public void openSpar(double saldo, double rate, double maxOut) {
        Spar mySpar = new Spar(saldo, rate, maxOut);
        accountList.add(mySpar);  
    }
    
    public void openGiro(double saldo, double creditLimit) {
        Giro myGiro = new Giro(saldo, creditLimit);
        accountList.add(myGiro);
    }
    
    private int noOfAccounts() {
        return accountList.size();
    }
    
    private void printAccounts() {
        Iterator it = accountList.iterator();
        
        while (it.hasNext()) {
            Konto myKonto = (Konto)it.next();
            myKonto.print(); 
        }
    }
    
    private void printFund() {
        double fund = 0;
        Iterator  it = accountList.iterator();
        
        while (it.hasNext()) {
            Konto myKonto = (Konto)it.next();
            fund += myKonto.getSaldo();
        }
        
        System.out.println("Vermoegen: " + fund);
    }
    
    public static void main(String[] args) {
        Bank myBank = new Bank("myBank");
        myBank.openKonto(500, 0.5);
        myBank.openSpar(100, 0.4, 2000);
        myBank.openGiro(20000, 100000);
        
        System.out.println("Anzahl Konten: " + myBank.noOfAccounts());
        myBank.printFund();
        System.out.println();
        
        myBank.printAccounts();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop1;

/**
 *
 * @author ramon
 */
public class Bank_Aufgabe3 {
    private String name;
    LinkedList accountList = new LinkedList();
    
    public Bank_Aufgabe3(String name) {
        this.name = name;
    }
    
    public void openKonto(double saldo, double rate) {
        Konto myKonto = new Konto(saldo, rate);
        accountList.insert(myKonto);
    }
    
    public void openSpar(double saldo, double rate, double maxOut) {
        Spar mySpar = new Spar(saldo, rate, maxOut);
        accountList.insert(mySpar);  
    }
    
    public void openGiro(double saldo, double creditLimit) {
        Giro myGiro = new Giro(saldo, creditLimit);
        accountList.insert(myGiro);
    }
    
    private int noOfAccounts() {
        return accountList.length();
    }
    
    private void printAccounts() {
        ListNode myNode = accountList.getHead();
        
        do {
            Konto myKonto = myNode.getKonto();
            myKonto.print();
            myNode = myNode.getNext();
        } while (myNode != null);
    }
    
    private void printFund() {
        double fund = 0;
        ListNode myNode = accountList.getHead();
        
        do {
            Konto myKonto = myNode.getKonto();
            fund += myKonto.getSaldo();
            myNode = myNode.getNext();
        } while (myNode != null);
        
        System.out.println("Vermoegen: " + fund);
    }
    
    public static void main(String[] args) {
        Bank_Aufgabe3 myBank = new Bank_Aufgabe3("myBank");
        myBank.openKonto(500, 0.5);
        myBank.openSpar(100, 0.4, 2000);
        myBank.openGiro(20000, 100000);
        
        System.out.println("Anzahl Konten: " + myBank.noOfAccounts());
        myBank.printFund();
        System.out.println();
        
        myBank.printAccounts();
    }
}

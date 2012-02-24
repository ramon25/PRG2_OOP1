/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop1;

/**
 *
 * @author ramon
 */
public class LinkedList {
    private ListNode head;
    
    public LinkedList() {
        head = null;
    }
    
    public boolean isFound(Konto konto) {
        ListNode actualNode = head;
        while ((actualNode != null) && !konto.equals(actualNode.getKonto())) {
            actualNode = actualNode.getNext();
        }
        if (actualNode == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void insert(Konto konto) {
        head = new ListNode(konto, head);
    }
    
    public void print() {
        ListNode actualNode = head;
        System.out.println("--------------");
        while (actualNode != null) {
            actualNode.getKonto().print();
            actualNode = actualNode.getNext();
        }
    }
    
    public int length() {
        int count = 0;
        ListNode actualNode = head;

        while (actualNode != null) {
            count++;
            actualNode = actualNode.getNext();
        }
        
        return count;
    }
    
    public ListNode getHead() {
        return head;
    }
            
    
    public static void main(String[] args) {
        Konto myKonto = new Konto(1000,0.6);
        Konto myKonto2 = new Konto(500,0.3);
        Spar mySpar = new Spar(200,0.8,30000);
        LinkedList myList = new LinkedList();
        myList.insert(myKonto);
        myList.insert(myKonto2);
        myList.insert(mySpar);
        
        System.out.println(myList.isFound(myKonto));
        System.out.println();
        myList.print();
    }
}

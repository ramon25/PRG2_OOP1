/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop1;

/**
 *
 * @author ramon
 */
public class ListNode<T> {
    private T konto;
    private ListNode next;
    
    public ListNode(T konto, ListNode next) {
        this.konto = konto;
        this.next = next;
    }
    
    public T getKonto() {
        return konto;
    }

    public void setKonto(T konto) {
        this.konto = konto;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

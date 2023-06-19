/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l5;

import java.util.NoSuchElementException;

/**
 *
 * @author aykay
 */
public class SinglyLinkedList<E> {

    Node<E> head;
    Node<E> tail;
    int size;

    public class Node<E> {

        E element;
        Node<E> next;

        public Node() {
        }

        public Node(E e) {
            this.element = e;
        }
    }

    public int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) {
                return i;
            }
            current = current.next;

        }
        return -1;
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public void removeElement(E e) {
        int index = indexOf(e);
        if (index == 0 ) removeFirst();
        else if (index == size-1) removeLast();
        else {
            Node <E> current=head;
            for(int i=0;i<index-1;i++){
                current=current.next;
            }
            current.next=current.next.next;
                }
                size--;
                }
 
            
        
            
    
    public void removeFirst(){
        if (head == null) throw new NoSuchElementException();
        else if (head == tail ){
            head = tail = null;
        }
        else {
            head = head.next ; 
        }
        
    }
    
    public void removeLast(){
        if (tail == null) throw new NoSuchElementException();
        else if (head == tail) head = tail = null ;
        else {
            Node<E> current = head ;
            for  (int i = 0 ; i < size -1 ; i ++)
                current.next = null ; 
                tail = current ; 
         
        }
    }
    
    public void printList(){
        Node<E> current = head ; 
        for (int i = 0 ; i < size ; i ++){
            System.out.print(current.element + ((current.equals(tail)) ? ".\n" : ", "));
            current = current.next ;
        }
        

    }
    public int getSize(){
        return this.size ; 
        }
    
    public void replace (E e, E newE){
        Node<E> current = head;
        for (int i = 0 ; i < size; i ++){
            if (current.element.equals(e))
                current.element = newE;
            current = current.next ;
        }
    }

}

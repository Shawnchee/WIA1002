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
public class DoublyLinkedList<E> {
    Node <E> head  ;
    Node <E> tail ; 
    int size;
    
    public class Node<E>{
        E element ;
        Node<E> next ; 
        Node<E> prev ; 
        public Node (){}
        
        public Node (E element,Node next, Node prev){
            this.element = element ;
            this.prev = prev;
            this.next = next;
        }
    }
    
    public E addFirst (E e){
        Node<E> newNode = new Node<>(e,head,null);
        if (head !=null)
            head.prev = newNode;
        head = newNode;
        
        if (tail == null) tail = newNode; 
        size ++;
        return e;
    }
    
    public E addLast (E e){
        Node <E> temp = new Node<>(e,null,tail);
        if (tail!=null) tail.next = temp;
        tail = temp ; 
        
        if (head==null) head = temp ; 
        size ++;
        return e;
    }
    
    public void add (int index, E e){
        if (index ==0) addFirst(e);
        else if (index == size) addLast(e);
        else if (index < 0 || index >size) throw new IndexOutOfBoundsException() ; 
        else {
            Node <E> current = head ;
            for (int i = 0 ;  i <index-1 ; i ++){
                current = current.next ;  // iterate to one place before the index set
            }
                Node<E> newNode = new Node<>(e,current.next,current);
               (current.next).prev = newNode ;  
                current.next = newNode ; 

        }
        size ++; 
    }
    public E remove (int index){
        Node<E> temp = new Node<>();
        if (index < 0 || index >size) {
            throw new IndexOutOfBoundsException();
        } 
        else if (index == 0 ) {
            return removeFirst();
        } 
        else if (index == size- 1) 
            return removeLast();
        
        else {
            Node<E> current = head;
            for (int i = 0; i < index  ;  i ++){
                current = current.next;
                temp.element = current.element;
            }
            current.next.prev = current.prev;
            current.prev.next = current.next ;
            current.prev = null ; 
             current.next = null ; 
            size -- ; 
  
        }
       return temp.element;
    }
    public E removeFirst(){  
     Node<E> temp = new Node<>();
        if (head == tail) {
            head = tail = null ;
            return head.element;
        } 
        else if (head == null) throw new NoSuchElementException();
        else {

            temp.element = head.element;
            head = head.next ;
            head.prev = null ;
        }
        size -- ;
        return temp.element;
    }
    
    public E removeLast(){
        Node<E> temp = new Node<>();
        if (head == tail) {
            head = tail = null ;
            return head.element;
        }
        else if (head == null) throw new NoSuchElementException();
        else {
            temp.element = tail.element;
            tail = tail.prev ;
            tail.next = null;
        }
        size -- ;
        return temp.element;
    }
    
    public void iterateForward (){
        Node<E> current = head ;
        while(current!=null){
            System.out.print( current.element + (((current.next) == null) ? ".\n" : ", "));
            current = current.next ;
        }
    }
    public void iterateBackward(){
        Node<E> current= tail;
        while(current !=null){
            System.out.print(current.element + ((current.prev==null) ? ".\n" : ", "));
            current = current.prev ;
        }
    }
    public int printSize(){
        return this.size;
    }
    public void clear(){
        Node <E> temp =  head;
        while(head != null){
            temp = head.next ; 
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0 ;
      
    }
}

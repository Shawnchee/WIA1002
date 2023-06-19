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
public class SList <E>{
    E element ; 
    SNode<E>  head  ;
    SNode<E> tail ;
    int size ;
    
    
    public void appendEnd (E e){
        SNode<E> newNode = new SNode<>(e); 
        if (head == null && tail == null ){
            head = tail = newNode ;            
        }
        else {
             tail.next = newNode ;
             tail = newNode ; 
            }
        size ++ ;
        }
    
    public E removeInitial(){
        SNode<E> temp = new SNode<>() ;
        if (head == null){
            throw new NoSuchElementException();
        }
        else if (head == tail){
            head = tail = null ;
        }
        else {
             temp = head ; 
             head = head.next;
        }
        size --;
        return temp.element;
    }
    public boolean contains (E e){
        if (head == null){
            head = tail = null ;
            return false;
        }
        else {
            SNode<E> current = head ; 
            for (int i = 0 ; i < size ; i ++){
                if ((current.element).equals(e))
                    return true ;
                current = current.next;
            }
        }
        return false ;
    }
    public void clear(){
        SNode<E> temp = new SNode<>();
        while (head != null){
            temp = head ;
            head = null ; 
            head = temp.next;
        }
        tail = head = null;
        size = 0 ;
        System.out.println("List has been cleared.");
    }
    public void display(){
        System.out.print("[");
        SNode<E> current = head ;
        for (int i = 0 ; i <size ; i ++){
            System.out.print(current.element + ((i == size-1) ? "" : ","));
            current = current.next;
        }
        System.out.println("]");
    }
    
}



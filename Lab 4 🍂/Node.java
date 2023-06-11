/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l4;

/**
 *
 * @author aykay
 */
public class Node <E>{
    E element ; 
     Node <E> next ; 
    
    public Node(){
    this.element = null ; 
    this.next = null ; 
    }
   
    public Node (E element){
        this.element = element ; 
    }
    
    
}

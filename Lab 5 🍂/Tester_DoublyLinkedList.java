/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l5;

/**
 *
 * @author aykay
 */
public class Tester_DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList <Integer> ls = new DoublyLinkedList<>();
        System.out.print("Adding: " +ls.addFirst(1) +"\n");
        System.out.print("Adding: " +ls.addLast(10) +"\n");
        System.out.print("Adding: " +ls.addLast(100) +"\n");
        ls.add(2, 2);
        System.out.print("Deleted: " +ls.remove(3) + "\n");
        System.out.println("");
        System.out.println("iterating forward...");
        ls.iterateForward();
        System.out.println("iterating backward...");
        ls.iterateBackward();
        System.out.println("Size of current doubly linked list: " + ls.printSize());
        System.out.println("succesfully cleared " + ls.printSize() + " node(s)");        
        ls.clear();
        System.out.println("Size of current doubly liunked list: " + ls.printSize());
        
        
    }
}

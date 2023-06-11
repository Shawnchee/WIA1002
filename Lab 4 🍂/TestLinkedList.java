/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l4;

public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Character> ls = new MyLinkedList<>();
        //a.
        for (char ch = 'a'; ch <= 'e'; ch++) {
            ls.addLast(ch);
        }
        System.out.println("Middle value is: " + ls.getMiddleValue());
        //b.
        ls.print();
        //c.
        ls.reverse();
        //d.
        System.out.println("Number of elements in the LinkedList is: " + ls.getSize());
        //e.
        System.out.println("First value in the LinkedList is: " + ls.getFirst());
        System.out.println("Last value in the LinkedList is: " + ls.getLast());
        //f.
        System.out.println("Third value that has been deleted is: " + ls.remove(2));
        System.out.print("LinkedList after deleting the third value is: ");
        ls.print();
        //g.
        System.out.println("Second value in the LinkedList is: " + ls.get(1));
        System.out.println("Third value in the LinkedList is: " + ls.get(2));
        //h.
        System.out.println("LinkedList contains 'c'?: " + ls.contains('c'));
        //i.
        ls.clear();
        ls.add(0, 'j');
        ls.add(1, 'a');
        ls.add(2, 'v');
        ls.add(3, 'a');
        ls.print();
        System.out.println("Middle value is: " +ls.getMiddleValue());
        ls.print();
        ls.clear();
        ls.print();

    }
}

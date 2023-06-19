/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l5;

/**
 *
 * @author aykay
 */
public class TestSList {
    
    public static void main(String[] args) {
        SList <String> ls = new SList<>();
        ls.appendEnd("Linked list");
        ls.appendEnd("is");
        ls.appendEnd("easy");
        ls.display();
        System.out.println(ls.removeInitial());
        ls.display();
        System.out.println("Is \"difficult\" in the list?: " + ls.contains("difficult"));
        ls.clear();
        System.out.print("Proof:" );
        ls.display();
    }   
}

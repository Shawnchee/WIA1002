/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package wia1002_l2;

/**
 *
 * @author aykay
 */
public class TesterQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MyGeneric strObj = new MyGeneric ("Shawn Chee");
        MyGeneric intObj = new MyGeneric (30);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}

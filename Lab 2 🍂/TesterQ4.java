/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package wia1002_l2;

/**
 *
 * @author aykay
 */
public class TesterQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Integer [] intArray = {5,3,7,1,4,9,8,2};
       String[] strArray = {"red", "blue", "orange", "tan"};
       
        MinMaxArray a = new MinMaxArray();
        MinMaxArray b = new MinMaxArray();
        
        System.out.println(a.minmax(intArray));
        System.out.println(b.minmax(strArray));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package wia1002_l1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class Text1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
       Scanner input = new Scanner (new FileInputStream("C:/Users/aykay/Desktop/WIA1002/Files/text1.txt"));
       int  total = 0 , count = 0 ;
       while (input.hasNextLine()){
           String line = input.nextLine();
           String [] line2= line.split(",");
           count = 0 ; 
           for (String str : line2){
               System.out.print(str);
        count += str.length() ; 
           }
            System.out.println("");
           System.out.println("Number of characters: " + (count));
           total += count ; 
          
       }
        System.out.println("Total number of characters: " + total);
    }
}

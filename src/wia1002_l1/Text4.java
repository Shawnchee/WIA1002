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
public class Text4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
     Scanner input = new Scanner (new FileInputStream("C:/Users/aykay/Desktop/WIA1002/Files/text4.txt"));
       String line = input.nextLine();
       int count = 0 ; 
       for (int i = 0 ; i <line.length(); i ++){
           if (Character.isAlphabetic(line.charAt(i))){
               count++ ;
               System.out.print(line.charAt(i));
           }

       }
                  System.out.println("\nTotal number of characters: "+ count);
       }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
       
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package wia1002_l3;

/**
 *
 * @author aykay
 */
import java.util.Arrays;
public class ArrayBagDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
  /*      int DEFAULT_CAPACITY = 25 ; 
      ArrayBag bag1 = new ArrayBag(DEFAULT_CAPACITY); */ // can be used this to call the second constructor
      ArrayBag<String> bag1 = new ArrayBag<>();
      ArrayBag<String> bag2 = new ArrayBag<>();
      
      String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
      String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        System.out.println("Bag 1 : ");
      testAdd(bag1, contentsOfBag1);
      displayBag(bag1);
        System.out.println("Bag 2 : ");
      testAdd(bag2 , contentsOfBag2);
      displayBag(bag2);
        System.out.println("bag 3, test the method union of bag1 and bag2: ");
       displayBag(bag1.union(bag2));
        System.out.println("bag 4, test the method intersection of bag1 and bag2: ");
       displayBag(bag1.intersection(bag2));
        System.out.println("bag 5, test the method difference of bag1 and bag2: ");

       displayBag(bag1.difference(bag2));

      
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for (String str : content){
                System.out.print(str  + " ");
                aBag.add(str);
        }
        System.out.println("");
    }
    private static void displayBag(BagInterface<String> aBag){

        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows: ");
         Object [] arr = aBag.toArray();
    for (int i = 0 ; i < arr.length ; i ++ ){
        System.out.print(arr[i] + " ");
    }
        System.out.println("");
        System.out.println("");
    }
}

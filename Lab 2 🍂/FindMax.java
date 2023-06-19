/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l2;

/**
 *
 * @author aykay
 */
public class FindMax<E> {
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (int i = 0 ; i < list.length ; i ++){
            if (list[i].compareTo(max)>0)
                max = list[i];
        }
        return max ;    
    }
}

    
   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l2;

/**
 *
 * @author aykay
 */
public class MinMaxArray {
    
    public <E extends Comparable<E>> String minmax (E [] list){
            E min = list[0] , max = list[0]  ;

            for (int i = 0 ; i < list.length ; i ++){
                if (max.compareTo(list[i])<0)
                    max = list [i] ; 
            }
        
             for (int i = 0 ; i < list.length ; i ++){
                if (min.compareTo(list[i])>0)
                    min = list [i] ; 
            }
         
 
    
             return "Min = " + min + "  Max = " + max ; 
}
}

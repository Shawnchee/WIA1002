/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l2;

/**
 *
 * @author aykay
 */
public class StorePairGeneric <E> implements Comparable<E> {
 private E first, second;
 
 public StorePairGeneric(E first, E second) {
 this.first = first;
 this.second = second;
 }
 
 public E getFirst() {
 return first;
 }
 
 public E getSecond() {
 return second;
 }
 
 public void setPair(E first, E second) {
 this.first = first;
 this.second = second;
 }
 
 @Override
 public String toString() {
 return "first = " + first + " second = " + second;
 }
 
 @Override
 public boolean equals(Object o){
     if (this== o)
         return true;
     else return false; 
 }

 @Override
    public int compareTo(E o) {
        if (this == o)
            return 0 ;
        else return 1 ; 
    }
 
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l2;

/**
 *
 * @author aykay
 */
public class MyGeneric <E> {
        private E e ;
        public MyGeneric (){}
        
        public MyGeneric (E e){
            this.e = e;
        }
        
        public E getE (){
           return  this.e = e ;
        }
        
        public void setE(E e){
            this.e = e ; 
        }
}


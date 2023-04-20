/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package wia1002_l1;

/**
 *
 * @author aykay
 */
public class TesterQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Account1 a = new Account1("George" ,1122,1000);
        a.setAnnualInterestRate(1.5);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        System.out.println(a.toString());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package wia1002_l1;

/**
 *
 * @author aykay
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            Account a = new Account (1122 , 20000);
            a.setAnnualInterestRate(4.5);
            a.withdraw(2500);
            a.deposit(3000);
            a.print();
    }
}

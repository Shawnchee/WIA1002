/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l1;

import java.util.ArrayList;


/**
 *
 * @author aykay
 */
public class Account1 extends Account {

    private String name ; 
    private ArrayList <Object> transactions = new ArrayList<>();  


    public Account1 (String name , int ID , double balance ){
        super(ID, balance);
        this.name = name ; 
    }
    public void withdraw (double withdraw){
        super.withdraw(withdraw);
        transactions.add(new Transaction('w', withdraw, super.getBalance(), ("You have withdrew $" + withdraw)));
    }
    public void deposit (double deposit){
        super.deposit(deposit);
        transactions.add(new Transaction(('d'), deposit, super.getBalance(), ("You have deposited $" + deposit)));
    }
    @Override
    public String toString(){
        String transactionList = "";
        for (int i = 0 ; i < transactions.size() ; i ++){
            transactionList += transactions.get(i) + "\n";
        }
        return "Account holder name: " + name + "\nInterest rate: " + super.getAnnualInterestRate()*100 +"%" 
                + "\nBalance: $" + super.getBalance() + "\nTransaction History: \n-----------------------------------------------------\n" + transactionList;
    }
}

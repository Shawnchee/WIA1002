/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002_l1;

import java.util.Date;

/**
 *
 * @author aykay
 */
public class Transaction {
    Date dateCreated ; 
    char transactionType ;
    double amount ;
    double newBalance ;
    String description ;
    
    
    public Transaction(char transactionType, double amount, double newBalance, String description){
        this.transactionType = transactionType ; 
        this.amount = amount ; 
        this.newBalance = newBalance ; 
        this.description = description ;
        dateCreated = new Date();
        
    }
    @Override
    public String toString(){
        return "Transaction date: " + dateCreated  + "\nTransaction type(w = withdraw, d = deposit): " + transactionType + "\nAmount: $" + amount 
                + "\nNew Balance: $" + newBalance + "\nDescription: " + description  + "\n"; 
    }
}

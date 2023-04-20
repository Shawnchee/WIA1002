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
public class Account {
    private int ID = 0  ;
    private double balance = 0 ;
    private double annualInterestRate = 0 ;
    private Date dateCreated ; 
    
    public Account (){}
    
    public Account (int ID , double balance ){
        this.ID = ID ; 
        this.balance = balance ;
        this.dateCreated = new Date();
    }
    
    public void setID (int ID){
        this.ID = ID ;
    }
     public void setBalance (double balance){
        this.balance = balance ;
     }
    public void setAnnualInterestRate (double annualInterestRate){
        this.annualInterestRate = annualInterestRate/100 ;
    }    
    public int getID (){
        return this.ID;
    }    
    public double getBalance (){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDate(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        double MonthlyInterestRate = this.annualInterestRate /12 ;
       return MonthlyInterestRate ; 
    }
    public double getMonthlyInterest(){
        double MonthlyInterest = balance * ( this.annualInterestRate /12 ) ; 
        return MonthlyInterest;
        
    }
    public void withdraw (double withdraw){
        this.balance -=  withdraw ; 
    }
    public void deposit(double deposit){
        this.balance += deposit ;
    }
    
    public void print (){
        System.out.println("Balance: " + this.balance);
        System.out.println("Monthly Interest: " + getMonthlyInterest());
        System.out.println("Date created: " + getDate());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semifinals.Activity1;

/**
 *
 * @author Jim Owen
 */
public class BankClass {
    private String fullname;
    private double userBalance = 100; 
    
    public void setName(String lastName, String firstName){
        fullname = lastName+ ", " +firstName;
    }
    
    public String getName(){
        return fullname;
    }
    
    public double getBalance(){
        return userBalance;
        
    }
    public double withdraw(double Balance) {
        userBalance = userBalance - Balance;
        return userBalance;
    }
    
    public double deposit(double Balance) {
        userBalance = userBalance + Balance;
        return userBalance;
    }
   
}
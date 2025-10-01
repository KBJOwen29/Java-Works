/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm.MidtermExamination;

/**
 *
 * @author Jim Owen
 */
public class User {
    String userWholeName;
    double userBalance;
    
    User(String Name, double Balance) {
        userWholeName = Name;
        userBalance = Balance;
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

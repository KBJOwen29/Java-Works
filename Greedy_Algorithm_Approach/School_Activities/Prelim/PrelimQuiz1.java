/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prelim;

/**
 *
 * @author Jim Owen
 */
//This is used to import a scanner for inputs
import java.util.Scanner;
public class PrelimQuiz1 {
    public static void main(String[] args){
        //This is the scanner for inputs
        Scanner finput = new Scanner(System.in);
        
        //This is the Variables:
        Float gas_amount , gas_total, rent, food, dorm_expense, total_expense;
        Integer gas_price;
        
        //This part prints out a statment that ask us input our expenses
        System.out.println("Input the Gas Amount Bought for each Month: ");
        gas_amount = finput.nextFloat();
        System.out.println("Input the rent for each Month: ");
        rent = finput.nextFloat();
        System.out.println("Input the Food Expense for each Month: ");
        food = finput.nextFloat();

        //This part makes use of the arithmetic operators to get the gas expense and other expenses made
        gas_price = 75;
        gas_total = gas_amount * gas_price;
        dorm_expense = rent + food;
        total_expense = gas_total + dorm_expense;
        
        //This one uses an escape sequence( \n ) to print out the outputs in new lines using only one line
        System.out.println("Total Gas Expense: " + gas_total + "\nTotal Dorm Expense: " + dorm_expense + "\nTotal Monthly Expense:" + total_expense);
        
        //This used to close the scanner
        finput.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prelim;

/**
 *
 * @author Jim Owen
 */
import java.util.Scanner;
public class PrelimActivity2 {
    public static void main(String[] args){
        //This is the scanner for inputs
        Scanner input = new Scanner(System.in);
        
        //This is the Variables:
        Float FirstNum, SecondNum, Total;
        String Sign;
        
        //This part ask you want you to calculate
        System.out.print("FirstNumber: ");
        FirstNum = input.nextFloat();
        System.out.print("Operator: ");
        Sign = input.next();
        System.out.print("SecondNumber: ");
        SecondNum = input.nextFloat();
        
        //This part makes use of arithmetic operators to calculate the value of variable Total
        switch(Sign) {
            case "+":
                Total = FirstNum + SecondNum;
                System.out.println(FirstNum + " + " + SecondNum + " = " + Total);
                break;
                
            case "-":
                Total = FirstNum - SecondNum;
                System.out.println(FirstNum + " - " + SecondNum + " = " + Total);                
                break;
                
            case "*":
                Total = FirstNum * SecondNum;
                System.out.println(FirstNum + " * " + SecondNum + " = " + Total);
                break;
                
            case "/":
                Total = FirstNum / SecondNum;
                System.out.println(FirstNum + " / " + SecondNum + " = " + Total);
                break;   
                
            default:
                System.out.println("Try Again");
            }
        
        
        //This used to close the scanner
        input.close();
    }
}



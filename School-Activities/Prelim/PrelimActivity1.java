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
public class PrelimActivity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Float celsuis,fahrenheit;
        
        System.out.print("Enter Celsuis:");
        celsuis = input.nextFloat();
        
        fahrenheit = (celsuis * 9/5) + 32;
        
        System.out.println("Fahrenheit = " + String.format("%.2f", fahrenheit));
        
        
        input.close();

    }
}

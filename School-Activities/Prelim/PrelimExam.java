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

public class PrelimExam{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    Double price ,percentage_discount ,discount_amount ,new_prices , Product_prices;
    double[] Productlist = new double[100];
    int count = 0;
    while(true){
        System.out.print("Enter Price: ");
        price = input.nextDouble();
        Productlist[count] = price;
        count++;
        
        for (int i = 0 ; i < count ; i++){
            Product_prices = Productlist[i];
            if (Product_prices <= 500){
            percentage_discount = 0.01;
            discount_amount = Product_prices * percentage_discount;
            new_prices = Product_prices - discount_amount;
            System.out.println(Product_prices + " " + "1%" + " " + discount_amount + " " + new_prices);
    
            }else if (Product_prices > 500 && Product_prices <= 3000){
            percentage_discount = 0.02;
            discount_amount = Product_prices * percentage_discount;
            new_prices = Product_prices - discount_amount;
            System.out.println(Product_prices + " " + "2%" + " " + discount_amount + " " + new_prices);
    
            }else if (Product_prices > 3000 && Product_prices <= 5000){
                percentage_discount = 0.03;
            discount_amount = Product_prices * percentage_discount;
            new_prices = Product_prices - discount_amount;
            System.out.println(Product_prices + " " + "3%" + " " + discount_amount + " " + new_prices);
            
            }else if (Product_prices > 5000 && Product_prices <= 10000){
            percentage_discount = 0.05;
            discount_amount = Product_prices * percentage_discount;
            new_prices = Product_prices - discount_amount;
            System.out.println(Product_prices + " " + "5%" + " " + discount_amount + " " + new_prices);
            
            } else if (Product_prices > 10000){
            percentage_discount = 0.06;
            discount_amount = Product_prices * percentage_discount;
            new_prices = Product_prices - discount_amount;
            System.out.println(Product_prices + " " + "6%" + " " + discount_amount + " " + new_prices);
            }
        }  
    }
    
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semifinals.SelfAssessment1;

/**
 *
 * @author Jim Owen
 */
public class ProductClass {
    private String ProdName;
    private double ProdPrice;
    private double ProdQuantity;
    
    public void setProdName(String Name){
        ProdName = Name;
    }
    
    public void setProdPrice(double Price){
        ProdPrice = Price;
    }
    
    public void setProdQuantity(double Quantity){
        ProdQuantity = Quantity;
    }
    
    public String getProdName(){
        return ProdName;
    }
    
    public double getProdQuantity(){
        return ProdQuantity;
    }
    
    public double getProdPrice(){
        return ProdPrice;
    }
    
    public double TotalPrice(double Price, double Quantity){
        double TotalPrice = Price * Quantity;
        return TotalPrice;
    }
  
}

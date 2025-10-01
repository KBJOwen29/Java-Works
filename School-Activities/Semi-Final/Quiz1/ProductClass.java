/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semifinals.Quiz1;

import com.mycompany.semifinals.SelfAssessment1.*;

/**
 *
 * @author Jim Owen
 */
public class ProductClass extends ProductCalculation {
    private String ProdName;
    private double ProdPrice;
    private int ProdInitialQuantity;
    private int ProdPurchaseQuantity;
    private int PurchaseCount;
    
    private String PurchaseMessage = "";
    
    public void setProdName(String Name){
        ProdName = Name;
    }
    
    public void setProdPrice(double Price){
        ProdPrice = Price;
    }
    
    public void setProdInitialQuantity(int Quantity){
        ProdInitialQuantity = Quantity;
    }
    
    public String getProdName(){
        return ProdName;
    }
    
    public double getProdInitialQuantity(){
        return ProdInitialQuantity;
    }
    
    public double getProdPrice(){
        return ProdPrice;
    }
    
    public double getProdPurchaseQuantity(){
        return ProdPurchaseQuantity;
    }
    
    public void setProdPurchaseQuantity(int Quantity){
        ProdPurchaseQuantity = Quantity;
    }
    
    public double TotalPrice(){
        return getTotalPrice(ProdPrice, ProdPurchaseQuantity);
    }
    
    public void addToPurchaseHistory(int Quantity) {
        PurchaseCount++;
        String purchaseRecord = "Purchase No. " + PurchaseCount + ": " + Quantity + "\n";
        PurchaseMessage = PurchaseMessage + purchaseRecord;
    }
    
    public String getPurchaseHistory(){
        return PurchaseMessage;
    }
    
    public void clearPurchaseHistory(){
        PurchaseMessage = "";
        PurchaseCount = 0;
    }
  
}

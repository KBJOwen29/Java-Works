/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semifinals.Exams;

/**
 *
 * @author Jim Owen
 */
public class ProductClass extends PizzaCalc {
    private String GuestName;
    private int PizzaQuantity;
    
    String Flavor;
    String PizzaSize;
    
    double SoloPrice = 100;
    double DoublePrice = 200;
    double FamilyPrice = 350;
    double TotalPrice;
    
    double TotalAmount;
    private String OrderMessage = "";
    
    public String getName(){
        return GuestName;
    }
    
    public void setName(String Name){
        GuestName = Name;
    }
    
    public int getQuantity(){
        return PizzaQuantity;
    }
    
    public void setQuantity(int Quantity){
        PizzaQuantity = Quantity;
    }
    
    public double getTotalSolo(){
        double total = getTotalPrice(PizzaQuantity, SoloPrice);
        TotalPrice = total;
        return TotalPrice;
    }
    
    public double getTotalDouble(){
        double total = getTotalPrice(PizzaQuantity, DoublePrice);
        TotalPrice = total;
        return TotalPrice;
    }
    public double getTotalFamily(){
        double total = getTotalPrice(PizzaQuantity, FamilyPrice);
        TotalPrice = total;
        return TotalPrice;
    }
    
    public void addOrder() {
        String OrderRecord = PizzaQuantity + " "+PizzaSize + ("\t" +Flavor )+ ("\t" + SoloPrice )+  ("\t" +TotalPrice )+ "\n";
        OrderMessage = OrderMessage + OrderRecord;
        TotalAmount = TotalAmount + TotalPrice;
    }
    public String getOrderRecord(){
        return OrderMessage;
    }
    
    public void setFlavor(String flavor){
        Flavor = flavor;
    }
    
    public void setPizzaSize(String size) {
        PizzaSize = size;
    }
    public double getTotalAmount(){
        return TotalAmount;
    }
}
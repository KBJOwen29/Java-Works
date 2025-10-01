/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semifinals.Activity2;

/**
 *
 * @author Jim Owen
 */
public class SalaryGUI extends SalaryCompute { 
    private String fullname;
    private double SalaryPerHour;
    private double HoursWorked;
    private double GrossSalary;
    
    public void setDetails(String Name, double salary, double hour){
        fullname = Name;
        SalaryPerHour = salary;
        HoursWorked = hour;
    }
    
    public String getName(){
        return fullname;
    }
    
    public double getSalary(){
        return SalaryPerHour;
    }
    
    public double getHour(){
        return HoursWorked;
    }
    
    public void setGrossSalary(double hour, double salary) {
        GrossSalary = salary * hour;
    }
    
    public double getGrossSalary(){
        return GrossSalary;
    }
    
    public double getNetSalary() {
        return computeNetSalary(GrossSalary);
    }
    
    public double computeSSS(){
        return getSSS(GrossSalary);
    }
    
    public double computePagibig(){
        return getPagibig(GrossSalary);
    }
    
    public double computePhilHealth(){
        return getPhilHealth(GrossSalary);
    }
    
}

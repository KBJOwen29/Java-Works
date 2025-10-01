/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semifinals.Activity2;

/**
 *
 * @author Jim Owen
 */
public class SalaryCompute {
    // Deduction percentages
    double sssPercentage = 0.045;      
    double pagibigPercentage = 0.02;   
    double philHealthPercentage = 0.04; 


    // Calculate total deductions
    public double computeTotalDeductions(double grossSalary) {
        return (grossSalary * sssPercentage) + 
               (grossSalary * pagibigPercentage) + 
               (grossSalary * philHealthPercentage);
    }

    // Calculate net salary after deductions
    public double computeNetSalary(double grossSalary) {
        return grossSalary - computeTotalDeductions(grossSalary);
    }

    // Computations for individual deductions (for display purposes)
    public double getSSS(double grossSalary) { 
        return grossSalary * sssPercentage;
    }
    
    public double getPagibig(double grossSalary) { 
        return grossSalary * pagibigPercentage;
    }
    
    public double getPhilHealth(double grossSalary) { 
        return grossSalary * philHealthPercentage;
    }
}

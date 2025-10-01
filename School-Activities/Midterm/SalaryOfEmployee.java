/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm.MidtermAssignment;

/**
 *
 * @author Jim Owen
 */
import javax.swing.JOptionPane;
public class SalaryOfEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the Methods class
        SalaryCalculations methods = new SalaryCalculations();
        
        //Variables&
        String employeeName;
        double amountPerHourWorked;
        int numberOfHoursWorked;
        String input;

        // Input employee details
        employeeName = JOptionPane.showInputDialog(null, "Enter Employee Name: ");
        
        input = JOptionPane.showInputDialog("Enter Salary Amount per Hour:");
        amountPerHourWorked = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter Number of Hours Worked:");
        numberOfHoursWorked = Integer.parseInt(input);
        
        // Calculate gross salary
        double grossSalary = methods.computeGrossSalary(amountPerHourWorked, numberOfHoursWorked);
        
        // Calculate deductions and net salary
        double sss = methods.getSss(grossSalary);
        double pagibig = methods.getPagibig(grossSalary);
        double philHealth = methods.getPhilHealth(grossSalary);
        double totalDeductions = methods.computeTotalDeductions(grossSalary);
        double netSalary = methods.computeNetSalary(grossSalary);

        // Display results
        String message = "Employee Name: " + employeeName + 
                         "\nGross Salary: " + grossSalary +
                         "\nSSS Deduction: " + sss +
                         "\nPag-IBIG Deduction: " + pagibig +
                         "\nPhilHealth Deduction: " + philHealth +
                         "\nTotal Deductions: " + totalDeductions +
                         "\nNet Salary: " + netSalary;

        JOptionPane.showMessageDialog(null, message); 
    }
    
}

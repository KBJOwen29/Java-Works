/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm.MidtermSelfAssessment2;

/**
 *
 * @author Jim Owen
 */
import javax.swing.JOptionPane;
public class MidtermSelfAssessment2 {

    public static void main(String[] args) {
        Methods getOperator = new Methods();
        int gradeNum;
        String input;
        double gradeAverage,sum = 0;
        
        input = JOptionPane.showInputDialog(null, "Enter Number of Grades: ");
        gradeNum = Integer.parseInt(input);
        
        int[] arrGrades = new int[gradeNum];
        
        for (int counter = 0; counter < gradeNum; counter++){
            input = JOptionPane.showInputDialog(null, "Enter Grades");
            arrGrades[counter] = Integer.parseInt(input);
        }
        
        for (int counter = 0 ; counter < gradeNum; counter++){
            sum = sum + arrGrades[counter];
        }
        gradeAverage = getOperator.getAverage(sum, gradeNum);
        if (gradeAverage < 75){
            JOptionPane.showMessageDialog(null, "Average = "+ gradeAverage + "\n" + "Failed");
        } else {
            JOptionPane.showMessageDialog(null, "Average = "+ gradeAverage + "\n" + "Passed");
        }
            
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author Jim Owen
 */
import javax.swing.JOptionPane;
public class MidtermSelfAssessment1 {
    public static void main(String[] args)
    {
        String input,passGrades="",failGrades="",invalidGrades="",inputGrades="";
        int index,grade;
        String students[] = new String[]{"Student 1","Student 2","Student 3","Student 4","Student 5"};
        Object selectStudents;
        for(index=1;index<=5;index++)
        {
            
            selectStudents = JOptionPane.showInputDialog(null, "Select Student: ",
                 "STUDENT LIST",JOptionPane.INFORMATION_MESSAGE,
                 null,students,students[0]);
            input=JOptionPane.showInputDialog("Enter grade: ");
            grade=Integer.parseInt(input); 
            inputGrades=inputGrades+"\n"+selectStudents+"=\t "+grade;  
            if(grade>=50 && grade<=100)
            {
                if(grade>=75)
                    passGrades=passGrades+"\n"+selectStudents+"=\t "+grade;  
                else
                    failGrades=failGrades+"\n"+selectStudents+"=\t "+grade;  
            }
            else
                invalidGrades=invalidGrades+"\n"+selectStudents+"=\t "+grade; 
        }
        JOptionPane.showMessageDialog(null,"STUDENT GRADE"+inputGrades
        +"\n\nPASSED"+passGrades+"\n\nFAILED"+failGrades+"\n\nINVALID"+invalidGrades,"STUDENT GRADES",JOptionPane.INFORMATION_MESSAGE);
        
    }
}

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

public class MidtermActvity1 {
    public static void main(String[] args) {
        // this creates an array for us to use
        int[] arrnumb1 = new int[5];
        String listofnumb1 = "", input1;
        int[] arrnumb2 = new int[5];
        String listofnumb2 = "", input2;
        
        // this is the index which we would use as a counter in the for loop
        int index;
        
        //this is the for loop that we would use to place something in the array
        for(index = 0; index < 5; index++ ){
            input1 = JOptionPane.showInputDialog("Array A Index[" + index + "]");
            arrnumb1[index] = Integer.parseInt(input1);
            listofnumb1 = listofnumb1 + "\n" + "A{"+index+"}: "+ arrnumb1[index];
            
        }
        
        for(index = 0; index < 5; index++ ){
            input2 = JOptionPane.showInputDialog("Array B Index[" + index + "]");
            arrnumb2[index] = Integer.parseInt(input2);
            listofnumb2 = listofnumb2 + "\n" + "B{"+index+"}: "+ arrnumb2[index];
            
        }
        // This Computes part computes the sum for each indexes in each array
        int[] sumarr = new int[5];
        sumarr[0] =arrnumb1[0] + arrnumb2[0];
        sumarr[1] =arrnumb1[1] + arrnumb2[1];
        sumarr[2] =arrnumb1[2] + arrnumb2[2];
        sumarr[3] =arrnumb1[3] + arrnumb2[3];
        sumarr[4] =arrnumb1[4] + arrnumb2[4];
        
        // this part lets us see the outcome of each sum the of the array by deisplaying it on the panel
        JOptionPane.showMessageDialog(null,"A[0]: " + arrnumb1[0] + " + " +" B[0]: " + arrnumb2[0] + " = " + sumarr[0] + 
                "\nA[1]: " + arrnumb1[1] + " + " +" B[1]: " + arrnumb2[1] + " = " + sumarr[1] + 
                "\nA[2]: " + arrnumb1[2] + " + " +" B[2]: " + arrnumb2[2] + " = " + sumarr[2] + 
                "\nA[3]: " + arrnumb1[3] + " + " +" B[3]: " + arrnumb2[3] + " = " + sumarr[3] + 
                "\nA[4]: " + arrnumb1[4] + " + " +" B[4]: " + arrnumb2[4] + " = " + sumarr[4] );
        
    }
}    


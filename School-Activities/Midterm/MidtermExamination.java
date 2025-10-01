/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm.MidtermExamination;

/**
 *
 * @author Jim Owen
 */
import javax.swing.JOptionPane;
public class MidtermExamination {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        String input;
        double CurrentBalance = 100;
        JOptionPane.showMessageDialog(null,"Welcome To Java Bank ","Message",JOptionPane.INFORMATION_MESSAGE);
        firstName = JOptionPane.showInputDialog(null,"Enter First Name: ",null,JOptionPane.QUESTION_MESSAGE);
        lastName = JOptionPane.showInputDialog(null,"Enter Last Name: ",null,JOptionPane.QUESTION_MESSAGE);
        String UserWholeName;
        UserWholeName = firstName+ " " + lastName;
        JOptionPane.showMessageDialog(null,"Welcome To Java Bank " + UserWholeName,"Message",JOptionPane.INFORMATION_MESSAGE);
        
        Object[] optionsSelection = {"Select Transaction" , "Exit"};
        int OptionChoices = JOptionPane.showOptionDialog(null, "What to do: ",
                "Bank Transaction",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsSelection,
                optionsSelection[0]);
        
        Object[] optionTransaction = {"Balance Inquiry","Withdraw" , "Deposit" , "Exit"};
        if (OptionChoices == 0){
            while(true){
                int TransactionChoices = JOptionPane.showOptionDialog(null, "What to do: ",
                "Bank Transaction",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionTransaction,
                optionTransaction[3]);
                
                User constructor = new User(UserWholeName,CurrentBalance);
                
                if (TransactionChoices == 0){
                    JOptionPane.showMessageDialog(null,"Account Name: " + UserWholeName +"\nBalance: "+constructor.userBalance, "Balance" , JOptionPane.INFORMATION_MESSAGE);
                    
                } else if (TransactionChoices == 1){
                    double withdraw;
                    String amountSelection[] = new String[]{"100" ,"200" ,"500" ,"1000" ,"3000" ,"5000" ,"6000" , "10000", "Other Amount"};
                    Object select;
                    amountSelection[0] = "100";
                    amountSelection[1] = "200";
                    amountSelection[2] = "500";
                    amountSelection[3] = "1000";
                    amountSelection[4] = "3000";
                    amountSelection[5] = "5000";
                    amountSelection[6] = "6000";
                    amountSelection[7] = "10000";
                    amountSelection[8] = "Other Amount";
                    
                    select = JOptionPane.showInputDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance + "\nAmount to Withdraw: ", "Selection" ,JOptionPane.INFORMATION_MESSAGE, null,amountSelection,amountSelection[0]);
                    if (select == amountSelection[0]){
                        int amount = 100;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  100
                            + "\nNew Balance: " + constructor.withdraw(100), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - 100;
                        }
                    } else if (select == amountSelection[1]){
                        int amount = 200;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    } else if (select == amountSelection[2]){
                        int amount = 500;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    } else if (select == amountSelection[3]){
                        int amount = 1000;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    } else if (select == amountSelection[4]){
                        int amount = 3000;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    } else if (select == amountSelection[5]){
                        int amount = 5000;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    } else if (select == amountSelection[6]){
                        int amount = 6000;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    }else if (select == amountSelection[7]){
                        int amount = 10000;
                        if (amount > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else {
                        JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Withdrawn: " +  amount
                            + "\nNew Balance: " + constructor.withdraw(amount), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                        CurrentBalance = CurrentBalance - amount;
                        }
                    } else if (select == amountSelection[8]){
                        input = JOptionPane.showInputDialog(null,"Account Name: " + UserWholeName +"\nBalance: "+constructor.userBalance +"\nEnter Amount to Withdraw:");
                        withdraw = Double.parseDouble(input);
                        if (withdraw < 100 || withdraw > CurrentBalance){
                        JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                        
                        } else if (withdraw % 1 != 0 && withdraw % 2 != 0 && withdraw % 3 != 0 && withdraw % 5 != 0) {
                            JOptionPane.showMessageDialog(null, "Cannot Withdraw with the Requested Amount", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                                + "\nCurrent Balance: " + constructor.userBalance
                                + "\nAmount Withdrawn: " +  withdraw
                                + "\nNew Balance: " + constructor.withdraw(withdraw), input, JOptionPane.INFORMATION_MESSAGE);
                            CurrentBalance = CurrentBalance - withdraw;
                        }
                        
                        
                    }


                        
                        
                } else if (TransactionChoices == 2){
                    input = JOptionPane.showInputDialog(null,"Balance: "+constructor.userBalance +"\nEnter Amount to Deposit:");
                    double deposit = Double.parseDouble(input);
                    JOptionPane.showMessageDialog(null, "Account Name: " + UserWholeName 
                            + "\nCurrent Balance: " + constructor.userBalance
                            + "\nAmount Deposited: " + deposit 
                            + "\nNew Balance: " + constructor.deposit(deposit), "Input", JOptionPane.INFORMATION_MESSAGE);
                    CurrentBalance = deposit + CurrentBalance;
                    
                } else if (TransactionChoices == 3){
                    JOptionPane.showMessageDialog(null,"Thank you " + UserWholeName + "For Using Java Bank!", "Message" , JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                
                    
            }
        }
        
            

    }
}

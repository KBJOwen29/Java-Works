/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threadexample;

/**
 *
 * @author Jim Owen
 */

// Class that prints numbers from 1 to 5
class NumberPrinter extends Thread {
    public void run() {
        // Loop to print 5 numbers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i); // Print the number
            try {
                Thread.sleep(500); // Pause for 0.5 seconds (to simulate work)
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print error if thread is interrupted
            }
        }
    }
}

// Class that prints letters from A to E
class LetterPrinter extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c); // Print the letter
            try {
                Thread.sleep(700); // Pause for 0.7 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Class that prints the current system time
class TimePrinter extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Time: " + java.time.LocalTime.now()); 
            try {
                Thread.sleep(1000); // Pause for 1 second before printing again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main program class
public class ThreadExample {
    public static void main(String[] args) {
        // Create 3 thread objects (each one will run its own run() method)
        NumberPrinter t1 = new NumberPrinter();
        LetterPrinter t2 = new LetterPrinter();
        TimePrinter t3 = new TimePrinter();

        // Start the threads (this calls their run() methods in parallel)
        t1.start();
        t2.start();
        t3.start();

        // Synchronization: make sure main waits until all threads are finished
        try {
            t1.join(); // Wait until NumberPrinter finishes
            t2.join(); // Wait until LetterPrinter finishes
            t3.join(); // Wait until TimePrinter finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // When all threads are done, main program continues
        System.out.println("All threads have finished. Main program exiting.");
    }
}

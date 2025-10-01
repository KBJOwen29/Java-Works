import javax.swing.*;
import java.util.ArrayList;

public class MainApp extends JFrame {
    // Activity history for the current session, stored in memory only
    private ArrayList<String> activityHistory = new ArrayList<>(); 

    // Constructor to set up the application window
    public MainApp() {
        setTitle("Permutation and Combination System");  // Set the title of the application
        setSize(400, 400);  // Set the window size
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Close the application when the window is closed
        setLayout(null);  // Use absolute positioning for components

        showMainMenu();  // Display the main menu as soon as the application starts
    }

    // Method to display the main menu
    private void showMainMenu() {
        // Clear the window and prepare for fresh components
        getContentPane().removeAll();
        repaint();  

        // Label to prompt the user to choose an option
        JLabel menuLabel = new JLabel("Main Menu - Choose an option:");
        menuLabel.setBounds(100, 20, 200, 30);  // Set position and size of the label
        add(menuLabel);

        // Create a button for Linear Permutation calculation
        JButton linearButton = new JButton("Linear Permutation");
        linearButton.setBounds(100, 60, 200, 30);
        add(linearButton);
        linearButton.addActionListener(e -> performLinearPermutation());  // Attach event handler

        // Create a button for Circular Permutation calculation
        JButton circularButton = new JButton("Circular Permutation");
        circularButton.setBounds(100, 100, 200, 30);
        add(circularButton);
        circularButton.addActionListener(e -> performCircularPermutation());  // Attach event handler

        // Create a button for Permutation with Repeats calculation
        JButton repeatedButton = new JButton("Permutation with Repeats");
        repeatedButton.setBounds(100, 140, 200, 30);
        add(repeatedButton);
        repeatedButton.addActionListener(e -> performPermutationWithRepeats());  // Attach event handler

        // Create a button for Truncated Permutation calculation
        JButton truncatedButton = new JButton("Truncated Permutation");
        truncatedButton.setBounds(100, 180, 200, 30);
        add(truncatedButton);
        truncatedButton.addActionListener(e -> performTruncatedPermutation());  // Attach event handler

        // Create a button for Combination calculation
        JButton combinationButton = new JButton("Combination");
        combinationButton.setBounds(100, 220, 200, 30);
        add(combinationButton);
        combinationButton.addActionListener(e -> performCombination());  // Attach event handler

        // Create a button to view the current session's activity history
        JButton viewHistoryButton = new JButton("View Activity History");
        viewHistoryButton.setBounds(100, 260, 200, 30);
        add(viewHistoryButton);
        viewHistoryButton.addActionListener(e -> viewActivityHistory());  // Attach event handler

        // Create a button to exit the application
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(100, 300, 200, 30);
        add(exitButton);
        exitButton.addActionListener(e -> System.exit(0));  // Attach event handler to exit the app

        setVisible(true);  // Display the window
    }

    // Method to handle Linear Permutation logic
    private void performLinearPermutation() {
        // Get the number of items from the user input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of items:"));
        LinearPermutation lp = new LinearPermutation();
        int result = lp.calculate(n);  // Calculate the result
        JOptionPane.showMessageDialog(null, "Linear Permutation result: " + result);
        logActivity("Calculated Linear Permutation for " + n + ": " + result);  // Log the activity
    }

    // Method to handle Circular Permutation logic
    private void performCircularPermutation() {
        // Get the number of items from the user input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of items:"));
        CircularPermutation cp = new CircularPermutation();
        int result = cp.calculate(n);  // Calculate the result
        JOptionPane.showMessageDialog(null, "Circular Permutation result: " + result);
        logActivity("Calculated Circular Permutation for " + n + ": " + result);  // Log the activity
    }

    // Method to handle Permutation with Repeats logic
    private void performPermutationWithRepeats() {
        // Get the items as a comma-separated string
        String input = JOptionPane.showInputDialog("Enter items separated by commas (e.g., A,A,B):");
        if (input != null && !input.trim().isEmpty()) {
            String[] items = input.split(",");  // Split the input into an array of items
            PermutationWithRepeats pw = new PermutationWithRepeats();
            int result = pw.calculate(items);  // Calculate the result
            JOptionPane.showMessageDialog(null, "Permutation with Repeats result: " + result);
            logActivity("Calculated Permutation with Repeats for " + input + ": " + result);  // Log the activity
        }
    }

    // Method to handle Truncated Permutation logic
    private void performTruncatedPermutation() {
        // Get the total number of items and number of selections from user input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number of items:"));
        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of selections:"));
        TruncatedPermutation tp = new TruncatedPermutation();
        int result = tp.calculate(n, r);  // Calculate the result
        JOptionPane.showMessageDialog(null, "Truncated Permutation result: " + result);
        logActivity("Calculated Truncated Permutation for n=" + n + ", r=" + r + ": " + result);  // Log the activity
    }

    // Method to handle Combination logic
    private void performCombination() {
        // Get the total number of items and number of selections from user input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number of items:"));
        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of selections:"));
        Combination c = new Combination();
        int result = c.calculate(n, r);  // Calculate the result
        JOptionPane.showMessageDialog(null, "Combination result: " + result);
        logActivity("Calculated Combination for n=" + n + ", r=" + r + ": " + result);  // Log the activity
    }

    // Method to display the current session's activity history
    private void viewActivityHistory() {
        StringBuilder historyText = new StringBuilder("Activity History:\n");
        // Append each logged activity to the history text
        for (String activity : activityHistory) {
            historyText.append(activity).append("\n");
        }
        // Display the session's activity history
        JOptionPane.showMessageDialog(null, historyText.toString());
    }

    // Method to log each activity during the session
    private void logActivity(String activity) {
        activityHistory.add(activity);  // Add the activity to the list
    }

    // Main method to launch the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp());  // Create the MainApp window
    }
}

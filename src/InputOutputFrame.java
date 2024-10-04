package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputOutputFrame {
    // Declare the JTextArea and JTextField
    private JTextArea outputArea;
    private JTextField inputField;

    // Constructor
    public InputOutputFrame() {
        // Create the main frame
        JFrame mainFrame = new JFrame("Input Output Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());

        // Create the output area
        outputArea = new JTextArea();
        outputArea.setEditable(false); // Make it read-only
        JScrollPane scrollPane = new JScrollPane(outputArea);
        mainFrame.add(scrollPane, BorderLayout.CENTER);

        // Create the input field
        inputField = new JTextField();
        mainFrame.add(inputField, BorderLayout.SOUTH);

        // Add action listener to handle input
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                outputArea.append("You entered: " + inputText + "\n");
                inputField.setText(""); // Clear input field
            }
        });

        // Make the frame visible
        mainFrame.setVisible(true);
    }
}
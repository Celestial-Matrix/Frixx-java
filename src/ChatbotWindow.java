package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ChatbotWindow {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private PipedOutputStream pipedOut;

    public ChatbotWindow() {
        // Create the JFrame and components
        frame = new JFrame("Chatbot Console");
        chatArea = new JTextArea(20, 50);
        inputField = new JTextField(40);
        sendButton = new JButton("Send");

        // Set up the layout
        JPanel inputPanel = new JPanel();
        inputPanel.add(inputField);
        inputPanel.add(sendButton);

        // Add components to frame
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        // Disable chat area editing
        chatArea.setEditable(false);

        try {
            redirectSystemOutput();
            redirectSystemInput();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add action listener for the send button
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processUserCommand();
            }
        });

        // Allow pressing "Enter" in the input field to send the command
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processUserCommand();
            }
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Process user input as a command and send it to the main class
    private void processUserCommand() {
        String command = inputField.getText().trim();
        if (!command.isEmpty()) {
            // Print the command to the console for visual feedback
            System.out.println(command);

            // Send the command to the piped input stream, simulating console input
            try {
                pipedOut.write((command + "\n").getBytes());
                pipedOut.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Clear the input field after sending the command
            inputField.setText("");
        }
    }

    // Redirects System.out to the JTextArea
    private void redirectSystemOutput() {
        PrintStream printStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                // Append the output to the chat area (JTextArea)
                chatArea.append(String.valueOf((char) b));
                chatArea.setCaretPosition(chatArea.getDocument().getLength());
            }
        });

        // Set the new output stream to System.out
        System.setOut(printStream);
    }

    // Redirects System.in using Piped streams to simulate console input
    private void redirectSystemInput() throws IOException {
        PipedInputStream pipedIn = new PipedInputStream();
        pipedOut = new PipedOutputStream(pipedIn);
        System.setIn(pipedIn); // Set System.in to the piped input stream
    }
}

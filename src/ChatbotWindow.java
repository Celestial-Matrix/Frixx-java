

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
        frame = new JFrame("Frix");

        // Disable the maximize button by making the frame non-resizable
        frame.setResizable(false); // This disables the maximize button only

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

        // Set the window to be always on top
        frame.setAlwaysOnTop(false);

        // Request focus on the input field
        inputField.requestFocusInWindow();
    }

    // Process user input as a command and send it to the main class
    private void processUserCommand() {
        String command = inputField.getText().trim();
        if (!command.isEmpty()) {
            // Append the input to chat area with "Me: " for display purposes
            chatArea.append("Me: " + command + "\n");

            // Send the command to the piped input stream (simulate console input)
            try {
                pipedOut.write((command + "\n").getBytes());
                pipedOut.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Clear the input field
            inputField.setText("");

            // Limit chat history if needed
            
        } else {
            // Optionally handle empty input
            chatArea.append("Me: (empty input)\n");
        }
    }

    // Redirects System.out to the JTextArea
    private void redirectSystemOutput() {
        PrintStream printStream = new PrintStream(new OutputStream() {
            private StringBuilder buffer = new StringBuilder();

            @Override
            public void write(int b) {
                char c = (char) b;

                if (c == '\n') {
                    if (buffer.length() > 0) {
                        String output = buffer.toString().trim();
                        // Append only non-empty output
                        if (!output.isEmpty()) {
                            chatArea.append(output + "\n");
                        }
                        buffer.setLength(0); // Reset buffer
                    }
                } else {
                    buffer.append(c);
                }

                // Auto-scroll to the bottom
                chatArea.setCaretPosition(chatArea.getDocument().getLength());
            }
        });

        System.setOut(printStream);
    }

    // Redirects System.in using Piped streams to simulate console input
    private void redirectSystemInput() throws IOException {
        PipedInputStream pipedIn = new PipedInputStream();
        pipedOut = new PipedOutputStream(pipedIn);
        System.setIn(pipedIn); // Set System.in to the piped input stream
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatbotWindow::new); // Run the GUI on the Event Dispatch Thread
    }
}

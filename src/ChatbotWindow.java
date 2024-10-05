import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatbotWindow {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    // Constructor that sets up the JFrame and handles input/output
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

        // Add action listener for the send button
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processUserInput();
            }
        });

        // Allow pressing "Enter" in the input field to send the message
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processUserInput();
            }
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Process user input and display it along with the chatbot's response
    private void processUserInput() {
        String userInput = inputField.getText().trim();
        if (!userInput.isEmpty()) {
            appendChat("You: " + userInput);  // Display the user's input

            // Get chatbot response (internal logic handled here)
            String chatbotResponse = handleChatbotResponse(userInput);
            appendChat("Chatbot: " + chatbotResponse);

            // Clear input field for next input
            inputField.setText("");
        }
    }

    // Append messages to the chat area
    private void appendChat(String message) {
        chatArea.append(message + "\n");
        chatArea.setCaretPosition(chatArea.getDocument().getLength());  // Scroll to the bottom
    }

    // Chatbot logic to process user input and return the response
    private String handleChatbotResponse(String input) {
        // Example simple chatbot logic (replace with your chatbot logic)
        if (input.equalsIgnoreCase("hello")) {
            return "Hello! How can I assist you today?";
        } else if (input.equalsIgnoreCase("bye")) {
            return "Goodbye! Have a great day!";
        } else {
            return "I'm sorry, I didn't understand that.";
        }
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ChatbotWindow {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private JLabel dateLabel; // Label to display the date and day
    private JLabel timeLabel; // Label to display the time
    private PipedOutputStream pipedOut;

    public ChatbotWindow() {
        // Create the JFrame and components
        frame = new JFrame("Frix");

        // Disable the maximize button by making the frame non-resizable
        frame.setResizable(false); // This disables the maximize button only

        ImageIcon icon = new ImageIcon(getClass().getResource("./media/Frix.jpg"));
        frame.setIconImage(icon.getImage());

        chatArea = new JTextArea(20, 50);
        inputField = new JTextField(40);
        sendButton = new JButton("Send");
        
        // Initialize the labels for date and time
        dateLabel = new JLabel();
        timeLabel = new JLabel();

        // Set up the layout
        JPanel inputPanel = new JPanel();
        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        
        // Add components to frame
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);
        
        // Create a panel for the date and time labels
        JPanel dateTimePanel = new JPanel(new GridLayout(2, 1)); // Vertical layout
        dateTimePanel.add(dateLabel);
        dateTimePanel.add(timeLabel);
        dateTimePanel.setAlignmentX(Component.RIGHT_ALIGNMENT); // Align to the right
        
        frame.add(dateTimePanel, BorderLayout.NORTH); // Add dateTimePanel to the top

        // Disable chat area editing
        chatArea.setEditable(false);

        try {
            redirectSystemOutput();
            redirectSystemInput();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add action listener for the send button
        sendButton.addActionListener(e -> processUserCommand());

        // Allow pressing "Enter" in the input field to send the command
        inputField.addActionListener(e -> processUserCommand());

        // Set the date and time labels' initial texts
        updateDateTime();

        // Timer to update the date and time every second
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateDateTime();
            }
        }, 0, 1000); // Update every second

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Set the window to be always on top
        frame.setAlwaysOnTop(false);

        // Request focus on the input field
        inputField.requestFocusInWindow();
    }

    // Update the date and time labels with the current date and time
    private void updateDateTime() {
        SwingUtilities.invokeLater(() -> {
            String currentDate = new SimpleDateFormat("EEEE, yyyy-MM-dd").format(new Date()); // Include day
            String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
            dateLabel.setText("Date: " + currentDate);
            timeLabel.setText("Time: " + currentTime);
            dateLabel.setHorizontalAlignment(SwingConstants.RIGHT); // Align to the right
            timeLabel.setHorizontalAlignment(SwingConstants.RIGHT); // Align to the right
        });
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

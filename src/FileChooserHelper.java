
import javax.swing.*;
import java.io.File;

public class FileChooserHelper {
    // Method to open file chooser
    public static void openFileChooser() {
        System.out.println("Sewer Sir! Here is the Dialog Dabba");

                    // Create the JDialog for the file chooser
                    JDialog fileDialog = new JDialog();
                    fileDialog.setTitle("Select and Open File");
                    fileDialog.setAlwaysOnTop(true);
                    fileDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    fileDialog.setSize(300, 200);
                    fileDialog.setLocationRelativeTo(null); // Center the dialog on the screen

                    // Add a window listener to close the dialog after the file chooser closes
                    fileDialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                            fileDialog.dispose(); // Close the dialog when the window is closing
                        }
                    });
                    // Make the dialog visible
                    

                    // Open the file chooser in a modal dialog
                    JFileChooser fileChooser = new JFileChooser();
                    int returnValue = fileChooser.showOpenDialog(fileDialog);
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        @SuppressWarnings("unused")
                        File selectedFile = fileChooser.getSelectedFile();
                        // Process the selected file
                    }
                    fileDialog.setVisible(true);
                    // After file chooser closes, dispose of the dialog
                    fileDialog.dispose();

        }
    }

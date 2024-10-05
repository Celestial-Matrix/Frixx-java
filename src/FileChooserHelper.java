package src;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class FileChooserHelper {
    // Method to open file chooser
    public static void openFileChooser(JFrame frame) {
        // Create a JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        // Set the dialog title
        fileChooser.setDialogTitle("Select a file to open");

        // Show the file chooser dialog
        int returnValue = fileChooser.showOpenDialog(frame);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();
            // Open the selected file
            try {
                Desktop.getDesktop().open(selectedFile);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error opening file: " + ex.getMessage());
            }
        }
    }
}
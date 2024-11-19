package com.heavenly_matrix.tools;
import java.net.URI;
import java.util.*;
import java.awt.*;

public class web {
    private static String getSeparatorLine() {
        return "______________________________________________________________________________";
        
    }

    public void open() {
        while (true) {
            System.out.println();
            System.out.println("Entering Custom URL mode...");
            System.out.println();
            Scanner in = new Scanner(System.in);
            System.out.println("1 for Enter Custom URL");
            System.out.println("2 for exit Custom URL mode");
            System.out.println();

            int option = -1; // Initialize with a default invalid option
            try {
                System.out.println(getSeparatorLine());
                option = in.nextInt();
                in.nextLine(); // Clear the buffer
            } catch (InputMismatchException e) {
                System.out.println("Wrong Statement! Enter again");
                in.nextLine(); // Clear the buffer for the next input
                continue; // Restart the loop
            }

            if (option == 1) {
                System.out.println("1 for WWW protocol");
                System.out.println("2 for HTTPS protocol");
                System.out.println("Select the protocol");

                int select_protocol;

                try {
                    System.out.println(getSeparatorLine());
                    select_protocol = in.nextInt();
                    in.nextLine(); // Clear the buffer

                } catch (InputMismatchException e) {
                    System.out.println("Wrong Statement! Enter again");
                    in.nextLine(); // Clear the buffer for the next input
                    continue; // Restart the loop
                }

                String prefix;

                switch (select_protocol) {
                    case 1:
                        prefix = "www.";
                        break; // Break here to continue below
                    case 2:
                        prefix = "https://";
                        break; // Break here to continue below
                    default:
                        System.out.println("Invalid protocol selection.");
                        continue; // Skip the rest of this iteration
                }

                try {
                    System.out.println("Enter Custom URL, Please don't type the prefix (e.g., www)");
                    String url = in.nextLine();
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI(prefix + url);
                    desktop.browse(oURL);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
              
            } else if (option == 2) {
                break; // Exit the custom URL mode
            } else {
                System.out.println("Wrong Statement! Enter again");
            }
            System.out.println(getSeparatorLine());
        }
    }
}

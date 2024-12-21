package com.heavenly_matrix.tools.Easter_Eggs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Matchmaker {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Matchmaker");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 500);
            frame.setLayout(new BorderLayout());

            JLabel instructionLabel = new JLabel("Take pictures of two people to find their compatibility!",
                    SwingConstants.CENTER);
            instructionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            frame.add(instructionLabel, BorderLayout.NORTH);

            JPanel cameraPanel = new JPanel();
            cameraPanel.setLayout(new GridLayout(1, 2, 10, 10));
            JPanel camera1View = new JPanel();
            camera1View.setBackground(Color.BLACK); // Simulated camera view
            JLabel camera1Label = new JLabel("Camera 1 View", SwingConstants.CENTER);
            camera1Label.setForeground(Color.WHITE);
            camera1View.setLayout(new BorderLayout());
            camera1View.add(camera1Label, BorderLayout.CENTER);

            JPanel camera2View = new JPanel();
            camera2View.setBackground(Color.BLACK); // Simulated camera view
            JLabel camera2Label = new JLabel("Camera 2 View", SwingConstants.CENTER);
            camera2Label.setForeground(Color.WHITE);
            camera2View.setLayout(new BorderLayout());
            camera2View.add(camera2Label, BorderLayout.CENTER);

            cameraPanel.add(camera1View);
            cameraPanel.add(camera2View);
            frame.add(cameraPanel, BorderLayout.CENTER);

            JPanel bottomPanel = new JPanel();
            bottomPanel.setLayout(new BorderLayout());

            JButton takePictureButton = new JButton("Take Pictures");
            takePictureButton.setFont(new Font("Arial", Font.BOLD, 16));
            bottomPanel.add(takePictureButton, BorderLayout.NORTH);

            JLabel resultLabel = new JLabel("", SwingConstants.CENTER);
            resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
            bottomPanel.add(resultLabel, BorderLayout.SOUTH);

            frame.add(bottomPanel, BorderLayout.SOUTH);

            takePictureButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    takePictureButton.setEnabled(false); // Disable button during simulation
                    resultLabel.setText("");

                    // Simulate accessing the first camera
                    camera1Label.setText("Accessing Camera 1...");
                    Timer timer1 = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt1) {
                            camera1Label.setText("Camera 1: Picture Taken!");
                            ((Timer) evt1.getSource()).stop();

                            // Simulate accessing the second camera
                            camera2Label.setText("Accessing Camera 2...");
                            Timer timer2 = new Timer(2000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt2) {
                                    camera2Label.setText("Camera 2: Picture Taken!");
                                    ((Timer) evt2.getSource()).stop();

                                    // Calculate and show compatibility
                                    int compatibility = (int) (Math.random() * 101);
                                    resultLabel.setText("Compatibility: " + compatibility + "%");
                                    takePictureButton.setEnabled(true); // Re-enable button
                                }
                            });
                            timer2.setRepeats(false);
                            timer2.start();
                        }
                    });
                    timer1.setRepeats(false);
                    timer1.start();
                }
            });

            frame.setLocationRelativeTo(null); // Center the window
            frame.setVisible(true);
        });
    }
}

package com.heavenly_matrix.game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PingPongGame extends JPanel implements ActionListener {
    private Timer timer;
    private int ballX = 300, ballY = 200; // Initial ball position
    private double ballVelX = 4, ballVelY = 4; // Ball velocity
    private int paddleX = 250, paddleWidth = 100, paddleHeight = 10;
    private int paddleVelX = 0; // Paddle velocity
    private final int PADDLE_SPEED = 10; // Speed of paddle movement
    private Color ballColor = Color.BLUE; // Ball color for visual feedback
    private JFrame frame; // Reference to the JFrame
    private int paddleBounceCount = 0; // Counter for the number of paddle bounces

    // Set the paddleY position relative to the panel's height
    private int paddleY;

    // Flag to track whether the game is paused
    private boolean isPaused = false;

    public PingPongGame(JFrame frame) {
        this.frame = frame; // Save the reference to the frame
        this.setPreferredSize(new Dimension(600, 450)); // Explicitly set preferred size for the game panel

        // Calculate the paddleY position dynamically
        paddleY = 400; // Adjusted to fit within the panel

        timer = new Timer(16, this); // Approximately 60 FPS
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    paddleVelX = -PADDLE_SPEED; // Move left
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    paddleVelX = PADDLE_SPEED; // Move right
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    paddleVelX = 0; // Stop moving when key is released
                }
            }
        });

        // Start the game after a short delay
        Timer startDelay = new Timer(1000, e -> timer.start()); // Start timer after 1 second
        startDelay.setRepeats(false); // Only run once
        startDelay.start();
    }

    // Method to toggle the pause state
    private void togglePause() {
        if (isPaused) {
            timer.start(); // Resume the timer
        } else {
            timer.stop(); // Pause the timer
        }
        isPaused = !isPaused; // Toggle the paused state
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(ballColor);
        g.fillOval(ballX, ballY, 20, 20); // Draw the ball
        g.setColor(Color.RED);
        g.fillRect(paddleX, paddleY, paddleWidth, paddleHeight); // Draw the paddle

        // Display the paddle bounce count
        g.setColor(Color.BLACK);
        g.drawString("SCORE: " + paddleBounceCount, 10, 20); // Display paddle bounce count at the top left
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isPaused) {
            // Move the ball
            ballX += ballVelX;
            ballY += ballVelY;

            // Bounce off walls
            if (ballX < 0 || ballX > getWidth() - 20) {
                ballVelX = -ballVelX; // Reverse direction
            }
            if (ballY < 0) {
                ballVelY = -ballVelY; // Reverse direction
            }

            // Move paddle
            paddleX += paddleVelX;
            // Prevent the paddle from moving off-screen
            paddleX = Math.max(paddleX, 0);
            paddleX = Math.min(paddleX, getWidth() - paddleWidth);

            // Bounce off paddle
            if (ballY + 20 >= paddleY && ballX + 20 > paddleX && ballX < paddleX + paddleWidth) {
                ballVelY = -ballVelY; // Reverse vertical direction
                ballY = paddleY - 20; // Position ball above the paddle
                ballColor = Color.GREEN; // Change color on hit for visual feedback
                paddleBounceCount++; // Increment paddle bounce count

                // Optional: Slightly increase ball speed for difficulty
                ballVelX *= 1.05;
                ballVelY *= 1.05;
            } else {
                ballColor = Color.BLUE; // Reset ball color when not hitting paddle
            }

            // Game over condition
            if (ballY > getHeight()) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over! Score: " + paddleBounceCount); // Show game over message
                frame.dispose(); // Close the game window
            }

            repaint(); // Refresh the game state
        }
    }

    // Change the method to public so it can be accessed externally
    public void endGame() {
        timer.stop();
        JOptionPane.showMessageDialog(this, "Game Ended! Score: " + paddleBounceCount); // Show end game message
        frame.dispose(); // Close the game window
    }

    public void pauseGame() {
        togglePause(); // Toggle pause state
    }
}

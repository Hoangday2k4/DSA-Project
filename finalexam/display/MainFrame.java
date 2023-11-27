package finalexam.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        frame = new JFrame("Sorting Visualization");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // UI components
        JLabel titleLabel = new JLabel("Sorting Visualization");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JButton singleModeButton = new JButton("Single Mode");
        JButton compareModeButton = new JButton("Compare Mode");
        JButton customAlgorithmButton = new JButton("Your Custom Algorithm");

        // Set button size
        Dimension buttonSize = new Dimension(200, 50);
        singleModeButton.setPreferredSize(buttonSize);
        compareModeButton.setPreferredSize(buttonSize);
        customAlgorithmButton.setPreferredSize(buttonSize);

        // Add actions to buttons
        singleModeButton.addActionListener(e -> openSingleModeFrame());
        //compareModeButton.addActionListener(e -> openCompareModeFrame());
        customAlgorithmButton.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "Your Custom Algorithm Selected"));

        // Create panel
        JPanel panel = new JPanel();
        panel.add(titleLabel);
        panel.add(singleModeButton);
        panel.add(compareModeButton);
        panel.add(customAlgorithmButton);

        // Add panel to frame
        frame.add(panel);

        // Display frame
        frame.setVisible(true);
    }

    private void openSingleModeFrame() {
        ModeFrame singleModeFrame = new SingleModeFrame(this);
        singleModeFrame.setVisible(true);
        frame.setVisible(false);
    }

    /*private void openCompareModeFrame() {
        ModeFrame compareModeFrame = new CompareModeFrame(this);
        compareModeFrame.setVisible(true);
        frame.setVisible(false);
    }*/

    void showMainFrame() {
        frame.setVisible(true);
    }
}
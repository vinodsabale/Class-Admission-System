package com.mycompany.signuppage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCourse {

    // Constructor for creating the GUI
    public UpdateCourse() {
        // Create the frame
        JFrame frame = new JFrame("Update Course");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels and text fields
        JLabel nameLabel = new JLabel("Course Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);
        frame.add(nameField);

        JLabel costLabel = new JLabel("New Cost:");
        costLabel.setBounds(50, 100, 100, 30);
        frame.add(costLabel);

        JTextField costField = new JTextField();
        costField.setBounds(150, 100, 150, 30);
        frame.add(costField);

        // Update button
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(150, 150, 100, 30);
        frame.add(updateButton);

        // ActionListener for the update button
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseName = nameField.getText().trim(); // Get course name
                String costText = costField.getText().trim();   // Get new cost

                if (courseName.isEmpty() || costText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                    return;
                }

                try {
                    double newCost = Double.parseDouble(costText); // Validate cost as a number
                    updateCourseInDatabase(courseName, newCost);  // Update database
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Cost must be a valid number.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to update the course in the database
    private void updateCourseInDatabase(String courseName, double newCost) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/csfsms?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1111";
        String updateQuery = "UPDATE course SET cost = ? WHERE cname = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {

            pstmt.setDouble(1, newCost);
            pstmt.setString(2, courseName);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Course updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No course found with the given name.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new UpdateCourse(); // Create and show the UpdateCourse GUI
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

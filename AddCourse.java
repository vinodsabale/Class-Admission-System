/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.signuppage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddCourse {

    // Constructor for creating the GUI
    public AddCourse() {
        // Create the frame
        JFrame frame = new JFrame("Add Course");
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

        JLabel costLabel = new JLabel("Course Cost:");
        costLabel.setBounds(50, 100, 100, 30);
        frame.add(costLabel);

        JTextField costField = new JTextField();
        costField.setBounds(150, 100, 150, 30);
        frame.add(costField);

        // Add button
        JButton addButton = new JButton("Add Course");
        addButton.setBounds(150, 150, 100, 30);
        frame.add(addButton);

        // ActionListener for the add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseName = nameField.getText().trim();  // Get course name
                String costText = costField.getText().trim();    // Get course cost

                if (courseName.isEmpty() || costText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in both fields.");
                    return;
                }

                try {
                    double courseCost = Double.parseDouble(costText);  // Validate cost as a number
                    addCourseToDatabase(courseName, courseCost);  // Add course to the database
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Course cost must be a valid number.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to add the course to the database
    private void addCourseToDatabase(String courseName, double courseCost) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/csfsms?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1111";
        String insertQuery = "INSERT INTO course (cname, cost) VALUES (?, ?)";  // SQL query to insert course

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            pstmt.setString(1, courseName);  // Set the course name
            pstmt.setDouble(2, courseCost);  // Set the course cost

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Course added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add the course.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new AddCourse(); // Create and show the AddCourse GUI
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

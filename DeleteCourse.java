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

public class DeleteCourse {

    // Constructor for creating the GUI
    public DeleteCourse() {
        // Create the frame
        JFrame frame = new JFrame("Delete Course");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels and text fields
        JLabel idLabel = new JLabel("Course ID:");
        idLabel.setBounds(50, 50, 100, 30);
        frame.add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(150, 50, 150, 30);
        frame.add(idField);

        // Delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(150, 100, 100, 30);
        frame.add(deleteButton);

        // ActionListener for the delete button
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseIdText = idField.getText().trim();  // Get course ID

                if (courseIdText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in the course ID.");
                    return;
                }

                try {
                    int courseId = Integer.parseInt(courseIdText);  // Validate ID as a number
                    deleteCourseFromDatabase(courseId);  // Delete course based on ID
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Course ID must be a valid number.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to delete the course from the database based on course ID
    private void deleteCourseFromDatabase(int courseId) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/csfsms?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1111";
        String deleteQuery = "DELETE FROM course WHERE id = ?";  // SQL query to delete by ID

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {

            pstmt.setInt(1, courseId);  // Set the course ID to the prepared statement

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Course deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No course found with the given ID.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new DeleteCourse(); // Create and show the DeleteCourse GUI
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

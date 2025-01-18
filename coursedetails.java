/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.signuppage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class coursedetails extends JFrame {
    public coursedetails() {
        setTitle("Course Details");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String url = "jdbc:mysql://localhost:3306/csfsms?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1111";

        JPanel panel = new JPanel(new BorderLayout());
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new String[] {"Name", "Cost"}, 0);

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT cname, cost FROM course";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[] {rs.getString("cname"), rs.getString("cost")});
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No course data found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }

        table.setModel(model);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        add(panel);

        setLocationRelativeTo(null); // Center window on screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            coursedetails courseDetails = new coursedetails();
            courseDetails.setVisible(true);
        });
    }
}

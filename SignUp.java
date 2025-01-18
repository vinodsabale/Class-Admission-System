/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.signuppage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vsabale
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtcpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtmnumber = new javax.swing.JTextField();
        btnsignup = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        lblmnumbererror = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblcpassworderror = new javax.swing.JLabel();
        lblpassworderror = new javax.swing.JLabel();
        lblmnumbererror1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Sign Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 550, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 154, 105, -1));

        txtfname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtfname.setForeground(new java.awt.Color(0, 51, 255));
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 154, 108, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 194, 105, -1));

        txtlname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtlname.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 194, 108, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 245, 105, -1));

        txtuname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtuname.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 245, 108, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 204));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 297, 105, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 297, 108, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 204));
        jLabel7.setText("Conform Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, -1, -1));

        txtcpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtcpassword.setForeground(new java.awt.Color(0, 0, 255));
        txtcpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpasswordActionPerformed(evt);
            }
        });
        txtcpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcpasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcpasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtcpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 345, 108, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 204));
        jLabel6.setText("Mobile No:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 392, 105, -1));

        txtmnumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtmnumber.setForeground(new java.awt.Color(0, 51, 255));
        txtmnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmnumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmnumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmnumberKeyTyped(evt);
            }
        });
        getContentPane().add(txtmnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 392, 108, -1));

        btnsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(204, 0, 204));
        btnsignup.setText("Sign Up");
        btnsignup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 449, 90, -1));

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(204, 0, 204));
        btnclear.setText("Clear");
        btnclear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 70, -1));

        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(204, 0, 204));
        btnlogin.setText("Login");
        btnlogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 50, -1));

        lblmnumbererror.setBackground(new java.awt.Color(204, 255, 51));
        lblmnumbererror.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(lblmnumbererror, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 392, 265, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 470, 264, 22));

        lblcpassworderror.setBackground(new java.awt.Color(255, 255, 204));
        lblcpassworderror.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblcpassworderror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblcpassworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 257, 20));

        lblpassworderror.setBackground(new java.awt.Color(255, 255, 204));
        lblpassworderror.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblpassworderror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblpassworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 257, 20));

        lblmnumbererror1.setBackground(new java.awt.Color(204, 255, 204));
        lblmnumbererror1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblmnumbererror1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblmnumbererror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 210, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
 passwordCheck(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
  passwordCheck();        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
  passwordCheck();             // TODO add your handling code here:
             
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
  passwordCheck();            // TODO add your handling code here:
           
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtcpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpasswordActionPerformed
        // TODO add your handling code here:
      //  passwordCheck();
        conformpassword();

    }//GEN-LAST:event_txtcpasswordActionPerformed

    private void txtmnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnumberKeyPressed
           // TODO add your handling code here:
           mobileCheck();
    }//GEN-LAST:event_txtmnumberKeyPressed

    private void txtmnumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnumberKeyReleased
              // TODO add your handling code here:
              mobileCheck();
    }//GEN-LAST:event_txtmnumberKeyReleased

    private void txtmnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnumberKeyTyped
            // TODO add your handling code here:
            mobileCheck();
    }//GEN-LAST:event_txtmnumberKeyTyped

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        validation();
        if(validation())
        {
          insertData();
          
        }
        else
        {
            JOptionPane.showMessageDialog(this,"validation error");
        }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtfname.setText("");
        txtlname.setText("");
        txtuname.setText("");
        txtpassword.setText("");
        txtcpassword.setText("");

        txtmnumber.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked

    }//GEN-LAST:event_btnloginMouseClicked

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginMousePressed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        login l1=new login();
        l1.show();
        this.dispose();
        
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtcpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpasswordKeyPressed
        conformpassword();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpasswordKeyPressed

    private void txtcpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpasswordKeyReleased
conformpassword();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpasswordKeyReleased

    private void txtcpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpasswordKeyTyped
conformpassword();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpasswordKeyTyped
 String fname,lname,uname,password,cpassword,mnumber;
       
        boolean validation()
        {
            fname=txtfname.getText();
            lname=txtlname.getText();
            uname=txtuname.getText();
            password=txtpassword.getText();
            cpassword=txtcpassword.getText();
           
            mnumber=txtmnumber.getText();
            
             if(fname.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Enter the First name");
                return false;
            }
              if(lname.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Enter the last name");
                return false;
            }
               if(uname.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Enter the user name");
                return false;
            }
              if(password.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Enter the password");
                return false;
            }
              if(cpassword.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Enter thee conform password");
                return false;
            }
          
           if(mnumber.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Enter your Mobile Nomber");
                return false;
            }
            return true;
        }
          void passwordCheck()
        {
             password=txtpassword.getText();
             if(password.length()>8)
             {
                 lblpassworderror.setText("");
             }
             else
             {
                 lblpassworderror.setText("Enter 8 number of password");   
             }
             
        }
         void conformpassword() {
    // Get text from password and confirm password fields
    String password = txtpassword.getText(); // Assuming txtpassword is the field for password
    String cpassword = txtcpassword.getText();

    // Compare the two values
    if (password.equals(cpassword)) {
        lblcpassworderror.setText(""); // Clear error message if they match
    } else {
        lblcpassworderror.setText("Password does not match"); // Show error message if they don't match
    }
}

        void mobileCheck()
        {
              mnumber=txtmnumber.getText();
            if(mnumber.length()==10)
            {
                lblmnumbererror.setText("");
            }
            else
            {
                lblmnumbererror.setText("Enter the 10 digit number");
            }
        }
    
    
    int id=0;
   int getId()
   {
       ResultSet rs=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/csfsms?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "1111");
       String sql="select max(id) from signup";
       Statement st=con.createStatement();
       rs=st.executeQuery(sql);
        while(rs.next()) {
                id = rs.getInt(1); // Get the maximum id
            }
            // Increment the id
            id++;
        }catch(Exception e1)
        {
            e1.printStackTrace();
         
         }
       return id;
   }
void insertData() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/csfsms?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "1111");
        String sql="insert into signup values(?,?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, getId());
        st.setString(2, fname);
        st.setString(3, lname);
        st.setString(4, uname);
        st.setString(5, password);
        st.setString(6, mnumber);
        int i = st.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "YOU HAVE SUCCESSFULLY SIGNUP" );
        } else {
            JOptionPane.showMessageDialog(this, "SIGNUP PROBLEM");
        }
    } catch (Exception e1) {
        e1.printStackTrace();
    }
}
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcpassworderror;
    private javax.swing.JLabel lblmnumbererror;
    private javax.swing.JLabel lblmnumbererror1;
    private javax.swing.JLabel lblpassworderror;
    private javax.swing.JPasswordField txtcpassword;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmnumber;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}

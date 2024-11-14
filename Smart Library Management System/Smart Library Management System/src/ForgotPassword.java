import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabelPrompt = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JTextField(); // New password text field
        jLabelNewPassword = new javax.swing.JLabel(); // New password label

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));  // Set preferred window size
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Prompt Text (Heading)
        jLabelPrompt.setFont(new java.awt.Font("Roboto", 1, 19)); // Set font and size for heading
        jLabelPrompt.setForeground(new java.awt.Color(255, 255, 255)); // Set text color to white
        jLabelPrompt.setText("Please enter your email to reset the password.");
        getContentPane().add(jLabelPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 160, 450, 40)); // Centering text with adjusted X position

        // Email Input Field (Textbox) - adjusted size to be longer horizontally
        txtemail.setFont(new java.awt.Font("Roboto", 0, 18)); // Set font size
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Center the input text
        txtemail.setPreferredSize(new java.awt.Dimension(220, 30)); // Set text box size longer horizontally
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 220, 30)); // Centered text box

        // New Password Input Field (Textbox)
        jLabelNewPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLabelNewPassword.setFont(new java.awt.Font("Roboto", 1, 16)); // Set font size for label
        jLabelNewPassword.setForeground(new java.awt.Color(255, 255, 255)); // Set text color to white
        jLabelNewPassword.setText("Enter new password:"); // Label text
        jLabelNewPassword.setVisible(false); // Initially hide the label
        getContentPane().add(jLabelNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 247, 200, 30)); // Position label

        txtNewPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // Set font size
        txtNewPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER); // Center the input text
        txtNewPassword.setPreferredSize(new java.awt.Dimension(220, 30)); // Set text box size longer horizontally
        txtNewPassword.setVisible(false); // Initially hide the text field
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 220, 30)); // Centered text box

        // Submit Button - centered
        btnSubmit.setBackground(new java.awt.Color(255, 255, 255)); // White background
        btnSubmit.setFont(new java.awt.Font("Roboto", 1, 14)); // Set font size to 14
        btnSubmit.setForeground(new java.awt.Color(210, 211, 255)); // Set text color
        btnSubmit.setText("Submit");
        btnSubmit.setPreferredSize(new java.awt.Dimension(100, 30)); // Set button size smaller
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 255, 100, 30)); // Centered submit button

        // Background Image
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-page.jpg"))); // Set background image
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600)); // Ensure it covers entire screen

        pack();
        setLocationRelativeTo(null);  // Center the window on the screen
    }

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {
        String email = txtemail.getText();
        String newPassword = txtNewPassword.getText();
        Connection c = Connect.ConnectToDB();
        PreparedStatement pst;
        ResultSet rs;

        try {
            // SQL to check if email exists in the database
            String sql = "SELECT * FROM library.login WHERE email=?";
            pst = c.prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();

            if (rs.next()) {
                // If email is found, show the new password input fields
                jLabelNewPassword.setVisible(true);
                txtNewPassword.setVisible(true);
                // Update the position of the Submit button
                getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 340, 100, 30)); // Centered submit button
                //btnSubmit.setBounds(295, 340, 100, 30); // Adjust button position

                // Proceed to reset the password when the user clicks submit again
                btnSubmit.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        resetPassword(email);
                    }
                });

            } else {
                JOptionPane.showMessageDialog(this, "No user found with this email.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (c != null) c.close();
            } catch (SQLException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void resetPassword(String email) {
        String newPassword = txtNewPassword.getText(); // Get new password
        Connection c = Connect.ConnectToDB();
        PreparedStatement pst;

        try {
            // Update the password in the database
            String updateSql = "UPDATE library.login SET password=? WHERE email=?";
            pst = c.prepareStatement(updateSql);
            pst.setString(1, newPassword);
            pst.setString(2, email);
            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Password reset successful. Please log in.");
                new SignIn().setVisible(true); // Navigate to SignIn page
                this.dispose(); // Close the current window
            } else {
                JOptionPane.showMessageDialog(this, "Failed to reset password. Please try again.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (c != null) c.close();
            } catch (SQLException ex) {
                Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabelPrompt;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtNewPassword; // New password text field
    private javax.swing.JLabel jLabelNewPassword; // New password label
}

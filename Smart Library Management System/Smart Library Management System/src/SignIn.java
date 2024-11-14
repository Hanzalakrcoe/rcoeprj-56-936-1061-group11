import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Initialize components
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelForgotPassword = new javax.swing.JLabel(); // Forgot Password label

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Close button logic
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png")));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1316, 0, 50, -1));

        // Email Label
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("User ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, 30));

        // Email Input Field
        txtemail.setFont(new java.awt.Font("Roboto", 1, 18));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 264, 41));

        // Password Label
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 100, 30));

        // Password Input Field
        txtpassword.setFont(new java.awt.Font("Tw Cen MT", 1, 24));
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 264, 40));

        // Login button logic
        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Roboto", 1, 14));
        btnlogin.setForeground(new java.awt.Color(210, 211, 255));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 122, 30));

        // Forgot Password label
        jLabelForgotPassword.setFont(new java.awt.Font("Roboto", 1, 13));
        jLabelForgotPassword.setForeground(new java.awt.Color(25, 25, 112));
        jLabelForgotPassword.setText("Forgot Password?");
        jLabelForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Show hand cursor
        jLabelForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswordMouseClicked(evt);  // Event listener for label click
            }
        });
        getContentPane().add(jLabelForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 120, 30));

        // Page title
        jLabel5.setFont(new java.awt.Font("Roboto", Font.BOLD, 26));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Admin Login");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 135, 364, 30));

        // Background image
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-page.jpg")));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }

    // Close button event handler
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        int yes = JOptionPane.showConfirmDialog(this, "Do you want to close this application?", "Exit", JOptionPane.YES_NO_OPTION);
        if (yes == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Login button event handler
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {
        PreparedStatement pst;
        ResultSet rs;
        Connection c = Connect.ConnectToDB();
        try {
            String sql = "SELECT * FROM library.login WHERE userid=? AND password=?";
            pst = c.prepareStatement(sql);
            pst.setString(1, txtemail.getText());
            pst.setString(2, new String(txtpassword.getPassword())); // Safely get password
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new home().setVisible(true);  // Show home page on success
                this.dispose();  // Close the login window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid User ID or Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (c != null) c.close();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Forgot Password label click event handler
    private void jLabelForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {
        new ForgotPassword().setVisible(true);  // Assuming you have ForgotPassword.java class
        this.dispose();  // Close the SignIn window
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variable declarations
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelForgotPassword;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
}

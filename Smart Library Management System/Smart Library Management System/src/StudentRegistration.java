import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentRegistration extends javax.swing.JFrame {

    public StudentRegistration() {
        initComponents();
    }

    public void clear(){
        txtid.setText("");
        txtname.setText("");
        txtsem.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        txtbranchdrop = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtsem = new javax.swing.JTextField();
        btnSR = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, -1));

        jLabel1.setBackground(new java.awt.Color(25, 25, 120));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 120));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/issue.png"))); // NOI18N
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 410, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Student ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 239, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 239, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Branch Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 239, 46));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Semester:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 239, 40));

        btnsave.setBackground(new java.awt.Color(25, 25, 120));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(242, 242, 242));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 120, 40));

        txtbranchdrop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbranchdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "AI & DS", "Electrical", "Mechanical", "Civil" }));
        txtbranchdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbranchdropActionPerformed(evt);
            }
        });
        getContentPane().add(txtbranchdrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 310, 40));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 310, 40));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 310, 40));

        txtsem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsemActionPerformed(evt);
            }
        });
        getContentPane().add(txtsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 310, 40));

        btnSR.setBackground(new java.awt.Color(25, 25, 120));
        btnSR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSR.setForeground(new java.awt.Color(242, 242, 242));
        btnSR.setText("Show Registered Students");
        btnSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 270, 40));

        btnclear.setBackground(new java.awt.Color(25, 25, 120));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(242, 242, 242));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 120, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/87007eee-1471-4168-9fac-65558827e285.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSRActionPerformed
        new TableRS().setVisible(true);
    }//GEN-LAST:event_btnSRActionPerformed

    private void txtsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsemActionPerformed
    }//GEN-LAST:event_txtsemActionPerformed
    private void txtbranchdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchdropActionPerformed
    }//GEN-LAST:event_txtbranchdropActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        PreparedStatement pst;
        Connection c=Connect.ConnectToDB();
        
        if(txtid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Student ID.");
                txtid.requestFocus();
        }
        else if(txtname.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Name of the Student.");
                txtname.requestFocus();
        }
        else if(txtsem.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Current Semester.");
                txtsem.requestFocus();
        }
        else{
            try {
                pst = c.prepareStatement("select id from student;");
                ResultSet rs = pst.executeQuery();
                int f = 0;
                while(rs.next())
                {
                    if (rs.getString("id").equals(txtid.getText()))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Student ID already exists.");
                        txtid.requestFocus();
                        f = 1;
                    }
                }

                if (f == 0)
                {
                    pst=c.prepareStatement("INSERT INTO `library`.`student` (`id`, `name`, `branch`, `semester`) VALUES (?,?,?,?)");
                    pst.setString(1, txtid.getText());
                    pst.setString(2, txtname.getText());
                    pst.setString(3, (String) txtbranchdrop.getSelectedItem());
                    pst.setString(4, txtsem.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "Record Saved Successfully.","Saved",JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            } 
            catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
    }//GEN-LAST:event_txtidActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSR;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> txtbranchdrop;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsem;
    // End of variables declaration//GEN-END:variables
}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {
    PreparedStatement pst;
    ResultSet rs;
    Connection c=Connect.ConnectToDB();

    public IssueBook() {
        initComponents();
        SimpleDateFormat  dat=new SimpleDateFormat("dd/MM/yyyy ");
        Date d=new Date();
        txtissuedate.setText(dat.format(d));
         
    }

    public void clear(){
            txtbookname.setText("");
            txtduedate.setText("");
            txtstudentid.setText("");
            txtbookid.setText("");
            txtbookpublisher.setText("");
            txtstudentname.setText("");
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnissue = new javax.swing.JButton();
        txtbookid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        txtbookname = new javax.swing.JTextField();
        txtstudentname = new javax.swing.JTextField();
        txtbookpublisher = new javax.swing.JTextField();
        btnshowBI = new javax.swing.JButton();
        btnsave4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Search1 = new javax.swing.JButton();
        Search2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 120));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/issue.png"))); // NOI18N
        jLabel1.setText("Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 280, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 240, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 250, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, 240, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Book Publisher");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 250, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Student Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 240, 40));

        btnissue.setBackground(new java.awt.Color(25, 25, 120));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnissue.setForeground(new java.awt.Color(242, 242, 242));
        btnissue.setText("Issue Book");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, 130, 40));

        txtbookid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 350, 40));

        txtstudentid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 350, 40));

        txtissuedate.setEditable(false);
        txtissuedate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtissuedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtissuedateActionPerformed(evt);
            }
        });
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 350, 40));

        txtduedate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtduedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduedateActionPerformed(evt);
            }
        });
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 350, 40));

        txtbookname.setEditable(false);
        txtbookname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbooknameActionPerformed(evt);
            }
        });
        getContentPane().add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 350, 40));

        txtstudentname.setEditable(false);
        txtstudentname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtstudentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtstudentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 350, 40));

        txtbookpublisher.setEditable(false);
        txtbookpublisher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbookpublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookpublisherActionPerformed(evt);
            }
        });
        getContentPane().add(txtbookpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 350, 40));

        btnshowBI.setBackground(new java.awt.Color(25, 25, 120));
        btnshowBI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnshowBI.setForeground(new java.awt.Color(242, 242, 242));
        btnshowBI.setText("Show Books Registered");
        btnshowBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowBIActionPerformed(evt);
            }
        });
        getContentPane().add(btnshowBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 680, -1, 40));

        btnsave4.setBackground(new java.awt.Color(25, 25, 120));
        btnsave4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave4.setForeground(new java.awt.Color(242, 242, 242));
        btnsave4.setText("Clear");
        btnsave4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, 130, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 51, -1));

        Search1.setBackground(new java.awt.Color(25, 25, 120));
        Search1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search1.setForeground(new java.awt.Color(242, 242, 242));
        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });
        getContentPane().add(Search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, 30));

        Search2.setBackground(new java.awt.Color(25, 25, 120));
        Search2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search2.setForeground(new java.awt.Color(242, 242, 242));
        Search2.setText("Search");
        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });
        getContentPane().add(Search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 370, -1, 30));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/87007eee-1471-4168-9fac-65558827e285.jpg"))); // NOI18N
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        if(txtbookid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Book ID.");
                txtbookid.requestFocus();
        }
        else if (txtstudentid.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter the Student ID.");
            txtstudentid.requestFocus();
        }
        else if (txtduedate.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter the Due Date of the Book.");
            txtduedate.requestFocus();
        }
        else{
            try{
            pst=c.prepareStatement("UPDATE `library`.`book` SET `status` = 'Issued', issuedate = ?, duedate = ?,studentid =? WHERE (`id` = ?)");
            pst.setString(1, txtissuedate.getText());
            pst.setString(2, txtduedate.getText());
            pst.setString(3, txtstudentid.getText());
            pst.setString(4, txtbookid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Book has been Issued.");
            clear();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnissueActionPerformed

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        try {
            pst=c.prepareStatement("SELECT * FROM library.book where id=?");
            pst.setString(1, txtbookid.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                if (rs.getString("status").equals("Issued"))
                { 
                    JOptionPane.showMessageDialog(this, "The Book is Already Issued.");
                    clear();
                    return;
                }
                txtbookname.setText(rs.getString("name"));
                txtbookpublisher.setText(rs.getString("publisher"));
            }
            else
                JOptionPane.showMessageDialog(this, "Please Enter a Valid Book ID");
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Search1ActionPerformed

    private void txtissuedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtissuedateActionPerformed
    }//GEN-LAST:event_txtissuedateActionPerformed

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
    try {
            pst=c.prepareStatement("SELECT * FROM library.student where id=?");
            pst.setString(1, txtstudentid.getText());
            rs=pst.executeQuery();
            if(rs.next())
                    txtstudentname.setText(rs.getString("name"));
            else
                JOptionPane.showMessageDialog(this, "Please Enter a Valid Student ID");
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Search2ActionPerformed

    private void txtbooknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbooknameActionPerformed
    }//GEN-LAST:event_txtbooknameActionPerformed
    private void txtstudentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentnameActionPerformed
    }//GEN-LAST:event_txtstudentnameActionPerformed
    private void txtbookpublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookpublisherActionPerformed
    }//GEN-LAST:event_txtbookpublisherActionPerformed
    private void txtduedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduedateActionPerformed
    }//GEN-LAST:event_txtduedateActionPerformed
    private void btnsave4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave4ActionPerformed
        clear();
    }//GEN-LAST:event_btnsave4ActionPerformed
    private void btnshowBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowBIActionPerformed
        new TableBR().setVisible(true);
    }//GEN-LAST:event_btnshowBIActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search1;
    private javax.swing.JButton Search2;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton btnsave4;
    private javax.swing.JButton btnshowBI;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtbookpublisher;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JTextField txtstudentname;
    // End of variables declaration//GEN-END:variables
}
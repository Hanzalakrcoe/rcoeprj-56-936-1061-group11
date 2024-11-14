import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddBook extends javax.swing.JFrame {

    public AddBook() {
        initComponents();
        SimpleDateFormat  dat=new SimpleDateFormat("dd/MM/yyyy ");
        Date d=new Date();
        txtpurchase.setText(dat.format(d));
    }

    public void clear(){
        txtid.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtpublisher.setText("");
        txtyear.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpurchase = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtbranchdrop = new javax.swing.JComboBox<>();
        btnsave1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 120));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/issue.png"))); // NOI18N
        jLabel1.setText("Add Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 230, 53));

        txtyear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 320, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 239, 40));

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 320, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Book Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 239, 40));

        jButton1.setBackground(new java.awt.Color(25, 25, 120));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 110, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Price:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 239, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Branch:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 239, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Purchase Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 239, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Publishing Year:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 239, 40));

        txtpurchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtpurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 320, 40));

        txtpublisher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublisherActionPerformed(evt);
            }
        });
        getContentPane().add(txtpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 320, 40));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 320, 40));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 320, 40));

        txtbranchdrop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbranchdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "AI & DS", "Electrical", "Mechanical", "Civil" }));
        txtbranchdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbranchdropActionPerformed(evt);
            }
        });
        getContentPane().add(txtbranchdrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 320, 40));

        btnsave1.setBackground(new java.awt.Color(25, 25, 120));
        btnsave1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave1.setForeground(new java.awt.Color(242, 242, 242));
        btnsave1.setText("Clear");
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 110, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Publisher:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 239, 40));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, -1));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/87007eee-1471-4168-9fac-65558827e285.jpg"))); // NOI18N
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PreparedStatement pst;
        Connection c=Connect.ConnectToDB();
        if(txtid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Book ID.");
                txtid.requestFocus();
        }
        else if(txtname.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Name of the Book.");
                txtname.requestFocus();
        }
        else if(txtpublisher.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Name of the Publisher.");
                txtpublisher.requestFocus();
        }        
        else if(txtprice.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Price of the Book.");
                txtprice.requestFocus();
        }
        else if(txtyear.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Publishing Year.");
                txtyear.requestFocus();
        }
        else if(txtpurchase.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Enter the Year of Purchase.");
                txtpurchase.requestFocus();
        }
        else{
            try {
                pst = c.prepareStatement("select id from book;");
                ResultSet rs = pst.executeQuery();
                int f = 0;
                while(rs.next())
                {
                    if (rs.getString("id").equals(txtid.getText()))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Book ID already exists.");
                        txtid.requestFocus();
                        f = 1;
                    }
                }
                if (f == 0)
                {
                    pst=c.prepareStatement("insert into library.book(id,name,publisher,branch,price,year,purchasedate,status)values(?,?,?,?,?,?,?,?)");
                    pst.setString(1, txtid.getText());
                    pst.setString(2, txtname.getText());
                    pst.setString(3, txtpublisher.getText());
                    pst.setString(4, (String) txtbranchdrop.getSelectedItem());
                    pst.setString(5, txtprice.getText());
                    pst.setString(6, txtyear.getText());
                    pst.setString(7, txtpurchase.getText());
                    pst.setString(8, "NotIssued");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "Record Saved Successfully.","Saved",JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            } 
            catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
    }//GEN-LAST:event_txtpriceActionPerformed
    private void txtpublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublisherActionPerformed
    }//GEN-LAST:event_txtpublisherActionPerformed
    private void txtbranchdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchdropActionPerformed
    }//GEN-LAST:event_txtbranchdropActionPerformed
    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
        clear();
    }//GEN-LAST:event_btnsave1ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
    }//GEN-LAST:event_txtidActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> txtbranchdrop;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextField txtpurchase;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReturnBook extends javax.swing.JFrame {
    Connection c=Connect.ConnectToDB();
    PreparedStatement pst;
    ResultSet rs;

    public ReturnBook() {
        initComponents();
    }

    public void clear(){
        txtbookid.setText("");
        txtbookname.setText("");
        txtduedate.setText("");
        txtissuedate.setText("");
        txtstudentid.setText("");
        txtstudentname.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        txtduedate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtissuedate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        txtbookid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        StudentSearch = new javax.swing.JButton();
        BookSearch = new javax.swing.JButton();
        txtstudentname = new javax.swing.JTextField();
        btnsave1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, -1));

        txtduedate.setEditable(false);
        txtduedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 350, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 270, 40));

        txtissuedate.setEditable(false);
        txtissuedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 350, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 270, 40));

        jButton1.setBackground(new java.awt.Color(25, 25, 120));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Return  Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 150, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 270, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Book Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 220, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Due Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 270, 40));

        txtbookname.setEditable(false);
        txtbookname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 350, 40));

        txtbookid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 350, 40));

        txtstudentid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 350, 40));

        jLabel1.setBackground(new java.awt.Color(25, 25, 120));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 120));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/issue.png"))); // NOI18N
        jLabel1.setText("Return Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 290, 60));

        StudentSearch.setBackground(new java.awt.Color(25, 25, 120));
        StudentSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StudentSearch.setForeground(new java.awt.Color(242, 242, 242));
        StudentSearch.setText("Search");
        StudentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentSearchActionPerformed(evt);
            }
        });
        getContentPane().add(StudentSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, -1, 30));

        BookSearch.setBackground(new java.awt.Color(25, 25, 120));
        BookSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BookSearch.setForeground(new java.awt.Color(242, 242, 242));
        BookSearch.setText("Search");
        BookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSearchActionPerformed(evt);
            }
        });
        getContentPane().add(BookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, -1, 30));

        txtstudentname.setEditable(false);
        txtstudentname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtstudentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtstudentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 350, 40));

        btnsave1.setBackground(new java.awt.Color(25, 25, 120));
        btnsave1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave1.setForeground(new java.awt.Color(242, 242, 242));
        btnsave1.setText("Clear");
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 150, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Student Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 220, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/87007eee-1471-4168-9fac-65558827e285.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentSearchActionPerformed
        try {
            pst = c.prepareStatement("select * from library.student where id = ?");
            pst.setString(1, txtstudentid.getText());
            rs = pst.executeQuery();
            boolean f = false;
            while(rs.next())
            {
                if(rs.getString("id").equals(txtstudentid.getText()))
                {    
                   f = true;
                }    
            }
            if (f)
            {
                pst=c.prepareStatement("SELECT * FROM library.book where studentid = ? ");
                pst.setString(1, txtstudentid.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                        txtbookname.setText(rs.getString("name"));
                        txtbookid.setText(rs.getString("id"));
                        txtissuedate.setText(rs.getString("issuedate"));
                        txtduedate.setText(rs.getString("duedate"));
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No books are issued under that ID.");
                    return;
                }
                pst=c.prepareStatement("SELECT * FROM library.student where id=?");
                pst.setString(1, txtstudentid.getText());
                rs=pst.executeQuery();
                if(rs.next())
                        txtstudentname.setText(rs.getString("name"));
            }
            else
                JOptionPane.showMessageDialog(this, "Please Enter Valid Student ID.");
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StudentSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtstudentid.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter the Student ID.");
            txtstudentid.requestFocus();
        }
        else if(txtbookid.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please Enter the Book ID.");
            txtbookid.requestFocus();
        }
        else if(txtbookname.getText().equals("") || txtstudentname.getText().equals("") 
                || txtissuedate.getText().equals("") || txtduedate.getText().equals(""))
        {    
            JOptionPane.showMessageDialog(rootPane, "One or more columns have information missing."
                    + " Please enter the details correctly.");
            txtstudentid.requestFocus();
        }
        else{
            try{
            pst=c.prepareStatement("UPDATE `library`.`book` SET `status` = 'NotIssued', `issuedate` = NULL, `duedate` = NULL, `studentid` = NULL WHERE (`id` = ?)");
            pst.setString(1, txtbookid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Return Successfull");
            clear();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSearchActionPerformed
        try {
            pst=c.prepareStatement("SELECT * FROM library.book where id = ? ");
            pst.setString(1, txtbookid.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                if (rs.getString("studentid") == null)
                {
                    JOptionPane.showMessageDialog(this, "The Entered Book ID is not Issued.");
                    return;
                }
                    txtbookname.setText(rs.getString("name"));
                    txtissuedate.setText(rs.getString("issuedate"));
                    txtduedate.setText(rs.getString("duedate"));
                    txtstudentid.setText(rs.getString("studentid"));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Book ID");
                return;
            }
            pst=c.prepareStatement("SELECT * FROM library.student where id=?");
            pst.setString(1, txtstudentid.getText());
            rs=pst.executeQuery();
            if(rs.next())
                    txtstudentname.setText(rs.getString("name"));
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BookSearchActionPerformed

    private void txtstudentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentnameActionPerformed
    }//GEN-LAST:event_txtstudentnameActionPerformed

    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
        clear();
    }//GEN-LAST:event_btnsave1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookSearch;
    private javax.swing.JButton StudentSearch;
    private javax.swing.JButton btnsave1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JTextField txtstudentname;
    // End of variables declaration//GEN-END:variables
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TableBR extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    Connection c = Connect.ConnectToDB();

    public TableBR() {
        initComponents();
        setLocationRelativeTo(null);
        ABTable.setVisible(false);
        IBTable.setVisible(false);
        DetailPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Available = new javax.swing.JButton();
        Issued = new javax.swing.JButton();
        SearchF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DetailPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        YearF = new javax.swing.JTextField();
        PDF = new javax.swing.JTextField();
        StatusF = new javax.swing.JTextField();
        PriceF = new javax.swing.JTextField();
        SIDF = new javax.swing.JTextField();
        DueF = new javax.swing.JTextField();
        IssueF = new javax.swing.JTextField();
        SNF = new javax.swing.JTextField();
        PublisherF = new javax.swing.JTextField();
        NameF = new javax.swing.JTextField();
        IF = new javax.swing.JTextField();
        BranchF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IBTable = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ABTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 51, -1));

        Available.setBackground(new java.awt.Color(25, 25, 120));
        Available.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Available.setForeground(new java.awt.Color(242, 242, 242));
        Available.setText("Available Books");
        Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableActionPerformed(evt);
            }
        });
        getContentPane().add(Available, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 40));

        Issued.setBackground(new java.awt.Color(25, 25, 120));
        Issued.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Issued.setForeground(new java.awt.Color(242, 242, 242));
        Issued.setText("Issued Books");
        Issued.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuedActionPerformed(evt);
            }
        });
        getContentPane().add(Issued, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 210, 40));

        SearchF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(SearchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 210, 40));

        jButton1.setBackground(new java.awt.Color(25, 25, 120));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 80, 30));

        DetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(25, 25, 120));
        jLabel20.setText("Student Name:");
        DetailPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 130, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(25, 25, 120));
        jLabel17.setText("Student ID:");
        DetailPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 130, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(25, 25, 120));
        jLabel18.setText("Due Date:");
        DetailPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 130, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(25, 25, 120));
        jLabel19.setText("Issue Date:");
        DetailPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 130, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(25, 25, 120));
        jLabel12.setText("Status:");
        DetailPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 130, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(25, 25, 120));
        jLabel13.setText("Purchase Date:");
        DetailPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 130, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(25, 25, 120));
        jLabel14.setText("Year of Publishing:");
        DetailPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 130, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(25, 25, 120));
        jLabel16.setText("Price:");
        DetailPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 130, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(25, 25, 120));
        jLabel10.setText("ID:");
        DetailPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 25, 120));
        jLabel9.setText("Publisher:");
        DetailPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 25, 120));
        jLabel7.setText("Branch:");
        DetailPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 25, 120));
        jLabel6.setText("Name:");
        DetailPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 40));

        YearF.setEditable(false);
        YearF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        YearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearFActionPerformed(evt);
            }
        });
        DetailPanel.add(YearF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 190, 40));

        PDF.setEditable(false);
        PDF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });
        DetailPanel.add(PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 190, 40));

        StatusF.setEditable(false);
        StatusF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatusF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusFActionPerformed(evt);
            }
        });
        DetailPanel.add(StatusF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 190, 40));

        PriceF.setEditable(false);
        PriceF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PriceF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFActionPerformed(evt);
            }
        });
        DetailPanel.add(PriceF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 190, 40));

        SIDF.setEditable(false);
        SIDF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SIDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDFActionPerformed(evt);
            }
        });
        DetailPanel.add(SIDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 190, 40));

        DueF.setEditable(false);
        DueF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DueF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DueFActionPerformed(evt);
            }
        });
        DetailPanel.add(DueF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 190, 40));

        IssueF.setEditable(false);
        IssueF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IssueF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueFActionPerformed(evt);
            }
        });
        DetailPanel.add(IssueF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 190, 40));

        SNF.setEditable(false);
        SNF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SNFActionPerformed(evt);
            }
        });
        DetailPanel.add(SNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 190, 40));

        PublisherF.setEditable(false);
        PublisherF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PublisherF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublisherFActionPerformed(evt);
            }
        });
        DetailPanel.add(PublisherF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 40));

        NameF.setEditable(false);
        NameF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFActionPerformed(evt);
            }
        });
        DetailPanel.add(NameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, 40));

        IF.setEditable(false);
        IF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IFActionPerformed(evt);
            }
        });
        DetailPanel.add(IF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, 40));

        BranchF.setEditable(false);
        BranchF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BranchF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchFActionPerformed(evt);
            }
        });
        DetailPanel.add(BranchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 190, 40));

        jLabel5.setBackground(new java.awt.Color(210, 211, 255));
        jLabel5.setOpaque(true);
        DetailPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 340));

        getContentPane().add(DetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 980, 340));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Publisher", "Branch", "Price", "Year", "Purchase Date", "Issue Date", "Due Date", "Student ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setOpaque(false);
        jTable2.setRowSelectionAllowed(false);
        jTable2.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable2.getTableHeader().setReorderingAllowed(false);
        IBTable.setViewportView(jTable2);

        getContentPane().add(IBTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 980, 340));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Publisher", "Branch", "Price", "Year", "Purchase Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setOpaque(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.getTableHeader().setReorderingAllowed(false);
        ABTable.setViewportView(jTable1);

        getContentPane().add(ABTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 980, 340));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 25, 120));
        jLabel4.setText("Search Book ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 25, 120));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/issue.png"))); // NOI18N
        jLabel2.setText("Books Registered");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 360, 60));

        jLabel1.setBackground(new java.awt.Color(210, 211, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 480));

        jLabel3.setBackground(new java.awt.Color(25, 25, 120));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IssuedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuedActionPerformed
        ABTable.setVisible(false);
        DetailPanel.setVisible(false);
        IBTable.setVisible(true);
        try {
            pst = c.prepareStatement("select * from library.book where status = 'Issued';");
            rs = pst.executeQuery();
            String id, name, publisher, branch, price, year, purchasedate, issuedate, duedate, studentid;
            if (rs.next())
            {   
                DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
                tblModel.setRowCount(0);  
                do
                {
                    id = rs.getString("id");
                    name = rs.getString("name");
                    publisher = rs.getString("publisher");
                    branch = rs.getString("branch");
                    price = rs.getString("price");
                    year = rs.getString("year");
                    purchasedate = rs.getString("purchasedate");
                    issuedate = rs.getString("issuedate");
                    duedate = rs.getString("duedate");
                    studentid = rs.getString("studentid");

                    String tbData[] = {id, name, publisher, branch, price, year, purchasedate, issuedate, duedate, studentid};
                    tblModel.addRow(tbData);
                } while(rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableRS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IssuedActionPerformed

    private void AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableActionPerformed
        DetailPanel.setVisible(false);
        IBTable.setVisible(false);
        ABTable.setVisible(true);
        try {
            pst = c.prepareStatement("select id, name, publisher, branch, price, year, purchasedate from library.book where status = 'NotIssued';");
            rs = pst.executeQuery();
            String id, name, publisher, branch, price, year, purchasedate;
            if (rs.next())
            {
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                tblModel.setRowCount(0);  
                do
                {
                    id = rs.getString("id");
                    name = rs.getString("name");
                    publisher = rs.getString("publisher");
                    branch = rs.getString("branch");
                    price = rs.getString("price");
                    year = rs.getString("year");
                    purchasedate = rs.getString("purchasedate");
                    String tbData[] = {id, name, publisher, branch, price, year, purchasedate};
                    tblModel.addRow(tbData);
                } while(rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableRS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AvailableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IBTable.setVisible(false);
        ABTable.setVisible(false);
        try {
            pst=c.prepareStatement("SELECT * FROM library.book where id=?");
            pst.setString(1, SearchF.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                DetailPanel.setVisible(true);  
                IF.setText(rs.getString("id"));
                NameF.setText(rs.getString("name"));
                PublisherF.setText(rs.getString("publisher"));
                BranchF.setText(rs.getString("branch"));
                PriceF.setText(rs.getString("price"));
                YearF.setText(rs.getString("year"));
                PDF.setText(rs.getString("purchasedate"));
                StatusF.setText(Objects.equals(rs.getString("status"),"NotIssued") ? "Available": rs.getString("status"));
                IssueF.setText(Objects.equals(rs.getString("issuedate"),null) ? "NULL": rs.getString("issuedate"));
                DueF.setText(Objects.equals(rs.getString("duedate"),null) ? "NULL": rs.getString("duedate"));
                SIDF.setText(Objects.equals(rs.getString("studentid"),null) ? "NULL": rs.getString("studentid"));
                
                if(Objects.equals(rs.getString("studentid"), null))
                {
                    SNF.setText("NULL");
                }
                else
                {
                    pst=c.prepareStatement("SELECT * FROM library.student where id=?");
                    pst.setString(1, rs.getString("studentid"));
                    rs=pst.executeQuery();
                    rs.next();
                    SNF.setText(rs.getString("name"));
                }   
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Please Valid Book ID");
                DetailPanel.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableRS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void YearFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearFActionPerformed
    }//GEN-LAST:event_YearFActionPerformed
    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
    }//GEN-LAST:event_PDFActionPerformed
    private void StatusFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusFActionPerformed
    }//GEN-LAST:event_StatusFActionPerformed
    private void PriceFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFActionPerformed
    }//GEN-LAST:event_PriceFActionPerformed
    private void SIDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDFActionPerformed
    }//GEN-LAST:event_SIDFActionPerformed
    private void DueFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DueFActionPerformed
    }//GEN-LAST:event_DueFActionPerformed
    private void IssueFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueFActionPerformed
    }//GEN-LAST:event_IssueFActionPerformed
    private void SNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SNFActionPerformed
    }//GEN-LAST:event_SNFActionPerformed
    private void PublisherFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublisherFActionPerformed
    }//GEN-LAST:event_PublisherFActionPerformed
    private void NameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFActionPerformed
    }//GEN-LAST:event_NameFActionPerformed
    private void IFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IFActionPerformed
    }//GEN-LAST:event_IFActionPerformed
    private void BranchFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchFActionPerformed
    }//GEN-LAST:event_BranchFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableBR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ABTable;
    private javax.swing.JButton Available;
    private javax.swing.JTextField BranchF;
    private javax.swing.JPanel DetailPanel;
    private javax.swing.JTextField DueF;
    private javax.swing.JScrollPane IBTable;
    private javax.swing.JTextField IF;
    private javax.swing.JTextField IssueF;
    private javax.swing.JButton Issued;
    private javax.swing.JTextField NameF;
    private javax.swing.JTextField PDF;
    private javax.swing.JTextField PriceF;
    private javax.swing.JTextField PublisherF;
    private javax.swing.JTextField SIDF;
    private javax.swing.JTextField SNF;
    private javax.swing.JTextField SearchF;
    private javax.swing.JTextField StatusF;
    private javax.swing.JTextField YearF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

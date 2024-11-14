import javax.swing.SwingUtilities;
public class Loading2 extends javax.swing.JFrame {
    public Loading2() {
        initComponents();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        // Update progress bar value
                        jProgressBar1.setValue(i);

                        // Simulate loading time
                        Thread.sleep(50);

                        // Update label based on progress
                        if (i == 100) {
                            SwingUtilities.invokeLater(() -> {
                                new SignIn().setVisible(true);
                                dispose(); // Close the loading screen
                            });
                        } else if (i == 50) {
                            SwingUtilities.invokeLater(() -> jLabel.setText("Loading Modules....."));
                        } else if (i == 25) {
                            SwingUtilities.invokeLater(() -> jLabel.setText("Connecting Database...."));
                        } else if (i == 95) {
                            SwingUtilities.invokeLater(() -> jLabel.setText("Launching Application...."));
                        }
                    } catch (InterruptedException ex) {
                        // Handle exception
                        ex.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, -1));

        jProgressBar1.setBackground(new java.awt.Color(25, 25, 112));
        jProgressBar1.setForeground(new java.awt.Color(25, 25, 112));
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 650, 16));
        jPanel1.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 247, 22));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class home extends JFrame {
    private JButton jButton1; // Logout button
    private JButton jButton2; // Issue Book button
    private JButton jButton3; // Return Book button
    private JButton jButton4; // Add Book button
    private JButton jButton5; // Student Registration button
    private JButton jButton6; // Close button
    private JLabel studentCountLabel; // Label for student count
    private JLabel numberOfStudentsLabel; 
    private JLabel numberOfBooksIssuedLabel; 
    private JLabel issuedBooksCountLabel; // Label for issued books count
    private int studentCount = 0; // Variable to hold student count
    private int issuedBooksCount = 0; // Variable to hold issued books count

    public home() {
        initComponents();
        fetchStudentCount(); // Fetch the student count from the database on initialization
        fetchIssuedBooksCount(); // Fetch the issued books count from the database on initialization
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        // Initialize the buttons
        jButton1 = new JButton(); // Logout button
        jButton2 = new JButton(); // Issue Book button
        jButton3 = new JButton(); // Return Book button
        jButton4 = new JButton(); // Add Book button
        jButton5 = new JButton(); // Student Registration button
        jButton6 = new JButton(); // Close button

        // Initialize the student count label
        studentCountLabel = new JLabel("0"); // Start with 0 registered students
        studentCountLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // Font settings
        studentCountLabel.setForeground(new java.awt.Color(25, 25, 112)); // Text color
        numberOfStudentsLabel = new JLabel("Number of students registered:"); numberOfStudentsLabel.setFont(new java.awt.Font("Roboto", 1, 18));
        numberOfStudentsLabel.setForeground(new java.awt.Color(25, 25, 112));
        numberOfBooksIssuedLabel = new JLabel("Number of books issued:"); 
        numberOfBooksIssuedLabel.setFont(new java.awt.Font("Roboto", 1, 18));
        numberOfBooksIssuedLabel.setForeground(new java.awt.Color(25, 25, 112));
        // Initialize the issued books count label
        issuedBooksCountLabel = new JLabel("0"); // Start with 0 issued books
        issuedBooksCountLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // Font settings
        issuedBooksCountLabel.setForeground(new java.awt.Color(25, 25, 112)); // Text color
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Title and dashboard label positions
        JLabel jLabel1 = new JLabel("Smart Library Management System");
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 112));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 700, 60));

        JLabel jLabel3 = new JLabel("Dashboard");
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, 40));

        // Student Registration button positioned on the top left
        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 18)); // Reduced font size
        jButton5.setForeground(new java.awt.Color(25, 25, 112));
        jButton5.setText("Student Registration");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 300, 50)); // Adjusted height

//        // Add the student count label next to the button
//        getContentPane().add(studentCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 50, 50)); // Position next to the button
//        getContentPane().add(numberOfStudentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 50, 50));
//        // Add issued books count label next to the Issue Book button
//        getContentPane().add(issuedBooksCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 336, 50, 50)); // Position next to the button
//        getContentPane().add(numberOfBooksIssuedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 50, 50));


        // Add the labels and their respective counts properly aligned
        getContentPane().add(numberOfStudentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 300, 50)); // Position below buttons
        getContentPane().add(studentCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 50, 50)); // Position beside the student label

        getContentPane().add(numberOfBooksIssuedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 300, 50)); // Position below student count
        getContentPane().add(issuedBooksCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 50, 50)); // Position beside issued books label
        // Add Book button aligned on the left below "Student Registration"
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Roboto", 1, 18)); // Reduced font size
        jButton4.setForeground(new java.awt.Color(25, 25, 112));
        jButton4.setText("Add Book");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 273, 300, 50)); // Increased spacing by 3 pixels

        // Issue Books button aligned on the left
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 18)); // Reduced font size
        jButton2.setForeground(new java.awt.Color(25, 25, 112));
        jButton2.setText("Issue Book");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 336, 300, 50)); // Increased spacing by 3 pixels

        
        // Return Books button aligned on the left
        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 18)); // Reduced font size
        jButton3.setForeground(new java.awt.Color(25, 25, 112));
        jButton3.setText("Return Book");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 399, 300, 50)); // Increased spacing by 3 pixels

        // Logout button aligned on the left side with other buttons
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // Maintained previous font size
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout-icon.jpg"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 462, 300, 50)); // Increased spacing by 3 pixels

        // Close button at the top-right corner
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, -1));

        // Background image
        JLabel jLabel2 = new JLabel(new javax.swing.ImageIcon(getClass().getResource("/img/login-page.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>                        

    // Fetch the number of students registered from the database
    private void fetchStudentCount() {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/library"; // Change to your database name
            String user = "root"; // Change to your database username
            String password = "good5786"; // Change to your database password

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS student_count FROM student"); // Change to your table name

            if (rs.next()) {
                studentCount = rs.getInt("student_count"); // Get the student count
                studentCountLabel.setText(String.valueOf(studentCount)); // Update label
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching student count: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Fetch the number of issued books from the database
    private void fetchIssuedBooksCount() {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/library"; // Change to your database name
            String user = "root"; // Change to your database username
            String password = "good5786"; // Change to your database password

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS issued_books_count FROM book"); // Change to your table name

            if (rs.next()) {
                issuedBooksCount = rs.getInt("issued_books_count"); // Get the issued books count
                issuedBooksCountLabel.setText(String.valueOf(issuedBooksCount)); // Update label
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching issued books count: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new StudentRegistration().setVisible(true);
        dispose();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new AddBook().setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new IssueBook().setVisible(true);
        dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new ReturnBook().setVisible(true);
        dispose();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int yes = JOptionPane.showConfirmDialog(this, "Are you sure you want to Log Out?", "Logout", JOptionPane.YES_NO_OPTION);
        if (yes == JOptionPane.YES_OPTION) {
            new SignIn().setVisible(true);
            dispose();
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int yes = JOptionPane.showConfirmDialog(this, "Do you want to close this application?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (yes == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                        

    // Main method to run the application
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
}
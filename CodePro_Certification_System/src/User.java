import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame implements ActionListener {
    //panel5 components
    public static JPanel panel5 ;
    public static JLabel userPortal;
    public static JButton quizApp , viewPerfomance, certificate, signOut;

    // panel14 components
    static JPanel panel14;
    static JLabel eligibleForCertificate,quizPerfomance;
    static JButton generateCertificate, backP14;

    // panel15 components
    public static JButton backP15;
    public static JLabel achiever , acheiverName ;
    public static JPanel panel15;
    User() {

        // frame properties
        setSize(800, 700);
        setLocation(320, 10);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);
        // --------------------------- Panel5 -----------------------------
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(0, 0, 800, 700);
        panel5.setOpaque(false);

        // user portal label on panel5
        userPortal = new JLabel("User portal");
        userPortal.setBounds(290, 20, 250, 40);
        userPortal.setFont(new Font("Candara", Font.PLAIN, 36));
        panel5.add(userPortal);
        add(panel5);

        // take quiz button on panel5
        quizApp = new JButton("Take Quiz");
        quizApp.setBounds(250, 150, 250, 30);
        quizApp.setFont(new Font("Candara", Font.BOLD, 20));
        quizApp.setFocusable(false);
        quizApp.addActionListener(this);
        panel5.add(quizApp);

        // view performance button on panel5
        viewPerfomance = new JButton("View Performance");
        viewPerfomance.setBounds(250, 250, 250, 30);
        viewPerfomance.setFont(new Font("Candara", Font.BOLD, 20));
        viewPerfomance.setFocusable(false);
        viewPerfomance.addActionListener(this);
        panel5.add(viewPerfomance);

        // certificate status button on panel5
        certificate = new JButton("Certificate Status");
        certificate.setBounds(250, 350, 250, 30);
        certificate.setFont(new Font("Candara", Font.BOLD, 20));
        certificate.setFocusable(false);
        certificate.addActionListener(this);
        panel5.add(certificate);

        // sign out button on panel5
        signOut = new JButton("Sign Out");
        signOut.setBounds(310, 489, 140, 35);
        signOut.setFont(new Font("Candara", Font.BOLD, 20));
        signOut.setFocusable(false);
        signOut.addActionListener(this);
        panel5.add(signOut);

        // -------------------------------------- Panel 14 --------------------------------
        panel14 = new JPanel();
        panel14.setBounds(0, 0, 800, 700);
        panel14.setOpaque(false);
        panel14.setLayout(null);
        add(panel14);
// label on panel14
        quizPerfomance = new JLabel("Your Quiz Report");
        quizPerfomance.setBounds(250,50 , 400,60);
        quizPerfomance.setFont(new Font("Candara",Font.BOLD,35));
        panel14.add(quizPerfomance);

        eligibleForCertificate = new JLabel("Your Eligibility For Certificate");
        eligibleForCertificate.setBounds(210,450 , 400,60);
        eligibleForCertificate.setFont(new Font("Candara",Font.BOLD,30));
        panel14.add(eligibleForCertificate);
// Table Showcasing on panel14
        Object[][] data2 = {
                {"Passed", "Failed", "Passed"},
                {"Failed", "Passed", "Failed"},
                {"Passed", "Passed", "Passed"}
        };

        // create table column names
        String[] columnNamesP14 = {"Java", "C++", "Python"};

        // create table model with data and column names
        DefaultTableModel modelP14 = new DefaultTableModel(data2, columnNamesP14);

        // create JTable with model
        JTable table = new JTable(modelP14);
        table.setBackground(Color.WHITE);
        table.setEnabled(false);
        table.setFont(new Font("Arial", Font.PLAIN, 16));

        // set header row with column names
        JTableHeader headerP14 = table.getTableHeader();

        headerP14.setFont(new Font("Arial", Font.BOLD, 18));

        // set table size
        table.setPreferredScrollableViewportSize(new Dimension(600, 250));

        // add table to a scroll pane
        JScrollPane scrollPane2 = new JScrollPane(table);
        scrollPane2.setBounds(100, 150, 600, 250);
        panel14.add(scrollPane2);

// Buttons on Panel14
        generateCertificate = new JButton("Get Certificate Now!") ;
        generateCertificate.setBounds(290, 530, 230, 35);
        generateCertificate.setFont(new Font("Candara", Font.BOLD, 20));
        generateCertificate.setEnabled(true);
        generateCertificate.addActionListener(this);
        panel14.add(generateCertificate);

        backP14 = new JButton("Back") ;
        backP14.setBounds(600, 550, 100, 35);
        backP14.setFont(new Font("Candara", Font.BOLD, 20));
        backP14.addActionListener(this);
        panel14.add(backP14);
        panel14.setVisible(false);

        //        ----------------------------- Panel15 -----------------------------
        panel15 = new JPanel() ;
        panel15.setLayout(null);
        panel15.setSize(800, 700);
        panel15.setOpaque(false);
        add(panel15);

        achiever = new JLabel() ;
        acheiverName = new JLabel("Winner Name") ;
        acheiverName.setBounds(320,280,200,30);

        acheiverName.setFont(new Font("Monospaced",Font.PLAIN,28));
        panel15.add(acheiverName) ;

        ImageIcon certificateP15 = new ImageIcon("C:\\Users\\Danish\\Desktop\\Main\\logoCer.jpg") ;
        achiever.setIcon(certificateP15);
        achiever.setBounds(20,0,750,550);
        achiever.setLayout(null);
        panel15.add(achiever) ;

        backP15 = new JButton("Back To Main Menu") ;
        backP15.setBounds(280,580,250,50);
        backP15.setFont(new Font("Candara", Font.BOLD, 20));
        backP15.addActionListener(this);
        panel15.add(backP15) ;
        panel15.setVisible(false);

        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed (ActionEvent e) {

        // if user clicks on take quiz on panel5
        if(e.getSource() == quizApp) {
            setVisible(false);
            new Quiz();
        }

        // if user clicks on view performance on panel5
        if(e.getSource() == viewPerfomance) {
            setVisible(false);
            new Result();
        }


        // if user clicks on show certificate status on panel5
        if(e.getSource() == certificate) {
            panel5.setVisible(false);
            panel14.setVisible(true);
        }

        // if user clicks on sign out on panel5
        if(e.getSource() == signOut) {
            setVisible(false);
            new Login();
        }

        // if user clicks on back button on panel14
        if(e.getSource() == backP14) {
            panel14.setVisible(false);
            panel5.setVisible(true);
        }

        // if user clicks on generate certificate button on panel14
        if(e.getSource() == generateCertificate) {
            panel14.setVisible(false);
            panel15.setVisible(true);
        }

        // if user clicks on back button on panel15
        if(e.getSource() == backP15) {
            setVisible(false);
            new User();
        }
}

}
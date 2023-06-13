import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPortal extends JFrame implements ActionListener {

    // panel16 components
    static JButton questionBank , viewData ,signOutP16 ;
    static JPanel panel16 ;
    static JLabel adminPortal ;

    // panel17 components
    static JPanel panel17;
    static JLabel userInfo ;
    static JButton backP17 ;

    // panel20 components
    public static JButton cppP20, javaP20, pythonP20, backP20;
    public static JLabel QuestionbankP20, chooseSubP20;
    public static JPanel panel20;

    // panel21 components
    public static JButton addQues, deleteQues, viewQues, backP21;
    public static JLabel QuestionbankP21, UserChoiceP21;
    public static JPanel panel21;

    // panel22 components
    public static JPanel panel22;
    public static JLabel QuestionbankP22, QuestionStatementP22, option1P22, option2P22, option3P22, option4P22, correctoptionP22;
    public static JTextField QuestionStatementTextFieldP22, option1fieldP22, option2fieldP22, option3fieldP22, option4fieldP22, correctoptionfieldP22;
    public  static JButton addP22, backP22;

    // panel 23 Components
    static JPanel panel23;
    static JLabel DeleteQuestionsP23, labelP23;
    static JButton deleteP23, BackP23;
    static JTextField SerialNumberField;
    //  panel 24 components
    static JPanel panel24;
    static JLabel questionStat ;
    static JButton backP24 ;
    AdminPortal() {
        // frame properties
        setSize(800, 700);
        setLocation(320, 10);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);

        // -------------------------------- Panel 16 ---------------------------

        panel16 = new JPanel();
        panel16.setBounds(0, 0, 800, 700);
        panel16.setOpaque(false);
        panel16.setLayout(null);
        add(panel16);
// Labels on Panel16
        adminPortal = new JLabel("Admin Portal");
        adminPortal.setBounds(250,50 , 400,60);
        adminPortal.setFont(new Font("Candara",Font.BOLD,45));
        panel16.add(adminPortal);
// Buttons on Panel16
        questionBank = new JButton("Question Bank System") ;
        questionBank.setBounds(270, 220, 250, 35);
        questionBank.setFont(new Font("Candara", Font.BOLD, 20)) ;
        questionBank.addActionListener(this);
        panel16.add(questionBank);

        viewData = new JButton("View User Data") ;
        viewData.setBounds(270, 320, 250, 35);
        viewData.setFont(new Font("Candara", Font.BOLD, 20));
        viewData.addActionListener(this);
        panel16.add(viewData);

        signOutP16 = new JButton("Sign Out") ;
        signOutP16.setBounds(270, 420, 250, 35);
        signOutP16.setFont(new Font("Candara", Font.BOLD, 20)) ;
        signOutP16.addActionListener(this);
        panel16.add(signOutP16);
//        panel16.setVisible(false);

        // -------------------------------- Panel 17 -----------------------------
        panel17 = new JPanel();
        panel17.setBounds(0, 0, 800, 700);
        panel17.setOpaque(false);
        panel17.setLayout(null);
        add(panel17);
        userInfo = new JLabel("All User's Information");
        userInfo.setBounds(225,50 , 400,60);
        userInfo.setFont(new Font("Candara",Font.BOLD,35));
        panel17.add(userInfo);


        Object[][] data = {
                {"Huzaifa Shahab", "19", "Male","Kamra"},
                {"Muhammd Danish", "22", "Male","Kamra"},
                {"Raheel Ahmad", "19", "Male","PAC Kamra"}
        };


        String[] columnNamesP14 = {"Username", "Age", "Gender","City"};

        // create table model with data and column names
        DefaultTableModel modelP14 = new DefaultTableModel(data, columnNamesP14);

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
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 150, 600, 250);
        panel17.add(scrollPane);

        backP17 = new JButton("Back") ;
        backP17.setBounds(600, 500, 100, 35);
        backP17.setFont(new Font("Candara", Font.BOLD, 20));
        backP17.addActionListener(this);
        panel17.add(backP17);
        panel17.setVisible(false);

        // ----------------------------- Panel 20 --------------------------
        panel20 = new JPanel() ;
        panel20.setLayout(null);
        panel20.setBounds(0, 0, 800, 700);
        panel20.setOpaque(false);
        add(panel20);

        QuestionbankP20 = new JLabel("Question Bank");
        QuestionbankP20.setHorizontalTextPosition(JLabel.CENTER);
        QuestionbankP20.setBounds(230, 30, 400, 60);
        QuestionbankP20.setFont(new Font("Candara", Font.BOLD, 50));
        panel20.add(QuestionbankP20);

        chooseSubP20 = new JLabel("Choose Subject:");
        chooseSubP20.setHorizontalTextPosition(JLabel.CENTER);
        chooseSubP20.setBounds(280, 150, 600, 40);
        chooseSubP20.setFont(new Font("Candara", Font.BOLD, 30));
        panel20.add(chooseSubP20);

        cppP20 = new JButton("C++") ;
        cppP20.setBounds(260, 240, 250, 30);
        cppP20.setFont(new Font("Candara", Font.BOLD, 20));
        cppP20.setFocusable(false);
        cppP20.addActionListener(this);
        panel20.add(cppP20);

        javaP20 = new JButton("Java") ;
        javaP20.setBounds(260, 330, 250, 30);
        javaP20.setFont(new Font("Candara", Font.BOLD, 20));
        javaP20.setFocusable(false);
        javaP20.addActionListener(this);
        panel20.add(javaP20);

        pythonP20 = new JButton("Python") ;
        pythonP20.setBounds(260, 420, 250, 30);
        pythonP20.setFont(new Font("Candara", Font.BOLD, 20));
        pythonP20.setFocusable(false);
        pythonP20.addActionListener(this);
        panel20.add(pythonP20);

        backP20 = new JButton("Back") ;
        backP20.setBounds(540, 550, 100, 32);
        backP20.setFont(new Font("Candara", Font.BOLD, 20));
        backP20.addActionListener(this);
        panel20.add(backP20);
        panel20.setVisible(false);

        // ---------------------------- Panel 21 --------------------------------
        panel21 = new JPanel() ;
        panel21.setLayout(null);
        panel21.setBounds(0, 0, 800, 700);
        panel21.setOpaque(false);
        add(panel21);

        QuestionbankP21 = new JLabel("Question Bank");
        QuestionbankP21.setHorizontalTextPosition(JLabel.CENTER);
        QuestionbankP21.setBounds(230, 30, 400, 60);
        QuestionbankP21.setFont(new Font("Candara", Font.BOLD, 50));
        panel21.add(QuestionbankP21);

        UserChoiceP21 = new JLabel("What do you want to do?");
        UserChoiceP21.setHorizontalTextPosition(JLabel.CENTER);
        UserChoiceP21.setBounds(220, 150, 600, 40);
        UserChoiceP21.setFont(new Font("Candara", Font.BOLD, 30));
        panel21.add(UserChoiceP21);

        addQues = new JButton("Add Questions") ;
        addQues.setBounds(260, 240, 250, 30);
        addQues.setFont(new Font("Candara", Font.BOLD, 20));
        addQues.setFocusable(false);
        addQues.addActionListener(this);
        panel21.add(addQues);

        deleteQues = new JButton("Delete Questions") ;
        deleteQues.setBounds(260, 330, 250, 30);
        deleteQues.setFont(new Font("Candara", Font.BOLD, 20));
        deleteQues.setFocusable(false);
        deleteQues.addActionListener(this);
        panel21.add(deleteQues);

        viewQues = new JButton("View Questions") ;
        viewQues.setBounds(260, 420, 250, 30);
        viewQues.setFont(new Font("Candara", Font.BOLD, 20));
        viewQues.setFocusable(false);
        viewQues.addActionListener(this);
        panel21.add(viewQues);

        backP21 = new JButton("Back") ;
        backP21.setBounds(540, 550, 100, 32);
        backP21.setFont(new Font("Candara", Font.BOLD, 20));
        backP21.addActionListener(this);
        panel21.add(backP21);
        panel21.setVisible(false);

//        -------------------------------- Panel 22 -----------------------------------
        panel22 = new JPanel() ;
        panel22.setLayout(null);
        panel22.setBounds(0, 0, 800, 700);
        panel22.setOpaque(false);
        add(panel22);

        QuestionbankP22 = new JLabel("Add Question");
        QuestionbankP22.setBounds(260, 30, 400, 60);
        QuestionbankP22.setFont(new Font("Candara", Font.BOLD, 50));
        panel22.add(QuestionbankP22);

        QuestionStatementP22 = new JLabel("Write question statement:");
        QuestionStatementP22.setBounds(30, 130, 400, 30);
        QuestionStatementP22.setFont(new Font("Candara", Font.BOLD, 20));
        panel22.add(QuestionStatementP22);

        QuestionStatementTextFieldP22 = new JTextField();
        QuestionStatementTextFieldP22.setBounds(30, 170, 725, 100);
        QuestionStatementTextFieldP22.setFont(new Font("Candara", Font.PLAIN, 20));
        QuestionStatementTextFieldP22.setBackground(Color.decode("#ffeaa7"));
        panel22.add(QuestionStatementTextFieldP22);

        option1P22 = new JLabel("Option 1:");
        option1P22.setBounds(20, 300, 200, 30);
        option1P22.setFont(new Font("Candara", Font.BOLD, 20));
        panel22.add(option1P22);

        option2P22 = new JLabel("Option 2:");
        option2P22.setBounds(20, 360, 200, 30);
        option2P22.setFont(new Font("Candara", Font.BOLD, 20));
        panel22.add(option2P22);

        option3P22 = new JLabel("Option 3:");
        option3P22.setBounds(20, 420, 200, 30);
        option3P22.setFont(new Font("Candara", Font.BOLD, 20));
        panel22.add(option3P22);

        option4P22 = new JLabel("Option 4:");
        option4P22.setBounds(20, 480, 200, 30);
        option4P22.setFont(new Font("Candara", Font.BOLD, 20));
        panel22.add(option4P22);

        correctoptionP22 = new JLabel("Correct Option (1,2,3,4):");
        correctoptionP22.setBounds(210, 540, 300, 30);
        correctoptionP22.setFont(new Font("Candara", Font.BOLD, 20));
        panel22.add(correctoptionP22);

        option1fieldP22 = new JTextField();
        option1fieldP22.setBounds(260, 300, 500, 30);
        option1fieldP22.setFont(new Font("Candara", Font.PLAIN, 20));
        option1fieldP22.setBackground(Color.decode("#ffeaa7"));
        panel22.add(option1fieldP22);

        option2fieldP22 = new JTextField();
        option2fieldP22.setBounds(260, 360, 500, 30);
        option2fieldP22.setFont(new Font("Candara", Font.PLAIN, 20));
        option2fieldP22.setBackground(Color.decode("#ffeaa7"));
        panel22.add(option2fieldP22);

        option3fieldP22 = new JTextField();
        option3fieldP22.setBounds(260, 420, 500, 30);
        option3fieldP22.setFont(new Font("Candara", Font.PLAIN, 20));
        option3fieldP22.setBackground(Color.decode("#ffeaa7"));
        panel22.add(option3fieldP22);

        option4fieldP22 = new JTextField();
        option4fieldP22.setBounds(260, 480, 500, 30);
        option4fieldP22.setFont(new Font("Candara", Font.PLAIN, 20));
        option4fieldP22.setBackground(Color.decode("#ffeaa7"));
        panel22.add(option4fieldP22);

        correctoptionfieldP22 = new JTextField();
        correctoptionfieldP22.setBounds(450, 540, 100, 30);
        correctoptionfieldP22.setFont(new Font("Candara", Font.PLAIN, 20));
        correctoptionfieldP22.setBackground(Color.decode("#ffeaa7"));
        panel22.add(correctoptionfieldP22);

        backP22 = new JButton("Back") ;
        backP22.setBounds(270, 600, 100, 32);
        backP22.setFont(new Font("Candara", Font.BOLD, 20));
        backP22.addActionListener(this);
        panel22.add(backP22);

        addP22 = new JButton("Add") ;
        addP22.setBounds(390, 600, 100, 32);
        addP22.setFont(new Font("Candara", Font.BOLD, 20));
        // backP22.addActionListener(this);
        panel22.add(addP22);
        panel22.setVisible(false);

        //--------------------------------Panel 23-----------------------------------
        panel23 = new JPanel();
        panel23.setBounds(0, 0, 800, 700);
        panel23.setOpaque(false);
        panel23.setLayout(null);
        add(panel23);
// label on panel23
        DeleteQuestionsP23 = new JLabel("Delete Questions");
        DeleteQuestionsP23.setBounds(255,50 , 400,60);
        DeleteQuestionsP23.setFont(new Font("Candara",Font.BOLD,35));
        panel23.add(DeleteQuestionsP23);

// Table Showcasing on panel23
        Object[][] data1 = {
                {"1", "Demo Statement 1"},
                {"2", "Demo Statement 1"},
                {"3", "Demo Statement 1"}
        };

        // create table column names
        String[] columnNamesP23 = {"Sr No", "Statement"};

        // create table model with data and column names
        DefaultTableModel modelP23 = new DefaultTableModel(data1, columnNamesP23);

        // create JTable with model
        JTable table1 = new JTable(modelP23);
        table1.setBackground(Color.WHITE);
        table1.setEnabled(false);
        table1.setFont(new Font("Arial", Font.PLAIN, 16));

        // set header row with column names
        JTableHeader headerP23 = table1.getTableHeader();

        headerP23.setFont(new Font("Arial", Font.BOLD, 18));

        // set table size
        table1.setPreferredScrollableViewportSize(new Dimension(600, 250));

        // add table to a scroll pane
        JScrollPane scrollPaneP23 = new JScrollPane(table1);
        scrollPaneP23.setBounds(100, 150, 600, 250);
        panel23.add(scrollPaneP23);

        labelP23 = new JLabel("Enter the serial number of the question you want to delete:");
        labelP23.setBounds(150,420 , 600,30);
        labelP23.setFont(new Font("Candara",Font.BOLD,20));
        panel23.add(labelP23);

        SerialNumberField = new JTextField();
        SerialNumberField.setBounds(340,460 , 100,30);
        SerialNumberField.setFont(new Font("Candara",Font.BOLD,20));
        SerialNumberField.setBackground(Color.decode("#ffeaa7"));
        panel23.add(SerialNumberField);

        deleteP23 = new JButton("Delete") ;
        deleteP23.setBounds(400, 550, 100, 35);
        deleteP23.setFont(new Font("Candara", Font.BOLD, 20));
//      deleteP23.addActionListener(this);
        panel23.add(deleteP23);


        BackP23 = new JButton("Back") ;
        BackP23.setBounds(280, 550, 100, 35);
        BackP23.setFont(new Font("Candara", Font.BOLD, 20));
        BackP23.addActionListener(this);
        panel23.add(BackP23);
        panel23.setVisible(false);

//--------------------------------Panel 24-----------------------------------
        panel24 = new JPanel();
        panel24.setBounds(0, 0, 800, 700);
        panel24.setOpaque(false);
        panel24.setLayout(null);
        add(panel24);
// label on Panel 24
        questionStat = new JLabel("Question Statement");
        questionStat.setBounds(240,50 , 400,60);
        questionStat.setFont(new Font("Candara",Font.BOLD,35));
        panel24.add(questionStat);


// Table Showcasing on Panel 24
        Object[][] dataP24 = {
                {"1", "Demo Statement    ", "Demo"},
                {"2", "Demo Statement    ", "Demo"},
                {"3", "Demo Statement    ", "Demo"}
        };

        // create table column names
        String[] columnNamesP24 = {"Sr No", "Statement", "Correct"};

        // create table model with data and column names
        DefaultTableModel modelP24 = new DefaultTableModel(dataP24, columnNamesP24);

        // create JTable with modelA
        JTable tableP24 = new JTable(modelP24);
        tableP24.setBackground(Color.WHITE);
        tableP24.setEnabled(false);
        tableP24.setFont(new Font("Arial", Font.PLAIN, 16));

        // set header row with column names
        JTableHeader headerP24 = tableP24.getTableHeader();

        headerP24.setFont(new Font("Arial", Font.BOLD, 18));

        // set table size
        tableP24.setPreferredScrollableViewportSize(new Dimension(600, 250));

        // add table to a scroll pane
        JScrollPane scrollPaneP24 = new JScrollPane(tableP24);
        scrollPaneP24.setBounds(100, 150, 600, 250);
        panel24.add(scrollPaneP24);

// Buttons on Panel 24
        backP24 = new JButton("Back") ;
        backP24.setBounds(600, 500, 100, 35);
        backP24.setFont(new Font("Candara", Font.BOLD, 20));
        backP24.addActionListener(this);
        panel24.add(backP24);
        panel24.setVisible(false);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

//         if user clicks on question bank on panel16
        if(e.getSource() == questionBank) {
            panel16.setVisible(false);
            panel20.setVisible(true);
        }
//         if user clicks on view user data on panel16
        if(e.getSource() == viewData) {
            panel16.setVisible(false);
            panel17.setVisible(true);
        }
        if(e.getSource() == questionBank) {
            panel16.setVisible(false);
            panel20.setVisible(true);
        }

        // if user clicks on sign out button on panel16
        if(e.getSource() == signOutP16) {
            setVisible(false);
            new Login();
        }
        // if user clicks on back button on panel17
        if(e.getSource() == backP17) {
            panel17.setVisible(false);
            panel16.setVisible(true);
        }
//         if user clicks on Java button on panel20
        if(e.getSource() == javaP20 || e.getSource() == cppP20 || e.getSource() == pythonP20 ) {
            panel20.setVisible(false);
            panel21.setVisible(true);
        }
//         if user clicks on back button on panel20
        if(e.getSource() == backP20) {
            panel20.setVisible(false);
            panel16.setVisible(true);
        }
//         if user clicks on Add Question on panel21
        if(e.getSource() == addQues) {
            panel21.setVisible(false);
            panel22.setVisible(true);
        }
//         if user clicks on delete Question on panel21
        if(e.getSource() == deleteQues) {
            panel21.setVisible(false);
            panel23.setVisible(true);
        }
//         if user clicks on view Question on panel21
        if(e.getSource() == viewQues) {
            panel21.setVisible(false);
            panel24.setVisible(true);
        }
//         if user clicks on back on panel21
        if(e.getSource() == backP21) {
            panel21.setVisible(false);
            panel20.setVisible(true);
        }
//         if user clicks on Add on panel22
        if(e.getSource() == backP22) {
            panel22.setVisible(false);
            panel21.setVisible(true);
        }

        //         if user clicks on Add on panel22
        if(e.getSource() == BackP23) {
            panel23.setVisible(false);
            panel22.setVisible(true);
        }

        if(e.getSource() == backP24) {
            panel24.setVisible(false);
            panel21.setVisible(true);
 }

}
}
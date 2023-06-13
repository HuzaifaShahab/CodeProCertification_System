import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame implements ActionListener {

    // panel12 components
    public static JButton CQuizCheck, javaQuizCheck, pythonQuizCheck, backP12;
    public static JLabel chooseSubPerformance;
    public static JPanel panel12;

    // panel13 components
    static JPanel panel13;
    static JLabel subjectNameP13;
    static JButton backP13;
    static JTable table;



    Result(){
        setSize(800, 700);
        setLayout(null);
        setLocation(320, 10);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        // ------------------------------ Panel 12 --------------------------------
        panel12 = new JPanel() ;
        panel12.setLayout(null);
        panel12.setBounds(0, 0, 800, 700);
        panel12.setOpaque(false);

        chooseSubPerformance = new JLabel("View Quiz Performance");
        chooseSubPerformance.setHorizontalTextPosition(JLabel.CENTER);
        chooseSubPerformance.setBounds(230, 30, 600, 40);
        chooseSubPerformance.setFont(new Font("Candara", Font.BOLD, 30));
        panel12.add(chooseSubPerformance);
        add(panel12) ;

        CQuizCheck = new JButton("C++ Quiz") ;
        CQuizCheck.setBounds(260, 150, 250, 30);
        CQuizCheck.setFont(new Font("Candara", Font.BOLD, 20));
        CQuizCheck.setFocusable(false);
        CQuizCheck.addActionListener(this);
        panel12.add(CQuizCheck);

        javaQuizCheck = new JButton("Java Quiz") ;
        javaQuizCheck.setBounds(260, 250, 250, 30);
        javaQuizCheck.setFont(new Font("Candara", Font.BOLD, 20));
        javaQuizCheck.setFocusable(false);
        javaQuizCheck.addActionListener(this);
        panel12.add(javaQuizCheck);

        pythonQuizCheck = new JButton("Python Quiz") ;
        pythonQuizCheck.setBounds(260, 350, 250, 30);
        pythonQuizCheck.setFont(new Font("Candara", Font.BOLD, 20));
        pythonQuizCheck.setFocusable(false);
        pythonQuizCheck.addActionListener(this);
        panel12.add(pythonQuizCheck);

        backP12 = new JButton("Back") ;
        backP12.setBounds(540, 550, 100, 32);
        backP12.setFont(new Font("Candara", Font.BOLD, 20));
        backP12.addActionListener(this);
        panel12.add(backP12);

        // ---------------------------- Panel 13 ---------------------------------------
        panel13 = new JPanel();
        panel13.setBounds(0, 0, 800, 700);
        panel13.setOpaque(false);
        panel13.setLayout(null);
        add(panel13);

        subjectNameP13 = new JLabel("Java Quiz Performance");
        subjectNameP13.setBounds(220,30 , 400,60);
        subjectNameP13.setFont(new Font("Candara",Font.BOLD,40));
        panel13.add(subjectNameP13);

        Object[][] data1 = {
                {"01/01/2022", "10:00 AM", "3/5"},
                {"01/02/2022", "02:30 PM", "4/5"},
                {"01/03/2022", "09:45 AM", "5/5"}
        };

        // create table column names
        String[] columnNames = {"Date", "Time", "Score"};

        // create table model with data and column names
        DefaultTableModel model = new DefaultTableModel(data1, columnNames);

        // create JTable with model
        table = new JTable(model);
        table.setEnabled(false);
        table.setFont(new Font("Arial", Font.PLAIN, 16));

        // set header row with column names
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 18));

        // set table size
        table.setPreferredScrollableViewportSize(new Dimension(600, 300));

        // add table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 150, 600, 77);
        panel13.add(scrollPane);


        // back button on panel13
        backP13 = new JButton("Go back");
        backP13.setBounds(300,450,200,40);
        backP13.setFont(new Font("Candara",Font.BOLD,20));
        backP13.addActionListener(this);
        panel13.add(backP13);
        panel13.setVisible(false);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        // if user clicks on any subject on panel12
        if(e.getSource() == CQuizCheck || e.getSource() == javaQuizCheck || e.getSource() == pythonQuizCheck) {
            panel12.setVisible(false);
            panel13.setVisible(true);
        }

        // if user clicks on back button on panel12
        if(e.getSource() == backP12) {
            setVisible(false);
            new User();
        }

        // if user clicks on back button on panel13
        if(e.getSource() == backP13) {
            panel13.setVisible(false);
            panel12.setVisible(true);
}

}
}
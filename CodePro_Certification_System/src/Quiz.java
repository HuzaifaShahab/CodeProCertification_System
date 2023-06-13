import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {

    // panel6 components
    public static JButton cQuiz, javaQuiz, pythonQuiz , backP6;
    public static JLabel chooseSub ;
    public static JPanel panel6;

    // panel7 components
    static JPanel panel7;
    static JLabel rulesLabel;
    static JTextArea textArea;
    JCheckBox acceptCheckBox;
    static JButton backP7,nextP7;

    // panel8 components
    public static JButton readyButtonP8,backP8;
    public static JLabel WelcomeUser ,subjectLabel, totalQues, timeAllow , subjectName, NumberOfQuestionsLabel, QuizTime, readyLabel;
    public static JPanel panel8;

    // panel9 components
    public static JButton NextP9;
    public static JRadioButton option1P9,option2P9,option3P9,option4P9;
    public static ButtonGroup groupRadioP9;
    public static JLabel quizQuesP9 , quizTitleP9 , timeLabelP9;
    public static JPanel panel9;
    public Timer timeTrackP9;
    private final int secondsRemainP9 = 60;

    // panel10 components
    public static JButton SubmitP10;
    public static JRadioButton option1P10, option2P10, option3P10, option4P10;
    public static ButtonGroup groupRadioP10;
    public static JLabel quizQuesP10, quizTitleP10, timeLabelP10;
    public static JPanel panel10;
//    public Timer timeTrack ;
//    final private int secondsRemain = 60 ;

    // panel11 components
    static JPanel panel11;
    static JLabel quizResultP11, scoreLabelP11, userScoreP11,statusLabelP11, userStatusP11;
    static JButton mainMenuP11;


    Quiz() {
        setSize(800, 700);
        setLayout(null);
        setLocation(320, 10);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        panel6 = new JPanel() ;
        panel6.setLayout(null);
        panel6.setBounds(0, 0, 800, 700);
        panel6.setOpaque(false);

        chooseSub = new JLabel("Choose Subject For Quiz");
        chooseSub.setHorizontalTextPosition(JLabel.CENTER);
        chooseSub.setBounds(225, 30, 600, 40);
        chooseSub.setFont(new Font("Candara", Font.BOLD, 30));
        panel6.add(chooseSub);
        add(panel6) ;

        cQuiz = new JButton("C++ Quiz") ;
        cQuiz.setBounds(260, 150, 250, 30);
        cQuiz.setFont(new Font("Candara", Font.BOLD, 20));
        cQuiz.setFocusable(false);
        cQuiz.addActionListener(this);
        panel6.add(cQuiz);

        javaQuiz = new JButton("Java Quiz") ;
        javaQuiz.setBounds(260, 250, 250, 30);
        javaQuiz.setFont(new Font("Candara", Font.BOLD, 20));
        javaQuiz.setFocusable(false);
        javaQuiz.addActionListener(this);
        panel6.add(javaQuiz);

        pythonQuiz = new JButton("Python Quiz") ;
        pythonQuiz.setBounds(260, 350, 250, 30);
        pythonQuiz.setFont(new Font("Candara", Font.BOLD, 20));
        pythonQuiz.setFocusable(false);
        pythonQuiz.addActionListener(this);
        panel6.add(pythonQuiz);

        backP6 = new JButton("Back") ;
        backP6.setBounds(540, 550, 100, 32);
        backP6.setFont(new Font("Candara", Font.BOLD, 20));
        backP6.addActionListener(this);
        panel6.add(backP6);

//        --------------------------- Panel 7 -----------------------------
        panel7 = new JPanel();
        panel7.setBounds(0, 0, 800, 700);
        panel7.setOpaque(false);
        panel7.setLayout(null);
        add(panel7);

        // rules label on panel7
        rulesLabel = new JLabel("Rules");
        rulesLabel.setBounds(350,20 , 150,40);
        rulesLabel.setFont(new Font("Candara",Font.BOLD,36));
        panel7.add(rulesLabel);

        // text area on panel7 which displays the rules to the user
        textArea = new JTextArea();
        textArea.setBounds(10,100,800,300);
        textArea.setFont(new Font("Candara",Font.BOLD,20));
        textArea.setText("1)    Each question has a time limit of 15 seconds.\n\n\n" +
                "2) If the user does not answer the question within the allotted time, the question will" + "\n\n     " +
                "automatically update to the next question.\n\n\n" +
                "3) The user is only allowed one attempt per question.\n\n\n" +
                "4) The score will be displayed at the end of the quiz.\n\n\n" +
                "5) The user cannot go back to previous questions once they have moved on.\n" +
                "6) The user cannot change their answer once they have submitted it.");
        textArea.setEditable(false);
        panel7.add(textArea);

        // accept checkbox on panel7
        acceptCheckBox = new JCheckBox("I accept the rules and conditions.");
        acceptCheckBox.setBounds(30, 500, 300, 30);
        acceptCheckBox.setOpaque(false);
        acceptCheckBox.setFont(new Font("Candara",Font.BOLD,18));
        acceptCheckBox.addActionListener(this);
        panel7.add(acceptCheckBox);

        // back button on panel7
        backP7 = new JButton("Back") ;
        backP7.setBounds(530,550,100,36);
        backP7.setFont(new Font("Candara", Font.BOLD, 20));
        backP7.addActionListener(this);
        panel7.add(backP7);

        // next button on panel7
        nextP7 = new JButton("Next") ;
        nextP7.setBounds(650,550,100,36);
        nextP7.setFont(new Font("Candara", Font.BOLD, 20));
        nextP7.setEnabled(false);
        nextP7.addActionListener(this);
        panel7.add(nextP7);
        panel7.setVisible(false);

        //        ----------------------------- Panel 8 -----------------------------
        panel8 = new JPanel() ;
        panel8.setLayout(null);
        panel8.setSize( 800, 700);
        panel8.setOpaque(false);
        add(panel8);
        // welcome user label on panel8
        WelcomeUser = new JLabel("Welcome User !");
        WelcomeUser.setBounds(10, 20, 250, 40);
        WelcomeUser.setFont(new Font("Candara", Font.BOLD, 35));
        panel8.add(WelcomeUser);

        // subject selected label on panel8
        subjectLabel = new JLabel("Subject Selected");
        subjectLabel.setBounds(150, 100, 250, 40);
        subjectLabel.setFont(new Font("Candara", Font.BOLD, 26));
        panel8.add(subjectLabel);

        // total questions label on panel8
        totalQues = new JLabel("Total Questions");
        totalQues.setBounds(150, 160, 250, 40);
        totalQues.setFont(new Font("Candara", Font.BOLD, 26));
        panel8.add(totalQues);

        // time allowed label on panel8
        timeAllow = new JLabel("Time Allowed");
        timeAllow.setBounds(150, 220, 250, 40);
        timeAllow.setFont(new Font("Candara", Font.BOLD, 26));
        panel8.add(timeAllow);

        // subject name label on panel8
        subjectName = new JLabel("Java");
        subjectName.setBounds(390, 100, 250, 40);
        subjectName.setFont(new Font("Candara", Font.PLAIN, 26));
        panel8.add(subjectName);

        // number of questions label on panel8
        NumberOfQuestionsLabel = new JLabel("5");
        NumberOfQuestionsLabel.setBounds(390, 160, 250, 40);
        NumberOfQuestionsLabel.setFont(new Font("Candara", Font.PLAIN, 26));
        panel8.add(NumberOfQuestionsLabel);

        // quiz time label on panel8
        QuizTime = new JLabel("1 min 15 secs");
        QuizTime.setBounds(390, 220, 250, 40);
        QuizTime.setFont(new Font("Candara", Font.PLAIN, 26));
        panel8.add(QuizTime);

        // are you ready for the quiz label on panel8
        readyLabel = new JLabel("Are you ready for the quiz?");
        readyLabel.setBounds(110, 350, 600, 60);
        readyLabel.setFont(new Font("Candara", Font.PLAIN, 50));
        panel8.add(readyLabel);

        // ready button on panel8
        readyButtonP8 = new JButton("Ready!") ;
        readyButtonP8.setBounds(400, 450, 150, 35);
        readyButtonP8.setFont(new Font("Candara", Font.BOLD, 20));
        readyButtonP8.setFocusable(false);
        readyButtonP8.addActionListener(this);
        panel8.add(readyButtonP8);

        // back button on panel8
        backP8 = new JButton("Back") ;
        backP8.setBounds(180, 450, 150, 35);
        backP8.setFont(new Font("Candara", Font.BOLD, 20));
        backP8.addActionListener(this);
        panel8.add(backP8);
        panel8.setVisible(false);
        //        ----------------------------- Panel 9 -----------------------------

        panel9 = new JPanel() ;
        panel9.setLayout(null);
        panel9.setSize(800, 700);
        panel9.setOpaque(false);
        add(panel9);

        // CodePro Certification System label on panel9
        quizTitleP9 = new JLabel("CodePro Certification System");
        quizTitleP9.setBounds(170, 20, 800, 40);
        quizTitleP9.setFont(new Font("Candara", Font.BOLD, 35));
        panel9.add(quizTitleP9);

        // Question statement on panel9
        quizQuesP9 = new JLabel("Question No.1 : Why do we park on driveways and drive on parkways ?");
        quizQuesP9.setBounds(30, 200, 800, 40);
        quizQuesP9.setFont(new Font("Candara", Font.PLAIN, 20));
        panel9.add(quizQuesP9);

       /* timeTrack = new Timer(1000,e -> {
            timeLabel = new JLabel(String.valueOf("Time Left: "+secondsRemain)) ;
            timeLabel.setBounds(600,100,130,70);
            timeLabel.setFont(new Font( "Candara",Font.BOLD,50)) ;
            panel9.add(timeLabel);
            if (secondsRemain == 0) {
                timeTrack.stop();
            }
        });


  panel9.add(timeLabel) ;
        timeTrack.start();  // start the timer */

        // option 1 on panel9
        option1P9 = new JRadioButton("Option 1");
        option1P9.setBounds(30,270,200,50);
        option1P9.setFont(new Font("Candara",Font.PLAIN,35));
        option1P9.setOpaque(false);
        panel9.add(option1P9);

        // option 2 on panel9
        option2P9 = new JRadioButton("Option 2");
        option2P9.setBounds(30,330,200,50);
        option2P9.setFont(new Font("Candara",Font.PLAIN,35));
        option2P9.setOpaque(false);
        panel9.add(option2P9);

        // option 3 on panel9
        option3P9 = new JRadioButton("Option 3");
        option3P9.setBounds(30,390,200,50);
        option3P9.setFont(new Font("Candara",Font.PLAIN,35));
        option3P9.setOpaque(false);
        panel9.add(option3P9);

        // option 4 on panel9
        option4P9 = new JRadioButton("Option 4");
        option4P9.setBounds(30,450,200,50);
        option4P9.setFont(new Font("Candara",Font.PLAIN,35));
        option4P9.setOpaque(false);
        panel9.add(option4P9);
        // radio button group on panel9
        groupRadioP9 = new ButtonGroup() ;
        groupRadioP9.add(option1P9) ;
        groupRadioP9.add(option2P9) ;
        groupRadioP9.add(option3P9) ;
        groupRadioP9.add(option4P9) ;

        // next button on panel9
        NextP9 = new JButton("Next") ;
        NextP9.setBounds(580,550,150,50);
        NextP9.setFont(new Font("Candara", Font.BOLD, 20));
        NextP9.addActionListener(this);
        panel9.add(NextP9);
        panel9.setVisible(false);

        //        ----------------------------- Panel10 -----------------------------
        panel10 = new JPanel() ;
        panel10.setLayout(null);
        panel10.setSize(800, 700);
        panel10.setOpaque(false);
        add(panel10);

        // CodePro Certification System label on panel10
        quizTitleP10 = new JLabel("CodePro Certification System");
        quizTitleP10.setBounds(170, 20, 800, 40);
        quizTitleP10.setFont(new Font("Candara", Font.BOLD, 35));
        panel10.add(quizTitleP10);

        // question statement on panel10
        quizQuesP10 = new JLabel("Question No.1 : Why do we park on driveways and drive on parkways ?");
        quizQuesP10.setBounds(30, 200, 800, 40);
        quizQuesP10.setFont(new Font("Candara", Font.PLAIN, 23));
        panel10.add(quizQuesP10);
  /* timeTrack = new Timer(1000,e -> {
            timeLabel = new JLabel(String.valueOf("Time Left: "+secondsRemain)) ;
            timeLabel.setBounds(600,100,130,70);
            timeLabel.setFont(new Font( "Candara",Font.BOLD,50)) ;
            panel9.add(timeLabel);
            if (secondsRemain == 0) {
                timeTrack.stop();
            }
        });


        panel9.add(timeLabel) ;
        timeTrack.start();  // start the timer */


        // option 1 on panel10
        option1P10 = new JRadioButton("Option 1");
        option1P10.setBounds(30,270,200,50);
        option1P10.setFont(new Font("Candara",Font.PLAIN,35));
        option1P10.setOpaque(false);
        panel10.add(option1P10);

        // option 2 on panel10
        option2P10 = new JRadioButton("Option 2");
        option2P10.setBounds(30,330,200,50);
        option2P10.setFont(new Font("Candara",Font.PLAIN,35));
        option2P10.setOpaque(false);
        panel10.add(option2P10);

        // option 3 on panel10
        option3P10 = new JRadioButton("Option 3");
        option3P10.setBounds(30,390,200,50);
        option3P10.setFont(new Font("Candara",Font.PLAIN,35));
        option3P10.setOpaque(false);
        panel10.add(option3P10);

        // option 4 on panel10
        option4P10 = new JRadioButton("option 4");
        option4P10.setBounds(30,450,200,50);
        option4P10.setFont(new Font("Candara",Font.PLAIN,35));
        option4P10.setOpaque(false);
        panel10.add(option4P10);

        // radio button group on panel10
        groupRadioP10 = new ButtonGroup() ;
        groupRadioP10.add(option1P10) ;
        groupRadioP10.add(option2P10) ;
        groupRadioP10.add(option3P10) ;
        groupRadioP10.add(option4P10) ;

        // submit button on panel10
        SubmitP10 = new JButton("Submit") ;
        SubmitP10.setBounds(580,550,150,50);
        SubmitP10.setFont(new Font("Candara", Font.BOLD, 20));
        SubmitP10.addActionListener(this);
        panel10.add(SubmitP10);
        panel10.setVisible(false);

        // -------------------------------------- Panel 11 --------------------------------------

        panel11 = new JPanel();
        panel11.setBounds(0, 0, 800, 700);
        panel11.setOpaque(false);
        panel11.setLayout(null);
        add(panel11);

        // Quiz Result label on panel11
        quizResultP11 = new JLabel("Quiz Result");
        quizResultP11.setBounds(290,30 , 350,60);
        quizResultP11.setFont(new Font("Candara",Font.BOLD,50));
        panel11.add(quizResultP11);

        // score label on panel11
        scoreLabelP11 = new JLabel("Score:");
        scoreLabelP11.setBounds(350,190 , 200,50);
        scoreLabelP11.setFont(new Font("Candara",Font.BOLD,40));
        panel11.add(scoreLabelP11);

        // user score label on panel 11
        userScoreP11 = new JLabel("3/5");
        userScoreP11.setBounds(380,240 , 200,40);
        userScoreP11.setFont(new Font("Candara",Font.BOLD,36));
        userScoreP11.setForeground(Color.decode("#74b9ff"));
        panel11.add(userScoreP11);

        // status label on panel11
        statusLabelP11 = new JLabel("Status:");
        statusLabelP11.setBounds(350,310 , 200,50);
        statusLabelP11.setFont(new Font("Candara",Font.BOLD,40));
        panel11.add(statusLabelP11);

        // user status label on panel11
        userStatusP11 = new JLabel("Pass");
        userStatusP11.setBounds(380,360 , 200,40);
        userStatusP11.setFont(new Font("Candara",Font.BOLD,36));
        userStatusP11.setForeground(Color.decode("#00b894"));
        panel11.add(userStatusP11);

        // go to main menu buttonon panel11
        mainMenuP11 = new JButton("Go back to main menu");
        mainMenuP11.setBounds(220,450,400,40);
        mainMenuP11.setFont(new Font("Candara",Font.BOLD,20));
        mainMenuP11.addActionListener(this);
        panel11.add(mainMenuP11);
        panel11.setVisible(false);

        setVisible(true);

    }

    public void actionPerformed (ActionEvent e) {

        // if user clicks on any subject on panel6
        if(e.getSource() == cQuiz || e.getSource() == pythonQuiz || e.getSource() == javaQuiz ) {
            panel6.setVisible(false);
            panel7.setVisible(true);
        }

        // if user clicks on back button on panel 6
        if(e.getSource() == backP6) {
            setVisible(false);
            new User();
        }

        // enable the next button if the checkbox on panel7 is selected
        if(e.getSource() == acceptCheckBox) {
            nextP7.setEnabled(acceptCheckBox.isSelected());
        }

        // if user clicks on next button on panel7
        if(e.getSource() == nextP7) {
            panel7.setVisible(false);
            panel8.setVisible(true);
        }

        // if user clicks on back button on panel7
        if(e.getSource() == backP7) {
            panel7.setVisible(false);
            panel6.setVisible(true);
        }

        // if user clicks on back button on panel8
        if(e.getSource() == backP8) {
            panel8.setVisible(false);
            panel7.setVisible(true);
        }

        // if user clicks on ready button on panel8
        if(e.getSource() == readyButtonP8) {
            panel8.setVisible(false);
            panel9.setVisible(true);
        }

        // if user clicks on next button on pane9
        if(e.getSource() == NextP9) {
            panel9.setVisible(false);
            panel10.setVisible(true);
        }
        // if user clicks on submit button on panel10
        if(e.getSource() == SubmitP10) {
            panel10.setVisible(false);
            panel11.setVisible(true);
        }

        // if user clicks on go back to main menu on panel11
        if(e.getSource() == mainMenuP11) {
            setVisible(false);
            new User();
 }

}
}
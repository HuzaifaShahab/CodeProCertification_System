import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    // all the panels
    static JPanel panel1, panel2, panel3, panel4;
    //panel1 components
    static JButton userbutton , adminbutton;
    static JLabel userCheck;
    //panel2 components
    static JButton createAccP2, signIn, backP2;
    static JLabel accountCheck;
    // panel3 components
    static JButton backP3, createAccP3;
    static JLabel nameLabel, lastLabel, ageLabel, genderLabel, cityLabel, registrationLabel, usernameLabel,passwordLabel, accCreatedLabel;
    static JPasswordField passwordFieldP3;
    static JTextField nameField, lastField, ageField, cityField , usernameField;
    static JComboBox  genderBox;
    // panel4 components
    static JLabel usernameLabelP4, passwordLabelP4;
    static JTextField usernameFieldP4;
    JPasswordField passwordFieldP4;

    JButton backP4, signInP4;

    Login() {

        // frame properties
        setSize(600, 600);
        setLocation(400,50);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);

        // -------------------------- panel 1 ----------------------------------
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,180,600,600);
        panel1.setOpaque(false);
        add(panel1);

        // Label on panel1
        userCheck = new JLabel();
        userCheck.setText("Are you a user or an admin?");
        userCheck.setFont(new Font("Candara", Font.PLAIN, 35));
        userCheck.setBounds(50,30, 500, 50);
        userCheck.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(userCheck);

        // user button on panel1
        userbutton = new JButton();
        userbutton.setText("User");
        userbutton.setBounds(180,100,100,40);
        userbutton.setFont(new Font("Candara", Font.BOLD, 20));
        panel1.add(userbutton);

        // admin button on panel1
        adminbutton = new JButton();
        adminbutton.setText("Admin");
        adminbutton.setBounds(300,100,100,40);
        adminbutton.setFont(new Font("Candara", Font.BOLD, 20));
        panel1.add(adminbutton);

        // action listeners for user and admin button on panel1
        userbutton.addActionListener(this);
        adminbutton.addActionListener(this);


        // -------------------------- panel 2 ----------------------------------
        panel2 = new JPanel();
        panel2.setBounds(0,0,600,600);
        panel2.setOpaque(false);
        panel2.setLayout(null);
        add(panel2);

        // label on panel2
        accountCheck = new JLabel();
        accountCheck.setText("Already have an account?");
        accountCheck.setBounds(140,250, 500, 50);
        accountCheck.setFont(new Font("Candara", Font.PLAIN, 26));
        panel2.add(accountCheck);

        // createAcc button on panel2
        createAccP2 = new JButton();
        createAccP2.setText("Create an account");
        createAccP2.setBounds(180,180,200,36);
        createAccP2.setFont(new Font("Candara", Font.BOLD, 20));
        createAccP2.addActionListener(this);
        panel2.add(createAccP2);

        // signIN button on panel2
        signIn = new JButton();
        signIn.setText("Sign in");
        signIn.setBounds(230,300,100,30);
        signIn.setFont(new Font("Candara", Font.BOLD, 20));
        signIn.addActionListener(this);
        panel2.add(signIn);

        // back button on panel2
        backP2 = new JButton();
        backP2.setText("Back");
        backP2.setBounds(450,500,100,32);
        backP2.setFont(new Font("Candara", Font.BOLD, 20));
        backP2.addActionListener(this);
        panel2.add(backP2);
        panel2.setVisible(false);

        // -------------------------- panel 3 ----------------------------------

        // panel3 properties
        panel3 = new JPanel();
        panel3.setBounds(0, 0, 600, 600);
        panel3.setOpaque(false);
        panel3.setLayout(null);
        add(panel3);

        // registration label on panel3
        registrationLabel = new JLabel("Registration") ;
        registrationLabel.setBounds(10,20 , 250,40);
        registrationLabel.setFont(new Font("Candara",Font.BOLD,35));
        panel3.add(registrationLabel) ;

        // first name label on panel3
        nameLabel = new JLabel("First Name:") ;
        nameLabel.setBounds(100,80 , 150,40);
        nameLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(nameLabel) ;

        // last name label on panel3
        lastLabel = new JLabel("Last Name:") ;
        lastLabel.setBounds(100,130 , 150,40);
        lastLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(lastLabel) ;

        // username label on panel3
        usernameLabel = new JLabel("Username:") ;
        usernameLabel.setBounds(100,180 , 150,40);
        usernameLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(usernameLabel) ;

        // password label on panel3
        passwordLabel = new JLabel("Password:") ;
        passwordLabel.setBounds(100,230,150,40);
        passwordLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(passwordLabel);

        // age label on panel3
        ageLabel = new JLabel("Age:") ;
        ageLabel.setBounds(100,280 , 150,40);
        ageLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(ageLabel);

        // city label on panel3
        cityLabel = new JLabel("City:") ;
        cityLabel.setBounds(100,330 , 150,40);
        cityLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(cityLabel) ;

        // gender label on panel3
        genderLabel = new JLabel("Gender:") ;
        genderLabel.setBounds(100,380 , 150,40);
        genderLabel.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(genderLabel);

        // account created label on panel3
        accCreatedLabel = new JLabel("Account created successfully! Go back and sign in to view your account.") ;
        accCreatedLabel.setBounds(60,500 , 500,40);
        accCreatedLabel.setFont(new Font("Candara",Font.PLAIN,16));
        accCreatedLabel.setVisible(false);
        panel3.add(accCreatedLabel);

        // name field on panel3
        nameField = new JTextField() ;
        nameField.setBounds(320,80 , 150,30);
        nameField.setFont(new Font("Candara",Font.PLAIN,20));
        panel3.add(nameField) ;

        // last name field on panel3
        lastField = new JTextField() ;
        lastField.setBounds(320,130 , 150,30);
        lastField.setFont(new Font("Candara",Font.PLAIN,20));
        panel3.add(lastField) ;

        // username field om panel3
        usernameField = new JTextField() ;
        usernameField.setBounds(320,180 , 150,30);
        usernameField.setFont(new Font("Candara",Font.PLAIN,20));
        panel3.add(usernameField) ;

        // password field on panel3
        passwordFieldP3 = new JPasswordField();
        passwordFieldP3.setBounds(320,230,150,30);
        passwordFieldP3.setFont(new Font("Candara",Font.PLAIN,26));
        panel3.add(passwordFieldP3);

        // age field on panel3
        ageField = new JTextField() ;
        ageField.setBounds(320,280 , 150,30);
        ageField.setFont(new Font("Candara",Font.PLAIN,20));
        panel3.add(ageField) ;

        // city field on panel3
        cityField = new JTextField() ;
        cityField.setBounds(320,330 , 150,30);
        cityField.setFont(new Font("Candara",Font.PLAIN,20));
        panel3.add(cityField) ;

        // Combo box on panel3
        genderBox = new JComboBox();
        genderBox.addItem("Male");
        genderBox.addItem("Female");
        genderBox.setSelectedItem("Male");
        genderBox.setBounds(320,380 , 150,30);
        genderBox.setFont(new Font("Candara",Font.BOLD,20));
        genderBox.setBackground(new Color(227,223,182,255));
        panel3.add(genderBox) ;

        // back button on panel3
        backP3 = new JButton("Back") ;
        backP3.setBounds(130,450,100,36);
        backP3.setFont(new Font("Candara", Font.BOLD, 20));
        backP3.addActionListener(this);
        panel3.add(backP3);

        // create account button on panel3
        createAccP3 = new JButton("Create Account") ;
        createAccP3.setBounds(260,450,200,36);
        createAccP3.setFont(new Font("Candara", Font.BOLD, 20));
        createAccP3.addActionListener(this);
        panel3.add(createAccP3);
        panel3.setVisible(false);

        // -------------------------------- Panel 4 ---------------------------------
        panel4 = new JPanel();
        panel4.setBounds(0, 0, 600, 600);
        panel4.setOpaque(false);
        panel4.setLayout(null);
        panel4.setVisible(false);
        add(panel4);

        // username label on panel4
        usernameLabelP4 = new JLabel("Username:") ;
        usernameLabelP4.setBounds(100,170 , 150,40);
        usernameLabelP4.setFont(new Font("Candara",Font.PLAIN,26));
        panel4.add(usernameLabelP4);

        // password label on panel4
        passwordLabelP4 = new JLabel("Password:");
        passwordLabelP4.setBounds(100,220 , 150,40);
        passwordLabelP4.setFont(new Font("Candara",Font.PLAIN,26));
        panel4.add(passwordLabelP4);

        // username field on panel4
        usernameFieldP4 = new JTextField() ;
        usernameFieldP4.setBounds(280,171, 200,30);
        usernameFieldP4.setFont(new Font("Candara",Font.PLAIN,20));
        panel4.add(usernameFieldP4);

        //password on panel4
        passwordFieldP4 = new JPasswordField();
        passwordFieldP4.setBounds(280,221 , 200,30);
        passwordFieldP4.setFont(new Font("Candara",Font.PLAIN,20));
        panel4.add(passwordFieldP4) ;

        //back button on panel4
        backP4 = new JButton("Back") ;
        backP4.setBounds(190,300,100,36);
        backP4.setFont(new Font("Candara", Font.BOLD, 20));
        backP4.addActionListener(this);
        panel4.add(backP4);

        // sign in button on panel4
        signInP4 = new JButton("Sign in") ;
        signInP4.setBounds(320,300,100,36);
        signInP4.setFont(new Font("Candara", Font.BOLD, 20));
        signInP4.addActionListener(this);
        panel4.add(signInP4);

        // show the Jframe on screen
        setResizable(false);
        setVisible(true);


    }

    public void actionPerformed (ActionEvent e){
        // if user clicks on user button on panel1
        if (e.getSource() == userbutton ) {
            panel1.setVisible(false);
            panel2.setVisible(true);
        }

        // if user clicks on admin button on panel1
        if (e.getSource() == adminbutton ) {
            setVisible(false);
            new Admin();
        }

        // if user clicks back button panel2
        if (e.getSource() == backP2) {
            panel2.setVisible(false);
            panel1.setVisible(true);
        }
        // if user clicks on create account button on panel2
        if (e.getSource() == createAccP2) {
            panel2.setVisible(false);
            panel3.setVisible(true);
        }

        // if user clicks on sign in button on panel2
        if(e.getSource() == signIn) {
            panel2.setVisible(false);
            panel4.setVisible(true);
        }

        // if user clicks on back button on panel3
        if (e.getSource() == backP3) {
            accCreatedLabel.setVisible(false);
            panel3.setVisible(false);
            panel2.setVisible(true);
        }

        // if user clicks on create account button on panel3
        if (e.getSource() == createAccP3) {
            accCreatedLabel.setVisible(true);
        }

        // if user clicks on back button on panel4
        if(e.getSource() == backP4) {
            panel4.setVisible(false);
            panel2.setVisible(true);
        }
        if (e.getSource() == signInP4) {
            setVisible(false);
            new User();
}

}
}
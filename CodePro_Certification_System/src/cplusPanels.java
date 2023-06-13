import javax.swing.*;
import java.awt.*;

public class cplusPanels extends JFrame {

    JPanel cp1 ;
    public static JRadioButton c1,c2,c3,c4 ;

    cplusPanels () {
        // frame properties
        setSize(800, 700);
        setLocation(320, 10);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);

        cp1 = new JPanel() ;
        cp1.setSize(800,700);
        cp1 = new JPanel()  ;
        cp1.setLayout(null) ;
        cp1.setBounds(0, 0, 800, 700);
        cp1.setOpaque(false);


    }

    public static void main(String[] args) {
       new  cplusPanels () ;
    }

}


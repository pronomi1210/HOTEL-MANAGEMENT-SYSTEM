package Hotel.management.system;

import javax.swing.*;

public class splash extends JFrame {
    splash() {

         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/splash1.gif"));
         JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,600,400);
        add(label);


        setLayout(null);
        setSize(600,400);
        setVisible(true);
        setLocation(500,200);

        try{
            Thread.sleep(3000);
            new Login();
            setVisible(false);
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new splash();

    }
}
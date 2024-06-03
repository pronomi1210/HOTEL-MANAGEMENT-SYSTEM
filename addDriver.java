package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

public class addDriver extends JFrame implements ActionListener{
    JTextField nameText, ageText,carNText;
    JComboBox comboBox, comboBox1;
    JButton add, back;
    addDriver() {
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(197, 11, 11));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel name = new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(174,70,156,20);
        nameText.setForeground(Color.WHITE);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setBackground(new Color(183, 73, 73));
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("Tahoma", Font.BOLD,14));
        age.setForeground(Color.WHITE);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(174,110,156,20);
        ageText.setForeground(Color.WHITE);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setBackground(new Color(183, 73, 73));
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        comboBox = new JComboBox(new String[]{"Male","Female"});
        comboBox.setBounds(176,150,154,20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setBackground(new Color(183, 73, 73));
        panel.add(comboBox);

        JLabel carN = new JLabel("CAR NAME");
        carN.setBounds(64,190,102,22);
        carN.setFont(new Font("Tahoma", Font.BOLD,14));
        carN.setForeground(Color.WHITE);
        panel.add(carN);
        carNText = new JTextField();
        carNText.setBounds(174,190,156,20);
        carNText.setForeground(Color.WHITE);
        carNText.setFont(new Font("Tahoma",Font.BOLD,14));
        carNText.setBackground(new Color(183, 73, 73));
        panel.add(carNText);

        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(64,230,102,22);
        available.setFont(new Font("Tahoma", Font.BOLD,14));
        available.setForeground(Color.WHITE);
        panel.add(available);
        comboBox1 = new JComboBox(new String[]{"YES","NO"});
        comboBox1.setBounds(176,230,154,20);
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox1.setBackground(new Color(183, 73, 73));
        panel.add(comboBox1);

        add = new JButton("ADD");
        add.setBounds(64,300,111,33);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(198,300,111,33);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,60,300,300);
        panel.add(label1);

        setUndecorated(true);

        setLocation(600,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String gender = (String) comboBox.getSelectedItem();
            String carname = carNText.getText();
            String available =(String)  comboBox1.getSelectedItem();

            try{
                con c = new con();
                String q = "insert into drivers values('"+name+"','"+age+"', '"+gender+"','"+carname+"','"+available+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Driver Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addDriver();
    }
}

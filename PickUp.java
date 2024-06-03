package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUp extends JFrame {
    PickUp(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(197, 11, 11));
        panel.setBounds(5,5,790,590);
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/taxi.png"));
        Image image = imageIcon.getImage().getScaledInstance(190,190,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(300,45,150,130);
        panel.add(imglabel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(300,10,160,25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(pus);

        JLabel TOC = new JLabel("Type of Car: ");
        TOC.setBounds(250,190,90,15);
        TOC.setForeground(Color.WHITE);
        TOC.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(350,189,150,25);
        panel.add(c);

        try{
            con C = new con();
            ResultSet resultSet = C.statement.executeQuery("select * from drivers");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(10,250,800,250);
        table.setBackground(new Color(197, 11, 11));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            con C = new con();
            String q = "select * from drivers";
            ResultSet resultSet = C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(24,220,46,14);
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(200,220,46,14);
        age.setForeground(Color.WHITE);
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(350,220,46,14);
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        JLabel Carname = new JLabel("Car Name");
        Carname.setBounds(500,220,100,14);
        Carname.setForeground(Color.WHITE);
        panel.add(Carname);

        JLabel available = new JLabel("Available");
        available.setBounds(650,220,100,14);
        available.setForeground(Color.WHITE);
        panel.add(available);

        JButton display = new JButton("Display");
        display.setBounds(250,500,120,30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from drivers where carname = '"+c.getSelectedItem()+"'";
                try{
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton Back = new JButton("Back");
        Back.setBounds(400,500,120,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
    }

    public static void main(String[] args) {

        new PickUp();
    }
}

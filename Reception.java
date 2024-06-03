package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
     Reception(){
         JPanel panel = new JPanel();
         panel.setLayout(null);
         panel.setBounds(280,5,1238,820);
         panel.setBackground(new Color(197, 11, 11));
         add(panel);

         JPanel panel1 = new JPanel();
         panel1.setLayout(null);
         panel1.setBounds(5,5,270,820);
         panel1.setBackground(new Color(197, 11, 11));
         add(panel1);

         ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icons/cccc2.png"));
         Image i22 = i111.getImage().getScaledInstance(1000,750, Image.SCALE_DEFAULT);
         ImageIcon imageIcon111 = new ImageIcon(i22);
         JLabel label11 = new JLabel(imageIcon111);
         label11.setBounds(100,15,1000,750);
         panel.add(label11);

         ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
         Image i2 = i11.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
         ImageIcon imageIcon11 = new ImageIcon(i2);
         JLabel label1 = new JLabel(imageIcon11);
         label1.setBounds(-70,420,400,400);
         panel1.add(label1);

         JButton btnNCF = new JButton("New Customer Form");
         btnNCF.setBounds(30,70,200,30);
         btnNCF.setBackground(Color.RED);
         btnNCF.setForeground(Color.WHITE);
         panel1.add(btnNCF);
         btnNCF.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new NewCustomer();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnRoom = new JButton("Room");
         btnRoom.setBounds(30,110,200,30);
         btnRoom.setBackground(Color.RED);
         btnRoom.setForeground(Color.WHITE);
         panel1.add(btnRoom);
         btnRoom.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new Room();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnAEI = new JButton("All Employee Info");
         btnAEI.setBounds(30,150,200,30);
         btnAEI.setBackground(Color.RED);
         btnAEI.setForeground(Color.WHITE);
         panel1.add(btnAEI);
         btnAEI.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new Employee();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnCI = new JButton("Customer Info");
         btnCI.setBounds(30,190,200,30);
         btnCI.setBackground(Color.RED);
         btnCI.setForeground(Color.WHITE);
         panel1.add(btnCI);
         btnCI.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new CustomerInfo();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnCO = new JButton("Check Out");
         btnCO.setBounds(30,230,200,30);
         btnCO.setBackground(Color.RED);
         btnCO.setForeground(Color.WHITE);
         panel1.add(btnCO);
         btnCO.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new CheckOut();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnUC = new JButton("Update Check-In Details");
         btnUC.setBounds(30,270,200,30);
         btnUC.setBackground(Color.RED);
         btnUC.setForeground(Color.WHITE);
         panel1.add(btnUC);
         btnUC.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new UpdateCheck();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnURS = new JButton("Update Room Status");
         btnURS.setBounds(30,310,200,30);
         btnURS.setBackground(Color.RED);
         btnURS.setForeground(Color.WHITE);
         panel1.add(btnURS);
         btnURS.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new UpdateRoom();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnPUS = new JButton("Pick up Service");
         btnPUS.setBounds(30,350,200,30);
         btnPUS.setBackground(Color.RED);
         btnPUS.setForeground(Color.WHITE);
         panel1.add(btnPUS);
         btnPUS.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new PickUp();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton btnSR = new JButton("Search Room");
         btnSR.setBounds(30,390,200,30);
         btnSR.setBackground(Color.RED);
         btnSR.setForeground(Color.WHITE);
         panel1.add(btnSR);
         btnSR.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new SearchRoom();

                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton logout = new JButton("Logout");
         logout.setBounds(30,430,95,30);
         logout.setBackground(Color.RED);
         logout.setForeground(Color.WHITE);
         panel1.add(logout);
         logout.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     System.exit(500);
                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });

         JButton back = new JButton("Back");
         back.setBounds(135,430,95,30);
         back.setBackground(Color.RED);
         back.setForeground(Color.WHITE);
         panel1.add(back);
         back.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     setVisible(false);
                     new Dashboard();
                 }catch (Exception E){
                     E.printStackTrace();
                 }
             }
         });


         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         setSize(1950,1090);
         setVisible(true);

     }


    public static void main(String[] args) {
        new Reception();

    }
}

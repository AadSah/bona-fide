package Registration;

import javax.swing.*; 

import java.awt.*;  

import java.awt.event.*; 

//import java.sql.*;  
import login.login;

import home.home;

public class Registration extends JFrame
{  
    JLabel label1, label2, label3, label4, label5, label6, label7, label8,label9;  
    JTextField tf1, tf2, tf5, tf6, tf7;  
    JButton btn1, btn2;  
    JPasswordField p1, p2;  
    public Registration()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);
        setLocationRelativeTo(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBackground(Color.LIGHT_GRAY);
        setTitle("Registration");  
        label1 = new JLabel("Welcome to BONA-FIDE");  
        label1.setForeground(Color.blue);  
        label1.setFont(new Font("Serif", Font.BOLD, 20));  
        label2 = new JLabel("Name:");  
        label3 = new JLabel("Email-ID:");  
        label4 = new JLabel("Create Passowrd:");  
        label5 = new JLabel("Confirm Password:");  
        label8 = new JLabel("Phone No:");   
        tf1 = new JTextField();  
        tf2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        tf7 = new JTextField();  
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear"); 
        label9 = new JLabel("Enter Details for Sign UP");
        label9.setFont(new Font("Serif", Font.BOLD, 20));
        //btn1.addActionListener(this);  
        //btn2.addActionListener(this);  
        label1.setBounds(180, 30, 400, 30);
        label9.setBounds(172,80,400,30);  
        label2.setBounds(80, 160, 200, 30);  
        label3.setBounds(80, 200, 200, 30);  
        label4.setBounds(80, 240, 200, 30);  
        label5.setBounds(80, 280, 200, 30);   
        label8.setBounds(80, 320, 200, 30);  
        tf1.setBounds(300, 160, 200, 30);  
        tf2.setBounds(300, 200, 200, 30);  
        p1.setBounds(300, 240, 200, 30);  
        p2.setBounds(300, 280, 200, 30);  
        tf7.setBounds(300, 320, 200, 30);  
        btn1.setBounds(180, 375, 100, 30);  
        btn2.setBounds(350, 375, 100, 30);  
        add(label1);
        add(label9);  
        add(label2);  
        add(tf1);  
        add(label3);  
        add(tf2);  
        add(label4);  
        add(p1);  
        add(label5);  
        add(p2); 
        add(label8);  
        add(tf7);  
        add(btn1);  
        add(btn2);  
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //go to button function
                dispose();
                home page = new home();
                page.setVisible(true);
            }
        });

        btn1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
                    btn1.doClick();
                    
                }
            }
        });
    }  
    
    public static void main(String args[])  
    {  
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration newReg = new Registration();  
                    newReg.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    } 
}  
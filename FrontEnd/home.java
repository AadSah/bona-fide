package home;

import javax.swing.*; 

import java.awt.*;  

import java.awt.event.*; 

import java.sql.*;

import login.login;

import Registration.Registration;

public class home extends JFrame{
	public home(){
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(900,640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLayout(null);
		setBackground(Color.WHITE);
		setTitle("Welcome to Bona-Fide");
		JLabel l1 = new JLabel("Welcome to Bona-fide");
		JLabel l2 = new JLabel("A place to check PLAGIARISM");
		JLabel l3 = new JLabel("Already a member?");
		JLabel l4 = new JLabel("New User? Sign Up here");
		JButton btn1 = new JButton("Log In");
		JButton btn2 = new JButton("Sign Up");
		l1.setBounds(310,270,400,30);
		l2.setBounds(280,310,400,30);
		btn1.setBounds(275,400,100,30);
		btn2.setBounds(525,400,100,30);
		l3.setBounds(265,440,240,30);
		l4.setBounds(513,440,240,30);
		l2.setFont(new Font("Tahoma", Font.BOLD, 20));
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(btn1);
		add(btn2);
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Registration newReg = new Registration();
                newReg.setVisible(true);
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login newLogin = new login();
                newLogin.setVisible(true);
            }
        });
        JLabel label = new JLabel("");
        label.setBounds(660,0,240,240);
        label.setIcon(new ImageIcon(home.class.getResource("/img_login/LOGO240_240PX.png")));
        add(label);
        JLabel label2 = new JLabel("");
        label2.setBounds(0,0,240,240);
        label2.setIcon(new ImageIcon(home.class.getResource("/img_login/LOGO240_240PX.png")));
        add(label2);
	}
	public static void main(String args[])
	{
		home newHome = new home();
		newHome.setVisible(true);
	}
}
package Registration;

import javax.swing.*; 

import java.awt.*;  

import java.awt.event.*; 

import java.sql.*; 

import login.login;

import home.home;

import MyConnection.MyConnection;

public class Registration extends JFrame{
    JLabel label1, label2, label3, label4, label5, label6, label7, label8,label9;  
    JTextField tf1, tf2, tf5, tf6, tf7;  
    JButton btn1, btn2;  
    JPasswordField p1, p2; 
    
    public Registration(){  
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
        label3 = new JLabel("Username:");  
        label4 = new JLabel("Create Passowrd:");  
        label5 = new JLabel("Confirm Password:");  
        label8 = new JLabel("Phone No:");   
        tf1 = new JTextField();  
        tf2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        tf7 = new JTextField();  
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Login"); 
        label9 = new JLabel("Enter Details for Sign UP");
        label9.setFont(new Font("Serif", Font.BOLD, 20));  
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
            public void actionPerformed(ActionEvent evt) {
             	new_Connection(evt);
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

        btn2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		login lg = new login();
        		dispose();
        	}
        });
    }


	public void new_Connection(ActionEvent evt){
                    String lname = "";
                    String name = tf1.getText();
                    String uname = tf2.getText();
                    String pass = String.valueOf(p1.getPassword());
                    String re_pass = String.valueOf(p2.getPassword());
                    String address = tf7.getText();

                    if(uname.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Add A Username");
                    }
                
                    else if(pass.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Add A Password");
                    }
                    else if(!pass.equals(re_pass))
                    {
                        JOptionPane.showMessageDialog(null, "Retype The Password Again");
                    }
                    
                    else if(checkUsername(uname))
                    {
                        JOptionPane.showMessageDialog(null, "This Username Already Exist");
                    }
                    else{
                        PreparedStatement ps;
                        String query = "INSERT INTO `the_app_users`(`u_fname`, `u_lname`, `u_uname`, `u_pass`, `u_address`) VALUES (?,?,?,?,?)";
                        try{
                        ps = MyConnection.getConnection().prepareStatement(query);
                        ps.setString(1, name);
                        ps.setString(2, lname);
                        ps.setString(3, uname);
                        ps.setString(4, pass);
                        ps.setString(5, address);
                        if(ps.executeUpdate() > 0)
                        {
                            JOptionPane.showMessageDialog(null, "New User Add");
                        }

                    }catch(Exception e){
                    	e.printStackTrace();
                    }
                }
               
    }
                        
    public static boolean checkUsername(String username)
    {
            PreparedStatement ps;
            ResultSet rs;
            boolean checkUser = false;
            String query = "SELECT * FROM `the_app_users` WHERE `u_uname` =?";
            try {
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, username);
                
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    checkUser = true;
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
         return checkUser;
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
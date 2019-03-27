package login;

import java.awt.*;

import javax.swing.*;

import javax.swing.border.*;

import java.awt.event.*;

import javax.swing.border.Border;

import main_Page.main_Page;

import Registration.Registration;

class RoundedBorder implements Border {

    private int radius;


    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username_stok;
	private JPasswordField pwdPassword;
	private JTextField user;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void signin() {
		String UserName = new String("a");
		String Password = new String("a");
		String enteredUserName = user.getText();
		String enteredPassword = new String(passwordField.getPassword());
		if (UserName.matches(enteredUserName) && Password.matches(enteredPassword)) {
			dispose();
		  	main_Page page = new main_Page();
			page.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Username/Password Eror", "ERROR", JOptionPane.ERROR_MESSAGE);
			user.setText(null);
			passwordField.setText(null);
			user.requestFocusInWindow();
		}
	}

	public login() {

		setTitle("Welcome to Bona-Fide::Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(Color.WHITE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton signinbtn = new JButton("Log in");
		signinbtn.setBounds(516, 371, 130, 50);
		signinbtn.setBorder(new RoundedBorder(25));
		signinbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signin();
			}
		});

		signinbtn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					signinbtn.doClick();
				}
			}
		});

		contentPane.setLayout(null);
		signinbtn.setBackground(Color.WHITE);
		signinbtn.setFont(new Font("Tahoma", Font.BOLD, 21));
		contentPane.add(signinbtn);

		user = new JTextField("Enter The Username");
		user.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user.setForeground(Color.BLACK);
				user.setText(null);
			}
		});
		
		
		user.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					passwordField.requestFocusInWindow();
					
				}
			}
		});
		user.setFont(new Font("Times New Roman", Font.ITALIC, 29));
		user.setForeground(Color.LIGHT_GRAY);
		user.setBounds(451, 183, 260, 62);
		contentPane.add(user);
		user.setColumns(20);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		passwordField.setBounds(451, 277, 260, 62);
		contentPane.add(passwordField);
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					signinbtn.doClick();
				}
			}
		});
		JLabel label = new JLabel("");
		label.setBounds(352, 267, 64, 71);
		label.setIcon(new ImageIcon(login.class.getResource("/img_login/icons_password-64.png")));
		contentPane.add(label);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(352, 183, 64, 71);
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/img_login/icons_user2-64.png")));
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/img_login/LOGO240_240PX.png")));
		lblNewLabel_3.setBounds(98, 183, 227, 241);
		contentPane.add(lblNewLabel_3);

		JLabel newSign = new JLabel("New User?");
		JButton sgnUp = new JButton("Sign Up");
		newSign.setBounds(516, 431, 200, 30);
		sgnUp.setBounds(516, 471, 130, 50);
		sgnUp.setBackground(Color.WHITE);
		sgnUp.setBorder(new RoundedBorder(25));
		contentPane.add(newSign);
		contentPane.add(sgnUp);

		sgnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Registration newReg = new Registration();
                newReg.setVisible(true);
            }
        });

	}
}



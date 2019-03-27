package main_Page;

import java.awt.*;

import javax.swing.*;

import javax.swing.border.*;

import java.awt.event.*;

public class main_Page extends JFrame{
    private JPanel contentPane;
    public JTextArea t1;
    public JLabel label1;
    public static void main(String args[]){
        main_Page mainPage = new main_Page();
    }

    public main_Page(){
        setVisible(true);
        setTitle("Welcome to Bona-Fide");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setBounds(100, 100, 900, 640);
        setLocationRelativeTo(null);  
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        label1 = new JLabel("Enter the text to be searched for plagiarism");
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setBounds(100,0,800,150);
        t1=new JTextArea("Enter text");
        t1.setLineWrap(true); 
        t1.setWrapStyleWord(true); 
        t1.setBounds(100,100, 700,250);

        contentPane = new JPanel(); 
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(t1);
        contentPane.add(label1);
        JButton searchBtn = new JButton("Search");
        searchBtn.setBounds(300, 400, 100, 40);
        JButton result = new JButton("Result");
        result.setBounds(500,400,100,40);
        searchBtn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
                    searchBtn.doClick();
                }
            }
        });
        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.add(result);
            }
        });

        contentPane.add(searchBtn);

        t1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                t1.setForeground(Color.BLACK);
                t1.setText(null);
            }
        });

        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                next_tab();
            }
        });
    }

    void next_tab(){
        String enteredText = t1.getText();
    } 
} 

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import keeptoo.Drag;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        this.setLocationRelativeTo(null);
        ScrollPane.setOpaque(false);
        ScrollPane.getViewport().setOpaque(false);
        //ScrollPane.setBorder(null);
        ScrollPane.setViewportBorder(null);
        
        TextArea.setBorder(null);
       TextArea.setBackground(new java.awt.Color(0,0,0,50));
       //gif.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextFieldSession = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gif = new javax.swing.JLabel();
        kButtonSignup = new keeptoo.KButton();
        ScrollPane = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        kButtonDetail = new keeptoo.KButton();
        jTextFieldSession1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kButtonQuick = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setForeground(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldSession.setBackground(new java.awt.Color(0,0,0,0));
        jTextFieldSession.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldSession.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldSession.setText(null);
        jTextFieldSession.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldSession.setCaretColor(new java.awt.Color(204, 0, 255));
        jTextFieldSession.setOpaque(false);
        jTextFieldSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSessionActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jTextFieldSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 470, 32));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Your Text");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(204, 204, 204));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_xbox_x_50px.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        kGradientPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(null);
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        gif.setBackground(new java.awt.Color(255, 255, 255));
        gif.setIconTextGap(10);
        kGradientPanel1.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        kButtonSignup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kButtonSignup.setText("Choose File");
        kButtonSignup.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        kButtonSignup.setkBorderRadius(0);
        kButtonSignup.setkEndColor(new java.awt.Color(0, 204, 204));
        kButtonSignup.setkFillButton(false);
        kButtonSignup.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        kButtonSignup.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        kButtonSignup.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButtonSignup.setkStartColor(new java.awt.Color(255, 255, 255));
        kButtonSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButtonSignupMouseClicked(evt);
            }
        });
        kButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonSignupActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButtonSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 150, -1));

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextArea.setForeground(new java.awt.Color(255, 255, 255));
        TextArea.setLineWrap(true);
        TextArea.setRows(5);
        TextArea.setWrapStyleWord(true);
        ScrollPane.setViewportView(TextArea);

        kGradientPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 760, 260));

        kButtonDetail.setText("Detailed Analysis");
        kButtonDetail.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        kButtonDetail.setkBorderRadius(40);
        kButtonDetail.setkEndColor(new java.awt.Color(0, 204, 204));
        kButtonDetail.setkFillButton(false);
        kButtonDetail.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        kButtonDetail.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        kButtonDetail.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButtonDetail.setkStartColor(new java.awt.Color(255, 255, 255));
        kButtonDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButtonDetailMouseClicked(evt);
            }
        });
        kButtonDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonDetailActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButtonDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 200, -1));

        jTextFieldSession1.setBackground(new java.awt.Color(0,0,0,0));
        jTextFieldSession1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldSession1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldSession1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldSession1.setCaretColor(new java.awt.Color(204, 0, 255));
        jTextFieldSession1.setOpaque(false);
        jTextFieldSession1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSession1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jTextFieldSession1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 470, 32));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Session Name");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        kButtonQuick.setText("Quick Analysis");
        kButtonQuick.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        kButtonQuick.setkBorderRadius(40);
        kButtonQuick.setkEndColor(new java.awt.Color(0, 204, 204));
        kButtonQuick.setkFillButton(false);
        kButtonQuick.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        kButtonQuick.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        kButtonQuick.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButtonQuick.setkStartColor(new java.awt.Color(255, 255, 255));
        kButtonQuick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButtonQuickMouseClicked(evt);
            }
        });
        kButtonQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonQuickActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButtonQuick, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 180, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSessionActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void kButtonSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButtonSignupMouseClicked
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Documents", "txt"));
        //chooser.addChoosableFileFilter(new FileNameExtensionFilter("MS Office Documents", "docx"));
        //chooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
	chooser.setAcceptAllFileFilterUsed(false);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            String fileName = f.getAbsolutePath();
            jTextFieldSession.setText(fileName);
            jTextFieldSession.setEditable(false);
        }
    }//GEN-LAST:event_kButtonSignupMouseClicked

    private void kButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButtonSignupActionPerformed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
        new Drag(kGradientPanel1).onPress(evt);
        //Use mouse only
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void kButtonDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButtonDetailMouseClicked
        // TODO add your handling code here:
        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageedit.gif")));
        String name = jLabel5.getText();
        String session1 = jTextFieldSession1.getText();
        //String working = System.getProperty("user.dir");
        //System.out.println(working);
        new java.util.Timer().schedule(
        
                new java.util.TimerTask() {
                @Override
                    public void run() {
                        String session = jTextFieldSession1.getText();
                        
                        File myFile = new File("MyTestFile.txt");
                        
                        String strContent = TextArea.getText();
                        //int i=0;
                        
                        strContent = strContent.trim();
                        
                        //System.out.println(strContent.length());
                        
                        String field = jTextFieldSession.getText();
                        
                        try{
                            if(!myFile.exists()) {
                                myFile.createNewFile();
                            }
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        
                        if((strContent.length()==0) && (field.length() == 0)){
                            JOptionPane.showMessageDialog(null, "Enter text");
                            gif.setIcon(null);
                        }    
                        
                        else if(strContent.length() != 0){
                            int wordCount = strContent.split("\\s").length;
                            BufferedWriter bufferedWriter = null;
                            if(wordCount > 1000){
                                JOptionPane.showMessageDialog(null, "Word Limit Exceed");
                            }
                            else{
                                try {
                                    //File myFile = new File("C:\\Users\\Ayush\\Desktop\\/MyTestFile.txt");
                                    // check if file exist, otherwise create the file before writing

                                    Writer writer = new FileWriter(myFile);
                                    bufferedWriter = new BufferedWriter(writer);
                                    bufferedWriter.write(strContent);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                } finally{
                                    try{
                                        if(bufferedWriter != null) bufferedWriter.close();
                                    }catch(Exception ex){

                                    }
                                }
                            }
                            String result[] = new String[2];
                            
                            try{
                                result = backend.callbackend(3);
                            }
                            catch(Exception e){}
                            
                            Result rgf = new Result();
                            rgf.jLabel5.setText(name);
                            rgf.jLabelPlagiarism.setText(result[0]);
                            rgf.jLabelUnique.setText(result[1]);                            
                            rgf.jLabelSession.setText(session1);
                            //rgf.jLabelSession.setText(session1);
                            rgf.setVisible(true);
                            rgf.pack();
                            rgf.setLocationRelativeTo(null);
                            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                        
                        else{
                            nullText();
                        
                            String result[] = new String[2];

                            try{
                                result = backend.callbackend(3);
                            }
                            catch(Exception e){}

                            Result rgf = new Result();
                            rgf.setVisible(true);
                            rgf.jLabel5.setText(name);
                            rgf.jLabelPlagiarism.setText(result[0]);
                            rgf.jLabelUnique.setText(result[1]);                            
                            rgf.jLabelSession.setText(session1);
                            rgf.pack();
                            rgf.setLocationRelativeTo(null);
                            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                
                    }
                },
                0
        );         
    }//GEN-LAST:event_kButtonDetailMouseClicked


    
    private void kButtonDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButtonDetailActionPerformed

    private void jTextFieldSession1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSession1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSession1ActionPerformed

    private void kButtonQuickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButtonQuickMouseClicked
        // TODO add your handling code here:
        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageedit.gif")));
        String name = jLabel5.getText();
        String session1 = jTextFieldSession1.getText();
        new java.util.Timer().schedule(
        
                new java.util.TimerTask() {
                @Override
                    public void run() {
                        String session = jTextFieldSession1.getText();
                        
                        File myFile = new File("MyTestFile.txt");
                        
                        String strContent = TextArea.getText();
                        //int i=0;
                        
                        strContent = strContent.trim();
                        
                        //System.out.println(strContent.length());
                        
                        String field = jTextFieldSession.getText();
                        
                        try{
                            if(!myFile.exists()) {
                                myFile.createNewFile();
                            }
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        
                        if((strContent.length()==0) && (field.length() == 0)){
                            JOptionPane.showMessageDialog(null, "Enter text");
                            gif.setIcon(null);
                        }    
                        
                        else if(strContent.length() != 0){
                            int wordCount = strContent.split("\\s").length;
                            BufferedWriter bufferedWriter = null;
                            if(wordCount > 1000){
                                JOptionPane.showMessageDialog(null, "Word Limit Exceed");
                            }
                            else{
                                try {
                                    //File myFile = new File("C:\\Users\\Ayush\\Desktop\\MyTestFile.txt");
                                    // check if file exist, otherwise create the file before writing

                                    Writer writer = new FileWriter(myFile);
                                    bufferedWriter = new BufferedWriter(writer);
                                    bufferedWriter.write(strContent);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                } finally{
                                    try{
                                        if(bufferedWriter != null) bufferedWriter.close();
                                    }catch(Exception ex){

                                    }
                                }
                            }
                            String result[] = new String[2];
                            
                            try{
                                result = backend.callbackend(1);
                            }
                            catch(Exception e){}

                            Result rgf = new Result();
                            rgf.setVisible(true);
                            rgf.jLabel5.setText(name);
                            rgf.jLabelPlagiarism.setText(result[0]);
                            rgf.jLabelUnique.setText(result[1]);                            
                            rgf.jLabelSession.setText(session1);
                            rgf.pack();
                            rgf.setLocationRelativeTo(null);
                            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                        
                        else{
                            nullText();
                        
                            String result[] = new String[2];

                            try{
                                result = backend.callbackend(1);
                            }
                            catch(Exception e){}

                            Result rgf = new Result();
                            rgf.setVisible(true);
                            rgf.jLabel5.setText(name);
                            rgf.jLabelPlagiarism.setText(result[0]);
                            rgf.jLabelUnique.setText(result[1]);                            
                            rgf.jLabelSession.setText(session1);
                            rgf.pack();
                            rgf.setLocationRelativeTo(null);
                            rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                
                    }
                },
                0
        );         
    
    }//GEN-LAST:event_kButtonQuickMouseClicked
    
    private void kButtonQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonQuickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButtonQuickActionPerformed

    public void nullText(){
            
            FileInputStream instream = null;
            FileOutputStream outstream = null;
            try{
                String fileName = jTextFieldSession.getText();
                File infile =new File(fileName);
                File outfile =new File("MyTestFile.txt");
                if (!outfile.exists()) {
                        outfile.createNewFile();
                }
                instream = new FileInputStream(infile);
                outstream = new FileOutputStream(outfile);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = instream.read(buffer)) > 0){
                    outstream.write(buffer, 0, length);
                }
                instream.close();
                outstream.close();
            }catch(IOException ioe){
                ioe.printStackTrace();
             }
            
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldSession;
    private javax.swing.JTextField jTextFieldSession1;
    private keeptoo.KButton kButtonDetail;
    private keeptoo.KButton kButtonQuick;
    private keeptoo.KButton kButtonSignup;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
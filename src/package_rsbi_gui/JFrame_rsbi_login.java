/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import methoden_rsbi.FrameManager;
import methoden_rsbi.User;
import methoden_rsbi.Verbindung;

/**
 *
 * @author JF
 */
public class JFrame_rsbi_login extends javax.swing.JFrame {
    
    

    /**
     * Creates new form JFrame_rsbi_login
     */
    public JFrame_rsbi_login() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_connect_login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField_username_login = new javax.swing.JTextField();
        jLabel_username_login = new javax.swing.JLabel();
        jPasswordField_login = new javax.swing.JPasswordField();
        jLabel_password_login = new javax.swing.JLabel();
        jButton_login_login = new javax.swing.JButton();
        jButton_registration_login = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foogle");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(425, 300));
        setResizable(false);

        jButton_connect_login.setText("Connect");
        jButton_connect_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_connect_loginActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(261, 198));

        jTextField_username_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_username_loginActionPerformed(evt);
            }
        });

        jLabel_username_login.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_username_login.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_username_login.setText("Username");

        jPasswordField_login.setSelectionColor(new java.awt.Color(255, 0, 0));
        jPasswordField_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_loginActionPerformed(evt);
            }
        });
        jPasswordField_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_loginKeyPressed(evt);
            }
        });

        jLabel_password_login.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_password_login.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_password_login.setText("Password");

        jButton_login_login.setBackground(new java.awt.Color(255, 0, 0));
        jButton_login_login.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_login_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login_login.setText("Login");
        jButton_login_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_login_login.setBorderPainted(false);
        jButton_login_login.setFocusPainted(false);
        jButton_login_login.setFocusable(false);
        jButton_login_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_login_loginActionPerformed(evt);
            }
        });

        jButton_registration_login.setBackground(new java.awt.Color(255, 255, 255));
        jButton_registration_login.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_registration_login.setForeground(new java.awt.Color(102, 102, 102));
        jButton_registration_login.setText("Register");
        jButton_registration_login.setBorder(null);
        jButton_registration_login.setBorderPainted(false);
        jButton_registration_login.setContentAreaFilled(false);
        jButton_registration_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registration_loginActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setText("LOGIN");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_username_login, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_username_login))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPasswordField_login, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_password_login))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_login_login, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_registration_login, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_username_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_username_login))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_login_login)
                    .addComponent(jButton_registration_login))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package_rsbi_gui/Google-5.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_connect_login))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(jButton_connect_login)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_connect_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_connect_loginActionPerformed
        // TODO add your handling code here:
        try
        {
            Verbindung connect2DB = new Verbindung();
            Connection conn2 = connect2DB.starteVerbindung();
            System.out.println("Verbindung erfolgreich aufgebaut!");
            conn2.close();
        }
        catch (Exception e)
        {
            System.out.println("Verbindung wurde nicht aufgebaut!");
            System.out.println("Fehler: "+e);
        }  
    }//GEN-LAST:event_jButton_connect_loginActionPerformed

    private void jTextField_username_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_username_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_username_loginActionPerformed

    private void jButton_login_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_login_loginActionPerformed
        // TODO add your handling code here:
        try
        {   
            // checks if Username and password are not empty
            if(!(jTextField_username_login.getText().equals("")) && !(jPasswordField_login.getPassword().length == 0))
            {
            Boolean logincheck = false;
            Boolean namecheck = false;
            Verbindung connect2DB = new Verbindung();
            namecheck = connect2DB.CheckName(jTextField_username_login.getText());
            if(namecheck)
                {
                logincheck = connect2DB.CheckPw(jTextField_username_login.getText(),jPasswordField_login.getPassword());
                    if(logincheck)
                    {
                    //Wenn Login korrekt öffne main
                    this.dispose();
                    JFrame main = FrameManager.getmainFrame();
                    main.setVisible(true);
                    //Erstelle Überschreibe aktuellen User
                    User current = new User();
                    int id = connect2DB.ReadUserId(jTextField_username_login.getText());
                    current.setUser(jTextField_username_login.getText(),id);
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter your Username and Password!");
            }
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton_login_loginActionPerformed

    private void jButton_registration_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registration_loginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame registration = FrameManager.getregistrationFrame();
        registration.setVisible(true);
    }//GEN-LAST:event_jButton_registration_loginActionPerformed

    private void jPasswordField_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_loginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField_loginActionPerformed

    private void jPasswordField_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_loginKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton_login_login.doClick();
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_loginKeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_rsbi_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_connect_login;
    private javax.swing.JButton jButton_login_login;
    private javax.swing.JButton jButton_registration_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_password_login;
    private javax.swing.JLabel jLabel_username_login;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField jPasswordField_login;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField_username_login;
    // End of variables declaration//GEN-END:variables
}

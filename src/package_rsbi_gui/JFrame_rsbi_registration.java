/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import methoden_rsbi.FrameManager;
import methoden_rsbi.User;
import methoden_rsbi.Verbindung;

/**
 *
 * @author JF
 */
public class JFrame_rsbi_registration extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_rsbi_registration
     */
    public JFrame_rsbi_registration() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField_username_registration = new javax.swing.JTextField();
        jLabel_username_registration = new javax.swing.JLabel();
        jTextField_email_registration = new javax.swing.JTextField();
        jLabel_email_registration = new javax.swing.JLabel();
        jPasswordField_registration = new javax.swing.JPasswordField();
        jLabel_password_registration = new javax.swing.JLabel();
        jPasswordField_registrationconf = new javax.swing.JPasswordField();
        jLabel_passwordconf_registration = new javax.swing.JLabel();
        jButton_registrate_registration = new javax.swing.JButton();
        jButton_Cancel_registration = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foogle");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_username_registration.setSelectionColor(new java.awt.Color(255, 0, 0));
        jTextField_username_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_username_registrationActionPerformed(evt);
            }
        });

        jLabel_username_registration.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_username_registration.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_username_registration.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_username_registration.setText("Username");

        jTextField_email_registration.setSelectionColor(new java.awt.Color(255, 0, 0));
        jTextField_email_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_email_registrationActionPerformed(evt);
            }
        });

        jLabel_email_registration.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_email_registration.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_email_registration.setText("Email");

        jPasswordField_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_registrationActionPerformed(evt);
            }
        });

        jLabel_password_registration.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_password_registration.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_password_registration.setText("Password");

        jPasswordField_registrationconf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_registrationconfKeyPressed(evt);
            }
        });

        jLabel_passwordconf_registration.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_passwordconf_registration.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_passwordconf_registration.setText("Password Confirmation");

        jButton_registrate_registration.setBackground(new java.awt.Color(204, 204, 204));
        jButton_registrate_registration.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_registrate_registration.setForeground(new java.awt.Color(102, 102, 102));
        jButton_registrate_registration.setText("Register");
        jButton_registrate_registration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_registrate_registration.setBorderPainted(false);
        jButton_registrate_registration.setFocusPainted(false);
        jButton_registrate_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrate_registrationActionPerformed(evt);
            }
        });

        jButton_Cancel_registration.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Cancel_registration.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_Cancel_registration.setForeground(new java.awt.Color(102, 102, 102));
        jButton_Cancel_registration.setText("Cancel");
        jButton_Cancel_registration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Cancel_registration.setBorderPainted(false);
        jButton_Cancel_registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_registrationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("REGISTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordField_registrationconf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_passwordconf_registration)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_email_registration, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jTextField_username_registration, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_username_registration)
                                    .addComponent(jLabel_email_registration)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordField_registration, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_password_registration))
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_registrate_registration, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Cancel_registration, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_username_registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_username_registration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_email_registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_email_registration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_registration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password_registration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_registrationconf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_passwordconf_registration))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_registrate_registration, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cancel_registration, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package_rsbi_gui/Google-5.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_username_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_username_registrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_username_registrationActionPerformed

    private void jTextField_email_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_email_registrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_email_registrationActionPerformed

    private void jButton_Cancel_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_registrationActionPerformed
        this.dispose();
        JFrame login = FrameManager.getloginFrame();
        login.setVisible(true);
    }//GEN-LAST:event_jButton_Cancel_registrationActionPerformed

    private void jButton_registrate_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrate_registrationActionPerformed
        
        String username = jTextField_username_registration.getText();
        String email = jTextField_email_registration.getText();
        String password = new String (jPasswordField_registration.getPassword());
        String password_conf = new String(jPasswordField_registrationconf.getPassword());
        boolean regcheck = false;
        
        
        try
        {
            if(!(jTextField_username_registration.getText().equals(""))  &&
               !(jTextField_email_registration.getText().equals("")      &&
               !(jPasswordField_registration.getPassword().length == 0)) &&
               !(jPasswordField_registrationconf.getPassword().length == 0))
            {
            
        Verbindung connect2DB = new Verbindung();
        regcheck = connect2DB.RegisterUser(username, email, password, password_conf);
        if (regcheck)
            {
                User current = new User();
                int id = connect2DB.ReadUserId(jTextField_username_registration.getText());
                current.setUser(jTextField_username_registration.getText(),id);
                this.dispose();
                JFrame main = FrameManager.getmainFrame();
                main.setVisible(true);
                //Optional Wilkommensnachricht
                JOptionPane.showMessageDialog(null, "Welcome " +jTextField_username_registration.getText()+"!");
            }
        }
        else
            {
                JOptionPane.showMessageDialog(null, "All Fields have to be filled!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Fehler bei der Registration!");
            System.out.println("Fehler: " +e);
        }
       
    }//GEN-LAST:event_jButton_registrate_registrationActionPerformed

    private void jPasswordField_registrationconfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_registrationconfKeyPressed

            if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton_registrate_registration.doClick();
         }
    }//GEN-LAST:event_jPasswordField_registrationconfKeyPressed

    private void jPasswordField_registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_registrationActionPerformed
       
    }//GEN-LAST:event_jPasswordField_registrationActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_rsbi_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel_registration;
    private javax.swing.JButton jButton_registrate_registration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_email_registration;
    private javax.swing.JLabel jLabel_password_registration;
    private javax.swing.JLabel jLabel_passwordconf_registration;
    private javax.swing.JLabel jLabel_username_registration;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_registration;
    private javax.swing.JPasswordField jPasswordField_registrationconf;
    private javax.swing.JTextField jTextField_email_registration;
    private javax.swing.JTextField jTextField_username_registration;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import javax.swing.JFrame;
import methoden_rsbi.FrameManager;

/**
 *
 * @author JF
 */
public class JFrame_rsbi_main extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_rsbi_main
     */
    public JFrame_rsbi_main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_search_main = new javax.swing.JButton();
        jButton_add_main = new javax.swing.JButton();
        jButton_logout_main = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foogle");
        setResizable(false);

        jButton_search_main.setText("search recipe");
        jButton_search_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_mainActionPerformed(evt);
            }
        });

        jButton_add_main.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton_add_main.setText("add recipe");
        jButton_add_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_mainActionPerformed(evt);
            }
        });

        jButton_logout_main.setText("logout");
        jButton_logout_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logout_mainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_logout_main)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_search_main, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_add_main, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_logout_main)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_add_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_search_main, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_search_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_mainActionPerformed
        JFrame searchwindow = FrameManager.getsearchrecipeFrame();
        searchwindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_search_mainActionPerformed

    private void jButton_add_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_mainActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame add =  FrameManager.getaddrecipeFrame();
        add.setVisible(true);  
    }//GEN-LAST:event_jButton_add_mainActionPerformed

    private void jButton_logout_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logout_mainActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame login =  FrameManager.getloginFrame();
        //Reset des loginFrames
        JFrame_rsbi_login.jTextField_username_login.setText("");
        JFrame_rsbi_login.jPasswordField_login.setText("");
        //Sichtbarmachen
        login.setVisible(true);
    }//GEN-LAST:event_jButton_logout_mainActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_rsbi_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_main;
    private javax.swing.JButton jButton_logout_main;
    private javax.swing.JButton jButton_search_main;
    // End of variables declaration//GEN-END:variables
}

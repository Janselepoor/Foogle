/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import methoden_rsbi.FrameManager;
import methoden_rsbi.Verbindung;

/**
 *
 * @author JF
 */
public class JFrame_rsbi_search extends javax.swing.JFrame {
    
    private Verbindung connect2db = new Verbindung();

    private void FuelleComboCategory1()
        {
           
            jComboBox_category1_search.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT cat_name FROM category ORDER BY cat_name ASC");
                String tmpString;
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_category1_search.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
    private void FuelleComboCategory2()
        {
           
            jComboBox_category2_search.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT cat_name FROM category ORDER BY cat_name ASC");
                String tmpString;
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_category2_search.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
    private void FuelleComboCategory3()
        {
           
            jComboBox_category3_search.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT cat_name FROM category ORDER BY cat_name ASC");
                String tmpString;
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_category3_search.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
    
    private void FuelleComboIngr()
        {
           
            jComboBox_ingredients_search.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT ingr_name FROM ingredient ORDER BY ingr_name ASC");
                String tmpString;
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_ingredients_search.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
    
    /**
     * Creates new form JFrame_rsbi_search
     */
    public JFrame_rsbi_search() {
        initComponents();
        FuelleComboCategory1();
        FuelleComboCategory2();
        FuelleComboCategory3();
        FuelleComboIngr();
        jLabel_ingredient1_search.setVisible(false);
        jLabel_ingredient2_search.setVisible(false);
        jLabel_ingredient3_search.setVisible(false);
        jLabel_ingredient4_search.setVisible(false);
        jLabel_ingredient5_search.setVisible(false);
        jLabel_ingredient6_search.setVisible(false);
        jLabel_ingredient7_search.setVisible(false);
        jLabel_ingredient8_search.setVisible(false);
        jLabel_ingredient9_search.setVisible(false);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        JButton_clearcategory_search = new javax.swing.JButton();
        jLabel_categories_search = new javax.swing.JLabel();
        jComboBox_category1_search = new javax.swing.JComboBox<>();
        jLabel_ingredients_search = new javax.swing.JLabel();
        jButton_clearingredients_search = new javax.swing.JButton();
        jComboBox_ingredients_search = new javax.swing.JComboBox<>();
        jButton_addingredient_search = new javax.swing.JButton();
        jLabel_ingredient1_search = new javax.swing.JLabel();
        jLabel_ingredient2_search = new javax.swing.JLabel();
        jLabel_ingredient3_search = new javax.swing.JLabel();
        jLabel_ingredient4_search = new javax.swing.JLabel();
        jLabel_ingredient5_search = new javax.swing.JLabel();
        jLabel_ingredient6_search = new javax.swing.JLabel();
        jLabel_ingredient7_search = new javax.swing.JLabel();
        jLabel_ingredient8_search = new javax.swing.JLabel();
        jLabel_ingredient9_search = new javax.swing.JLabel();
        jButton_search_search = new javax.swing.JButton();
        jButton_cancel_search = new javax.swing.JButton();
        jComboBox_category2_search = new javax.swing.JComboBox<>();
        jComboBox_category3_search = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("foogle");
        setResizable(false);

        JButton_clearcategory_search.setText("clear");
        JButton_clearcategory_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_clearcategory_searchActionPerformed(evt);
            }
        });

        jLabel_categories_search.setText("Categories:");

        jComboBox_category1_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category1_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category1_searchActionPerformed(evt);
            }
        });

        jLabel_ingredients_search.setText("Ingredients:");

        jButton_clearingredients_search.setText("clear");

        jComboBox_ingredients_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_addingredient_search.setText("add");
        jButton_addingredient_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addingredient_searchActionPerformed(evt);
            }
        });

        jLabel_ingredient1_search.setText("ingredient1");

        jLabel_ingredient2_search.setText("ingredient2");

        jLabel_ingredient3_search.setText("ingredient3");

        jLabel_ingredient4_search.setText("ingredient4");

        jLabel_ingredient5_search.setText("ingredient5");

        jLabel_ingredient6_search.setText("ingredient6");

        jLabel_ingredient7_search.setText("ingredient7");

        jLabel_ingredient8_search.setText("ingredient8");

        jLabel_ingredient9_search.setText("ingredient9");

        jButton_search_search.setText("search");
        jButton_search_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_searchActionPerformed(evt);
            }
        });

        jButton_cancel_search.setText("cancel");
        jButton_cancel_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_searchActionPerformed(evt);
            }
        });

        jComboBox_category2_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category2_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category2_searchActionPerformed(evt);
            }
        });

        jComboBox_category3_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category3_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category3_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel_categories_search))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_ingredient1_search)
                                    .addComponent(jLabel_ingredient3_search)
                                    .addComponent(jLabel_ingredient2_search, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ingredient4_search)
                            .addComponent(jLabel_ingredient5_search)
                            .addComponent(jLabel_ingredient6_search))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_clearingredients_search)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_ingredient8_search)
                                .addComponent(jLabel_ingredient7_search)
                                .addComponent(jLabel_ingredient9_search)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_ingredients_search))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox_category1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox_ingredients_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_addingredient_search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_category2_search, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(JButton_clearcategory_search, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_category3_search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_search_search)
                .addGap(36, 36, 36)
                .addComponent(jButton_cancel_search)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel_categories_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_category1_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_category2_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_category3_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(JButton_clearcategory_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ingredients_search)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient1_search)
                    .addComponent(jLabel_ingredient4_search)
                    .addComponent(jLabel_ingredient7_search))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient2_search)
                    .addComponent(jLabel_ingredient5_search)
                    .addComponent(jLabel_ingredient8_search))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient3_search)
                    .addComponent(jLabel_ingredient6_search)
                    .addComponent(jLabel_ingredient9_search))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_ingredients_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addingredient_search)
                    .addComponent(jButton_clearingredients_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_search_search)
                    .addComponent(jButton_cancel_search))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_clearcategory_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_clearcategory_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_clearcategory_searchActionPerformed

    private void jComboBox_category1_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category1_searchActionPerformed
        String Name = (String)jComboBox_category1_search.getSelectedItem();
    }//GEN-LAST:event_jComboBox_category1_searchActionPerformed

    private void jButton_search_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_searchActionPerformed
        this.dispose();
        new JFrame_rsbi_recipetable().setVisible(true);
    }//GEN-LAST:event_jButton_search_searchActionPerformed

    private void jButton_cancel_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_searchActionPerformed
        this.dispose();
        JFrame main = FrameManager.getmainFrame();
        main.setVisible(true);
    }//GEN-LAST:event_jButton_cancel_searchActionPerformed

    private void jComboBox_category2_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category2_searchActionPerformed
    String Name = (String)jComboBox_category2_search.getSelectedItem();
    }//GEN-LAST:event_jComboBox_category2_searchActionPerformed

    private void jComboBox_category3_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category3_searchActionPerformed
    String Name = (String)jComboBox_category3_search.getSelectedItem();
    }//GEN-LAST:event_jComboBox_category3_searchActionPerformed

    private void jButton_addingredient_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addingredient_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addingredient_searchActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_rsbi_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_clearcategory_search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton_addingredient_search;
    private javax.swing.JButton jButton_cancel_search;
    private javax.swing.JButton jButton_clearingredients_search;
    private javax.swing.JButton jButton_search_search;
    private javax.swing.JComboBox<String> jComboBox_category1_search;
    private javax.swing.JComboBox<String> jComboBox_category2_search;
    private javax.swing.JComboBox<String> jComboBox_category3_search;
    private javax.swing.JComboBox<String> jComboBox_ingredients_search;
    private javax.swing.JLabel jLabel_categories_search;
    private javax.swing.JLabel jLabel_ingredient1_search;
    private javax.swing.JLabel jLabel_ingredient2_search;
    private javax.swing.JLabel jLabel_ingredient3_search;
    private javax.swing.JLabel jLabel_ingredient4_search;
    private javax.swing.JLabel jLabel_ingredient5_search;
    private javax.swing.JLabel jLabel_ingredient6_search;
    private javax.swing.JLabel jLabel_ingredient7_search;
    private javax.swing.JLabel jLabel_ingredient8_search;
    private javax.swing.JLabel jLabel_ingredient9_search;
    private javax.swing.JLabel jLabel_ingredients_search;
    // End of variables declaration//GEN-END:variables
}

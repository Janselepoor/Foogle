/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import methoden_rsbi.Verbindung;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import methoden_rsbi.FrameManager;

/**
 *
 * @author claudio
 */
public class JFrame_rsbi_searchrecipe extends javax.swing.JFrame {
    
    private Verbindung connect2db = new Verbindung();
    
    //Fülle ComboBox
    private void FuelleComboIngr(){
        jComboBox_ingredients_search_recipe.removeAllItems();
        try
        {
        Connection conn = connect2db.starteVerbindung();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT DISTINCT ingr_name FROM ingredient ORDER BY ingr_name ASC;");
        String tmpString;
        while (rs.next()) 
            {                
                tmpString = "";
                tmpString = rs.getString(1);
                jComboBox_ingredients_search_recipe.addItem(tmpString);
            }
        jComboBox_ingredients_search_recipe.setSelectedIndex(-1);
            conn.close();
        
        }
        catch (Exception e)
        {
            System.out.println("Fehler beim Befüllen der ComboBox");
            System.out.println(e.getMessage());
        }
    }
    
    private void FuelleComboCategory1()
        {
           
            jComboBox_category1_search_recipe.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT cat_name FROM category ORDER BY cat_name ASC");
                String tmpString;
                jComboBox_category1_search_recipe.insertItemAt("", 0);
                jComboBox_category1_search_recipe.setSelectedIndex(0);
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_category1_search_recipe.addItem(tmpString);
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
           
            jComboBox_category2_search_recipe.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT cat_name FROM category ORDER BY cat_name ASC");
                String tmpString;
                jComboBox_category2_search_recipe.insertItemAt("", 0);
                jComboBox_category2_search_recipe.setSelectedIndex(0);
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_category2_search_recipe.addItem(tmpString);
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
           
            jComboBox_category3_search_recipe.removeAllItems();
            
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT cat_name FROM category ORDER BY cat_name ASC");
                String tmpString;
                jComboBox_category3_search_recipe.insertItemAt("", 0);
                jComboBox_category3_search_recipe.setSelectedIndex(0);
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_category3_search_recipe.addItem(tmpString);
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
     * Creates new form new_search
     */
    public JFrame_rsbi_searchrecipe() {
        initComponents();
        FuelleComboCategory1();
        FuelleComboCategory2();
        FuelleComboCategory3();
        FuelleComboIngr();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox_category1_search_recipe = new javax.swing.JComboBox<>();
        jComboBox_category2_search_recipe = new javax.swing.JComboBox<>();
        jComboBox_category3_search_recipe = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_ingredients_search_recipe = new javax.swing.JComboBox<>();
        jButton_addlist_searchrecipe = new javax.swing.JButton();
        jButton_deletelist_searchrecipe = new javax.swing.JButton();
        jButton_cancel_search = new javax.swing.JButton();
        jButton_search_search = new javax.swing.JButton();
        jScrollPane_ingredients_addrecipe = new javax.swing.JScrollPane();
        jTable_ingredients_searchrecipe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel1.setText("categories:");

        jComboBox_category1_search_recipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select category" }));
        jComboBox_category1_search_recipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category1_search_recipeActionPerformed(evt);
            }
        });

        jComboBox_category2_search_recipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category2_search_recipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category2_search_recipeActionPerformed(evt);
            }
        });

        jComboBox_category3_search_recipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category3_search_recipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category3_search_recipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBox_category1_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jComboBox_category2_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBox_category3_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_category1_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_category2_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_category3_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("ingredients:");

        jComboBox_ingredients_search_recipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_ingredients_search_recipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ingredients_search_recipeActionPerformed(evt);
            }
        });

        jButton_addlist_searchrecipe.setText("add");
        jButton_addlist_searchrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addlist_searchrecipeActionPerformed(evt);
            }
        });

        jButton_deletelist_searchrecipe.setText("delete");
        jButton_deletelist_searchrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletelist_searchrecipeActionPerformed(evt);
            }
        });

        jButton_cancel_search.setText("cancel");
        jButton_cancel_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_searchActionPerformed(evt);
            }
        });

        jButton_search_search.setText("search");
        jButton_search_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_searchActionPerformed(evt);
            }
        });

        jTable_ingredients_searchrecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name"
            }
        ));
        jScrollPane_ingredients_addrecipe.setViewportView(jTable_ingredients_searchrecipe);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 284, Short.MAX_VALUE)
                .addComponent(jButton_cancel_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_search_search)
                .addGap(1, 1, 1))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_ingredients_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_deletelist_searchrecipe)
                                    .addComponent(jButton_addlist_searchrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane_ingredients_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_ingredients_search_recipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_addlist_searchrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_deletelist_searchrecipe)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane_ingredients_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_cancel_search)
                            .addComponent(jButton_search_search))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_search_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_searchActionPerformed
        this.dispose();
        new JFrame_rsbi_recipetable().setVisible(true); //TODO add your handling code here:
    }//GEN-LAST:event_jButton_search_searchActionPerformed

    private void jButton_cancel_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_searchActionPerformed
        this.dispose();
        JFrame main = FrameManager.getmainFrame();
        main.setVisible(true);
    }//GEN-LAST:event_jButton_cancel_searchActionPerformed

    private void jButton_deletelist_searchrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletelist_searchrecipeActionPerformed
        if((jTable_ingredients_searchrecipe.getRowCount()) > 0){
            try
            {
                DefaultTableModel model = (DefaultTableModel) jTable_ingredients_searchrecipe.getModel();
                model.removeRow(jTable_ingredients_searchrecipe.getSelectedRow());
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Click the ingredient you want to delete!");
            }
        }
    }//GEN-LAST:event_jButton_deletelist_searchrecipeActionPerformed

    private void jButton_addlist_searchrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addlist_searchrecipeActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_ingredients_searchrecipe.getModel();
        int tablecount = model.getRowCount();
        boolean check = true;
        if (!(jComboBox_ingredients_search_recipe.getSelectedIndex() == -1))
        {
            for(int i=0;i<tablecount;i++)
            {
                if(model.getValueAt(i,0).toString().equals(jComboBox_ingredients_search_recipe.getSelectedItem().toString()))
                {
                    System.out.println("step"+i);
                    check = false;
                    JOptionPane.showMessageDialog(null, "Ingredients have to be unique!");
                    break;
                }
            }
            if(check){
                if(model.getRowCount()<9)
                {
                    model.addRow(new Object[]{jComboBox_ingredients_search_recipe.getSelectedItem()});
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ingredients are limited to a maximum of nine!");
                }
            }
        }
    }//GEN-LAST:event_jButton_addlist_searchrecipeActionPerformed

    private void jComboBox_ingredients_search_recipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ingredients_search_recipeActionPerformed
        String Name = (String)jComboBox_ingredients_search_recipe.getSelectedItem();
    }//GEN-LAST:event_jComboBox_ingredients_search_recipeActionPerformed

    private void jComboBox_category3_search_recipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category3_search_recipeActionPerformed
        String Name = (String)jComboBox_category3_search_recipe.getSelectedItem();
    }//GEN-LAST:event_jComboBox_category3_search_recipeActionPerformed

    private void jComboBox_category2_search_recipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category2_search_recipeActionPerformed
        String Name = (String)jComboBox_category2_search_recipe.getSelectedItem();
    }//GEN-LAST:event_jComboBox_category2_search_recipeActionPerformed

    private void jComboBox_category1_search_recipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category1_search_recipeActionPerformed
        String Name = (String)jComboBox_category1_search_recipe.getSelectedItem();
    }//GEN-LAST:event_jComboBox_category1_search_recipeActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addlist_searchrecipe;
    private javax.swing.JButton jButton_cancel_search;
    private javax.swing.JButton jButton_deletelist_searchrecipe;
    private javax.swing.JButton jButton_search_search;
    public static javax.swing.JComboBox<String> jComboBox_category1_search_recipe;
    public static javax.swing.JComboBox<String> jComboBox_category2_search_recipe;
    public static javax.swing.JComboBox<String> jComboBox_category3_search_recipe;
    public static javax.swing.JComboBox<String> jComboBox_ingredients_search_recipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane_ingredients_addrecipe;
    public static javax.swing.JTable jTable_ingredients_searchrecipe;
    // End of variables declaration//GEN-END:variables
}
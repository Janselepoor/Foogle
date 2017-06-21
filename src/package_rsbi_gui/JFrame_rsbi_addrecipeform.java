/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import methoden_rsbi.Verbindung;

/**
 *
 * @author rebecca
 */
public class JFrame_rsbi_addrecipeform extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_rsbi_addrecipeform
     */
    private Verbindung connect2db = new Verbindung();
    
    //Fülle ComboBox
    private void FuelleComboIngr(){
        jComboBox_Ingredient_addrecipe.removeAllItems();
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
                jComboBox_Ingredient_addrecipe.addItem(tmpString);
            }
            conn.close();
        
        }
        catch (Exception e)
        {
            System.out.println("Fehler beim Befüllen der ComboBox");
            System.out.println(e.getMessage());
        }
    }
       //Fülle ComboBox
        private void FuelleComboCategory1()
        {
           
            jComboBox_category1_addrecipe.removeAllItems();
            
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
                    jComboBox_category1_addrecipe.setSelectedIndex(-1);
                    jComboBox_category1_addrecipe.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
        //Fülle ComboBox
        private void FuelleComboCategory2()
        {
           
            jComboBox_category2_addrecipe.removeAllItems();
            
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
                    jComboBox_category2_addrecipe.setSelectedIndex(-1);
                    jComboBox_category2_addrecipe.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
        //Fülle ComboBox
        private void FuelleComboCategory3()
        {
           
            jComboBox_category3_addrecipe.removeAllItems();
            
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
                    jComboBox_category3_addrecipe.setSelectedIndex(-1);
                    jComboBox_category3_addrecipe.addItem(tmpString);
                }
                conn.close();
                
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
       //Fülle ComboBox
        private void FuelleComboMeas(){
            
            jComboBox_measurement_addrecipe.removeAllItems();
                
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT meas_name FROM measurement ORDER BY meas_name ASC;");
                String tmpString;
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_measurement_addrecipe.addItem(tmpString);
                }
                conn.close();
        
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }
        
        private void FuelleComboDiff(){
            
            jComboBox_difficulty_addrecipe.removeAllItems();
                
            try
            {
                Connection conn = connect2db.starteVerbindung();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT DISTINCT diff_name FROM difficulty;");
                String tmpString;
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
                    jComboBox_difficulty_addrecipe.addItem(tmpString);
                }
                conn.close();
        
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
            jComboBox_category1_addrecipe.insertItemAt("", 0);
            jComboBox_category2_addrecipe.insertItemAt("", 0);
            jComboBox_category3_addrecipe.insertItemAt("", 0);
        }
        
    
    // Ruft JFrame auf und initialisert alle Componenten und füllt Sie!
    public JFrame_rsbi_addrecipeform() {
        initComponents();
        FuelleComboIngr();
        FuelleComboMeas();
        FuelleComboCategory1();
        FuelleComboCategory2();
        FuelleComboCategory3();
        FuelleComboDiff();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_recipename_addrecipe = new javax.swing.JLabel();
        jLabel_persons_addrecipe = new javax.swing.JLabel();
        jLabel_preptime_addrecipe = new javax.swing.JLabel();
        jLabel_difficulty_addrecipe = new javax.swing.JLabel();
        jTextField_recipename_addrecipe = new javax.swing.JTextField();
        jTextField_persons_addrecipe = new javax.swing.JTextField();
        jTextField_preptime_addrecipe = new javax.swing.JTextField();
        jComboBox_difficulty_addrecipe = new javax.swing.JComboBox<>();
        jComboBox_category1_addrecipe = new javax.swing.JComboBox<>();
        jComboBox_category2_addrecipe = new javax.swing.JComboBox<>();
        jComboBox_category3_addrecipe = new javax.swing.JComboBox<>();
        jScrollPane_ingredients_addrecipe = new javax.swing.JScrollPane();
        jTable_ingredients_addrecipe = new javax.swing.JTable();
        jComboBox_Ingredient_addrecipe = new javax.swing.JComboBox<>();
        jTextField_amount_addrecipe = new javax.swing.JTextField();
        jComboBox_measurement_addrecipe = new javax.swing.JComboBox<>();
        jButton_addingredient_addrecipe = new javax.swing.JButton();
        jLabel_preperation_addrecipe = new javax.swing.JLabel();
        jButton_confirm_addrecipe = new javax.swing.JButton();
        jButton_cancel_addrecipe = new javax.swing.JButton();
        jLabel_amount_addrecipe = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_preparation_addrecipe = new javax.swing.JTextArea();
        jButton_deletelist_addrecipe = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foogle");
        setResizable(false);

        jLabel_recipename_addrecipe.setText("recipe name:");

        jLabel_persons_addrecipe.setText("persons:");

        jLabel_preptime_addrecipe.setText("preparation time:");

        jLabel_difficulty_addrecipe.setText("difficulty:");

        jTextField_recipename_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_recipename_addrecipeActionPerformed(evt);
            }
        });

        jTextField_persons_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_persons_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_difficulty_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_category1_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category1_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category1_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_category2_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category2_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category2_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_category3_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category3_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category3_addrecipeActionPerformed(evt);
            }
        });

        jTable_ingredients_addrecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "amount", "measurement"
            }
        ));
        jScrollPane_ingredients_addrecipe.setViewportView(jTable_ingredients_addrecipe);

        jComboBox_Ingredient_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Ingredient_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Ingredient_addrecipeActionPerformed(evt);
            }
        });

        jTextField_amount_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_amount_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_measurement_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_measurement_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_measurement_addrecipeActionPerformed(evt);
            }
        });

        jButton_addingredient_addrecipe.setText("add");
        jButton_addingredient_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addingredient_addrecipeActionPerformed(evt);
            }
        });

        jLabel_preperation_addrecipe.setText("Preparation:");

        jButton_confirm_addrecipe.setText("confirm");
        jButton_confirm_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirm_addrecipeActionPerformed(evt);
            }
        });

        jButton_cancel_addrecipe.setText("cancel");
        jButton_cancel_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_addrecipeActionPerformed(evt);
            }
        });

        jLabel_amount_addrecipe.setText("amount");

        jTextArea_preparation_addrecipe.setColumns(20);
        jTextArea_preparation_addrecipe.setRows(5);
        jScrollPane6.setViewportView(jTextArea_preparation_addrecipe);

        jButton_deletelist_addrecipe.setText("del");
        jButton_deletelist_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletelist_addrecipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox_Ingredient_addrecipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_amount_addrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_amount_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_measurement_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_addingredient_addrecipe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_confirm_addrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_cancel_addrecipe))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox_category1_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_category2_addrecipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_category3_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_recipename_addrecipe)
                                    .addComponent(jLabel_persons_addrecipe)
                                    .addComponent(jLabel_preptime_addrecipe)
                                    .addComponent(jLabel_difficulty_addrecipe))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_persons_addrecipe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_preptime_addrecipe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_difficulty_addrecipe, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jTextField_recipename_addrecipe)))
                            .addComponent(jLabel_preperation_addrecipe, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane_ingredients_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jButton_deletelist_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_recipename_addrecipe)
                    .addComponent(jTextField_recipename_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_persons_addrecipe)
                    .addComponent(jTextField_persons_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_preptime_addrecipe)
                    .addComponent(jTextField_preptime_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_difficulty_addrecipe)
                    .addComponent(jComboBox_difficulty_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_category1_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_category2_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_category3_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane_ingredients_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_deletelist_addrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Ingredient_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_amount_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_measurement_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addingredient_addrecipe)
                    .addComponent(jLabel_amount_addrecipe))
                .addGap(18, 18, 18)
                .addComponent(jLabel_preperation_addrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel_addrecipe)
                    .addComponent(jButton_confirm_addrecipe)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_recipename_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_recipename_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_recipename_addrecipeActionPerformed

    private void jTextField_persons_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_persons_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_persons_addrecipeActionPerformed

    private void jComboBox_category2_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category2_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_category2_addrecipeActionPerformed

    private void jComboBox_category1_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category1_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_category1_addrecipeActionPerformed

    private void jButton_confirm_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirm_addrecipeActionPerformed
        this.setVisible(false);
        new JFrame_rsbi_confirmrecipe().setVisible(true);
        String recipename = jTextField_recipename_addrecipe.getText();
        String persons = jTextField_persons_addrecipe.getText();
        String preptime = jTextField_preptime_addrecipe.getText();
        String difficulty = (String)jComboBox_difficulty_addrecipe.getSelectedItem();
        String category1 = (String)jComboBox_category1_addrecipe.getSelectedItem();
        String category2 = (String)jComboBox_category2_addrecipe.getSelectedItem();
        String category3 = (String)jComboBox_category3_addrecipe.getSelectedItem();
        String preparation = jTextArea_preparation_addrecipe.getText();
        
        JFrame_rsbi_confirmrecipe.jLabel_recipename_confirmrecipe.setText(recipename);
        JFrame_rsbi_confirmrecipe.jLabel_personsdisplay_confirmrecipe.setText(persons);
        JFrame_rsbi_confirmrecipe.jLabel_preptimedisplay_confirmrecipe.setText(preptime);
        JFrame_rsbi_confirmrecipe.jLabel_difficultydisplay_confirmrecipe.setText(difficulty);
        JFrame_rsbi_confirmrecipe.jLabel_category1_confirmrecipe.setText(category1);
        JFrame_rsbi_confirmrecipe.jLabel_category2_confirmrecipe.setText(category2);
        JFrame_rsbi_confirmrecipe.jLabel_category3_confirmrecipe.setText(category3);
        JFrame_rsbi_confirmrecipe.jTextArea_preparation_confirmrecipe.setText(preparation);
        JFrame_rsbi_confirmrecipe.jTextArea_preparation_confirmrecipe.setEditable(false);
    }//GEN-LAST:event_jButton_confirm_addrecipeActionPerformed

    private void jComboBox_Ingredient_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Ingredient_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Ingredient_addrecipeActionPerformed
  
    private void jButton_addingredient_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addingredient_addrecipeActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_ingredients_addrecipe.getModel();
        if(jTable_ingredients_addrecipe.getRowCount() <= 9){
        model.addRow(new Object[]{jComboBox_Ingredient_addrecipe.getSelectedItem(),jTextField_amount_addrecipe.getText(),jComboBox_measurement_addrecipe.getSelectedItem()});
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ingredients are limited to a maximum of nine!");
        }
    }//GEN-LAST:event_jButton_addingredient_addrecipeActionPerformed

    private void jTextField_amount_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_amount_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_amount_addrecipeActionPerformed

    private void jButton_cancel_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_addrecipeActionPerformed
        this.dispose();
        new JFrame_rsbi_main().setVisible(true);
    }//GEN-LAST:event_jButton_cancel_addrecipeActionPerformed

    private void jComboBox_category3_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category3_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_category3_addrecipeActionPerformed

    private void jComboBox_measurement_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_measurement_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_measurement_addrecipeActionPerformed

    private void jButton_deletelist_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletelist_addrecipeActionPerformed
            // TODO add your handling code here
        DefaultTableModel model = (DefaultTableModel) jTable_ingredients_addrecipe.getModel();
        model.removeRow(jTable_ingredients_addrecipe.getSelectedRow());
    }//GEN-LAST:event_jButton_deletelist_addrecipeActionPerformed
    
    //public void setText_Persons(String text){
    //JFrame_rsbi_confirmrecipe.jLabel_personsdisplay_confirmrecipe.setText(text);
    //}
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
            java.util.logging.Logger.getLogger(JFrame_rsbi_addrecipeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_addrecipeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_addrecipeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_addrecipeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_addrecipeform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addingredient_addrecipe;
    private javax.swing.JButton jButton_cancel_addrecipe;
    private javax.swing.JButton jButton_confirm_addrecipe;
    private javax.swing.JButton jButton_deletelist_addrecipe;
    private javax.swing.JComboBox<String> jComboBox_Ingredient_addrecipe;
    private javax.swing.JComboBox<String> jComboBox_category1_addrecipe;
    private javax.swing.JComboBox<String> jComboBox_category2_addrecipe;
    private javax.swing.JComboBox<String> jComboBox_category3_addrecipe;
    private javax.swing.JComboBox<String> jComboBox_difficulty_addrecipe;
    private javax.swing.JComboBox<String> jComboBox_measurement_addrecipe;
    private javax.swing.JLabel jLabel_amount_addrecipe;
    private javax.swing.JLabel jLabel_difficulty_addrecipe;
    private javax.swing.JLabel jLabel_persons_addrecipe;
    private javax.swing.JLabel jLabel_preperation_addrecipe;
    private javax.swing.JLabel jLabel_preptime_addrecipe;
    private javax.swing.JLabel jLabel_recipename_addrecipe;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane_ingredients_addrecipe;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_ingredients_addrecipe;
    private javax.swing.JTextArea jTextArea_preparation_addrecipe;
    private javax.swing.JTextField jTextField_amount_addrecipe;
    private javax.swing.JTextField jTextField_persons_addrecipe;
    private javax.swing.JTextField jTextField_preptime_addrecipe;
    private javax.swing.JTextField jTextField_recipename_addrecipe;
    // End of variables declaration//GEN-END:variables
}

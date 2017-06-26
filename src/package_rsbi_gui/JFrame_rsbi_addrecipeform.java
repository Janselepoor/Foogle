/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import methoden_rsbi.FrameManager;
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
        jComboBox_Ingredient_addrecipe.setSelectedIndex(-1);
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
                jComboBox_category1_addrecipe.insertItemAt("", 0);
                jComboBox_category1_addrecipe.setSelectedIndex(0);
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
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
                jComboBox_category2_addrecipe.insertItemAt("", 0);
                jComboBox_category2_addrecipe.setSelectedIndex(0);
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
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
                jComboBox_category3_addrecipe.insertItemAt("", 0);
                jComboBox_category3_addrecipe.setSelectedIndex(0);
                while (rs.next()) 
                {                
                    tmpString = "";
                    tmpString = rs.getString(1);
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
                jComboBox_measurement_addrecipe.setSelectedIndex(-1);
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
                jComboBox_difficulty_addrecipe.setSelectedIndex(-1);
        
            }
            catch (Exception e)
            {
                System.out.println("Fehler beim Befüllen der ComboBox");
                System.out.println(e.getMessage());
            }
        }        
    
    // Ruft JFrame auf und initialisert alle Componenten und füllt Sie!
    public JFrame_rsbi_addrecipeform() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        FuelleComboIngr();
        FuelleComboMeas();
        FuelleComboCategory1();
        FuelleComboCategory2();
        FuelleComboCategory3();
        FuelleComboDiff();
        jTextArea_preparation_addrecipe.setWrapStyleWord(true);
        jTextArea_preparation_addrecipe.setLineWrap(true);
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
        jScrollPane_ingredients_addrecipe = new javax.swing.JScrollPane();
        jTable_ingredients_addrecipe = new javax.swing.JTable();
        jComboBox_Ingredient_addrecipe = new javax.swing.JComboBox<>();
        jComboBox_measurement_addrecipe = new javax.swing.JComboBox<>();
        jButton_addingredient_addrecipe = new javax.swing.JButton();
        jLabel_preperation_addrecipe = new javax.swing.JLabel();
        jLabel_amount_addrecipe = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_preparation_addrecipe = new javax.swing.JTextArea();
        jButton_deletelist_addrecipe = new javax.swing.JButton();
        jFormattedTextField_amount_addrecipe = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_recipename_addrecipe = new javax.swing.JLabel();
        jTextField_recipename_addrecipe = new javax.swing.JTextField();
        jLabel_persons_addrecipe = new javax.swing.JLabel();
        jFormattedTextField_persons_addrecipe = new javax.swing.JFormattedTextField();
        jLabel_preptime_addrecipe = new javax.swing.JLabel();
        jFormattedTextField_preptime_addrecipe = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel_difficulty_addrecipe = new javax.swing.JLabel();
        jComboBox_difficulty_addrecipe = new javax.swing.JComboBox<>();
        jLabel_star2_addrecipe = new javax.swing.JLabel();
        jLabel_star4_addrecipe = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_category1_addrecipe = new javax.swing.JComboBox<>();
        jComboBox_category2_addrecipe = new javax.swing.JComboBox<>();
        jComboBox_category3_addrecipe = new javax.swing.JComboBox<>();
        jButton_confirm_addrecipe = new javax.swing.JButton();
        jButton_cancel_addrecipe = new javax.swing.JButton();

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

        jScrollPane_ingredients_addrecipe.setAutoscrolls(true);

        jTable_ingredients_addrecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "amount", "measurement"
            }
        ));
        jScrollPane_ingredients_addrecipe.setViewportView(jTable_ingredients_addrecipe);

        jComboBox_Ingredient_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Ingredient_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_Ingredient_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox_Ingredient_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Ingredient_addrecipe.setToolTipText("Select an ingredient.");
        jComboBox_Ingredient_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Ingredient_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_measurement_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_measurement_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_measurement_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox_measurement_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_measurement_addrecipe.setToolTipText("Select the measurement according to the selected ingredient.");
        jComboBox_measurement_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_measurement_addrecipeActionPerformed(evt);
            }
        });

        jButton_addingredient_addrecipe.setBackground(new java.awt.Color(204, 204, 204));
        jButton_addingredient_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_addingredient_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jButton_addingredient_addrecipe.setText("add");
        jButton_addingredient_addrecipe.setToolTipText("Add ingredient to table.");
        jButton_addingredient_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addingredient_addrecipeActionPerformed(evt);
            }
        });

        jLabel_preperation_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_preperation_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_preperation_addrecipe.setText("Preparation:");

        jLabel_amount_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_amount_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_amount_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_amount_addrecipe.setText("amount");

        jTextArea_preparation_addrecipe.setColumns(20);
        jTextArea_preparation_addrecipe.setRows(5);
        jScrollPane6.setViewportView(jTextArea_preparation_addrecipe);

        jButton_deletelist_addrecipe.setBackground(new java.awt.Color(204, 204, 204));
        jButton_deletelist_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_deletelist_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jButton_deletelist_addrecipe.setText("delete");
        jButton_deletelist_addrecipe.setToolTipText("To delete an ingredient, select it in the table and press this button");
        jButton_deletelist_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletelist_addrecipeActionPerformed(evt);
            }
        });

        jFormattedTextField_amount_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jFormattedTextField_amount_addrecipe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextField_amount_addrecipe.setToolTipText("Select the amount of the ingredient you need for your recipe.");
        jFormattedTextField_amount_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_amount_addrecipeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Enter your ingredients");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_recipename_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_recipename_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_recipename_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_recipename_addrecipe.setText("Recipe name");

        jTextField_recipename_addrecipe.setToolTipText("Enter a descriptive name for your recipe.");
        jTextField_recipename_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_recipename_addrecipeActionPerformed(evt);
            }
        });

        jLabel_persons_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_persons_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_persons_addrecipe.setText("# persons");

        jFormattedTextField_persons_addrecipe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField_persons_addrecipe.setToolTipText("Enter the amount of servings");

        jLabel_preptime_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_preptime_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_preptime_addrecipe.setText("Preparation time");

        jFormattedTextField_preptime_addrecipe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField_preptime_addrecipe.setToolTipText("Enter the preparation time.");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("min");

        jLabel_difficulty_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_difficulty_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_difficulty_addrecipe.setText("difficulty");

        jComboBox_difficulty_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_difficulty_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_difficulty_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox_difficulty_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_difficulty_addrecipe.setToolTipText("Choose the difficulty.");

        jLabel_star2_addrecipe.setText("*");

        jLabel_star4_addrecipe.setText("*");

        jLabel4.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel_difficulty_addrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_preptime_addrecipe)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox_difficulty_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField_preptime_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_star4_addrecipe)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel_recipename_addrecipe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_persons_addrecipe)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField_persons_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_star2_addrecipe))
                    .addComponent(jTextField_recipename_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_recipename_addrecipe)
                    .addComponent(jTextField_recipename_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_persons_addrecipe)
                    .addComponent(jFormattedTextField_persons_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_star2_addrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_preptime_addrecipe)
                    .addComponent(jFormattedTextField_preptime_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_difficulty_addrecipe)
                    .addComponent(jComboBox_difficulty_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_star4_addrecipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Choose from categories");

        jComboBox_category1_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_category1_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_category1_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox_category1_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category1_addrecipe.setToolTipText("Select a category for your recipe.");
        jComboBox_category1_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category1_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_category2_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_category2_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_category2_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox_category2_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category2_addrecipe.setToolTipText("Select a category for your recipe.");
        jComboBox_category2_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category2_addrecipeActionPerformed(evt);
            }
        });

        jComboBox_category3_addrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_category3_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jComboBox_category3_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox_category3_addrecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_category3_addrecipe.setToolTipText("Select a category for your recipe.");
        jComboBox_category3_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_category3_addrecipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox_category1_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_category2_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_category3_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_category1_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_category2_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_category3_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_confirm_addrecipe.setBackground(new java.awt.Color(204, 204, 204));
        jButton_confirm_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_confirm_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jButton_confirm_addrecipe.setText("confirm");
        jButton_confirm_addrecipe.setToolTipText("");
        jButton_confirm_addrecipe.setBorderPainted(false);
        jButton_confirm_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirm_addrecipeActionPerformed(evt);
            }
        });

        jButton_cancel_addrecipe.setBackground(new java.awt.Color(204, 204, 204));
        jButton_cancel_addrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_cancel_addrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jButton_cancel_addrecipe.setText("cancel");
        jButton_cancel_addrecipe.setToolTipText("Discard recipe and go back to mainwindow. This step can't be undone.");
        jButton_cancel_addrecipe.setBorderPainted(false);
        jButton_cancel_addrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_addrecipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(202, 202, 202))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jComboBox_Ingredient_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel_amount_addrecipe)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextField_amount_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox_measurement_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton_addingredient_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jScrollPane_ingredients_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton_deletelist_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_confirm_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_cancel_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel_preperation_addrecipe))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Ingredient_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_amount_addrecipe)
                            .addComponent(jFormattedTextField_amount_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_measurement_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_addingredient_addrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_ingredients_addrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_deletelist_addrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_preperation_addrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_confirm_addrecipe)
                    .addComponent(jButton_cancel_addrecipe))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_recipename_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_recipename_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_recipename_addrecipeActionPerformed

    private void jComboBox_category2_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category2_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_category2_addrecipeActionPerformed

    private void jComboBox_category1_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category1_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_category1_addrecipeActionPerformed

    private void jButton_confirm_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirm_addrecipeActionPerformed
    //
        if(!(jComboBox_difficulty_addrecipe.getSelectedIndex() == -1) && 
           !jFormattedTextField_persons_addrecipe.getText().equals("") && 
           !jTextField_recipename_addrecipe.getText().equals("") &&
           !jFormattedTextField_preptime_addrecipe.getText().equals("") &&
         ( !(jComboBox_category1_addrecipe.getSelectedItem().equals("")) ||
           !(jComboBox_category2_addrecipe.getSelectedItem().equals("")) ||
           !(jComboBox_category3_addrecipe.getSelectedItem().equals("")) ) ){   
    // bugfixing
    //  JOptionPane.showMessageDialog(null, ""+ jComboBox_category1_addrecipe.getSelectedItem());
    // überprüfung 2-3 mal gleiche category
            if((!jComboBox_category1_addrecipe.getSelectedItem().equals(jComboBox_category2_addrecipe.getSelectedItem()) ||
             jComboBox_category1_addrecipe.getSelectedIndex() == 0) &&
           (!jComboBox_category1_addrecipe.getSelectedItem().equals(jComboBox_category3_addrecipe.getSelectedItem()) ||
             jComboBox_category3_addrecipe.getSelectedIndex() == 0) &&
           (!jComboBox_category2_addrecipe.getSelectedItem().equals(jComboBox_category3_addrecipe.getSelectedItem()) ||
             jComboBox_category2_addrecipe.getSelectedIndex() == 0))
        //Übertragung der Liste
            {
                DefaultTableModel model = (DefaultTableModel) jTable_ingredients_addrecipe.getModel();
        // at least 3 ingredients        
            if(model.getRowCount()>=3)
            {
            this.setVisible(false);
            JFrame confirm = FrameManager.getconfirmrecipeFrame();
            confirm.setVisible(true);
            String recipename = jTextField_recipename_addrecipe.getText();
            String persons = jFormattedTextField_persons_addrecipe.getText();
            String preptime = jFormattedTextField_preptime_addrecipe.getText();
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
        
        //ÜBERTRAGUNG DER LISTE
        //DefaultTableModel model = (DefaultTableModel) jTable_ingredients_addrecipe.getModel();
        //Example ingredient1 + amount1 + measurement1 

        //Versucht Daten zu Übertragen wenn die Daten nicht existieren werden die Labels unsichtbar
        try
        {
        //Versucht Daten zu Übertragen..
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1_confirmrecipe.setText(model.getValueAt(0,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1amount_confirmrecipe.setText(model.getValueAt(0,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1measure_confirmrecipe.setText(model.getValueAt(0,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1measure_confirmrecipe.setVisible(true);        
        }
        catch(Exception e)
        {
        //..wenn die Daten nicht existieren werden die Labels unsichtbar
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient1measure_confirmrecipe.setVisible(false);
        }
        //Das ganze für alle 9 Ingredients kopiert...
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2_confirmrecipe.setText(model.getValueAt(1,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2amount_confirmrecipe.setText(model.getValueAt(1,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2measure_confirmrecipe.setText(model.getValueAt(1,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2measure_confirmrecipe.setVisible(true);        
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient2measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3_confirmrecipe.setText(model.getValueAt(2,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3amount_confirmrecipe.setText(model.getValueAt(2,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3measure_confirmrecipe.setText(model.getValueAt(2,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3measure_confirmrecipe.setVisible(true);        
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient3measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4_confirmrecipe.setText(model.getValueAt(3,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4amount_confirmrecipe.setText(model.getValueAt(3,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4measure_confirmrecipe.setText(model.getValueAt(3,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4measure_confirmrecipe.setVisible(true);        
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient4measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5_confirmrecipe.setText(model.getValueAt(4,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5amount_confirmrecipe.setText(model.getValueAt(4,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5measure_confirmrecipe.setText(model.getValueAt(4,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5measure_confirmrecipe.setVisible(true);        
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient5measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6_confirmrecipe.setText(model.getValueAt(5,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6amount_confirmrecipe.setText(model.getValueAt(5,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6measure_confirmrecipe.setText(model.getValueAt(5,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6measure_confirmrecipe.setVisible(true);
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient6measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7_confirmrecipe.setText(model.getValueAt(6,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7amount_confirmrecipe.setText(model.getValueAt(6,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7measure_confirmrecipe.setText(model.getValueAt(6,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7measure_confirmrecipe.setVisible(true);        
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient7measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8_confirmrecipe.setText(model.getValueAt(7,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8amount_confirmrecipe.setText(model.getValueAt(7,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8measure_confirmrecipe.setText(model.getValueAt(7,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8measure_confirmrecipe.setVisible(true);
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient8measure_confirmrecipe.setVisible(false);
        }
        
        try
        {
        //kopiert für erkläre siehe oben: übertragung der liste
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9_confirmrecipe.setText(model.getValueAt(8,0).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9amount_confirmrecipe.setText(model.getValueAt(8,1).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9measure_confirmrecipe.setText(model.getValueAt(8,2).toString());
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9amount_confirmrecipe.setVisible(true);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9measure_confirmrecipe.setVisible(true);
        }
        catch(Exception e)
        {
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9amount_confirmrecipe.setVisible(false);
        JFrame_rsbi_confirmrecipe.jLabel_ingredient9measure_confirmrecipe.setVisible(false);
        }     
    }//GEN-LAST:event_jButton_confirm_addrecipeActionPerformed
                else{
                        JOptionPane.showMessageDialog(null, "Please insert at least 3 ingredients!");
                }
        }
            else{
                JOptionPane.showMessageDialog(null, "Categories have to be unique!");
    }
    }
    else{
        JOptionPane.showMessageDialog(null, "All marked fields have to be filled!\nGive your recipe a name.\n"
                                          + "You have to type in numbers for the amount of persons\nand the preparation time.\n"
                                          + "Please select a difficulty and at least one category.");
    }
    }
    private void jComboBox_Ingredient_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Ingredient_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_Ingredient_addrecipeActionPerformed
  
    private void jButton_addingredient_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addingredient_addrecipeActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_ingredients_addrecipe.getModel();
        int count=model.getRowCount();
        boolean claudioholtgradpizza = true;
        if(!(jComboBox_Ingredient_addrecipe.getSelectedIndex() == -1) && !(jComboBox_measurement_addrecipe.getSelectedIndex() == -1)){
            
        for(int i=0;i<count;i++)
        {
            if(model.getValueAt(i,0).toString().equals(jComboBox_Ingredient_addrecipe.getSelectedItem().toString())){
                claudioholtgradpizza = false;
                JOptionPane.showMessageDialog(null, "Ingredients have to be unique!");
                break;
            }
        /*    else
            {
                claudioholtgradpizza = true;
            }
       */ }
        if(claudioholtgradpizza == true){
        if(!jFormattedTextField_amount_addrecipe.getText().equals("") ){
        if(jTable_ingredients_addrecipe.getRowCount() < 9){
        model.addRow(new Object[]{jComboBox_Ingredient_addrecipe.getSelectedItem(),jFormattedTextField_amount_addrecipe.getText(),jComboBox_measurement_addrecipe.getSelectedItem()});
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ingredients are limited to a maximum of nine!");
        }
    }//GEN-LAST:event_jButton_addingredient_addrecipeActionPerformed
        else
        {
            JOptionPane.showMessageDialog(null, "You have to type in a number for the amount!");
        }
            
    }
    }
        else{
            JOptionPane.showMessageDialog(null, "You have to select an ingredient and a measurement! ");
        }
    }
    
    private void jButton_cancel_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_addrecipeActionPerformed
        this.dispose();
        JFrame main = FrameManager.getmainFrame();
        main.setVisible(true);
    }//GEN-LAST:event_jButton_cancel_addrecipeActionPerformed

    private void jComboBox_category3_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_category3_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_category3_addrecipeActionPerformed

    private void jComboBox_measurement_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_measurement_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_measurement_addrecipeActionPerformed

    private void jButton_deletelist_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletelist_addrecipeActionPerformed
            // TODO add your handling code here
        if((jTable_ingredients_addrecipe.getRowCount()) > 0){
            try
            {
                DefaultTableModel model = (DefaultTableModel) jTable_ingredients_addrecipe.getModel();
                model.removeRow(jTable_ingredients_addrecipe.getSelectedRow());
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Click the ingredient you want to delete!");
            }
        }
    }//GEN-LAST:event_jButton_deletelist_addrecipeActionPerformed

    private void jFormattedTextField_amount_addrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_amount_addrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_amount_addrecipeActionPerformed
    
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
    public static javax.swing.JComboBox<String> jComboBox_Ingredient_addrecipe;
    public static javax.swing.JComboBox<String> jComboBox_category1_addrecipe;
    public static javax.swing.JComboBox<String> jComboBox_category2_addrecipe;
    public static javax.swing.JComboBox<String> jComboBox_category3_addrecipe;
    public static javax.swing.JComboBox<String> jComboBox_difficulty_addrecipe;
    public static javax.swing.JComboBox<String> jComboBox_measurement_addrecipe;
    public static javax.swing.JFormattedTextField jFormattedTextField_amount_addrecipe;
    public static javax.swing.JFormattedTextField jFormattedTextField_persons_addrecipe;
    public static javax.swing.JFormattedTextField jFormattedTextField_preptime_addrecipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_amount_addrecipe;
    private javax.swing.JLabel jLabel_difficulty_addrecipe;
    private javax.swing.JLabel jLabel_persons_addrecipe;
    private javax.swing.JLabel jLabel_preperation_addrecipe;
    private javax.swing.JLabel jLabel_preptime_addrecipe;
    private javax.swing.JLabel jLabel_recipename_addrecipe;
    private javax.swing.JLabel jLabel_star2_addrecipe;
    private javax.swing.JLabel jLabel_star4_addrecipe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JScrollPane jScrollPane_ingredients_addrecipe;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable_ingredients_addrecipe;
    public static javax.swing.JTextArea jTextArea_preparation_addrecipe;
    public static javax.swing.JTextField jTextField_recipename_addrecipe;
    // End of variables declaration//GEN-END:variables
}

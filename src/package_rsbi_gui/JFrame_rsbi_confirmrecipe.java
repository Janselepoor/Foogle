/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import methoden_rsbi.FrameManager;
import methoden_rsbi.User;
import methoden_rsbi.Verbindung;

/**
 *
 * @author patrick
 */
public class JFrame_rsbi_confirmrecipe extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_rsbi_showrecipe
     */
    public JFrame_rsbi_confirmrecipe() {
        initComponents();
        jTextArea_preparation_confirmrecipe.setWrapStyleWord(true);
        jTextArea_preparation_confirmrecipe.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_recipename_confirmrecipe = new javax.swing.JLabel();
        jLabel_persons_confirmrecipe = new javax.swing.JLabel();
        jLabel_preptime_confirmrecipe = new javax.swing.JLabel();
        jLabel_difficulty_confirmrecipe = new javax.swing.JLabel();
        jLabel_personsdisplay_confirmrecipe = new javax.swing.JLabel();
        jLabel_preptimedisplay_confirmrecipe = new javax.swing.JLabel();
        jLabel_difficultydisplay_confirmrecipe = new javax.swing.JLabel();
        jLabel_categories_confirmrecipe = new javax.swing.JLabel();
        jLabel_category1_confirmrecipe = new javax.swing.JLabel();
        jLabel_category2_confirmrecipe = new javax.swing.JLabel();
        jLabel_category3_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredients_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient1_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient1amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient1measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient2_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient3_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient4_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient5_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient6_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient6amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient6measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient7_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient8_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient9_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient7amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient7measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient8amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient9amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient8measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_preparation_confirmrecipe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_preparation_confirmrecipe = new javax.swing.JTextArea();
        jButton_confirm_confirmrecipe = new javax.swing.JButton();
        jButton_cancel_confirmrecipe = new javax.swing.JButton();
        jLabel_ingredient9measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient2amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient2measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient3amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient3measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient4amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient4measure_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient5amount_confirmrecipe = new javax.swing.JLabel();
        jLabel_ingredient5measure_confirmrecipe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foogle");
        setResizable(false);

        jLabel_recipename_confirmrecipe.setText("recipe name");

        jLabel_persons_confirmrecipe.setText("persons");

        jLabel_preptime_confirmrecipe.setText("prep time");

        jLabel_difficulty_confirmrecipe.setText("difficulty");

        jLabel_personsdisplay_confirmrecipe.setText("no.");

        jLabel_preptimedisplay_confirmrecipe.setText("time");

        jLabel_difficultydisplay_confirmrecipe.setText("diff");

        jLabel_categories_confirmrecipe.setText("categories");

        jLabel_category1_confirmrecipe.setText("category1");

        jLabel_category2_confirmrecipe.setText("category2");

        jLabel_category3_confirmrecipe.setText("category3");

        jLabel_ingredients_confirmrecipe.setText("ingredients:");

        jLabel_ingredient1_confirmrecipe.setText("ingredient1");

        jLabel_ingredient1amount_confirmrecipe.setText("amount");

        jLabel_ingredient1measure_confirmrecipe.setText("measure");

        jLabel_ingredient2_confirmrecipe.setText("ingredient2");

        jLabel_ingredient3_confirmrecipe.setText("ingredient3");

        jLabel_ingredient4_confirmrecipe.setText("ingredient4");

        jLabel_ingredient5_confirmrecipe.setText("ingredient5");

        jLabel_ingredient6_confirmrecipe.setText("ingredient6");

        jLabel_ingredient6amount_confirmrecipe.setText("amount");

        jLabel_ingredient6measure_confirmrecipe.setText("measure");

        jLabel_ingredient7_confirmrecipe.setText("ingredient7");

        jLabel_ingredient8_confirmrecipe.setText("ingredient8");

        jLabel_ingredient9_confirmrecipe.setText("ingredient9");

        jLabel_ingredient7amount_confirmrecipe.setText("amount");

        jLabel_ingredient7measure_confirmrecipe.setText("measure");

        jLabel_ingredient8amount_confirmrecipe.setText("amount");

        jLabel_ingredient9amount_confirmrecipe.setText("amount");

        jLabel_ingredient8measure_confirmrecipe.setText("measure");

        jLabel_preparation_confirmrecipe.setText("preparation:");

        jTextArea_preparation_confirmrecipe.setColumns(20);
        jTextArea_preparation_confirmrecipe.setRows(5);
        jScrollPane1.setViewportView(jTextArea_preparation_confirmrecipe);

        jButton_confirm_confirmrecipe.setText("confirm");
        jButton_confirm_confirmrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirm_confirmrecipeActionPerformed(evt);
            }
        });

        jButton_cancel_confirmrecipe.setText("cancel");
        jButton_cancel_confirmrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_confirmrecipeActionPerformed(evt);
            }
        });

        jLabel_ingredient9measure_confirmrecipe.setText("measure");

        jLabel_ingredient2amount_confirmrecipe.setText("amount");

        jLabel_ingredient2measure_confirmrecipe.setText("measure");

        jLabel_ingredient3amount_confirmrecipe.setText("amount");

        jLabel_ingredient3measure_confirmrecipe.setText("measure");

        jLabel_ingredient4amount_confirmrecipe.setText("amount");

        jLabel_ingredient4measure_confirmrecipe.setText("measure");

        jLabel_ingredient5amount_confirmrecipe.setText("amount");

        jLabel_ingredient5measure_confirmrecipe.setText("measure");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_category1_confirmrecipe)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_persons_confirmrecipe)
                                .addComponent(jLabel_preptime_confirmrecipe)
                                .addComponent(jLabel_difficulty_confirmrecipe)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_difficultydisplay_confirmrecipe)
                                    .addComponent(jLabel_preptimedisplay_confirmrecipe)
                                    .addComponent(jLabel_personsdisplay_confirmrecipe)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_category2_confirmrecipe)
                                .addGap(251, 251, 251))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_ingredient5_confirmrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient4_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient3_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient2_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient1_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_ingredient4amount_confirmrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient5amount_confirmrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient2amount_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient3amount_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient1amount_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_ingredient3measure_confirmrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient2measure_confirmrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient1measure_confirmrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ingredient4measure_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient5measure_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_ingredient6_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_ingredient6amount_confirmrecipe))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel_ingredient9_confirmrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_ingredient8_confirmrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_ingredient7_confirmrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_ingredient7amount_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel_ingredient8amount_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel_ingredient9amount_confirmrecipe, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel_ingredient8measure_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_ingredient6measure_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_ingredient7measure_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                    .addComponent(jLabel_ingredient9measure_confirmrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel_category3_confirmrecipe))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 435, Short.MAX_VALUE)
                        .addComponent(jButton_confirm_confirmrecipe)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_cancel_confirmrecipe)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_categories_confirmrecipe)
                                    .addComponent(jLabel_ingredients_confirmrecipe)
                                    .addComponent(jLabel_recipename_confirmrecipe)
                                    .addComponent(jLabel_preparation_confirmrecipe)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_recipename_confirmrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_persons_confirmrecipe)
                    .addComponent(jLabel_personsdisplay_confirmrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_preptime_confirmrecipe)
                    .addComponent(jLabel_preptimedisplay_confirmrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_difficulty_confirmrecipe)
                    .addComponent(jLabel_difficultydisplay_confirmrecipe))
                .addGap(28, 28, 28)
                .addComponent(jLabel_categories_confirmrecipe)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_category1_confirmrecipe)
                    .addComponent(jLabel_category2_confirmrecipe)
                    .addComponent(jLabel_category3_confirmrecipe))
                .addGap(31, 31, 31)
                .addComponent(jLabel_ingredients_confirmrecipe)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient1_confirmrecipe)
                    .addComponent(jLabel_ingredient1amount_confirmrecipe)
                    .addComponent(jLabel_ingredient1measure_confirmrecipe)
                    .addComponent(jLabel_ingredient6_confirmrecipe)
                    .addComponent(jLabel_ingredient6amount_confirmrecipe)
                    .addComponent(jLabel_ingredient6measure_confirmrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient2_confirmrecipe)
                    .addComponent(jLabel_ingredient7_confirmrecipe)
                    .addComponent(jLabel_ingredient7amount_confirmrecipe)
                    .addComponent(jLabel_ingredient7measure_confirmrecipe)
                    .addComponent(jLabel_ingredient2amount_confirmrecipe)
                    .addComponent(jLabel_ingredient2measure_confirmrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient8amount_confirmrecipe)
                    .addComponent(jLabel_ingredient8_confirmrecipe)
                    .addComponent(jLabel_ingredient8measure_confirmrecipe)
                    .addComponent(jLabel_ingredient3_confirmrecipe)
                    .addComponent(jLabel_ingredient3amount_confirmrecipe)
                    .addComponent(jLabel_ingredient3measure_confirmrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient9_confirmrecipe)
                    .addComponent(jLabel_ingredient9amount_confirmrecipe)
                    .addComponent(jLabel_ingredient4_confirmrecipe)
                    .addComponent(jLabel_ingredient9measure_confirmrecipe)
                    .addComponent(jLabel_ingredient4amount_confirmrecipe)
                    .addComponent(jLabel_ingredient4measure_confirmrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient5_confirmrecipe)
                    .addComponent(jLabel_ingredient5amount_confirmrecipe)
                    .addComponent(jLabel_ingredient5measure_confirmrecipe))
                .addGap(36, 36, 36)
                .addComponent(jLabel_preparation_confirmrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel_confirmrecipe)
                    .addComponent(jButton_confirm_confirmrecipe))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancel_confirmrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_confirmrecipeActionPerformed
        this.dispose();
        JFrame add =  FrameManager.getaddrecipeFrame();
        add.setVisible(true);  
        
    }//GEN-LAST:event_jButton_cancel_confirmrecipeActionPerformed

    private void jButton_confirm_confirmrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirm_confirmrecipeActionPerformed
        // fügt rezept in datenbank ein
        try
        {
        boolean addcheck=false;
        int user_id;
        int diff_id;
        int preptime = Integer.parseInt(jLabel_preptimedisplay_confirmrecipe.getText());
        int persons = Integer.parseInt(jLabel_personsdisplay_confirmrecipe.getText());
        String rec_name = jLabel_recipename_confirmrecipe.getText();
        String rec_text = jTextArea_preparation_confirmrecipe.getText();
        Verbindung connect2DB = new Verbindung();
        // hole user id
        User current_user = new User();
        user_id = current_user.getUserID();
        // hole difficulity id
        diff_id = connect2DB.getDiffID(jLabel_difficultydisplay_confirmrecipe.getText());
        addcheck = connect2DB.addRecipe(user_id,diff_id,rec_name,preptime,persons,rec_text);
        // füge kategorien
        if(addcheck)
        {
            int rec_id = connect2DB.getRecID(rec_name);
            //cat1
            if(!jLabel_category1_confirmrecipe.getText().equals(""))
            {
                int cat_id = connect2DB.getCatID(jLabel_category1_confirmrecipe.getText());
                connect2DB.addRecCat(rec_id, cat_id);
            }
            //cat2
            if(!jLabel_category2_confirmrecipe.getText().equals(""))
            {
                int cat_id = connect2DB.getCatID(jLabel_category2_confirmrecipe.getText());
                connect2DB.addRecCat(rec_id, cat_id);
            }
            //cat3
            if(!jLabel_category3_confirmrecipe.getText().equals(""))
            {
                int cat_id = connect2DB.getCatID(jLabel_category3_confirmrecipe.getText());
                connect2DB.addRecCat(rec_id, cat_id);
            }
            
        //füre Zutaten ein
            if(addcheck)
            {
                  // Zutat 1
                  if(jLabel_ingredient1_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient1measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient1_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient1amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  
                  // Zutat 2
                  if(jLabel_ingredient2_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient2measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient2_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient2amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 3
                  if(jLabel_ingredient3_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient3measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient3_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient3amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 4
                  if(jLabel_ingredient4_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient4measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient4_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient4amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 5
                  if(jLabel_ingredient5_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient5measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient5_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient5amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 6
                  if(jLabel_ingredient6_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient6measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient6_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient6amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 7
                  if(jLabel_ingredient7_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient7measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient7_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient7amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 8
                  if(jLabel_ingredient8_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient8measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient8_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient8amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 9
                  if(jLabel_ingredient9_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient9measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient9_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient9amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                  // Zutat 1
                  if(jLabel_ingredient1_confirmrecipe.isVisible())
                  {
                       int meas_id = connect2DB.getMeasID(jLabel_ingredient1measure_confirmrecipe.getText());
                       int ingr_id = connect2DB.getIngrID(jLabel_ingredient1_confirmrecipe.getText());
                       int amount = Integer.parseInt(jLabel_ingredient1amount_confirmrecipe.getText());
                       
                       connect2DB.addRecIng(rec_id,ingr_id,meas_id,amount);
                  }
                }
            }
            JOptionPane.showMessageDialog(null, "Your recipe has been added successfully");
        }
        catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Oooops somethings bad happened!");
                    }
        
        
        
        
        
        
        this.dispose();
        new JFrame_rsbi_main().setVisible(true);
    }//GEN-LAST:event_jButton_confirm_confirmrecipeActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_rsbi_confirmrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_confirmrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_confirmrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_confirmrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_confirmrecipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel_confirmrecipe;
    private javax.swing.JButton jButton_confirm_confirmrecipe;
    private javax.swing.JLabel jLabel_categories_confirmrecipe;
    public static javax.swing.JLabel jLabel_category1_confirmrecipe;
    public static javax.swing.JLabel jLabel_category2_confirmrecipe;
    public static javax.swing.JLabel jLabel_category3_confirmrecipe;
    private javax.swing.JLabel jLabel_difficulty_confirmrecipe;
    public static javax.swing.JLabel jLabel_difficultydisplay_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient1_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient1amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient1measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient2_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient2amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient2measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient3_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient3amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient3measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient4_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient4amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient4measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient5_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient5amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient5measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient6_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient6amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient6measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient7_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient7amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient7measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient8_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient8amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient8measure_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient9_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient9amount_confirmrecipe;
    public static javax.swing.JLabel jLabel_ingredient9measure_confirmrecipe;
    private javax.swing.JLabel jLabel_ingredients_confirmrecipe;
    private javax.swing.JLabel jLabel_persons_confirmrecipe;
    public static javax.swing.JLabel jLabel_personsdisplay_confirmrecipe;
    private javax.swing.JLabel jLabel_preparation_confirmrecipe;
    private javax.swing.JLabel jLabel_preptime_confirmrecipe;
    public static javax.swing.JLabel jLabel_preptimedisplay_confirmrecipe;
    public static javax.swing.JLabel jLabel_recipename_confirmrecipe;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea_preparation_confirmrecipe;
    // End of variables declaration//GEN-END:variables
}

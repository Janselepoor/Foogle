/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

import java.awt.Color;
import javax.swing.JFrame;
import methoden_rsbi.FrameManager;

/**
 *
 * @author patrick
 */
public class JFrame_rsbi_showrecipe extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_rsbi_showrecipe
     */
    public JFrame_rsbi_showrecipe() {
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

        jLabel_recipename_showrecipe = new javax.swing.JLabel();
        jLabel_preparation_showrecipe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_preparation_showrecipe = new javax.swing.JTextArea();
        jButton_close_showrecipe = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel_persons_showrecipe = new javax.swing.JLabel();
        jLabel_preptime_showrecipe = new javax.swing.JLabel();
        jLabel_difficulty_showrecipe = new javax.swing.JLabel();
        jLabel_personsdisplay_showrecipe = new javax.swing.JLabel();
        jLabel_preptimedisplay_showrecipe = new javax.swing.JLabel();
        jLabel_difficultydisplay_showrecipe = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_categories_showrecipe = new javax.swing.JLabel();
        jLabel_category1_showrecipe = new javax.swing.JLabel();
        jLabel_category2_showrecipe = new javax.swing.JLabel();
        jLabel_category3_showrecipe = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_ingredients_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient1_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient1amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient1measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient2_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient2amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient2measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient3measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient3_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient4_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient4amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient4measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient5_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient5amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient5measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient6_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient6amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient6measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient7_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient7amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient7measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient8_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient8amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient8measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient9_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient9amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient9measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient3amount_showrecipe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("foogle");
        setResizable(false);

        jLabel_recipename_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_recipename_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_recipename_showrecipe.setText("Recipe name");

        jLabel_preparation_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_preparation_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_preparation_showrecipe.setText("Preparation:");

        jTextArea_preparation_showrecipe.setEditable(false);
        jTextArea_preparation_showrecipe.setColumns(20);
        jTextArea_preparation_showrecipe.setRows(5);
        jScrollPane1.setViewportView(jTextArea_preparation_showrecipe);

        jButton_close_showrecipe.setBackground(new java.awt.Color(204, 204, 204));
        jButton_close_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton_close_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jButton_close_showrecipe.setText("close");
        jButton_close_showrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_close_showrecipeActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_persons_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_persons_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_persons_showrecipe.setText("persons");

        jLabel_preptime_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_preptime_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_preptime_showrecipe.setText("prep time");

        jLabel_difficulty_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_difficulty_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_difficulty_showrecipe.setText("difficulty");

        jLabel_personsdisplay_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_personsdisplay_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_personsdisplay_showrecipe.setText("no.");

        jLabel_preptimedisplay_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_preptimedisplay_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_preptimedisplay_showrecipe.setText("time");

        jLabel_difficultydisplay_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_difficultydisplay_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_difficultydisplay_showrecipe.setText("diff");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_persons_showrecipe)
                    .addComponent(jLabel_preptime_showrecipe)
                    .addComponent(jLabel_difficulty_showrecipe))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_difficultydisplay_showrecipe)
                    .addComponent(jLabel_preptimedisplay_showrecipe)
                    .addComponent(jLabel_personsdisplay_showrecipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_persons_showrecipe)
                    .addComponent(jLabel_personsdisplay_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_preptime_showrecipe)
                    .addComponent(jLabel_preptimedisplay_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_difficulty_showrecipe)
                    .addComponent(jLabel_difficultydisplay_showrecipe))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_categories_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_categories_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_categories_showrecipe.setText("Categories");

        jLabel_category1_showrecipe.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_category1_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_category1_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_category1_showrecipe.setText("category1");

        jLabel_category2_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_category2_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_category2_showrecipe.setText("category2");

        jLabel_category3_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_category3_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_category3_showrecipe.setText("category3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_categories_showrecipe)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_category1_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_category2_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_category3_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_categories_showrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_category1_showrecipe)
                    .addComponent(jLabel_category2_showrecipe)
                    .addComponent(jLabel_category3_showrecipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_ingredients_showrecipe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel_ingredients_showrecipe.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_ingredients_showrecipe.setText("Ingredients:");

        jLabel_ingredient1_showrecipe.setText("ingredient1");

        jLabel_ingredient1amount_showrecipe.setText("amount");

        jLabel_ingredient1measure_showrecipe.setText("measure");

        jLabel_ingredient2_showrecipe.setText("ingredient2");

        jLabel_ingredient2amount_showrecipe.setText("amount");

        jLabel_ingredient2measure_showrecipe.setText("measure");

        jLabel_ingredient3measure_showrecipe.setText("measure");

        jLabel_ingredient3_showrecipe.setText("ingredient3");

        jLabel_ingredient4_showrecipe.setText("ingredient4");

        jLabel_ingredient4amount_showrecipe.setText("amount");

        jLabel_ingredient4measure_showrecipe.setText("measure");

        jLabel_ingredient5_showrecipe.setText("ingredient5");

        jLabel_ingredient5amount_showrecipe.setText("amount");

        jLabel_ingredient5measure_showrecipe.setText("measure");

        jLabel_ingredient6_showrecipe.setText("ingredient6");

        jLabel_ingredient6amount_showrecipe.setText("amount");

        jLabel_ingredient6measure_showrecipe.setText("measure");

        jLabel_ingredient7_showrecipe.setText("ingredient7");

        jLabel_ingredient7amount_showrecipe.setText("amount");

        jLabel_ingredient7measure_showrecipe.setText("measure");

        jLabel_ingredient8_showrecipe.setText("ingredient8");

        jLabel_ingredient8amount_showrecipe.setText("amount");

        jLabel_ingredient8measure_showrecipe.setText("measure");

        jLabel_ingredient9_showrecipe.setText("ingredient9");

        jLabel_ingredient9amount_showrecipe.setText("amount");

        jLabel_ingredient9measure_showrecipe.setText("measure");

        jLabel_ingredient3amount_showrecipe.setText("amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ingredients_showrecipe)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_ingredient9_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_ingredient2_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient3_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient8_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient1_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient4_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient5_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_ingredient7_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_ingredient6_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_ingredient9amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_ingredient2amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient3amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient8amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient1amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_ingredient4amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_ingredient5amount_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel_ingredient6amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel_ingredient7amount_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_ingredient8measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_ingredient9measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel_ingredient1measure_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_ingredient7measure_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_ingredient3measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_ingredient2measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_ingredient4measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient5measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient6measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel_ingredients_showrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient1_showrecipe)
                            .addComponent(jLabel_ingredient1measure_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient2_showrecipe)
                            .addComponent(jLabel_ingredient2measure_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient3measure_showrecipe)
                            .addComponent(jLabel_ingredient3_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ingredient4measure_showrecipe)
                            .addComponent(jLabel_ingredient4_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient5_showrecipe)
                            .addComponent(jLabel_ingredient5measure_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient6_showrecipe)
                            .addComponent(jLabel_ingredient6measure_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient7_showrecipe)
                            .addComponent(jLabel_ingredient7measure_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient8_showrecipe)
                            .addComponent(jLabel_ingredient8measure_showrecipe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ingredient9_showrecipe)
                            .addComponent(jLabel_ingredient9measure_showrecipe)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_ingredient1amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient2amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient3amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient4amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient5amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient6amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient7amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ingredient8amount_showrecipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_ingredient9amount_showrecipe)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_recipename_showrecipe)
                            .addComponent(jLabel_preparation_showrecipe)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_close_showrecipe)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_recipename_showrecipe)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_preparation_showrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_close_showrecipe)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_close_showrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_close_showrecipeActionPerformed
        this.dispose();
        JFrame searchwindow = FrameManager.getrecipetableFrame();
        searchwindow.setVisible(true);
    }//GEN-LAST:event_jButton_close_showrecipeActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_rsbi_showrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_showrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_showrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_rsbi_showrecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_rsbi_showrecipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close_showrecipe;
    private javax.swing.JLabel jLabel_categories_showrecipe;
    public static javax.swing.JLabel jLabel_category1_showrecipe;
    public static javax.swing.JLabel jLabel_category2_showrecipe;
    public static javax.swing.JLabel jLabel_category3_showrecipe;
    private javax.swing.JLabel jLabel_difficulty_showrecipe;
    public static javax.swing.JLabel jLabel_difficultydisplay_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient1_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient1amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient1measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient2_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient2amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient2measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient3_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient3amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient3measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient4_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient4amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient4measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient5_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient5amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient5measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient6_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient6amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient6measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient7_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient7amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient7measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient8_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient8amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient8measure_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient9_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient9amount_showrecipe;
    public static javax.swing.JLabel jLabel_ingredient9measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredients_showrecipe;
    private javax.swing.JLabel jLabel_persons_showrecipe;
    public static javax.swing.JLabel jLabel_personsdisplay_showrecipe;
    private javax.swing.JLabel jLabel_preparation_showrecipe;
    private javax.swing.JLabel jLabel_preptime_showrecipe;
    public static javax.swing.JLabel jLabel_preptimedisplay_showrecipe;
    public static javax.swing.JLabel jLabel_recipename_showrecipe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea_preparation_showrecipe;
    // End of variables declaration//GEN-END:variables
}

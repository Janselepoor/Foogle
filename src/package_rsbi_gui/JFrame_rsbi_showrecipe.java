/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_rsbi_gui;

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
        jLabel_persons_showrecipe = new javax.swing.JLabel();
        jLabel_preptime_showrecipe = new javax.swing.JLabel();
        jLabel_difficulty_showrecipe = new javax.swing.JLabel();
        jLabel_personsdisplay_showrecipe = new javax.swing.JLabel();
        jLabel_preptimedisplay_showrecipe = new javax.swing.JLabel();
        jLabel_difficultydisplay_showrecipe = new javax.swing.JLabel();
        jLabel_categories_showrecipe = new javax.swing.JLabel();
        jLabel_category1_showrecipe = new javax.swing.JLabel();
        jLabel_category2_showrecipe = new javax.swing.JLabel();
        jLabel_category3_showrecipe = new javax.swing.JLabel();
        jLabel_ingredients_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient1_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient1amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient1measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient2_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient3_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient4_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient5_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient6_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient6amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient6measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient7_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient8_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient9_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient7amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient7measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient8amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient9amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient8measure_showrecipe = new javax.swing.JLabel();
        jLabel_preparation_showrecipe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_preparation_showrecipe = new javax.swing.JTextArea();
        jScrollBar_description_showrecipe = new javax.swing.JScrollBar();
        jLabel_rating_showrecipe = new javax.swing.JLabel();
        jButton_rating1_showrecipe = new javax.swing.JButton();
        jButton_rating2_showrecipe = new javax.swing.JButton();
        jButton_rating3_showrecipe = new javax.swing.JButton();
        jButton_rating4_showrecipe = new javax.swing.JButton();
        jButton_rating5_showrecipe = new javax.swing.JButton();
        jButton_confirm_showrecipe = new javax.swing.JButton();
        jButton_close_showrecipe = new javax.swing.JButton();
        jLabel_ingredient9measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient2amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient2measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient3amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient3measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient4amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient4measure_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient5amount_showrecipe = new javax.swing.JLabel();
        jLabel_ingredient5measure_showrecipe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_recipename_showrecipe.setText("recipe name");

        jLabel_persons_showrecipe.setText("persons");

        jLabel_preptime_showrecipe.setText("prep time");

        jLabel_difficulty_showrecipe.setText("difficulty");

        jLabel_personsdisplay_showrecipe.setText("no.");

        jLabel_preptimedisplay_showrecipe.setText("time");

        jLabel_difficultydisplay_showrecipe.setText("diff");

        jLabel_categories_showrecipe.setText("categories");

        jLabel_category1_showrecipe.setText("category1");

        jLabel_category2_showrecipe.setText("category2");

        jLabel_category3_showrecipe.setText("category3");

        jLabel_ingredients_showrecipe.setText("ingredients:");

        jLabel_ingredient1_showrecipe.setText("ingredient1");

        jLabel_ingredient1amount_showrecipe.setText("amount");

        jLabel_ingredient1measure_showrecipe.setText("measure");

        jLabel_ingredient2_showrecipe.setText("ingredient2");

        jLabel_ingredient3_showrecipe.setText("ingredient3");

        jLabel_ingredient4_showrecipe.setText("ingredient4");

        jLabel_ingredient5_showrecipe.setText("ingredient5");

        jLabel_ingredient6_showrecipe.setText("ingredient6");

        jLabel_ingredient6amount_showrecipe.setText("amount");

        jLabel_ingredient6measure_showrecipe.setText("measure");

        jLabel_ingredient7_showrecipe.setText("ingredient7");

        jLabel_ingredient8_showrecipe.setText("ingredient8");

        jLabel_ingredient9_showrecipe.setText("ingredient9");

        jLabel_ingredient7amount_showrecipe.setText("amount");

        jLabel_ingredient7measure_showrecipe.setText("measure");

        jLabel_ingredient8amount_showrecipe.setText("amount");

        jLabel_ingredient9amount_showrecipe.setText("amount");

        jLabel_ingredient8measure_showrecipe.setText("measure");

        jLabel_preparation_showrecipe.setText("preparation:");

        jTextArea_preparation_showrecipe.setColumns(20);
        jTextArea_preparation_showrecipe.setRows(5);
        jScrollPane1.setViewportView(jTextArea_preparation_showrecipe);

        jLabel_rating_showrecipe.setText("How good is this recipe?(1=bad,5=good)");

        jButton_rating1_showrecipe.setText("1");

        jButton_rating2_showrecipe.setText("2");
        jButton_rating2_showrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rating2_showrecipeActionPerformed(evt);
            }
        });

        jButton_rating3_showrecipe.setText("3");
        jButton_rating3_showrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rating3_showrecipeActionPerformed(evt);
            }
        });

        jButton_rating4_showrecipe.setText("4");

        jButton_rating5_showrecipe.setText("5");

        jButton_confirm_showrecipe.setText("confirm");
        jButton_confirm_showrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirm_showrecipeActionPerformed(evt);
            }
        });

        jButton_close_showrecipe.setText("close");
        jButton_close_showrecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_close_showrecipeActionPerformed(evt);
            }
        });

        jLabel_ingredient9measure_showrecipe.setText("measure");

        jLabel_ingredient2amount_showrecipe.setText("amount");

        jLabel_ingredient2measure_showrecipe.setText("measure");

        jLabel_ingredient3amount_showrecipe.setText("amount");

        jLabel_ingredient3measure_showrecipe.setText("measure");

        jLabel_ingredient4amount_showrecipe.setText("amount");

        jLabel_ingredient4measure_showrecipe.setText("measure");

        jLabel_ingredient5amount_showrecipe.setText("amount");

        jLabel_ingredient5measure_showrecipe.setText("measure");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_category1_showrecipe)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_persons_showrecipe)
                                .addComponent(jLabel_preptime_showrecipe)
                                .addComponent(jLabel_difficulty_showrecipe)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_difficultydisplay_showrecipe)
                                    .addComponent(jLabel_preptimedisplay_showrecipe)
                                    .addComponent(jLabel_personsdisplay_showrecipe)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_category2_showrecipe)
                                .addGap(181, 181, 181)
                                .addComponent(jLabel_category3_showrecipe))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_ingredient5_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient4_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient3_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient2_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient1_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_ingredient4amount_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient5amount_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient2amount_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient3amount_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient1amount_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_ingredient3measure_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient2measure_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient1measure_showrecipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ingredient4measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel_ingredient5measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_ingredient6_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_ingredient6amount_showrecipe))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_ingredient9_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_ingredient8_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_ingredient7_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_ingredient7amount_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_ingredient8amount_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_ingredient9amount_showrecipe, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_ingredient8measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_ingredient6measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ingredient7measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addComponent(jLabel_ingredient9measure_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_preparation_showrecipe)
                            .addComponent(jLabel_categories_showrecipe)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_rating1_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_rating2_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_rating3_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_rating4_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_rating5_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(jButton_confirm_showrecipe)
                                .addGap(116, 116, 116)
                                .addComponent(jButton_close_showrecipe))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_rating_showrecipe)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollBar_description_showrecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ingredients_showrecipe)
                            .addComponent(jLabel_recipename_showrecipe))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel_recipename_showrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_persons_showrecipe)
                    .addComponent(jLabel_personsdisplay_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_preptime_showrecipe)
                    .addComponent(jLabel_preptimedisplay_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_difficulty_showrecipe)
                    .addComponent(jLabel_difficultydisplay_showrecipe))
                .addGap(28, 28, 28)
                .addComponent(jLabel_categories_showrecipe)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_category1_showrecipe)
                    .addComponent(jLabel_category2_showrecipe)
                    .addComponent(jLabel_category3_showrecipe))
                .addGap(31, 31, 31)
                .addComponent(jLabel_ingredients_showrecipe)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient1_showrecipe)
                    .addComponent(jLabel_ingredient1amount_showrecipe)
                    .addComponent(jLabel_ingredient1measure_showrecipe)
                    .addComponent(jLabel_ingredient6_showrecipe)
                    .addComponent(jLabel_ingredient6amount_showrecipe)
                    .addComponent(jLabel_ingredient6measure_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient2_showrecipe)
                    .addComponent(jLabel_ingredient7_showrecipe)
                    .addComponent(jLabel_ingredient7amount_showrecipe)
                    .addComponent(jLabel_ingredient7measure_showrecipe)
                    .addComponent(jLabel_ingredient2amount_showrecipe)
                    .addComponent(jLabel_ingredient2measure_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient8amount_showrecipe)
                    .addComponent(jLabel_ingredient8_showrecipe)
                    .addComponent(jLabel_ingredient8measure_showrecipe)
                    .addComponent(jLabel_ingredient3_showrecipe)
                    .addComponent(jLabel_ingredient3amount_showrecipe)
                    .addComponent(jLabel_ingredient3measure_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient9_showrecipe)
                    .addComponent(jLabel_ingredient9amount_showrecipe)
                    .addComponent(jLabel_ingredient4_showrecipe)
                    .addComponent(jLabel_ingredient9measure_showrecipe)
                    .addComponent(jLabel_ingredient4amount_showrecipe)
                    .addComponent(jLabel_ingredient4measure_showrecipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ingredient5_showrecipe)
                    .addComponent(jLabel_ingredient5amount_showrecipe)
                    .addComponent(jLabel_ingredient5measure_showrecipe))
                .addGap(56, 56, 56)
                .addComponent(jLabel_preparation_showrecipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar_description_showrecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jLabel_rating_showrecipe)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_rating1_showrecipe)
                    .addComponent(jButton_rating2_showrecipe)
                    .addComponent(jButton_rating3_showrecipe)
                    .addComponent(jButton_rating4_showrecipe)
                    .addComponent(jButton_rating5_showrecipe)
                    .addComponent(jButton_confirm_showrecipe)
                    .addComponent(jButton_close_showrecipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_rating2_showrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rating2_showrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_rating2_showrecipeActionPerformed

    private void jButton_rating3_showrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rating3_showrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_rating3_showrecipeActionPerformed

    private void jButton_close_showrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_close_showrecipeActionPerformed
        this.setVisible(false);
        new JFrame_rsbi_recipetable().setVisible(true);
    }//GEN-LAST:event_jButton_close_showrecipeActionPerformed

    private void jButton_confirm_showrecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirm_showrecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_confirm_showrecipeActionPerformed

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
    private javax.swing.JButton jButton_confirm_showrecipe;
    private javax.swing.JButton jButton_rating1_showrecipe;
    private javax.swing.JButton jButton_rating2_showrecipe;
    private javax.swing.JButton jButton_rating3_showrecipe;
    private javax.swing.JButton jButton_rating4_showrecipe;
    private javax.swing.JButton jButton_rating5_showrecipe;
    private javax.swing.JLabel jLabel_categories_showrecipe;
    private javax.swing.JLabel jLabel_category1_showrecipe;
    private javax.swing.JLabel jLabel_category2_showrecipe;
    private javax.swing.JLabel jLabel_category3_showrecipe;
    private javax.swing.JLabel jLabel_difficulty_showrecipe;
    private javax.swing.JLabel jLabel_difficultydisplay_showrecipe;
    private javax.swing.JLabel jLabel_ingredient1_showrecipe;
    private javax.swing.JLabel jLabel_ingredient1amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient1measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient2_showrecipe;
    private javax.swing.JLabel jLabel_ingredient2amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient2measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient3_showrecipe;
    private javax.swing.JLabel jLabel_ingredient3amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient3measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient4_showrecipe;
    private javax.swing.JLabel jLabel_ingredient4amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient4measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient5_showrecipe;
    private javax.swing.JLabel jLabel_ingredient5amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient5measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient6_showrecipe;
    private javax.swing.JLabel jLabel_ingredient6amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient6measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient7_showrecipe;
    private javax.swing.JLabel jLabel_ingredient7amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient7measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient8_showrecipe;
    private javax.swing.JLabel jLabel_ingredient8amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient8measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredient9_showrecipe;
    private javax.swing.JLabel jLabel_ingredient9amount_showrecipe;
    private javax.swing.JLabel jLabel_ingredient9measure_showrecipe;
    private javax.swing.JLabel jLabel_ingredients_showrecipe;
    private javax.swing.JLabel jLabel_persons_showrecipe;
    private javax.swing.JLabel jLabel_personsdisplay_showrecipe;
    private javax.swing.JLabel jLabel_preparation_showrecipe;
    private javax.swing.JLabel jLabel_preptime_showrecipe;
    private javax.swing.JLabel jLabel_preptimedisplay_showrecipe;
    private javax.swing.JLabel jLabel_rating_showrecipe;
    private javax.swing.JLabel jLabel_recipename_showrecipe;
    private javax.swing.JScrollBar jScrollBar_description_showrecipe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_preparation_showrecipe;
    // End of variables declaration//GEN-END:variables
}

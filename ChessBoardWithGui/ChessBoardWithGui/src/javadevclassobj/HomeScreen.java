package javadevclassobj;

import java.awt.Color;

/**
 *
 * @author Max
 */
public class HomeScreen extends javax.swing.JFrame
{
    /**
     * Creates new form HomeScreen
     */
    public HomeScreen()
    {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(117, 117, 117));//sets
        //the specified background colour that is alligned to the sprites
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_probabilityCalculator = new javax.swing.JButton();
        btn_ReviewGames = new javax.swing.JButton();
        btnPlayerStats = new javax.swing.JButton();
        btn_PlayGame = new javax.swing.JButton();
        btn_ExitApplication = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AddDelPlayer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        HelpBTN = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(440, 400));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(117, 117, 117));

        btn_probabilityCalculator.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        btn_probabilityCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/CalcIcon.png"))); // NOI18N
        btn_probabilityCalculator.setText("Probability Calc");
        btn_probabilityCalculator.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_probabilityCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_probabilityCalculatorActionPerformed(evt);
            }
        });

        btn_ReviewGames.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        btn_ReviewGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/ReviewOldGamesIcon.png"))); // NOI18N
        btn_ReviewGames.setText("Review old games");
        btn_ReviewGames.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_ReviewGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReviewGamesActionPerformed(evt);
            }
        });

        btnPlayerStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PlayerStatsBars.png"))); // NOI18N
        btnPlayerStats.setText("Player stats");
        btnPlayerStats.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnPlayerStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayerStatsActionPerformed(evt);
            }
        });

        btn_PlayGame.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        btn_PlayGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/StartGameIcon.png"))); // NOI18N
        btn_PlayGame.setText("Play Game!");
        btn_PlayGame.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_PlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PlayGameActionPerformed(evt);
            }
        });

        btn_ExitApplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/ExitButtonIcon.png"))); // NOI18N
        btn_ExitApplication.setText("Exit");
        btn_ExitApplication.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ExitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitApplicationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("  1v1 Chess Game");
        jLabel2.setToolTipText("");

        AddDelPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PersonPicUpdateBG.png"))); // NOI18N
        AddDelPlayer.setText("Add/Delete Player");
        AddDelPlayer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        AddDelPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDelPlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_probabilityCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ReviewGames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlayerStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_ExitApplication))
                    .addComponent(btn_PlayGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(AddDelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_probabilityCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ReviewGames)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayerStats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddDelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_PlayGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ExitApplication))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/QueenFancyIconGreyBG.png"))); // NOI18N
        jLabel8.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(117, 117, 117));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PieceStringGreyBack.png"))); // NOI18N
        jPanel1.add(jLabel4);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PieceStringGreyBack.png"))); // NOI18N
        jPanel1.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PieceStringGreyBack.png"))); // NOI18N
        jPanel1.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PieceStringGreyBack.png"))); // NOI18N
        jPanel1.add(jLabel11);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/PieceStringGreyBack.png"))); // NOI18N
        jPanel1.add(jLabel12);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javadevclassobj/QueenFancyIconGreyBG.png"))); // NOI18N
        jLabel7.setToolTipText("");

        HelpBTN.setText("Help");
        HelpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpBTNActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(HelpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HelpBTN)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel1)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitApplicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ExitApplicationActionPerformed

    private void btn_PlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PlayGameActionPerformed
        new ChangePlayerName().setVisible(true); //Opens the selected JFrame
        this.dispose(); //Closes the current JFrame
    }//GEN-LAST:event_btn_PlayGameActionPerformed

    private void btnPlayerStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayerStatsActionPerformed
        new PlayerStats().setVisible(true); //Opens the selected JFrame
        this.dispose(); //Closes the current JFrame
    }//GEN-LAST:event_btnPlayerStatsActionPerformed

    private void btn_ReviewGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReviewGamesActionPerformed
        new ReviewGames().setVisible(true); //Opens the selected JFrame
        this.dispose(); //Closes the current JFrame
    }//GEN-LAST:event_btn_ReviewGamesActionPerformed

    private void btn_probabilityCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_probabilityCalculatorActionPerformed
        new RatingProbCalc().setVisible(true); //Opens the selected JFrame
        this.dispose(); //Closes the current JFrame
    }//GEN-LAST:event_btn_probabilityCalculatorActionPerformed

    private void AddDelPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDelPlayerActionPerformed
        new DeleteORAddNewPlayer().setVisible(true); //Opens the selected JFrame
        this.dispose(); //Closes the current JFrame
    }//GEN-LAST:event_AddDelPlayerActionPerformed

    private void HelpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpBTNActionPerformed
        new HelpFrame().setVisible(true); //Opens the selected JFrame
        this.dispose(); //Closes the current JFrame
    }//GEN-LAST:event_HelpBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() //Executed when the project is run
            {
                new HomeScreen().setVisible(true); //Opens the home Screen when the project is opened
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDelPlayer;
    private javax.swing.JButton HelpBTN;
    private javax.swing.JButton btnPlayerStats;
    private javax.swing.JButton btn_ExitApplication;
    private javax.swing.JButton btn_PlayGame;
    private javax.swing.JButton btn_ReviewGames;
    private javax.swing.JButton btn_probabilityCalculator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ergastirio2;

/**
 *
 * @author Lalik
 */
public class Ergastirio2_1 extends javax.swing.JFrame {

    /**
     * Creates new form Ergastirio2_1
     */
    public Ergastirio2_1() {
        initComponents();
        getRootPane().setDefaultButton(BEQUAL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        CALCBOX = new javax.swing.JTextField();
        BPOWER = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        BDOT = new javax.swing.JButton();
        BPLUS = new javax.swing.JButton();
        BMINUS = new javax.swing.JButton();
        BTIMES = new javax.swing.JButton();
        BDIVIDE = new javax.swing.JButton();
        BEQUAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("calculator");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        CALCBOX.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CALCBOX.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CALCBOX.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(CALCBOX, gridBagConstraints);

        BPOWER.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BPOWER.setForeground(new java.awt.Color(255, 0, 51));
        BPOWER.setText("POWER");
        BPOWER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPOWERActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BPOWER, gridBagConstraints);

        BC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BC.setForeground(new java.awt.Color(255, 51, 51));
        BC.setText("C");
        BC.setEnabled(false);
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BC, gridBagConstraints);

        B0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B0.setText("0");
        B0.setEnabled(false);
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B0, gridBagConstraints);

        B1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B1.setText("1");
        B1.setEnabled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B1, gridBagConstraints);

        B2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B2.setText("2");
        B2.setEnabled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B2, gridBagConstraints);

        B3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B3.setText("3");
        B3.setEnabled(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B3, gridBagConstraints);

        B4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B4.setText("4");
        B4.setEnabled(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B4, gridBagConstraints);

        B5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B5.setText("5");
        B5.setEnabled(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B5, gridBagConstraints);

        B6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B6.setText("6");
        B6.setEnabled(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B6, gridBagConstraints);

        B7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B7.setText("7");
        B7.setEnabled(false);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B7, gridBagConstraints);

        B8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B8.setText("8");
        B8.setEnabled(false);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B8, gridBagConstraints);

        B9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B9.setText("9");
        B9.setEnabled(false);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(B9, gridBagConstraints);

        BDOT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BDOT.setForeground(new java.awt.Color(255, 51, 51));
        BDOT.setText(".");
        BDOT.setEnabled(false);
        BDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDOTActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BDOT, gridBagConstraints);

        BPLUS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BPLUS.setForeground(new java.awt.Color(255, 51, 51));
        BPLUS.setText("+");
        BPLUS.setEnabled(false);
        BPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPLUSActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BPLUS, gridBagConstraints);

        BMINUS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BMINUS.setForeground(new java.awt.Color(255, 51, 51));
        BMINUS.setText("-");
        BMINUS.setEnabled(false);
        BMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMINUSActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BMINUS, gridBagConstraints);

        BTIMES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTIMES.setForeground(new java.awt.Color(255, 51, 51));
        BTIMES.setText("*");
        BTIMES.setEnabled(false);
        BTIMES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTIMESActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BTIMES, gridBagConstraints);

        BDIVIDE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BDIVIDE.setForeground(new java.awt.Color(255, 51, 51));
        BDIVIDE.setText("/");
        BDIVIDE.setEnabled(false);
        BDIVIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDIVIDEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BDIVIDE, gridBagConstraints);

        BEQUAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BEQUAL.setForeground(new java.awt.Color(255, 51, 51));
        BEQUAL.setText("=");
        BEQUAL.setEnabled(false);
        BEQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEQUALActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(BEQUAL, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPOWERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPOWERActionPerformed
        // TODO add your handling code here:
        if (BC.isEnabled())
        {
            BC.setEnabled(false);
            B0.setEnabled(false);
            B1.setEnabled(false);
            B2.setEnabled(false);
            B3.setEnabled(false);
            B4.setEnabled(false);
            B5.setEnabled(false);
            B6.setEnabled(false);
            B7.setEnabled(false);
            B8.setEnabled(false);
            B9.setEnabled(false);
            BDIVIDE.setEnabled(false);
            BDOT.setEnabled(false);
            BPLUS.setEnabled(false);
            BMINUS.setEnabled(false);
            BTIMES.setEnabled(false);
            BEQUAL.setEnabled(false);
            CALCBOX.setEnabled(false); 
        }
        else
        {
            BC.setEnabled(true);
            B0.setEnabled(true);
            B1.setEnabled(true);
            B2.setEnabled(true);
            B3.setEnabled(true);
            B4.setEnabled(true);
            B5.setEnabled(true);
            B6.setEnabled(true);
            B7.setEnabled(true);
            B8.setEnabled(true);
            B9.setEnabled(true);
            BDIVIDE.setEnabled(true);
            BDOT.setEnabled(true);
            BPLUS.setEnabled(true);
            BMINUS.setEnabled(true);
            BTIMES.setEnabled(true);
            BEQUAL.setEnabled(true);
            CALCBOX.setEnabled(true);
        }
    }//GEN-LAST:event_BPOWERActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "0");
    }//GEN-LAST:event_B0ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "3");
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "4");
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "5");
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "6");
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "7");
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "8");
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
         CALCBOX.setText(CALCBOX.getText()+ "9");
    }//GEN-LAST:event_B9ActionPerformed

    private void BDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDOTActionPerformed
        // TODO add your handling code here:
        if(DOTFLAG==false)
        {
            CALCBOX.setText(CALCBOX.getText()+ ".");
            DOTFLAG = true;
        }
    }//GEN-LAST:event_BDOTActionPerformed

    private void BPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPLUSActionPerformed
        // TODO add your handling code here:
        NUMBER1 = Double.valueOf(CALCBOX.getText());
        CALCBOX.setText("");
        DOTFLAG = false;
        SIGN = "add";  
    }//GEN-LAST:event_BPLUSActionPerformed

    private void BMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMINUSActionPerformed
        // TODO add your handling code here:
        NUMBER1 = Double.valueOf(CALCBOX.getText());
        CALCBOX.setText("");
        DOTFLAG = false;
        SIGN = "minus";  
    }//GEN-LAST:event_BMINUSActionPerformed

    private void BTIMESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTIMESActionPerformed
        // TODO add your handling code here:
        NUMBER1 = Double.valueOf(CALCBOX.getText());
        CALCBOX.setText("");
        DOTFLAG = false;
        SIGN = "times";  
    }//GEN-LAST:event_BTIMESActionPerformed

    private void BDIVIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDIVIDEActionPerformed
        // TODO add your handling code here:
        NUMBER1 = Double.valueOf(CALCBOX.getText());
        CALCBOX.setText("");
        DOTFLAG = false;
        SIGN = "divide";  
    }//GEN-LAST:event_BDIVIDEActionPerformed

    private void BEQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEQUALActionPerformed
        // TODO add your handling code here:
        String temp = CALCBOX.getText();
        if(temp.isEmpty())
        {
            if(NUMBER1 !=0)
            {
                CALCBOX.setText(String.valueOf(NUMBER1));
            }
            else if((NUMBER1==0))
            {
                CALCBOX.setText("0.0");
            }
        }
        else
        {
            NUMBER2 = Double.valueOf(temp);
            if(SIGN.contentEquals("add"))
            {
                RESULT = NUMBER1 + NUMBER2;
            
            }
            else if(SIGN.contentEquals("minus"))
            {
                RESULT = NUMBER1 - NUMBER2;
            }
            else if(SIGN.contentEquals("times"))
            {
                RESULT = NUMBER1 * NUMBER2;
            }
            else if(SIGN.contentEquals("divide"))
            {
                if(NUMBER2!=0)
                {
                    RESULT = NUMBER1 / NUMBER2;
                }
                else
                {
                    ERRORFLAG = true;
                }
            }
            if (ERRORFLAG==false)
            {
            RESULTTEXT = String.valueOf(RESULT);
            CALCBOX.setText(RESULTTEXT);
            }
            else
            {
                CALCBOX.setText("ERROR");
            }
        }
    }//GEN-LAST:event_BEQUALActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
        CALCBOX.setText("0");
        DOTFLAG=false;
        ERRORFLAG=false;
        NUMBER1=0;
        NUMBER2=0;
        RESULT=0;
    }//GEN-LAST:event_BCActionPerformed

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
            java.util.logging.Logger.getLogger(Ergastirio2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ergastirio2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ergastirio2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ergastirio2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ergastirio2_1().setVisible(true);
            }
        });
    }
    boolean DOTFLAG = false;
    double NUMBER1 =0;
    double NUMBER2 =0;
    double RESULT = 0;
    String SIGN = null;
    boolean ERRORFLAG = false;
    String RESULTTEXT = "                        ";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BC;
    private javax.swing.JButton BDIVIDE;
    private javax.swing.JButton BDOT;
    private javax.swing.JButton BEQUAL;
    private javax.swing.JButton BMINUS;
    private javax.swing.JButton BPLUS;
    private javax.swing.JButton BPOWER;
    private javax.swing.JButton BTIMES;
    private javax.swing.JTextField CALCBOX;
    // End of variables declaration//GEN-END:variables
}
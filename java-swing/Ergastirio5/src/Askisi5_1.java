/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lalik
 */ //den exw kanei to vima 10 to megalo
public class Askisi5_1 extends javax.swing.JFrame {

    /**
     * Creates new form Askisi5_1
     */
    public Askisi5_1() {
        initComponents();
        jLHotel.setText("To epilegmeno ksenodoxei einai to AL Arab");
        jLDetails.setText("Δεν έχει γίνει επιλογή πακέτου");
        jLRoom.setText("O epilegmenos tipos domatio einai mono");
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPHotels = new javax.swing.JPanel();
        jRBALArab = new javax.swing.JRadioButton();
        jRBHilton = new javax.swing.JRadioButton();
        jRBIceHotel = new javax.swing.JRadioButton();
        jPdetails = new javax.swing.JPanel();
        Breakfast = new javax.swing.JCheckBox();
        Dinner = new javax.swing.JCheckBox();
        ExtraTrip = new javax.swing.JCheckBox();
        jPRoom = new javax.swing.JPanel();
        jRBSingle = new javax.swing.JRadioButton();
        jRBDouble = new javax.swing.JRadioButton();
        jRBSuite = new javax.swing.JRadioButton();
        jBShowIcon = new javax.swing.JButton();
        jLRoomIcon = new javax.swing.JLabel();
        jPReport = new javax.swing.JPanel();
        jLHotel = new javax.swing.JLabel();
        jLRoom = new javax.swing.JLabel();
        jLDetails = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Holidays");

        buttonGroup1.add(jRBALArab);
        jRBALArab.setSelected(true);
        jRBALArab.setToolTipText("AL Arab Hotel");
        jRBALArab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotelBW.jpg"))); // NOI18N
        jRBALArab.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotel.jpg"))); // NOI18N
        jRBALArab.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotel.jpg"))); // NOI18N
        jRBALArab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotel.jpg"))); // NOI18N
        jRBALArab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBALArabItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRBHilton);
        jRBHilton.setToolTipText("Hilton Hotel");
        jRBHilton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotelBW.jpg"))); // NOI18N
        jRBHilton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotel.jpg"))); // NOI18N
        jRBHilton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotel.jpg"))); // NOI18N
        jRBHilton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotel.jpg"))); // NOI18N
        jRBHilton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBHiltonItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRBIceHotel);
        jRBIceHotel.setToolTipText("Ice Hotel");
        jRBIceHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotelBW.jpg"))); // NOI18N
        jRBIceHotel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotel.jpg"))); // NOI18N
        jRBIceHotel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotel.jpg"))); // NOI18N
        jRBIceHotel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotel.jpg"))); // NOI18N
        jRBIceHotel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBIceHotelItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPHotelsLayout = new javax.swing.GroupLayout(jPHotels);
        jPHotels.setLayout(jPHotelsLayout);
        jPHotelsLayout.setHorizontalGroup(
            jPHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHotelsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBIceHotel)
                    .addComponent(jRBHilton)
                    .addComponent(jRBALArab))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPHotelsLayout.setVerticalGroup(
            jPHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHotelsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jRBALArab)
                .addGap(33, 33, 33)
                .addComponent(jRBHilton)
                .addGap(44, 44, 44)
                .addComponent(jRBIceHotel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPHotels);

        jTabbedPane1.addTab("HOTELS", jScrollPane1);

        Breakfast.setText("Breakfast");
        Breakfast.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BreakfastItemStateChanged(evt);
            }
        });

        Dinner.setText("Dinner");
        Dinner.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DinnerItemStateChanged(evt);
            }
        });

        ExtraTrip.setText("Extra Trip");
        ExtraTrip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ExtraTripItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPdetailsLayout = new javax.swing.GroupLayout(jPdetails);
        jPdetails.setLayout(jPdetailsLayout);
        jPdetailsLayout.setHorizontalGroup(
            jPdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdetailsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExtraTrip)
                    .addComponent(Dinner)
                    .addComponent(Breakfast))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPdetailsLayout.setVerticalGroup(
            jPdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdetailsLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Breakfast)
                .addGap(42, 42, 42)
                .addComponent(Dinner)
                .addGap(41, 41, 41)
                .addComponent(ExtraTrip)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DETAILS", jPdetails);

        buttonGroup2.add(jRBSingle);
        jRBSingle.setSelected(true);
        jRBSingle.setText("Single");
        jRBSingle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBSingleItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRBDouble);
        jRBDouble.setText("Double");
        jRBDouble.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBDoubleItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRBSuite);
        jRBSuite.setText("Suite");
        jRBSuite.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBSuiteItemStateChanged(evt);
            }
        });

        jBShowIcon.setText("Show Icon");
        jBShowIcon.setToolTipText("Parousiasi tis eikonas domatiou tou epolegmenou ksenodoxeiou");

        jLRoomIcon.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPRoomLayout = new javax.swing.GroupLayout(jPRoom);
        jPRoom.setLayout(jPRoomLayout);
        jPRoomLayout.setHorizontalGroup(
            jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRoomLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBSuite)
                    .addComponent(jRBDouble)
                    .addComponent(jRBSingle))
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRoomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRoomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBShowIcon))
                .addGap(142, 142, 142))
        );
        jPRoomLayout.setVerticalGroup(
            jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRoomLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jRBSingle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBShowIcon)
                .addGap(25, 25, 25)
                .addComponent(jRBDouble)
                .addGap(44, 44, 44)
                .addComponent(jRBSuite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLRoomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        jTabbedPane1.addTab("ROOM", jPRoom);

        jLHotel.setText("jLabel2");

        jLRoom.setText("jLabel3");

        jLDetails.setText("jLabel4");

        javax.swing.GroupLayout jPReportLayout = new javax.swing.GroupLayout(jPReport);
        jPReport.setLayout(jPReportLayout);
        jPReportLayout.setHorizontalGroup(
            jPReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReportLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDetails)
                    .addComponent(jLRoom)
                    .addComponent(jLHotel))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPReportLayout.setVerticalGroup(
            jPReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReportLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLHotel)
                .addGap(51, 51, 51)
                .addComponent(jLRoom)
                .addGap(48, 48, 48)
                .addComponent(jLDetails)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("REPORT", jPReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBALArabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBALArabItemStateChanged
        jLHotel.setText("To epilegmeno ksenodoxeio einai to Arab");
    }//GEN-LAST:event_jRBALArabItemStateChanged

    private void jRBHiltonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBHiltonItemStateChanged
       jLHotel.setText("To epilegmeno ksenodoxeio einai to Hilton");
    }//GEN-LAST:event_jRBHiltonItemStateChanged

    private void jRBIceHotelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBIceHotelItemStateChanged
         jLHotel.setText("To epilegmeno ksenodoxeio einai to Ice Hotel");
    }//GEN-LAST:event_jRBIceHotelItemStateChanged

    private void BreakfastItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BreakfastItemStateChanged
        String infodetails = "";
        if(Breakfast.isSelected())
            infodetails += "Breakfast ";
        if(Dinner.isSelected())
            infodetails += "Dinner ";
        if(ExtraTrip.isSelected())
            infodetails += "ExtraTrip ";
        jLDetails.setText("Epilogi paketou: " + infodetails);
    }//GEN-LAST:event_BreakfastItemStateChanged

    private void DinnerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DinnerItemStateChanged
         String infodetails = "";
        if(Breakfast.isSelected())
            infodetails += "Breakfast ";
        if(Dinner.isSelected())
            infodetails += "Dinner ";
        if(ExtraTrip.isSelected())
            infodetails += "ExtraTrip ";
        jLDetails.setText("Epilogi paketou: " + infodetails);
    }//GEN-LAST:event_DinnerItemStateChanged

    private void ExtraTripItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ExtraTripItemStateChanged
        String infodetails = "";
        if(Breakfast.isSelected())
            infodetails += "Breakfast ";
        if(Dinner.isSelected())
            infodetails += "Dinner ";
        if(ExtraTrip.isSelected())
            infodetails += "ExtraTrip ";
        jLDetails.setText("Epilogi paketou: " + infodetails);
    }//GEN-LAST:event_ExtraTripItemStateChanged

    private void jRBSingleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBSingleItemStateChanged
        jLRoom.setText("O epilegmenos tipos domatio einai mono");
    }//GEN-LAST:event_jRBSingleItemStateChanged

    private void jRBDoubleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBDoubleItemStateChanged
        jLRoom.setText("O epilegmenos tipos domatio einai diplo");
    }//GEN-LAST:event_jRBDoubleItemStateChanged

    private void jRBSuiteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBSuiteItemStateChanged
         jLRoom.setText("O epilegmenos tipos domatio einai souita");
    }//GEN-LAST:event_jRBSuiteItemStateChanged

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
            java.util.logging.Logger.getLogger(Askisi5_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Askisi5_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Askisi5_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Askisi5_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Askisi5_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Breakfast;
    private javax.swing.JCheckBox Dinner;
    private javax.swing.JCheckBox ExtraTrip;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBShowIcon;
    private javax.swing.JLabel jLDetails;
    private javax.swing.JLabel jLHotel;
    private javax.swing.JLabel jLRoom;
    private javax.swing.JLabel jLRoomIcon;
    private javax.swing.JPanel jPHotels;
    private javax.swing.JPanel jPReport;
    private javax.swing.JPanel jPRoom;
    private javax.swing.JPanel jPdetails;
    private javax.swing.JRadioButton jRBALArab;
    private javax.swing.JRadioButton jRBDouble;
    private javax.swing.JRadioButton jRBHilton;
    private javax.swing.JRadioButton jRBIceHotel;
    private javax.swing.JRadioButton jRBSingle;
    private javax.swing.JRadioButton jRBSuite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

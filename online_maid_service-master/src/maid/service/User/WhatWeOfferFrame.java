/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maid.service.User;

import maid.service.LoginFrame;

/**
 *
 * @author hasib
 */
public class WhatWeOfferFrame extends javax.swing.JFrame {

    /**
     * Creates new form WhatWeOffer
     */
    public WhatWeOfferFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        whatweofferbutton = new javax.swing.JButton();
        whyusbutton = new javax.swing.JButton();
        homebuttonforgotframe = new javax.swing.JButton();
        contactus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cookbutton = new javax.swing.JToggleButton();
        babysitterbutton = new javax.swing.JToggleButton();
        carebutton = new javax.swing.JToggleButton();
        housemaidbutton = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        whatweofferbutton.setBackground(new java.awt.Color(0, 204, 255));
        whatweofferbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        whatweofferbutton.setText("What we offer");
        whatweofferbutton.setBorder(new javax.swing.border.MatteBorder(null));
        whatweofferbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatweofferbuttonActionPerformed(evt);
            }
        });

        whyusbutton.setBackground(new java.awt.Color(0, 204, 255));
        whyusbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        whyusbutton.setText("Why us");
        whyusbutton.setBorder(new javax.swing.border.MatteBorder(null));
        whyusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whyusbuttonActionPerformed(evt);
            }
        });

        homebuttonforgotframe.setBackground(new java.awt.Color(0, 204, 255));
        homebuttonforgotframe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        homebuttonforgotframe.setText("Home");
        homebuttonforgotframe.setBorder(new javax.swing.border.MatteBorder(null));
        homebuttonforgotframe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonforgotframeActionPerformed(evt);
            }
        });

        contactus.setBackground(new java.awt.Color(0, 204, 255));
        contactus.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        contactus.setText("Contact us");
        contactus.setBorder(new javax.swing.border.MatteBorder(null));
        contactus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jButton2.setText("Logout");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(homebuttonforgotframe)
                .addGap(18, 18, 18)
                .addComponent(whatweofferbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(whyusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(whatweofferbutton)
                        .addComponent(whyusbutton)
                        .addComponent(homebuttonforgotframe)
                        .addComponent(contactus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cookbutton.setBackground(new java.awt.Color(0, 255, 255));
        cookbutton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cookbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon2.png"))); // NOI18N
        cookbutton.setText("Cook");
        cookbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cookbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookbuttonActionPerformed(evt);
            }
        });

        babysitterbutton.setBackground(new java.awt.Color(0, 255, 255));
        babysitterbutton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        babysitterbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon3.png"))); // NOI18N
        babysitterbutton.setText("Baby Sitters");
        babysitterbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        babysitterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                babysitterbuttonActionPerformed(evt);
            }
        });

        carebutton.setBackground(new java.awt.Color(0, 255, 255));
        carebutton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        carebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon4.png"))); // NOI18N
        carebutton.setText("Senior Citizen Care");
        carebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carebuttonActionPerformed(evt);
            }
        });

        housemaidbutton.setBackground(new java.awt.Color(0, 255, 255));
        housemaidbutton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        housemaidbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon1.png"))); // NOI18N
        housemaidbutton.setText("Housemaid");
        housemaidbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        housemaidbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housemaidbuttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Maid");

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Service");

        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 204));
        jLabel11.setText("The new way to hire a trusted maid");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(cookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(babysitterbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(housemaidbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(babysitterbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housemaidbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(463, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void whatweofferbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatweofferbuttonActionPerformed
        // TODO add your handling code here:
        WhatWeOfferFrame wf = new WhatWeOfferFrame();
        wf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_whatweofferbuttonActionPerformed

    private void whyusbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whyusbuttonActionPerformed
        // TODO add your handling code here:
        WhyUsFrame wf = new WhyUsFrame();
        wf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_whyusbuttonActionPerformed

    private void cookbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookbuttonActionPerformed

    private void babysitterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_babysitterbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_babysitterbuttonActionPerformed

    private void carebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carebuttonActionPerformed

    private void housemaidbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housemaidbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_housemaidbuttonActionPerformed

    private void homebuttonforgotframeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonforgotframeActionPerformed
        // TODO add your handling code here:
        LoginUser lu = new LoginUser();
        lu.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_homebuttonforgotframeActionPerformed

    private void contactusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusActionPerformed
        // TODO add your handling code here:
        ContactUsFrame cf = new ContactUsFrame();
        cf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_contactusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(WhatWeOfferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhatWeOfferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhatWeOfferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhatWeOfferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WhatWeOfferFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton babysitterbutton;
    private javax.swing.JToggleButton carebutton;
    private javax.swing.JButton contactus;
    private javax.swing.JToggleButton cookbutton;
    private javax.swing.JButton homebuttonforgotframe;
    private javax.swing.JToggleButton housemaidbutton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton whatweofferbutton;
    private javax.swing.JButton whyusbutton;
    // End of variables declaration//GEN-END:variables
}

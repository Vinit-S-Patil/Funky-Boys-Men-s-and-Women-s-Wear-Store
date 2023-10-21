import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class help extends javax.swing.JFrame {

    int x_loc,y_loc;
    public help() {
        initComponents();
        setLocationRelativeTo(null);
        menu_btn.setBorder(null);
        menu_btn.setBorderPainted(false);
        menu_btn.setContentAreaFilled(false);
        menu_btn.setOpaque(false);
        
        menu_pnl.setVisible(false);
        menu_pnl.setBackground(new Color(1, 1, 1,130));
        info_pnl.setVisible(false);
        info_pnl.setBackground(new Color(1, 1, 1,130));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu_pnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menu_btn = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        info_pnl = new javax.swing.JPanel();
        info_leb = new javax.swing.JLabel();
        leb1 = new javax.swing.JLabel();
        leb2 = new javax.swing.JLabel();
        leb3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_pnl.setBackground(new java.awt.Color(0, 0, 0));
        menu_pnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contact_us.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insta_icon.png"))); // NOI18N
        jLabel5.setText("jLabel4");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gmail-icon.png"))); // NOI18N
        jLabel6.setText("jLabel4");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout menu_pnlLayout = new javax.swing.GroupLayout(menu_pnl);
        menu_pnl.setLayout(menu_pnlLayout);
        menu_pnlLayout.setHorizontalGroup(
            menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_pnlLayout.setVerticalGroup(
            menu_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_pnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel1.add(menu_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        menu_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        menu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btnActionPerformed(evt);
            }
        });
        jPanel1.add(menu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 0, 30, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 30));

        info_pnl.setBackground(new java.awt.Color(255, 255, 255));

        info_leb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        info_leb.setForeground(new java.awt.Color(255, 255, 255));
        info_leb.setText("Contact Us");

        leb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        leb1.setForeground(new java.awt.Color(255, 255, 255));
        leb1.setText("Shubham Patil");

        leb2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        leb2.setForeground(new java.awt.Color(255, 255, 255));
        leb2.setText("9960262933");

        leb3.setForeground(new java.awt.Color(255, 255, 255));
        leb3.setText("Branch of NextTech Infosystem Shirpur ");
        leb3.setToolTipText("");
        leb3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout info_pnlLayout = new javax.swing.GroupLayout(info_pnl);
        info_pnl.setLayout(info_pnlLayout);
        info_pnlLayout.setHorizontalGroup(
            info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_pnlLayout.createSequentialGroup()
                        .addGroup(info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(info_pnlLayout.createSequentialGroup()
                                .addComponent(leb1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(leb2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(info_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addComponent(leb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        info_pnlLayout.setVerticalGroup(
            info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_pnlLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(info_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leb1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leb2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(leb3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jPanel1.add(info_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 330, 410));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 673, 673));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btnActionPerformed
        if(menu_btn.isSelected()){
            menu_pnl.show();
        }
        else{
            menu_pnl.setVisible(false);
        }
    }//GEN-LAST:event_menu_btnActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        
        info_leb.setText("Contact US");
        leb1.setText("Shubham Patil");
        leb2.setText("9960262933");
        leb3.setText("Branch of NextTech Infosystem Shirpur ");
        info_pnl.show();
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        info_pnl.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        info_leb.setText("Follow US");
        leb1.setText("User ID");
        leb2.setText("boss_patil");        
        leb3.setText("by clicking you can directly connect to us on Instagram");
        info_pnl.show();
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        info_pnl.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/boss_patil/").toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(help.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(help.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(help.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        info_leb.setText("Mail US");
        leb1.setText("E mail ID");
        leb3.setText("patil.shubham1212@gmail.com");        
        leb2.setText("");
        info_pnl.show();
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        info_pnl.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseExited

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info_leb;
    private javax.swing.JPanel info_pnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leb1;
    private javax.swing.JLabel leb2;
    private javax.swing.JLabel leb3;
    private javax.swing.JToggleButton menu_btn;
    private javax.swing.JPanel menu_pnl;
    // End of variables declaration//GEN-END:variables
}

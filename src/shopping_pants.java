
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class shopping_pants extends javax.swing.JFrame {

    public static Image img1;
    public static ImageIcon get_path;    
    
    String size;
    
    int admin_balance;
    
    Statement stmt = null;
    ResultSet rs =null;
    Connection con = null;
    PreparedStatement pst = null;
    
    public shopping_pants() {
        initComponents();
        setLocationRelativeTo(null);
        
        con = connect_database.join_database();
        
        get_path = new ImageIcon(Toolkit.getDefaultToolkit().getImage(pants_info.img_path));
        img1 = get_path.getImage();
        img1 = img1.getScaledInstance(photo_leb.getWidth(), photo_leb.getHeight(),Image.SCALE_SMOOTH);
        photo_leb.setIcon(new ImageIcon(img1));   
        
        pants_name.setText(pants_info.shirt_name);
        ammount_leb.setText(pants_info.price);
        
        try {
            stmt = con.createStatement();
            rs =  stmt.executeQuery("select * from  profile_table where user_id = 'admin'");
            if(rs.next()){
                admin_balance = Integer.parseInt(rs.getString("balance"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(shopping_pants.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        photo_leb = new javax.swing.JLabel();
        s = new javax.swing.JButton();
        M = new javax.swing.JButton();
        x = new javax.swing.JButton();
        xl = new javax.swing.JButton();
        xxl = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ammount_leb = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        pants_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        photo_leb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s.setBackground(new java.awt.Color(255, 255, 255));
        s.setText("30");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        M.setBackground(new java.awt.Color(255, 255, 255));
        M.setText("32");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setText("34");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        xl.setBackground(new java.awt.Color(255, 255, 255));
        xl.setText("36");
        xl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlActionPerformed(evt);
            }
        });

        xxl.setBackground(new java.awt.Color(255, 255, 255));
        xxl.setText("40");
        xxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxlActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Price");

        ammount_leb.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ammount_leb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ammount_leb.setText("100");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton6.setText("Buy");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        pants_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pants_name.setText("Mens_tshirt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(xl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(xxl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(photo_leb, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(pants_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(74, 74, 74))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ammount_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(photo_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pants_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s)
                    .addComponent(M)
                    .addComponent(x)
                    .addComponent(xl)
                    .addComponent(xxl))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ammount_leb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        size = s.getText();
    }//GEN-LAST:event_sActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        size = M.getText();
    }//GEN-LAST:event_MActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        size = x.getText();
    }//GEN-LAST:event_xActionPerformed

    private void xlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlActionPerformed
        size = xl.getText();
    }//GEN-LAST:event_xlActionPerformed

    private void xxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxlActionPerformed
        size = xxl.getText();
    }//GEN-LAST:event_xxlActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if(size.equals("")){
            size = "30";
        }
        
        try {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");            
            
            pst = con.prepareStatement("insert into history(user_id,price,size,product_info,date_given) values('"+Log_in.id+"','"+pants_info.price+"','"+size+"','"+pants_name.getText()+"','"+sdf.format(d)+"')");
            pst.executeUpdate();
            
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from profile_table where user_id = 'admin'");
            if(rs.next()){
                shopping.admin_balance = Integer.parseInt(rs.getString("balance"));
            }
            
            admin_balance = shopping.admin_balance + Integer.parseInt(ammount_leb.getText());
            pst = con.prepareStatement("update profile_table set balance = ? where user_id = 'admin'");
            pst.setString(1, ""+admin_balance);
            pst.execute();            
            
            Log_in.bal = ""+(Integer.parseInt(Log_in.bal) - Integer.parseInt(ammount_leb.getText()));
            
            pst = con.prepareStatement("update profile_table set balance = ? where user_id = '"+Log_in.id+"'");
            pst.setString(1,Log_in.bal);
            pst.execute();
            
            main_frame.bal_prin_leb.setText(Log_in.bal);
            
            JOptionPane.showMessageDialog(null,"Your Balance;- "+ Log_in.bal);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(shopping.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton M;
    private javax.swing.JLabel ammount_leb;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pants_name;
    private javax.swing.JLabel photo_leb;
    private javax.swing.JButton s;
    private javax.swing.JButton x;
    private javax.swing.JButton xl;
    private javax.swing.JButton xxl;
    // End of variables declaration//GEN-END:variables
}

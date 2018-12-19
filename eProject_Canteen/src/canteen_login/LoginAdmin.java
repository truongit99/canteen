package canteen_login;

import canteen_connection.Connect;
import canteen_encrypt.EncryptSHA1;
import canteen_main.AdminMain;
import canteen_main.EmployeesMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginAdmin extends javax.swing.JFrame {    
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public LoginAdmin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        leftBackground = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        textFieldUserName = new javax.swing.JTextField();
        seperatorUserName = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JPasswordField();
        seperatorPassword = new javax.swing.JSeparator();
        iconUserName = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
        buttonCancel = new keeptoo.KButton();
        buttonLogIn = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập tài khoản");

        jPanel1.setBackground(new java.awt.Color(186, 249, 174));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/header_logo.png"))); // NOI18N
        jPanel2.add(logo);
        logo.setBounds(70, 170, 260, 270);

        leftBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/034 Lemon Gate.png"))); // NOI18N
        jPanel2.add(leftBackground);
        leftBackground.setBounds(0, 0, 420, 610);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 420, 610);

        jPanel3.setBackground(new java.awt.Color(186, 249, 174));

        labelTitle.setFont(new java.awt.Font("Times New Roman", 0, 32)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 51, 153));
        labelTitle.setText("Canteen");

        labelUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(102, 102, 102));
        labelUserName.setText("User Name");

        textFieldUserName.setBackground(new java.awt.Color(186, 249, 174));
        textFieldUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textFieldUserName.setBorder(null);

        labelPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(102, 102, 102));
        labelPassword.setText("Password");

        textFieldPassword.setBackground(new java.awt.Color(186, 249, 174));
        textFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textFieldPassword.setBorder(null);
        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });

        iconUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/User_32px.png"))); // NOI18N

        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Key 2_32px.png"))); // NOI18N

        buttonCancel.setForeground(new java.awt.Color(0, 0, 0));
        buttonCancel.setText("Exit");
        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCancel.setkBackGroundColor(new java.awt.Color(0, 204, 102));
        buttonCancel.setkBorderRadius(50);
        buttonCancel.setkEndColor(new java.awt.Color(102, 255, 153));
        buttonCancel.setkForeGround(new java.awt.Color(0, 0, 0));
        buttonCancel.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        buttonCancel.setkHoverStartColor(new java.awt.Color(0, 153, 102));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonLogIn.setForeground(new java.awt.Color(0, 0, 0));
        buttonLogIn.setText("Log In");
        buttonLogIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLogIn.setkBackGroundColor(new java.awt.Color(0, 204, 102));
        buttonLogIn.setkBorderRadius(50);
        buttonLogIn.setkEndColor(new java.awt.Color(102, 255, 153));
        buttonLogIn.setkForeGround(new java.awt.Color(0, 0, 0));
        buttonLogIn.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        buttonLogIn.setkHoverStartColor(new java.awt.Color(0, 153, 102));
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(iconUserName))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconPassword)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelUserName)
                            .addComponent(textFieldUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(seperatorUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(labelPassword)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(seperatorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(150, 150, 150))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelTitle)
                .addGap(64, 64, 64)
                .addComponent(labelUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperatorUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(420, 0, 420, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswordActionPerformed

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        // TODO add your handling code here:
        try {
        String username = textFieldUserName.getText();
        String password = EncryptSHA1.sha1(textFieldPassword.getText());
        
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Some field is empty", "Error", 1);
        } else {
                conn = Connect.getConnection();
                pst = conn.prepareStatement("select * from adminaccount where adminUserName=? and adminPassword=?");
                
                pst.setString(1, username);
                pst.setString(2, password);
                
                rs = pst.executeQuery();
                
                if (rs.next()) {
                    AdminMain adMain = new AdminMain();
                    
                    adMain.setVisible(true);
                    this.setVisible(false);
                    
                    
                } else {
                    JOptionPane.showMessageDialog(this, "User Name or Password is wrong", "Error", 1);
                }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 1);
        }
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton buttonCancel;
    private keeptoo.KButton buttonLogIn;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel leftBackground;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator seperatorPassword;
    private javax.swing.JSeparator seperatorUserName;
    private javax.swing.JPasswordField textFieldPassword;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables
}

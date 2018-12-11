package canteen_login;

import canteen_main.Main;

public class LoginUser extends javax.swing.JFrame {    
    
    public LoginUser() {
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
        txtFieldUserName = new javax.swing.JTextField();
        seperatorUserName = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        txtFieldPassword = new javax.swing.JPasswordField();
        seperatorPassword = new javax.swing.JSeparator();
        iconUserName = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
>>>>>>> parent of de64758... done design

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập tài khoản");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/header_logo.png"))); // NOI18N
        jPanel2.add(logo);
        logo.setBounds(70, 170, 260, 270);

        leftBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/034 Lemon Gate.png"))); // NOI18N
        jPanel2.add(leftBackground);
        leftBackground.setBounds(0, 0, 420, 610);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 420, 630);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        labelTitle.setFont(new java.awt.Font("Times New Roman", 0, 32)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 51, 153));
        labelTitle.setText("Quản Lý Canteen");

        labelUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelUserName.setText("Tài Khoản");

        txtFieldUserName.setBackground(new java.awt.Color(204, 255, 204));
        txtFieldUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFieldUserName.setBorder(null);

        labelPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPassword.setText("Mật Khẩu");

        txtFieldPassword.setBackground(new java.awt.Color(204, 255, 204));
        txtFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFieldPassword.setBorder(null);

        iconUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/User_32px.png"))); // NOI18N

        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Key 2_32px.png"))); // NOI18N

<<<<<<< HEAD
=======
        kButton1.setForeground(new java.awt.Color(0, 0, 0));
        kButton1.setText("Thoát");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kButton1.setkBorderRadius(50);
        kButton1.setkEndColor(new java.awt.Color(102, 255, 204));
        kButton1.setkStartColor(new java.awt.Color(0, 255, 153));

        kButton2.setForeground(new java.awt.Color(0, 0, 0));
        kButton2.setText("Đăng Nhập");
        kButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kButton2.setkBorderRadius(50);
        kButton2.setkEndColor(new java.awt.Color(102, 255, 153));

>>>>>>> parent of de64758... done design
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(txtFieldUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(seperatorUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(labelPassword)
                    .addComponent(txtFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(seperatorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(95, 95, 95))
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 83, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
>>>>>>> parent of de64758... done design
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelTitle)
                .addGap(66, 66, 66)
                .addComponent(labelUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperatorUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addContainerGap(272, Short.MAX_VALUE))
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
>>>>>>> parent of de64758... done design
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(420, 0, 430, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
<<<<<<< HEAD
=======
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
>>>>>>> parent of de64758... done design
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel leftBackground;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator seperatorPassword;
    private javax.swing.JSeparator seperatorUserName;
    private javax.swing.JPasswordField txtFieldPassword;
    private javax.swing.JTextField txtFieldUserName;
    // End of variables declaration//GEN-END:variables
}
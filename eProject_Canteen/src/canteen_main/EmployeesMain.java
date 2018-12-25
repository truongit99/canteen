/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_main;

import javax.swing.JPanel;
import canteen_login.LoginEmployee;

/**
 *
 * @author My Computer
 */
public class EmployeesMain extends javax.swing.JFrame {

    /**
     * Creates new form Trangchu
     */
    public EmployeesMain() {
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        bigLogo = new javax.swing.JLabel();
        logoBackground = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelLogOut = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Main");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(null);

        bigLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/banner.png"))); // NOI18N
        jPanel2.add(bigLogo);
        bigLogo.setBounds(220, 20, 840, 210);

        logoBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/051 February Ink.png"))); // NOI18N
        jPanel2.add(logoBackground);
        logoBackground.setBounds(1, 0, 1360, 250);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 250));

        mainMenu.setBackground(new java.awt.Color(255, 255, 255));
        mainMenu.setLayout(null);

        panelMenu.setBackground(new java.awt.Color(204, 255, 255));
        panelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMenuMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Food_96px.png"))); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        mainMenu.add(panelMenu);
        panelMenu.setBounds(91, 129, 240, 170);

        panelLogOut.setBackground(new java.awt.Color(204, 255, 255));
        panelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelLogOutMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Logout Rounded Left_96px.png"))); // NOI18N
        jLabel4.setText("Log Out");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelLogOutLayout = new javax.swing.GroupLayout(panelLogOut);
        panelLogOut.setLayout(panelLogOutLayout);
        panelLogOutLayout.setHorizontalGroup(
            panelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogOutLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(58, 58, 58))
        );
        panelLogOutLayout.setVerticalGroup(
            panelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        mainMenu.add(panelLogOut);
        panelLogOut.setBounds(1020, 129, 240, 170);

        panelBill.setBackground(new java.awt.Color(204, 255, 255));
        panelBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBillMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Purchase Order_96px.png"))); // NOI18N
        jLabel2.setText("Bill");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelBillLayout = new javax.swing.GroupLayout(panelBill);
        panelBill.setLayout(panelBillLayout);
        panelBillLayout.setHorizontalGroup(
            panelBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelBillLayout.setVerticalGroup(
            panelBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        mainMenu.add(panelBill);
        panelBill.setBounds(550, 130, 240, 170);

        menuBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/043 New York.png"))); // NOI18N
        mainMenu.add(menuBackground);
        menuBackground.setBounds(0, 0, 1360, 440);

        jPanel1.add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1360, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(panelMenu);
    }//GEN-LAST:event_panelMenuMouseEntered

    private void panelMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMouseExited
        // TODO add your handling code here:
        resetColor((panelMenu));
    }//GEN-LAST:event_panelMenuMouseExited

    private void panelBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBillMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(panelBill);
    }//GEN-LAST:event_panelBillMouseEntered

    private void panelBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBillMouseExited
        // TODO add your handling code here:
        resetColor(panelBill);
    }//GEN-LAST:event_panelBillMouseExited

    private void panelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogOutMouseEntered
        // TODO add your handling code here:
        setColorMouseEntered(panelLogOut);
    }//GEN-LAST:event_panelLogOutMouseEntered

    private void panelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogOutMouseExited
        // TODO add your handling code here:
        resetColor(panelLogOut);
    }//GEN-LAST:event_panelLogOutMouseExited

    private void panelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMouseClicked
        // TODO add your handling code here:
        setColorMouseClicked(panelMenu);
        
        
    }//GEN-LAST:event_panelMenuMouseClicked

    private void panelBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBillMouseClicked
        // TODO add your handling code here:
        setColorMouseClicked(panelBill);
    }//GEN-LAST:event_panelBillMouseClicked

    private void panelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLogOutMouseClicked
        // TODO add your handling code here:
        setColorMouseClicked(panelLogOut);
        this.dispose();
        LoginEmployee logEmp = new LoginEmployee();
        
        logEmp.setVisible(true);
    }//GEN-LAST:event_panelLogOutMouseClicked
public void setColorMouseEntered(JPanel panel){
    panel.setBackground(new java.awt.Color(153, 255, 255));
}

public void resetColor(JPanel panel){
    panel.setBackground(new java.awt.Color(204,255,255));
}

public void setColorMouseClicked(JPanel panel){
    panel.setBackground(new java.awt.Color(102,255,255));
}
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
            java.util.logging.Logger.getLogger(EmployeesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new EmployeesMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bigLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoBackground;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JLabel menuBackground;
    private javax.swing.JPanel panelBill;
    private javax.swing.JPanel panelLogOut;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}


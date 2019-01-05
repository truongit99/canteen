/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_products;

import canteen_connection.Connect;
import com.mysql.jdbc.MysqlDataTruncation;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class ProductEdit extends javax.swing.JFrame {

    Connection conn;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form NewJFrame
     */
    public ProductEdit() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        try {
                conn = Connect.getConnection();
                st = conn.createStatement();
                
                String s = "select * from productType";
                rs = st.executeQuery(s);
                
                while (rs.next()) {
                    comboBoxProductType.addItem(rs.getString("productType"));
                }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelProductName = new javax.swing.JLabel();
        textfieldProductName = new javax.swing.JTextField();
        separatorProductName = new javax.swing.JSeparator();
        labelProductCategory = new javax.swing.JLabel();
        separatorProductCategory = new javax.swing.JSeparator();
        labelProductPrice = new javax.swing.JLabel();
        textfieldProductPrice = new javax.swing.JTextField();
        buttonCancel = new keeptoo.KButton();
        buttonSave = new keeptoo.KButton();
        separatorProductPrice = new javax.swing.JSeparator();
        iconProductName = new javax.swing.JLabel();
        iconProductCategory = new javax.swing.JLabel();
        iconProductPrice = new javax.swing.JLabel();
        comboBoxProductType = new javax.swing.JComboBox<>();
        labelProductID = new javax.swing.JLabel();
        textfieldProductID = new javax.swing.JTextField();
        separatorProductID = new javax.swing.JSeparator();
        labelProductQuantity = new javax.swing.JLabel();
        textfieldProductQuantity = new javax.swing.JTextField();
        separatorProductQuantity = new javax.swing.JSeparator();
        iconProductCategory1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Food And Wine_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Edit product");

        labelProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProductName.setForeground(new java.awt.Color(153, 153, 153));
        labelProductName.setText("Product Name");

        textfieldProductName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textfieldProductName.setBorder(null);
        textfieldProductName.setOpaque(false);

        labelProductCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProductCategory.setForeground(new java.awt.Color(153, 153, 153));
        labelProductCategory.setText("Product Type");

        labelProductPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProductPrice.setForeground(new java.awt.Color(153, 153, 153));
        labelProductPrice.setText("Price");

        textfieldProductPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textfieldProductPrice.setBorder(null);
        textfieldProductPrice.setOpaque(false);

        buttonCancel.setText("Thoát");
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

        buttonSave.setText("Lưu");
        buttonSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSave.setkBackGroundColor(new java.awt.Color(0, 204, 102));
        buttonSave.setkBorderRadius(50);
        buttonSave.setkEndColor(new java.awt.Color(102, 255, 153));
        buttonSave.setkForeGround(new java.awt.Color(0, 0, 0));
        buttonSave.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        buttonSave.setkHoverStartColor(new java.awt.Color(0, 153, 102));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        iconProductName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Food And Wine_32px.png"))); // NOI18N

        iconProductCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Category_32px.png"))); // NOI18N

        iconProductPrice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Expensive Price _32px.png"))); // NOI18N

        comboBoxProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Product Type ---" }));

        labelProductID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProductID.setForeground(new java.awt.Color(153, 153, 153));
        labelProductID.setText("ProductID");

        textfieldProductID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textfieldProductID.setBorder(null);
        textfieldProductID.setEnabled(false);
        textfieldProductID.setOpaque(false);

        labelProductQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProductQuantity.setForeground(new java.awt.Color(153, 153, 153));
        labelProductQuantity.setText("Quantity");

        textfieldProductQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textfieldProductQuantity.setBorder(null);
        textfieldProductQuantity.setOpaque(false);

        iconProductCategory1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Counter_32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(iconProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iconProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconProductCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(separatorProductPrice)
                                    .addComponent(labelProductID)
                                    .addComponent(textfieldProductName)
                                    .addComponent(labelProductName)
                                    .addComponent(separatorProductName)
                                    .addComponent(separatorProductCategory)
                                    .addComponent(labelProductQuantity)
                                    .addComponent(separatorProductQuantity)
                                    .addComponent(textfieldProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                    .addComponent(separatorProductID)
                                    .addComponent(textfieldProductQuantity)
                                    .addComponent(labelProductCategory)
                                    .addComponent(labelProductPrice)
                                    .addComponent(textfieldProductPrice))))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProductCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProductQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfieldProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelProductPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        try {
            String productName = textfieldProductName.getText();
            String productPrice = textfieldProductPrice.getText();
            int productTypeID = comboBoxProductType.getSelectedIndex();
            String productID = textfieldProductID.getText();
            int quantity = Integer.parseInt(textfieldProductQuantity.getText());
            
            
        if (textfieldProductName.getText().trim().length() == 0 || textfieldProductPrice.getText().trim().length() == 0 || comboBoxProductType.getSelectedItem().toString().equals("--- Product Type ---") || textfieldProductQuantity.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Some field is empty", "Error", 1);
        } else {
                conn = Connect.getConnection();
                st = conn.createStatement();
                
                st.executeUpdate(String.format("UPDATE productMenu SET productName='%s', productTypeID='%d', quantity='%d', price='%s' WHERE productID = '%s';", productName, productTypeID, quantity, productPrice, productID));
                
                JOptionPane.showMessageDialog(this, "Product edited successfully", "Success", 1);
                
                this.dispose();
                ProductManage prodMng = new ProductManage();
                prodMng.setVisible(true);
        } 
        
        } catch (MysqlDataTruncation e) {
            JOptionPane.showMessageDialog(this, "One or some fields have wrong data type", "Error", 1); 
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 1);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ProductManage prodMng = new ProductManage();
        prodMng.setVisible(true);
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
            java.util.logging.Logger.getLogger(ProductEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ProductEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton buttonCancel;
    private keeptoo.KButton buttonSave;
    public javax.swing.JComboBox<String> comboBoxProductType;
    private javax.swing.JLabel iconProductCategory;
    private javax.swing.JLabel iconProductCategory1;
    private javax.swing.JLabel iconProductName;
    private javax.swing.JLabel iconProductPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel labelProductCategory;
    private javax.swing.JLabel labelProductID;
    private javax.swing.JLabel labelProductName;
    private javax.swing.JLabel labelProductPrice;
    private javax.swing.JLabel labelProductQuantity;
    private javax.swing.JSeparator separatorProductCategory;
    private javax.swing.JSeparator separatorProductID;
    private javax.swing.JSeparator separatorProductName;
    private javax.swing.JSeparator separatorProductPrice;
    private javax.swing.JSeparator separatorProductQuantity;
    public javax.swing.JTextField textfieldProductID;
    public javax.swing.JTextField textfieldProductName;
    public javax.swing.JTextField textfieldProductPrice;
    public javax.swing.JTextField textfieldProductQuantity;
    // End of variables declaration//GEN-END:variables
}
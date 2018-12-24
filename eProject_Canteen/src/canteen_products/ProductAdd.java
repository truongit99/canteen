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
public class ProductAdd extends javax.swing.JFrame {

    Connection conn;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form NewJFrame
     */
    public ProductAdd() {
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

    public boolean checkInput() {
        if (textfieldProductName.getText().trim().length() == 0
                || textfieldProductPrice.getText().trim().length() == 0
                || comboBoxProductType.getSelectedItem().toString().equals("--- Product Type ---")
                || textfieldProductQuantity.getText().trim().length() == 0)
                
            return false;
         else return true;
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
        labelProductQuantity = new javax.swing.JLabel();
        textfieldProductQuantity = new javax.swing.JTextField();
        separatorProductQuantity = new javax.swing.JSeparator();
        iconProductCategory1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add new product");

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Food And Wine_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Add new product");

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

        buttonCancel.setText("Cancel");
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

        buttonSave.setText("Add");
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iconProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(iconProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(iconProductCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfieldProductName)
                                    .addComponent(separatorProductName)
                                    .addComponent(separatorProductCategory)
                                    .addComponent(comboBoxProductType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelProductCategory)
                                            .addComponent(labelProductName))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textfieldProductQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                    .addComponent(labelProductQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separatorProductQuantity, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iconProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separatorProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addComponent(labelProductPrice)
                            .addComponent(textfieldProductPrice))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 192, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(168, 168, 168))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(labelProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelProductCategory)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(separatorProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelProductQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfieldProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelProductPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textfieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        try {
            String productName = textfieldProductName.getText();
            String productPrice = textfieldProductPrice.getText();
            int productTypeID = comboBoxProductType.getSelectedIndex();
            int productQuantity = Integer.parseInt(textfieldProductQuantity.getText());
            
        if (checkInput() == false) {
            JOptionPane.showMessageDialog(this, "Some field is empty", "Error", 1);
        } else {
                conn = Connect.getConnection();
                st = conn.createStatement();
                
                st.executeUpdate(String.format("insert into productMenu (productID, productName, productTypeID, quantity, price) VALUES (NULL, '%s', '%d', '%d', '%s')", productName, productTypeID, productQuantity, productPrice));
                
                JOptionPane.showMessageDialog(this, "Product added successfully", "Success", 1);
                
                this.dispose();
                ProductManage prodMng = new ProductManage();
                prodMng.setVisible(true);
                
        }
        } catch (MysqlDataTruncation e) {
            JOptionPane.showMessageDialog(this, "One or some fields have wrong data type", "Error", 1);
        }
        
        catch (Exception e) {
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
            java.util.logging.Logger.getLogger(ProductAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton buttonCancel;
    private keeptoo.KButton buttonSave;
    private javax.swing.JComboBox<String> comboBoxProductType;
    private javax.swing.JLabel iconProductCategory;
    private javax.swing.JLabel iconProductCategory1;
    private javax.swing.JLabel iconProductName;
    private javax.swing.JLabel iconProductPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel labelProductCategory;
    private javax.swing.JLabel labelProductName;
    private javax.swing.JLabel labelProductPrice;
    private javax.swing.JLabel labelProductQuantity;
    private javax.swing.JSeparator separatorProductCategory;
    private javax.swing.JSeparator separatorProductName;
    private javax.swing.JSeparator separatorProductPrice;
    private javax.swing.JSeparator separatorProductQuantity;
    private javax.swing.JTextField textfieldProductName;
    private javax.swing.JTextField textfieldProductPrice;
    private javax.swing.JTextField textfieldProductQuantity;
    // End of variables declaration//GEN-END:variables
}

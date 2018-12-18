/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_employees;

import canteen_connection.Connect;
import canteen_encrypt.EncryptSHA1;
import com.mysql.jdbc.MysqlDataTruncation;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EmployeeAdd extends javax.swing.JFrame {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn;
    Statement st;
    ResultSet rs;
    
    /**
     * Creates new form EmployeesDetail
     */
    public EmployeeAdd() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
            Date date = new Date();
            dateChooserEmployeeDOB.setDate(date);
            
    }

    public boolean checkInput() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        if (textFieldEmployeeUserName.getText().trim().length() == 0
                || textFieldEmployeeName.getText().trim().length() == 0
                || textFieldEmployeeAddress.getText().trim().length() == 0
                || textFieldEmployeePhoneNumber.getText().trim().length() == 0
                || textFieldEmployeePassword.getText().trim().length() == 0
                || (radioButtonMale.isSelected() == false && radioButtonFemale.isSelected() == false)
                || dateFormat.format(dateChooserEmployeeDOB.getDate()).trim().length() == 0) 
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

        buttonGroupSex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textFieldEmployeeUserName = new javax.swing.JTextField();
        labelEmployeeName = new javax.swing.JLabel();
        textFieldEmployeeName = new javax.swing.JTextField();
        separatorEmployeeName = new javax.swing.JSeparator();
        labelEmployeeSex = new javax.swing.JLabel();
        radioButtonMale = new javax.swing.JRadioButton();
        radioButtonFemale = new javax.swing.JRadioButton();
        labelUserName = new javax.swing.JLabel();
        separatorEmployeeDOB = new javax.swing.JSeparator();
        labelEmployeePhoneNumber = new javax.swing.JLabel();
        textFieldEmployeePhoneNumber = new javax.swing.JTextField();
        separatorEmployeePhoneNumber = new javax.swing.JSeparator();
        labelEmployeeAddress = new javax.swing.JLabel();
        textFieldEmployeeAddress = new javax.swing.JTextField();
        separatorEmployeeAddress = new javax.swing.JSeparator();
        buttonSave = new keeptoo.KButton();
        buttonCancel = new keeptoo.KButton();
        iconEmployeeDOB = new javax.swing.JLabel();
        iconEmployeeSex = new javax.swing.JLabel();
        iconEmployeePhoneNumber = new javax.swing.JLabel();
        iconEmployeeAddress = new javax.swing.JLabel();
        iconEmployeeName = new javax.swing.JLabel();
        dateChooserEmployeeDOB = new com.toedter.calendar.JDateChooser();
        labelEmployeeDOB1 = new javax.swing.JLabel();
        iconEmployeeUserName = new javax.swing.JLabel();
        separatorEmployeeUserName = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        iconEmployeePassword = new javax.swing.JLabel();
        separatorEmployeePassword = new javax.swing.JSeparator();
        textFieldEmployeePassword = new javax.swing.JPasswordField();
        backgroundEmployeeDetail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldEmployeeUserName.setBackground(new java.awt.Color(229, 238, 206));
        textFieldEmployeeUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldEmployeeUserName.setBorder(null);
        textFieldEmployeeUserName.setOpaque(false);
        jPanel1.add(textFieldEmployeeUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 230, 30));

        labelEmployeeName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEmployeeName.setForeground(new java.awt.Color(0, 153, 255));
        labelEmployeeName.setText("Employee Name");
        jPanel1.add(labelEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 30));

        textFieldEmployeeName.setBackground(new java.awt.Color(226, 240, 213));
        textFieldEmployeeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textFieldEmployeeName.setBorder(null);
        textFieldEmployeeName.setOpaque(false);
        jPanel1.add(textFieldEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, 30));
        jPanel1.add(separatorEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, 10));

        labelEmployeeSex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEmployeeSex.setForeground(new java.awt.Color(0, 153, 255));
        labelEmployeeSex.setText("Sex");
        jPanel1.add(labelEmployeeSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        radioButtonMale.setBackground(new java.awt.Color(232, 235, 197));
        buttonGroupSex.add(radioButtonMale);
        radioButtonMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButtonMale.setText("Male");
        jPanel1.add(radioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        radioButtonFemale.setBackground(new java.awt.Color(232, 235, 197));
        buttonGroupSex.add(radioButtonFemale);
        radioButtonFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioButtonFemale.setText("Female");
        jPanel1.add(radioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        labelUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(0, 153, 255));
        labelUserName.setText("User Name");
        jPanel1.add(labelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));
        jPanel1.add(separatorEmployeeDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 240, 10));

        labelEmployeePhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEmployeePhoneNumber.setForeground(new java.awt.Color(0, 153, 255));
        labelEmployeePhoneNumber.setText("Phone Number");
        jPanel1.add(labelEmployeePhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        textFieldEmployeePhoneNumber.setBackground(new java.awt.Color(232, 236, 200));
        textFieldEmployeePhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldEmployeePhoneNumber.setBorder(null);
        textFieldEmployeePhoneNumber.setOpaque(false);
        jPanel1.add(textFieldEmployeePhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 240, 30));
        jPanel1.add(separatorEmployeePhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 240, 20));

        labelEmployeeAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEmployeeAddress.setForeground(new java.awt.Color(0, 153, 255));
        labelEmployeeAddress.setText("Address");
        jPanel1.add(labelEmployeeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        textFieldEmployeeAddress.setBackground(new java.awt.Color(234, 234, 193));
        textFieldEmployeeAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldEmployeeAddress.setBorder(null);
        textFieldEmployeeAddress.setOpaque(false);
        jPanel1.add(textFieldEmployeeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 240, 30));
        jPanel1.add(separatorEmployeeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 240, 10));

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
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, -1, -1));

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
        jPanel1.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        iconEmployeeDOB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Calendar_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeeDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 40, 30));

        iconEmployeeSex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Gender_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeeSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 30));

        iconEmployeePhoneNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Number Pad_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeePhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, 30));

        iconEmployeeAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Marker_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 40, 30));

        iconEmployeeName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/User Male_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 30));

        dateChooserEmployeeDOB.setDateFormatString("yyyy-MM-dd");
        dateChooserEmployeeDOB.setOpaque(false);
        jPanel1.add(dateChooserEmployeeDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 220, 30));

        labelEmployeeDOB1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelEmployeeDOB1.setForeground(new java.awt.Color(0, 153, 255));
        labelEmployeeDOB1.setText("Date Of Birth");
        jPanel1.add(labelEmployeeDOB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        iconEmployeeUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/User_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeeUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 40, 30));
        jPanel1.add(separatorEmployeeUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 240, 10));

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(0, 153, 255));
        labelPassword.setText("Password");
        jPanel1.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        iconEmployeePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/Key 2_32px.png"))); // NOI18N
        jPanel1.add(iconEmployeePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 40, 30));
        jPanel1.add(separatorEmployeePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 240, 10));

        textFieldEmployeePassword.setBackground(new java.awt.Color(231, 236, 200));
        textFieldEmployeePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldEmployeePassword.setBorder(null);
        textFieldEmployeePassword.setOpaque(false);
        jPanel1.add(textFieldEmployeePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 240, 30));

        backgroundEmployeeDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteen_image/031 Blessing.png"))); // NOI18N
        jPanel1.add(backgroundEmployeeDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
            String empUserName = textFieldEmployeeUserName.getText();
        try {
            String empName = textFieldEmployeeName.getText();
            String empPhone = textFieldEmployeePhoneNumber.getText();
            String empAddress = textFieldEmployeeAddress.getText();
            String empPassword = textFieldEmployeePassword.getText();
            
            String empSex;
            if (radioButtonFemale.isSelected() == true ) 
                empSex = radioButtonFemale.getText();
            else empSex = radioButtonMale.getText();
            
            String empDOB = dateFormat.format(dateChooserEmployeeDOB.getDate());
            
            
        if (checkInput() == false) {
            JOptionPane.showMessageDialog(this, "Some field is empty", "Error", 1);
        } else {
                EncryptSHA1.sha1(empPassword);
                
                conn = Connect.getConnection();
                st = conn.createStatement();
                
                st.executeUpdate(String.format("INSERT INTO employee (employeeID, employeeName, employeeSex, employeeDOB, employeePhoneNumber, employeeAddress, employeeUserName, employeePassword) VALUES (NULL, '%s', '%s', '%s', '%s', '%s', '%s', '%s')", empName, empSex, empDOB, empPhone, empAddress, empUserName, empPassword));
                
                JOptionPane.showMessageDialog(this, "Employee added successfully", "Success", 1);
                
                this.dispose();
                EmployeeManage empMng = new EmployeeManage();
                empMng.setVisible(true);
                
        }
        } catch (MySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(this, "Username '"+empUserName+"' is not available", "Error", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 1);
            
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundEmployeeDetail;
    private keeptoo.KButton buttonCancel;
    private javax.swing.ButtonGroup buttonGroupSex;
    private keeptoo.KButton buttonSave;
    private com.toedter.calendar.JDateChooser dateChooserEmployeeDOB;
    private javax.swing.JLabel iconEmployeeAddress;
    private javax.swing.JLabel iconEmployeeDOB;
    private javax.swing.JLabel iconEmployeeName;
    private javax.swing.JLabel iconEmployeePassword;
    private javax.swing.JLabel iconEmployeePhoneNumber;
    private javax.swing.JLabel iconEmployeeSex;
    private javax.swing.JLabel iconEmployeeUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmployeeAddress;
    private javax.swing.JLabel labelEmployeeDOB1;
    private javax.swing.JLabel labelEmployeeName;
    private javax.swing.JLabel labelEmployeePhoneNumber;
    private javax.swing.JLabel labelEmployeeSex;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JRadioButton radioButtonFemale;
    private javax.swing.JRadioButton radioButtonMale;
    private javax.swing.JSeparator separatorEmployeeAddress;
    private javax.swing.JSeparator separatorEmployeeDOB;
    private javax.swing.JSeparator separatorEmployeeName;
    private javax.swing.JSeparator separatorEmployeePassword;
    private javax.swing.JSeparator separatorEmployeePhoneNumber;
    private javax.swing.JSeparator separatorEmployeeUserName;
    private javax.swing.JTextField textFieldEmployeeAddress;
    private javax.swing.JTextField textFieldEmployeeName;
    private javax.swing.JPasswordField textFieldEmployeePassword;
    private javax.swing.JTextField textFieldEmployeePhoneNumber;
    private javax.swing.JTextField textFieldEmployeeUserName;
    // End of variables declaration//GEN-END:variables
}

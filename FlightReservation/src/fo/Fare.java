/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fo;

import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mostafa Salem
 */
public class Fare extends javax.swing.JFrame {

    /**
     * Creates new form Fare
     */
    public Fare() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Amount");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(144, 210, 70, 19);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(232, 206, 139, 24);

        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 248, 70, 35);

        jButton2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Save");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(382, 248, 90, 35);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Cheque No.");
        jLabel3.setEnabled(false);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 90, 19);

        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(120, 90, 95, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Credit card No.");
        jLabel5.setEnabled(false);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(263, 88, 120, 19);

        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(391, 84, 160, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Credit Card type");
        jLabel6.setEnabled(false);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 125, 120, 19);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Master Card" }));
        jComboBox2.setEnabled(false);
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(392, 120, 159, 26);

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Client name");
        jLabel7.setEnabled(false);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 130, 90, 19);

        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(120, 130, 95, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Bank name");
        jLabel4.setEnabled(false);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 90, 19);

        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(120, 170, 95, 24);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 255, 255));
        jRadioButton1.setText("Cheque");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ar(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(189, 44, 80, 28);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 255, 255));
        jRadioButton2.setText("CreditCard");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ar(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(282, 44, 110, 28);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 255, 255));
        jRadioButton3.setText("Cash");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ar(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(393, 44, 80, 28);

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Payment Type");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 50, 110, 19);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(216, 6, 130, 32);

        jButton4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.setText("Main");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(83, 248, 70, 35);
        getContentPane().add(jl);
        jl.setBounds(0, 0, 560, 290);

        setSize(new java.awt.Dimension(576, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       reserve1 fd = new reserve1();
       this.setVisible(false);
       fd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ar
        if(jRadioButton1.isSelected())
        {
             jLabel3.setEnabled(true);
            jTextField2.setEnabled(true);
            jLabel7.setEnabled(true);
            jTextField5.setEnabled(true);
            jLabel4.setEnabled(true);
            jTextField3.setEnabled(true);
            
            jLabel5.setEnabled(false);
                jLabel6.setEnabled(false);
                jTextField4.setEnabled(false);
                jComboBox2.setEnabled(false);
        }
        else if(jRadioButton2.isSelected())
        {
              jLabel5.setEnabled(true);
                jLabel6.setEnabled(true);
                jTextField4.setEnabled(true);
                jComboBox2.setEnabled(true);
                
            jLabel3.setEnabled(false);
            jTextField2.setEnabled(false);
            jLabel7.setEnabled(false);
            jTextField5.setEnabled(false);
            jLabel4.setEnabled(false);
            jTextField3.setEnabled(false);
        }
        else if(jRadioButton3.isSelected()){
             jLabel5.setEnabled(false);
                jLabel6.setEnabled(false);
                jTextField4.setEnabled(false);
                jComboBox2.setEnabled(false);
                
            jLabel3.setEnabled(false);
            jTextField2.setEnabled(false);
            jLabel7.setEnabled(false);
            jTextField5.setEnabled(false);
            jLabel4.setEnabled(false);
            jTextField3.setEnabled(false);
        }
    }//GEN-LAST:event_ar

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        main s=new main();
        this.setVisible(false);
        s.setVisible(true);    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jRadioButton1.isSelected())
        {
            String t=jRadioButton1.getText();
            String des=jTextField1.getText();
            String con=jTextField2.getText();
            
        try {
                Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
               /* PreparedStatement d=c2.prepareStatement("insert into passenger (Fare_Type,Fare_Des,Comment) "
                    + "values(?,?,?)");*/
               PreparedStatement d=c2.prepareStatement("update passenger set Fare_Type=? ,Fare_Des=?,Cheque_Visa_No=? "
                    + " where Fare_Type is NULL ");
                d.setString(1,t);
                d.setString(2,des);
                d.setString(3,con);
                //d.setString(4,id);
                d.executeUpdate();
            }
        catch (SQLException ex) {
                Logger.getLogger(reserve1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(jRadioButton2.isSelected())
        {
           String t=jRadioButton2.getText();
            String des=jTextField1.getText();
            String con=jTextField4.getText();
        try {
                Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
                PreparedStatement d=c2.prepareStatement("update passenger set Fare_Type=? ,Fare_Des=?,Cheque_Visa_No=? "
                    + " where Fare_Type is NULL ");
                d.setString(1,t);
                d.setString(2,des);
                d.setString(3,con);
                //d.setString(4,id);
                d.executeUpdate();
            }
        catch (SQLException ex) {
                Logger.getLogger(reserve1.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        else if(jRadioButton3.isSelected())
        {
            String t=jRadioButton3.getText();
            String des=jTextField1.getText();
            
        try {
                Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
                PreparedStatement d=c2.prepareStatement("update passenger set Fare_Type=? ,Fare_Des=? "
                    + " where Fare_Type is NULL ");
                d.setString(1,t);
                d.setString(2,des);
                //d.setString(4,id);
                d.executeUpdate();
            }
        catch (SQLException ex) {
                Logger.getLogger(reserve1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         this.setLocationRelativeTo(null);
        try { 
            ImageIcon img = new ImageIcon(ImageIO.read(getClass().getResource("b8.jpg")).getScaledInstance(560,290, Image.SCALE_AREA_AVERAGING));
           jl.setIcon(img);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Fare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Fare().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jl;
    // End of variables declaration//GEN-END:variables
}

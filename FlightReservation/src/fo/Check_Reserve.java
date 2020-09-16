/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fo;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
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
public class Check_Reserve extends javax.swing.JFrame {

    /**
     * Creates new form Check_Reserve
     */
    public Check_Reserve() {
        initComponents();
        Connection c;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
            PreparedStatement d=c.prepareStatement("select * from Passenger");
            
            ResultSet res = d.executeQuery();
            DefaultTableModel t=new DefaultTableModel();
            t.addColumn("ID");
            t.addColumn("Passenger_Name");
            t.addColumn("age");
            t.addColumn("gender");
            t.addColumn("Adress");
            t.addColumn("Contact");
            t.addColumn("e-mail");
            t.addColumn("Office_ID");
            t.addColumn("Flight_No");
            t.addColumn("Fare_Type");
            t.addColumn("Fare_Des");
            t.addColumn("Cheque/Visa No");
            while(res.next())
            {
                String s[]={res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)
                ,res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getString(11),res.getString(12)};
                t.addRow(s);
            }
            jTable1.setModel(t);
        } catch (SQLException ex) {
            Logger.getLogger(Check_Reserve.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Reserved Tickets Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(244, 6, 230, 40);

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)), new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 2, true)));
        jTable1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 68, 707, 100);

        jButton1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(21, 394, 110, 40);

        jButton2.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jButton2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(603, 394, 110, 40);
        getContentPane().add(jl);
        jl.setBounds(0, 0, 720, 440);

        setSize(new java.awt.Dimension(736, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main m=new main();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String del_id=(String) jTable1.getValueAt( jTable1.getSelectedRow(), 0 );
        if(jTable1.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "No reservation is selected to delete","Error!", WIDTH);
        }else
        {
            try 
            {   
                /////////Delete From DataBase
                Connection  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
                PreparedStatement d=c.prepareStatement("delete from passenger where Id = ?");
                d.setString(1,del_id);
                d.executeUpdate();   
                /////////Delete Row from JTabel
                int modelIndex = jTable1.convertRowIndexToModel(jTable1.getSelectedRow()); 
                     DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                       model.removeRow(modelIndex);
            } catch (SQLException ex) {
                Logger.getLogger(Check_Reserve.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         this.setLocationRelativeTo(null);
        try { 
            ImageIcon img = new ImageIcon(ImageIO.read(getClass().getResource("f23.jpg")).getScaledInstance(720,440, Image.SCALE_AREA_AVERAGING));
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
            java.util.logging.Logger.getLogger(Check_Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Reserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jl;
    // End of variables declaration//GEN-END:variables
}

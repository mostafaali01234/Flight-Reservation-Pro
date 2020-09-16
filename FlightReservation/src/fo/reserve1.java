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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mostafa Salem
 */
public class reserve1 extends javax.swing.JFrame {

    /**
     * Creates new form reserve1
     */
    public reserve1() {
        initComponents();
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        
        try {
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
            PreparedStatement d2=c.prepareStatement("Select Office_Id from booking_office");
            ResultSet rs = d2.executeQuery();
            while(rs.next())
            {
                String pat = rs.getString("Office_Id");
                jComboBox2.addItem(pat);
            }
             PreparedStatement d1=c.prepareStatement("Select Office_name from booking_office");
            ResultSet r = d1.executeQuery();
            while(r.next())
            {
                String pat = r.getString("Office_name");
                jComboBox3.addItem(pat);
            }
            ////////////////////////////////////////////////////////////////////
            
         
        } catch (SQLException ex) {
            Logger.getLogger(reserve1.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Office Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(491, 261, 127, 24);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(15, 576, 94, 35);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Passenger Details");
        jLabel11.setToolTipText("");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 10, 260, 32);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Passenger's full name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 56, 150, 20);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(643, 212, 50, 26);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Age");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 50, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(491, 104, 92, 24);

        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(643, 256, 50, 26);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Phone contact");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 130, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(491, 148, 127, 24);

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("Office ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(491, 217, 127, 24);

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 200, 127, 19);

        jTextField2.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jTextField2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(175, 56, 177, 24);

        jTextField3.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jTextField3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(175, 144, 163, 24);

        jTextField4.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jTextField4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(610, 144, 190, 24);

        jTextArea1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(175, 199, 245, 98);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(601, 98, 64, 28);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 255, 255));
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(683, 98, 81, 28);

        jComboBox1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jComboBox1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(175, 99, 89, 29);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Payment Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(690, 570, 138, 50);

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("Flight Select");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 310, 130, 24);

        jComboBox4.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jComboBox4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(290, 340, 80, 26);

        jComboBox5.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jComboBox5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tokyo", "London", "Paris", "USA", "Dubai" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(510, 340, 80, 26);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("From");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(190, 332, 60, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("To");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(440, 340, 30, 24);

        jButton5.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jButton5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(630, 330, 90, 40);

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)), new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true)));
        jTable1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jTable1.setForeground(java.awt.SystemColor.activeCaptionBorder);
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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 401, 779, 140);

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 255));
        jLabel10.setText("Booking Office");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(581, 180, 130, 24);
        getContentPane().add(jl);
        jl.setBounds(0, 0, 840, 630);

        setSize(new java.awt.Dimension(856, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||
            jTextArea1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "There's an empty field","Error!", WIDTH);
        }
        else if(jTable1.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "No Flight Was seleceted","Error!", WIDTH);
        }
        else
        {
            String Office_id=(String) jComboBox2.getSelectedItem();
            int off_id=Integer.parseInt(Office_id);
           //////////////////////////////
            int column = 0;
            int row = jTable1.getSelectedRow();
            String flightId = jTable1.getModel().getValueAt(row, column).toString();
            
             ///////////////////////////////// 
            //String id=jTextField1.getText();
            String name=jTextField2.getText();
            String age =(String) jComboBox1.getSelectedItem();
            String gender;
            if(jRadioButton1.isSelected())
            gender="male";
            else
            gender="female";
            String contact=jTextField3.getText();
            String e_mail=jTextField4.getText();
            String adress=jTextArea1.getText();
                //////////////////////////
            try {
                Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
                PreparedStatement d=c2.prepareStatement("insert into passenger (P_name,age,gender,Adress,contact,e_mail,Office_id,Flight_No) "
                    + "values(?,?,?,?,?,?,?,?)");
               /* d.setString(1,id);*/
                d.setString(1,name);
                d.setString(2,age);
                d.setString(3,gender);
                d.setString(4,adress);
                d.setString(5,contact);
                d.setString(6,e_mail);
                d.setInt(7,off_id );
                d.setString(8,flightId );
                d.executeUpdate();
                
                ////////////////////////////////////
                
                
            } catch (SQLException ex) {
                Logger.getLogger(reserve1.class.getName()).log(Level.SEVERE, null, ex);
            }
        /////////////////////////////////////////////////////////
        Fare f= new Fare();
        if(jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||
            jTextArea1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "There's an empty field","Error!", WIDTH);
        }
        else if(jTable1.getSelectionModel().isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "No Flight Was seleceted","Error!", WIDTH);
        }
        else
        {
            this.setVisible(false);
            f.setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String to=(String) jComboBox5.getSelectedItem();
         
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
            PreparedStatement d2=c.prepareStatement("select * from flight where FlyTo = ? ");
            d2.setString(1, to);
            ResultSet res = d2.executeQuery();
            DefaultTableModel t=new DefaultTableModel();
            t.addColumn("Flight_No");
            t.addColumn("Class");
            t.addColumn("FlyFrom");
            t.addColumn("FlyTo");
            t.addColumn("Dep_Time");
            t.addColumn("Dep_Date");
            t.addColumn("Arr_Time");
            t.addColumn("Arr_Date");
            t.addColumn("Seats_Num");
            while(res.next())
            {
                String s[]={res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)
                ,res.getString(7),res.getString(8),res.getString(9)};
                t.addRow(s);
            }
            jTable1.setModel(t);
        } catch (SQLException ex) {
            Logger.getLogger(Fare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        main m = new main();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         this.setLocationRelativeTo(null);
        try { 
            ImageIcon img = new ImageIcon(ImageIO.read(getClass().getResource("b7.jpeg")).getScaledInstance(840,630, Image.SCALE_AREA_AVERAGING));
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
            java.util.logging.Logger.getLogger(reserve1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserve1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserve1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserve1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserve1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jl;
    // End of variables declaration//GEN-END:variables
}

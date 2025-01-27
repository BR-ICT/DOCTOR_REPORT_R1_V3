/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DOCTOR_REPORT_R1_V2;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Mahakit
 */
public class TransportGenerate extends javax.swing.JFrame {

    DefaultTableModel model2;
    SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
    boolean modechangedate = true;
    public static JTable Table1;

    /**
     * Creates new form TransportGenerate
     */
    public TransportGenerate() {
        initComponents();
        this.jXStartDate1.setDate(new Date());
        this.model2 = ((DefaultTableModel) jTable1.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXStartDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jXStartDate1 = new org.jdesktop.swingx.JXDatePicker();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jXStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXStartDateActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Delivery Date:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TK No.", "Customer Name", "Driver Name", "Car Register No.", "Address", "Date", "Count", "Order", "Delete"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(7).setMinWidth(0);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(8).setMinWidth(60);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(60);
        }

        jXStartDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXStartDate1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete Date");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Search:");

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jXStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try {

            Boolean isChecked = Boolean.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
            System.out.println(isChecked);
            if (isChecked.booleanValue() == true) {
                Connection conn = ConnectDB2.ConnectionDBS();
                Statement sta = conn.createStatement();

                String sql2 = "DELETE FROM BRLDTA0100.TRANSRN1\n"
                        + "WHERE RNTKNO ='" + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'\n"
                        + "AND RNADNO ='" + jTable1.getValueAt(jTable1.getSelectedRow(), 7) + "'\n"
                        + "AND RNDATE ='" + jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "'";
                sta.executeUpdate(sql2);
            }
            Getdata();
        } catch (Exception localException) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jXStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXStartDateActionPerformed

    private void jXStartDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXStartDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXStartDate1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        cleartable();
        boolean check = checkdate();
        if (check) {
            Getdata();
            this.modechangedate = false;
        } else {
            this.modechangedate = true;
            JOptionPane.showMessageDialog(null, "No data found please create new data", "Message", 1);
        }
        this.jButton2.setEnabled(this.modechangedate);
        this.jButton3.setEnabled(!this.modechangedate);
        this.jTextField1.setEnabled(!this.modechangedate);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            Connection conn = ConnectDB2.ConnectionDBS();
            Statement sta = conn.createStatement();

            String sql = "INSERT INTO BRLDTA0100.TRANSRN1 (RNCONO, RNDIVI, RNDATE, RNTKNO, RNADNO)\n"
                    + "SELECT RNCONO, RNDIVI, '" + this.format2.format(this.jXStartDate1.getDate()) + "', RNTKNO, RNADNO\n"
                    + "FROM BRLDTA0100.ADDRRN1";

            sta.executeUpdate(sql);
            System.err.println(sql);
            JOptionPane.showMessageDialog(null, "Creation Complete!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        Getdata();
        this.modechangedate = false;
        this.jButton2.setEnabled(this.modechangedate);
        this.jButton3.setEnabled(!this.modechangedate);
        this.jTextField1.setEnabled(!this.modechangedate);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try {
            Connection conn = ConnectDB2.ConnectionDBS();
            Statement sta = conn.createStatement();

            String sql2 = "DELETE FROM BRLDTA0100.TRANSRN1\n"
                    + "WHERE RNDATE = '" + this.format2.format(this.jXStartDate1.getDate()) + "'";
            sta.executeUpdate(sql2);

            Getdata();
            this.modechangedate = true;
            this.jButton2.setEnabled(this.modechangedate);
            this.jButton3.setEnabled(!this.modechangedate);
            this.jTextField1.setEnabled(!this.modechangedate);
        } catch (Exception localException) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cleartable() {
        while (this.model2.getRowCount() > 0) {
            for (int i = 0; i < this.model2.getRowCount(); i++) {
                this.model2.removeRow(i);
            }
        }
    }

    private void Getdata() {
        try {
            while (this.model2.getRowCount() > 0) {
                for (int i = 0; i < this.model2.getRowCount(); i++) {
                    this.model2.removeRow(i);
                }
            }
            Connection conn = ConnectDB2.ConnectionDB();
            Statement sta = conn.createStatement();
            String Sql;
            if (this.jTextField1.getText().equals("")) {
                Sql = "SELECT A.RNTKNO,RNCUNA,RNTKNA,RNREGI,RNADDR,A.RNDATE,HOWMANY,A.RNADNO\n"
                        + "FROM BRLDTA0100.TRANSRN1 A\n"
                        + "LEFT JOIN BRLDTA0100.ADDRRN1  B\n"
                        + "ON  A.RNTKNO = B.RNTKNO\n"
                        + "AND A.RNADNO = B.RNADNO\n"
                        + "AND A.RNCONO = B.RNCONO\n"
                        + "AND A.RNDIVI = B.RNDIVI\n"
                        + "LEFT JOIN\n"
                        + "(SELECT A.RNTKNO, COUNT(*) AS HOWMANY FROM BRLDTA0100.TRANSRN1 A\n"
                        + "WHERE RNDATE = '" + this.format2.format(this.jXStartDate1.getDate()) + "'\n"
                        + "GROUP BY A.RNTKNO\n"
                        + "ORDER BY RNTKNO) AS C\n"
                        + "ON C.RNTKNO = A.RNTKNO\n"
                        + "WHERE RNDATE = '" + this.format2.format(this.jXStartDate1.getDate()) + "'";
            } else {
                Sql = "SELECT A.RNTKNO,RNCUNA,RNTKNA,RNREGI,RNADDR,A.RNDATE,HOWMANY,A.RNADNO\n"
                        + "FROM BRLDTA0100.TRANSRN1 A\n"
                        + "LEFT JOIN BRLDTA0100.ADDRRN1  B\n"
                        + "ON  A.RNTKNO = B.RNTKNO\n"
                        + "AND A.RNADNO = B.RNADNO\n"
                        + "AND A.RNCONO = B.RNCONO\n"
                        + "AND A.RNDIVI = B.RNDIVI\n"
                        + "LEFT JOIN\n"
                        + "(SELECT A.RNTKNO, COUNT(*) AS HOWMANY FROM BRLDTA0100.TRANSRN1 A\n"
                        + "WHERE RNDATE = '" + this.format2.format(this.jXStartDate1.getDate()) + "'\n"
                        + "GROUP BY A.RNTKNO\n"
                        + "ORDER BY RNTKNO) AS C\n"
                        + "ON C.RNTKNO = A.RNTKNO\n"
                        + "WHERE RNDATE = '" + this.format2.format(this.jXStartDate1.getDate()) + "'\n"
                        + "AND A.RNTKNO||' '||B.RNCUNA||B.RNTKNA||B.RNREGI||B.RNADDR LIKE '%" + this.jTextField1.getText() + "%'";
            }
            ResultSet rs = sta.executeQuery(Sql);
            while (rs.next()) {
                this.model2.insertRow(this.model2.getRowCount(), new Object[]{rs
                    .getString("RNTKNO").trim(), rs
                    .getString("RNCUNA").trim(), rs
                    .getString("RNTKNA").trim(), rs
                    .getString("RNREGI").trim(), rs
                    .getString("RNADDR").trim(), rs
                    .getString("RNDATE").trim(), rs
                    .getString("HOWMANY").trim(), rs
                    .getString("RNADNO").trim()});
            }
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public boolean checkdate() {
        boolean check1 = true;
        int amount = 0;
        try {
            Connection conn = ConnectDB2.ConnectionDB();
            Statement sta = conn.createStatement();

            String Sql = "SELECT COUNT(RNDATE) AS Exist  FROM BRLDTA0100.TRANSRN1\nWHERE RNDATE = '" + this.format2.format(this.jXStartDate1.getDate()) + "'";

            ResultSet rs = sta.executeQuery(Sql);
            while (rs.next()) {
                amount = rs.getInt("Exist");
            }
            rs.close();
            if (amount > 0) {
                check1 = true;
            } else {
                check1 = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return check1;
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
            java.util.logging.Logger.getLogger(TransportGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransportGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransportGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransportGenerate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransportGenerate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXStartDate;
    private org.jdesktop.swingx.JXDatePicker jXStartDate1;
    // End of variables declaration//GEN-END:variables
}

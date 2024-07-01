/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOCTOR_REPORT_R1_V2;

import static DOCTOR_REPORT_R1_V2.LoginMain.LoginCono;
import static DOCTOR_REPORT_R1_V2.LoginMain.LoginDivision;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Aticha
 */
public class ReportDoctor extends javax.swing.JFrame {

    public static int year = 0;

    /**
     * Creates new form MainJFrame
     */
    public ReportDoctor() {
        initComponents();

        setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        this.setTitle("Company  " + LoginMain.LoginCompanyName);
        lblCompanyName.setText(LoginMain.LoginCompanyName);
        getdoctorlist();
        jComboBox2.setSelectedIndex(0);
        Locale.setDefault(Locale.US);
        Date d = new Date();

        SimpleDateFormat C = new SimpleDateFormat("yyyy");

        String YYYY = C.format(d);
        year = Integer.parseInt(YYYY) + 543;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new java.awt.Button();
        txtInvoice = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnPrint = new java.awt.Button();
        lblCompanyName = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        btnV2 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        btnV3 = new java.awt.Button();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anatis_Invioce");
        getContentPane().setLayout(null);

        btnCancel.setBackground(new java.awt.Color(240, 240, 240));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setLabel("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(180, 320, 150, 30);

        txtInvoice.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvoiceActionPerformed(evt);
            }
        });
        getContentPane().add(txtInvoice);
        txtInvoice.setBounds(120, 120, 267, 34);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Order");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 60, 230, 29);

        btnPrint.setBackground(new java.awt.Color(255, 204, 204));
        btnPrint.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPrint.setLabel("Print from date Invoide");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint);
        btnPrint.setBounds(300, 180, 180, 30);

        lblCompanyName.setAlignment(java.awt.Label.CENTER);
        lblCompanyName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCompanyName.setForeground(new java.awt.Color(204, 0, 0));
        lblCompanyName.setText("Company Name");
        getContentPane().add(lblCompanyName);
        lblCompanyName.setBounds(120, 20, 270, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DOCTOR_REPORT_R1_V2/icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 60, 100, 110);

        btnV2.setActionCommand("Print V.2");
        btnV2.setBackground(new java.awt.Color(204, 255, 255));
        btnV2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnV2.setLabel("Print from date now");
        btnV2.setName(""); // NOI18N
        btnV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnV2);
        btnV2.setBounds(50, 180, 190, 30);

        jButton1.setText("ปริ้นแบบ ร.น.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 248, 140, 60);

        btnV3.setActionCommand("Print V.2");
        btnV3.setBackground(new java.awt.Color(255, 255, 153));
        btnV3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnV3.setLabel("New Print");
        btnV3.setName(""); // NOI18N
        btnV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnV3);
        btnV3.setBounds(170, 220, 190, 30);
        btnV3.getAccessibleContext().setAccessibleName("PrintwithCO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Doctor:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 270, 68, 22);

        jComboBox2.setFont(new java.awt.Font("Angsana New", 0, 15)); // NOI18N
        jComboBox2.setSelectedItem(0);
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(200, 270, 190, 26);

        setSize(new java.awt.Dimension(565, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed


    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        btnPrint.enable(false);
        ClassGetReport cgr = new ClassGetReport();

        String Customer = cgr.getcustomer(txtInvoice.getText().trim());

        if (Customer.equals("TH08130002")) {
            String ss = cgr.GetDoctorRunningNo(txtInvoice.getText().trim());
            cgr.GetReportDoctorheadbigC(txtInvoice.getText().trim());
        } else {
            String ss = cgr.GetDoctorRunningNo(txtInvoice.getText().trim());
            cgr.GetReportDoctor(txtInvoice.getText().trim());
        }
        btnPrint.enable(true);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvoiceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtInvoiceActionPerformed

    private void btnV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV2ActionPerformed
        btnV2.enable(false);
        ClassGetReport cgr = new ClassGetReport();

        String Customer = cgr.getcustomer(txtInvoice.getText().trim());

        if (Customer.equals("TH08130002")) {
            String ss = cgr.GetDoctorRunningNo(txtInvoice.getText().trim());
            cgr.GetReportDoctorBigc(txtInvoice.getText().trim());
        } else {
            String ss = cgr.GetDoctorRunningNo(txtInvoice.getText().trim());
            cgr.GetReportDoctorV2(txtInvoice.getText().trim());
        }

        btnV2.enable(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnV2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SetSeries set = new SetSeries();
        set.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void getdoctorlist() {

        try {
            String Sql;

            Connection conn = ConnectDB2.ConnectionDB();
            Statement sta = conn.createStatement();
//

            Sql = "SELECT * FROM (SELECT NOASSISTANT||'-'||ANAME AS ASSISTANTLIST\n"
                    + "FROM BRLDTA0100.DOCTORASSISTANT\n"
                    + "WHERE STATUS = '1') AS A\n"
                    + "UNION\n"
                    + "(SELECT TRIM(NODOCTOR) ||'-'||DNAME FROM BRLDTA0100.PRODOCTOREST14 AS ffff\n"
                    + "WHERE VARCHAR_FORMAT(current timestamp, 'YYYYMMDD') BETWEEN STARTDATE AND ENDDATE)";

            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {

                jComboBox2.insertItemAt(rs.getString("ASSISTANTLIST").trim(), 0);

            }
            rs.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    private void btnV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV3ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        btnPrint.enable(false);
        ClassGetReport cgr = new ClassGetReport();

        String Customer = cgr.getcustomer(txtInvoice.getText().trim());

        String ss = cgr.GetDoctorRunningNo(txtInvoice.getText().trim());
        cgr.GetReportDoctorLocation(txtInvoice.getText().trim());
        String[] doctorlist = jComboBox2.getSelectedItem().toString().split("-");
        String doctorcode = doctorlist[0];
        String doctorname = doctorlist[1];
        insertDoctorhistory(txtInvoice.getText().trim(), doctorcode, LoginCono, LoginDivision);
        btnPrint.enable(true);
    }//GEN-LAST:event_btnV3ActionPerformed

    /**
     * @param args the command line arguments
     */
    private String insertDoctorhistory(String conumber, String doctorcode, String cono, String divi) {
        int howmany = 0;
        try {
            String sqlserver;

            Connection conn = ConnectDB2.ConnectionDB();
            Statement sta = conn.createStatement();
            Statement sta2 = conn.createStatement();
            String Sql2 = "SELECT COUNT(HEADERNO) AS TIMES FROM BRLDTA0100.DOCTORHISTORY\n"
                    + "WHERE HEADERNO = '" + conumber + "'";
            ResultSet rs = sta.executeQuery(Sql2);
//            ResultSet rs = sta.executeQuery(Sql2);
            while (rs.next()) {
                howmany = rs.getInt("TIMES");
            }

            if (howmany == 0) {
                sqlserver = "INSERT INTO BRLDTA0100.DOCTORHISTORY\n"
                        + "(HEADERNO,APPROVER,DCONO,DDIVI)\n"
                        + "values('" + conumber + "','" + doctorcode + "','" + cono + "','" + divi + "')";
            } else {
                sqlserver = "UPDATE BRLDTA0100.DOCTORHISTORY\n"
                        + "SET APPROVER = '" + doctorcode + "'\n"
                        + "WHERE HEADERNO = '" + conumber + "'\n"
                        + "AND DCONO = '" + cono + "'\n"
                        + "AND DDIVI = '" + divi + "'";
            }

            sta2.execute(sqlserver);

//            Connection conn2 = ConnectMsSql.ConnectionDB();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;

    }

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
            java.util.logging.Logger.getLogger(ReportDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCancel;
    private java.awt.Button btnPrint;
    private java.awt.Button btnV2;
    private java.awt.Button btnV3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label lblCompanyName;
    private java.awt.TextField txtInvoice;
    // End of variables declaration//GEN-END:variables
}

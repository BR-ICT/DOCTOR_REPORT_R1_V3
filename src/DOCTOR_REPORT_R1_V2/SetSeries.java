/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DOCTOR_REPORT_R1_V2;

import static DOCTOR_REPORT_R1_V2.LoginMain.LoginCono;
import static DOCTOR_REPORT_R1_V2.LoginMain.LoginUsername;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jilasak
 */
public class SetSeries extends javax.swing.JFrame {

    SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH); //คศ
    SimpleDateFormat format3 = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH); //คศ
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH); //คศ
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
    DefaultTableModel model2;

    /**
     * Creates new form SetSeries
     */
    public SetSeries() {
        initComponents();
        this.setTitle("Set Series");
        callSeries();
        getData();
        jComboBox2.setSelectedIndex(1);
//        jXStartDate1.setDate(new Date());
//        radiotype2.setEnabled(false);
    }

    public void callSeries() {
        try {
            Connection conn = ConnectDB2.ConnectionDBS();
            Statement sta = conn.createStatement();
            String sql = "SELECT A.ROWPRENUM,B.PDR_START ,B.PDR_END , CASE WHEN B.PDR_PROGRAM = 'THAIMAX' THEN B.PDR_CODE || '/' || B.PDR_YEAR || '/'  || 'THMAX' ||TRIM(TO_CHAR(A.ROWPRENUM,'000000')) \n"
                    + "WHEN B.PDR_PROGRAM = 'Farm' THEN B.PDR_CODE || '/' || B.PDR_YEAR || '/'  || 'F' ||TRIM(TO_CHAR(A.ROWPRENUM,'000000')) ELSE\n"
                    + "B.PDR_CODE || '/' || B.PDR_YEAR || '/'  || TRIM(TO_CHAR(A.ROWPRENUM,'000000')) END AS RUNNING\n"
                    + ",B.PDR_CODE, B.PDR_YEAR, B.PDR_START, B.PDR_END\n"
                    + "FROM BRLDTA0100.ROW_PREREPORT A,BRLDTA0100.PRODOCRUNNING B\n"
                    + "WHERE A.ROWPRENUM BETWEEN int(B.PDR_START) AND int(B.PDR_END) \n"
                    + "AND B.PDR_CONO = '10'\n"
                    + "AND B.PDR_DIVI = '101'\n"
                    + "AND B.PDR_USER = '" + LoginMain.LoginUsername.trim() + "'\n"
                    + "AND B.PDR_PROGRAM =  '" + LoginMain.ProgramName.trim() + "' \n"
                    + "ORDER BY RUNNING DESC  \n"
                    + "LIMIT 1 ";
            ResultSet rsl = sta.executeQuery(sql);
            while (rsl.next()) {
                txt_code.setText(rsl.getString("PDR_CODE").trim());
                txt_year.setText(rsl.getString("PDR_YEAR").trim());
//                txt_month.setText(rsl.getString("PDR_MONTH").trim());
                txt_start.setText(rsl.getString("PDR_START").trim());
                txt_end.setText(rsl.getString("PDR_END").trim());
                txt_sample.setText(rsl.getString("RUNNING").trim());
            }

        } catch (Exception e) {
            System.err.println(e.toString());
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

        jXStartDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        typeradio = new javax.swing.ButtonGroup();
        txt_end = new javax.swing.JTextField();
        txt_start = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_sample = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_set = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_print1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_print2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        radiotype1 = new javax.swing.JRadioButton();
        radiotype2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();

        jXStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXStartDateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DATE :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        txt_end.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        getContentPane().add(txt_end);
        txt_end.setBounds(160, 180, 140, 40);

        txt_start.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        getContentPane().add(txt_start);
        txt_start.setBounds(20, 180, 130, 40);

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Sample :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 220, 130, 30);

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("End");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 150, 130, 30);

        txt_year.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        getContentPane().add(txt_year);
        txt_year.setBounds(160, 110, 140, 40);

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Year");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 80, 130, 30);

        txt_code.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        getContentPane().add(txt_code);
        txt_code.setBounds(20, 110, 130, 40);

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Customer Location");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 370, 130, 30);

        txt_sample.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        getContentPane().add(txt_sample);
        txt_sample.setBounds(20, 250, 450, 60);

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Start");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 150, 130, 30);

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Doctor Report Set Series");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 10, 450, 60);

        btn_set.setText("Set");
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });
        getContentPane().add(btn_set);
        btn_set.setBounds(320, 180, 130, 40);

        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print);
        btn_print.setBounds(20, 320, 140, 40);

        btn_print1.setText("Print W/O Series");
        btn_print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print1);
        btn_print1.setBounds(170, 320, 150, 40);

        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Code");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 80, 130, 30);

        btn_print2.setText("Print");
        btn_print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print2);
        btn_print2.setBounds(130, 590, 150, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Kg.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 530, 80, 22);

        jComboBox2.setFont(new java.awt.Font("Angsana New", 0, 15)); // NOI18N
        jComboBox2.setSelectedItem(0);
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(110, 490, 180, 26);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(110, 530, 180, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Doctor:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 490, 70, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Weight:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 530, 80, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Customer:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 450, 100, 22);

        typeradio.add(radiotype1);
        radiotype1.setSelected(true);
        radiotype1.setText("บริโถคโดยมนุษย์");
        getContentPane().add(radiotype1);
        radiotype1.setBounds(330, 460, 150, 27);

        typeradio.add(radiotype2);
        radiotype2.setText("อาหารสัตว์");
        getContentPane().add(radiotype2);
        radiotype2.setBounds(330, 490, 150, 27);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 450, 180, 29);

        setSize(new java.awt.Dimension(509, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed
        String code = txt_code.getText().trim();
        String year = txt_year.getText().trim();
//        String month = txt_month.getText().trim();
        String start = txt_start.getText().trim();
        String end = txt_end.getText().trim();
//        month = String.format("%02d", Integer.parseInt(month)); // Filling with zeroes  

        try {
            Connection conn = ConnectDB2.ConnectionDBS();
            Statement sta = conn.createStatement();

            String sql = "UPDATE BRLDTA0100.PRODOCRUNNING\n"
                    + "SET PDR_CODE = '" + code + "', PDR_YEAR = '" + year + "', PDR_START = '" + start + "', PDR_END = '" + end + "' \n"
                    + "where UPPER(PDR_USER) = UPPER('" + LoginMain.LoginUsername.trim() + "')   and PDR_PROGRAM = '" + LoginMain.ProgramName.trim() + "' ";
            System.err.println(sql);
            sta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Complete !");
            callSeries();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_btn_setActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed

        btn_print.enable(false);
        ClassGetReport cgr = new ClassGetReport();
        cgr.getReportSetSeries(LoginMain.ProgramName);
        btn_print.enable(true);

    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print1ActionPerformed
        // TODO add your handling code here:
        btn_print.enable(false);
        ClassGetReport cgr = new ClassGetReport();
        cgr.getReportSetSeriesV2(LoginMain.ProgramName);
        btn_print.enable(true);
    }//GEN-LAST:event_btn_print1ActionPerformed
    private void getData() {
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

//            String Sql = "SELECT RNTKNA,RNTKNA,RNTKNA,RNREGI,RNADDR FROM BRLDTA0100.TRANSRN1 A\n"
//                    + "LEFT JOIN BRLDTA0100.ADDRRN1  B\n"
//                    + "ON  A.RNTKNO = B.RNTKNO\n"
//                    + "AND A.RNADNO = B.RNADNO\n"
//                    + "AND A.RNCONO = B.RNCONO\n"
//                    + "AND A.RNDIVI = B.RNDIVI\n"
//                    + "WHERE RNDATE = '" + format2.format(jXStartDate1.getDate()) + "'";
            ResultSet rs = sta.executeQuery(Sql);

            while (rs.next()) {

                //comment ใช้ให้ขึ้น 00001-01-01
                //String getDate = "0";
                //Date cvDate = new SimpleDateFormat("yyyymmdd").parse("0001-01-01");
                jComboBox2.insertItemAt(rs.getString("ASSISTANTLIST").trim(), 0);

                //System.out.println(cvDate);
                //format.format(getDate),})
            }
            rs.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
//                jButton1.setEnabled(true);
    }


    private void btn_print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print2ActionPerformed

// TODO add your handling code here:
//        String Lotdate = format1.format(jXStartDate1.getDate());
//        String Lotdate2 = yearFormat.format(jXStartDate1.getDate()) + "-01-01";
//        LocalDate date1 = LocalDate.parse(Lotdate);
//        LocalDate date2 = LocalDate.parse(Lotdate2);
//        long daysBetween = ChronoUnit.DAYS.between(date2, date1);
//        String daysBetween2 = String.valueOf(daysBetween);
//        int daysbetween3 = Integer.valueOf(daysBetween2) + 1;
//        String thaiyear = String.valueOf(Integer.valueOf(yearFormat.format(jXStartDate1.getDate())) + 543);
//        String thaiyear2digit = thaiyear.substring(2, 4);
//        System.out.println(thaiyear2digit);
//        String lotnum = "14" + thaiyear2digit + String.format("%03d", daysbetween3);
//        long test2 = ChronoUnit.Days.between(date1, date2);
//        String daysPassed = test2.toString();
//        String Lotdateformatted = monthFormat.format(jXStartDate1.getDate()) + "/" + dayFormat.format(jXStartDate1.getDate()) + "/" + yearFormat.format(jXStartDate1.getDate());
//        System.out.println(Lotdate);
//        System.out.print(evt);
        String customercode = jTextField2.getText();
//        String customercode = "test";
//        String customername ="test";
        String[] doctorlist = jComboBox2.getSelectedItem().toString().split("-");
        String doctorcode = doctorlist[0];
        String doctorname = doctorlist[1];
        ClassGetReport cgr = new ClassGetReport();
        String weight = jTextField1.getText();
        boolean select1 = radiotype1.isSelected();
        boolean select2 = radiotype2.isSelected();
        System.out.println(select1);
        System.out.println(select2);
        cgr.getReportSetSeriesLocation(LoginMain.ProgramName, customercode,
                weight, doctorcode, doctorname, select1, select2);
    }//GEN-LAST:event_btn_print2ActionPerformed

    private void jXStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXStartDateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(SetSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetSeries().setVisible(true);
            }
        });
    }

//    private void getData() {
//        String Month = monthFormat.format(jXStartDate1.getDate());
//        String Year = yearFormat.format(jXStartDate1.getDate());
////        Runnable runnable = new Runnable() {
////
////            public void run() {
////                jButton1.setEnabled(false);
//        try {
//
////            jComboBox1.removeAllItems();
//            Connection conn = ConnectDB2.ConnectionDB();
//            Statement sta = conn.createStatement();
//
//            String Sql = "SELECT DISTINCT OPCUNO||'-'||OKCUNM AS CUSTOMERNAME,'LOCAL'\n"
//                    + "FROM M3FDBPRD.ODHEAD A,M3FDBPRD.ODLINE B,M3FDBPRD.MITTRA C,M3FDBPRD.MITMAS D,\n"
//                    + "     M3FDBPRD.OCUSMA E , brldta0100.PRODOCTOREST14 AS ffff ,BRLDTA0100.PRODOCTORAUTO AS GGGGG\n"
//                    + "    ,M3FDBPRD.OCUSAD AS CUSTNAMES,M3FDBPRD.CSYTAB AS jv\n"
//                    + "WHERE B.UBORNO = C.MTRIDN\n"
//                    + "AND B.UBCONO = C.MTCONO\n"
//                    + "AND GGGGG.NODOCUMENT <> ''\n"
//                    + "AND C.MTTTYP = 31\n"
//                    + "AND B.UBITNO = C.MTITNO\n"
//                    + "AND A.UAORNO = B.UBORNO\n"
//                    + "AND A.UACONO = B.UBCONO\n"
//                    + "AND A.UACONO = 10\n"
//                    + "AND B.UBITNO NOT IN ('FFA2100L020','FFGS6001000','FFO1200L020'\n"
//                    + ",'FFO1400L020','FF003001000','FF004001000','FF005001000'\n"
//                    + ",'FF006001000','FF007001000','FF008001000','FF009001000'\n"
//                    + ",'FF010001000','FF011001000','FF012001000','FF013001000'\n"
//                    + ",'FF017001000','FF018001000','FF019001000','FF020001000'\n"
//                    + ",'FF024000008','FF024001000','FF025000008','FF031001000'\n"
//                    + ",'FF032001000','FF037001000','FF039001000' )\n"
//                    + "AND CAST(SUBSTR(DATERUNREPORT,5,2)AS INT)=  '" + Month + "'\n"
//                    + "AND CAST(SUBSTR(DATERUNREPORT,1,4)as INT)='" + Year + "'\n"
//                    + "AND C.MTCONO = D.MMCONO\n"
//                    + "AND C.MTITNO = D.MMITNO	\n"
//                    + "AND D.MMITGR BETWEEN 'SH01'\n"
//                    + "AND 'SH07'\n"
//                    + "AND A.UACONO = E.OKCONO\n"
//                    + "AND A.UACUNO = E.OKCUNO\n"
//                    + "AND A.UAIVDT  BETWEEN ffff.STARTDATE AND ffff.ENDDATE\n"
//                    + "AND GGGGG.UBORNO=A.UAORNO\n"
//                    + "AND CUSTNAMES.OPCUNO=A.UACUNO\n"
//                    + "AND CUSTNAMES.OPCONO=A.UACONO\n"
//                    + "AND OPADID='DELI02'\n"
//                    + "AND jv.ctstco ='ECAR' AND jv.CTCONO = CUSTNAMES.OPCONO AND jv.ctstky = CUSTNAMES.OPECAR\n"
//                    + "GROUP BY GGGGG.DATERUNREPORT,B.UBORNO,A.UAIVNO,A.UAIVDT,A.UACUNO,E.OKCUNM,RTRIM(E.OKCUA1)||' '||RTRIM(E.OKCUA2)||' '||RTRIM(E.OKCUA3)\n"
//                    + ",ffff.NODOCTOR,ffff.DNAME,GGGGG.NODOCUMENT,CUSTNAMES.OPCUA1,CUSTNAMES.OPCUA2,CUSTNAMES.OPCUA3,CUSTNAMES.OPCUA4,CUSTNAMES.OPTOWN,jv.CTTX40,CUSTNAMES.OPCUNO,B.UBCONO,OKCUA1,OKCUA2,OKCUA3,OKCUNO\n"
//                    + "UNION\n"
//                    + "SELECT DISTINCT OPCUNO||'-'||OKCUNM AS CUSTOMERNAME,'LOCAL'\n"
//                    + "FROM M3FDBPRD.ODHEAD A,M3FDBPRD.ODLINE B,M3FDBPRD.MITTRA C,M3FDBPRD.MITMAS D,M3FDBPRD.OCUSMA E\n"
//                    + ",M3FDBPRD.OCUSAD AS CUSTNAMES,BRLDTA0100.ITEMNRN1 AS ITEMS\n"
//                    + ",BRLDTA0100.PRODOCTOREST14 AS ffff\n"
//                    + ",BRLDTA0100.INVCNRN1 AS GGGGG\n"
//                    + ",M3FDBPRD.CSYTAB AS jv\n"
//                    + "WHERE B.UBORNO = C.MTRIDN\n"
//                    + "AND B.UBCONO = C.MTCONO\n"
//                    + "AND C.MTTTYP = 31\n"
//                    + "AND B.UBITNO = C.MTITNO\n"
//                    + "AND A.UAORNO = B.UBORNO\n"
//                    + "AND A.UACONO = B.UBCONO\n"
//                    + "AND A.UACONO = 10\n"
//                    + "AND C.MTCONO = D.MMCONO														\n"
//                    + "AND C.MTITNO = D.MMITNO\n"
//                    + "AND (D.MMITGR BETWEEN 'SH01' AND 'SH07' OR D.MMITGR = 'MO00')\n"
//                    + "AND A.UACONO = E.OKCONO\n"
//                    + "AND CUSTNAMES.OPCUNO=A.UACUNO\n"
//                    + "AND CUSTNAMES.OPCONO=A.UACONO\n"
//                    + "AND A.UACUNO = E.OKCUNO\n"
//                    + "AND OPADID='DELI02'\n"
//                    + "AND SUBSTR(A.UAIVDT,5,2) = '" + Month + "'\n"
//                    + "AND SUBSTR(A.UAIVDT,1,4) = '" + Year + "'\n"
//                    + "AND B.UBDLIX=C.MTRIDI\n"
//                    + "AND B.UBPONR=C.MTRIDL\n"
//                    + "AND A.UADLIX=C.MTRIDI\n"
//                    + "AND jv.ctstco ='ECAR' AND jv.CTCONO = CUSTNAMES.OPCONO AND jv.ctstky = CUSTNAMES.OPECAR\n"
//                    + "AND A.UAIVDT BETWEEN ffff.STARTDATE AND ffff.ENDDATE\n"
//                    + "AND ITEMS.RNCONO = B.UBCONO\n"
//                    + "AND ITEMS.RNITNO = B.UBITNO\n"
//                    + "AND GGGGG.INORNO = A.UAORNO\n"
//                    + "GROUP BY B.UBORNO,A.UAIVNO,A.UAIVDT,A.UACUNO,E.OKCUNM,RTRIM(E.OKCUA1)||' '||RTRIM(E.OKCUA2)||' '||RTRIM(E.OKCUA3),OPCUNO\n"
//                    + ",ffff.NODOCTOR,CUSTNAMES.OPCUA1,CUSTNAMES.OPCUA2,CUSTNAMES.OPCUA3,CUSTNAMES.OPCUA4,ffff.DNAME,ffff.ESTCOMPANY,GGGGG.INRNNO,CUSTNAMES.OPCUA1,CUSTNAMES.OPCUA2,CUSTNAMES.OPTOWN,jv.CTTX40,B.UBORNO,B.UBCONO,OKCUA2,OKCUA3,OKCUA1\n"
//                    + "UNION\n"
//                    + "SELECT DISTINCT OKCUNO||'-'||OKCUNM AS CUSTOMERNAME,'Fish Farm'\n"
//                    + "FROM M3FDBPRD.ODHEAD A,M3FDBPRD.ODLINE B,M3FDBPRD.MITTRA C,M3FDBPRD.MITMAS D,\n"
//                    + "     M3FDBPRD.OCUSMA E , brldta0100.PRODOCTOREST14 AS ffff ,BRLDTA0100.PRODOCTORAUTO AS GGGGG\n"
//                    + "    ,M3FDBPRD.OCUSAD AS CUSTNAMES,M3FDBPRD.CSYTAB AS jv\n"
//                    + "WHERE B.UBORNO = C.MTRIDN\n"
//                    + "AND B.UBCONO = C.MTCONO\n"
//                    + "AND GGGGG.NODOCUMENT <> ''\n"
//                    + "AND C.MTTTYP = 31\n"
//                    + "AND B.UBITNO = C.MTITNO\n"
//                    + "AND A.UAORNO = B.UBORNO\n"
//                    + "AND A.UACONO = B.UBCONO\n"
//                    + "AND A.UACONO = 10\n"
//                    + "AND B.UBITNO IN ('FFA2100L020','FFGS6001000','FFO1200L020'\n"
//                    + ",'FFO1400L020','FF003001000','FF004001000','FF005001000'\n"
//                    + ",'FF006001000','FF007001000','FF008001000','FF009001000'\n"
//                    + ",'FF010001000','FF011001000','FF012001000','FF013001000'\n"
//                    + ",'FF017001000','FF018001000','FF019001000','FF020001000'\n"
//                    + ",'FF024000008','FF024001000','FF025000008','FF031001000'\n"
//                    + ",'FF032001000','FF037001000','FF039001000' )\n"
//                    + "AND CAST(SUBSTR(DATERUNREPORT,5,2)AS INT)=  '" + Month + "'\n"
//                    + "AND CAST(SUBSTR(DATERUNREPORT,1,4)as INT)= '" + Year + "'\n"
//                    + "AND C.MTCONO = D.MMCONO\n"
//                    + "AND C.MTITNO = D.MMITNO\n"
//                    + "AND D.MMITGR BETWEEN 'SH01'\n"
//                    + "AND 'SH07'\n"
//                    + "AND A.UACONO = E.OKCONO\n"
//                    + "AND A.UACUNO = E.OKCUNO\n"
//                    + "AND A.UAIVDT  BETWEEN ffff.STARTDATE AND ffff.ENDDATE\n"
//                    + "AND GGGGG.UBORNO=A.UAORNO\n"
//                    + "AND CUSTNAMES.OPCUNO=A.UACUNO\n"
//                    + "AND CUSTNAMES.OPCONO=A.UACONO\n"
//                    + "AND OPADID='DELI02'\n"
//                    + "AND jv.ctstco ='ECAR' AND jv.CTCONO = CUSTNAMES.OPCONO AND jv.ctstky = CUSTNAMES.OPECAR\n"
//                    + "GROUP BY GGGGG.DATERUNREPORT,B.UBORNO,A.UAIVNO,A.UAIVDT,A.UACUNO,E.OKCUNM,RTRIM(E.OKCUA1)||' '||RTRIM(E.OKCUA2)||' '||RTRIM(E.OKCUA3)\n"
//                    + ",ffff.NODOCTOR,ffff.DNAME,GGGGG.NODOCUMENT,CUSTNAMES.OPCUA1,CUSTNAMES.OPCUA2,CUSTNAMES.OPCUA3,CUSTNAMES.OPCUA4,CUSTNAMES.OPTOWN,jv.CTTX40,CUSTNAMES.OPCUNO,OKCUA1,OKCUA2,OKCUA3,UBCONO,OKCUNO";
//
////            String Sql = "SELECT OAORNO, OACUNO, OKCUNM, UAIVNO, UAIVDT\n"
////                    + "FROM m3fdbprd.OOHEAD a, m3fdbprd.OCUSMA b, BRLDTA0100.VIIVRN1 c\n"
////                    + "WHERE b.OKCONO = a.OACONO \n"
////                    + "AND b.OKCUNO = a.OACUNO\n"
////                    + "AND c.UBORNO = a.OAORNO \n"
////                 + "AND UACONO = '" + LoginCono + "' \n"
////                    + "AND UAIVDT = '" + format2.format(jXStartDate.getDate()) + "'";
////            String Sql = "SELECT UACONO, UADIVI, UBORNO, UAIVNO, UAIVDT  \n"
////                    + "FROM BRLDTA0100.VIIVRN1 \n"
////                    + "WHERE UACONO = '" + LoginCono + "' \n"
////                    + "AND UAIVDT = '" + format2.format(jXStartDate.getDate()) + "' \n"
////                    + "ORDER BY UBORNO";
//            ResultSet rs = sta.executeQuery(Sql);
//
//            while (rs.next()) {
////                System.out.println(Month);
////                System.out.println(Year);
//                String getDate = rs.getString("CUSTOMERNAME").trim();
////                Date cvDate = new SimpleDateFormat("yyyyMMdd").parse(getDate);
////                jComboBox1.addItem(getDate);
//
//            }
//
//            rs.close();
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }}
//                jButton1.setEnabled(true);
//        jbSearch.setEnabled(true);
//            }
//        };
//        new Thread(runnable)
//                .start();
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_print;
    public static javax.swing.JButton btn_print1;
    public static javax.swing.JButton btn_print2;
    private javax.swing.JButton btn_set;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXDatePicker jXStartDate;
    private javax.swing.JRadioButton radiotype1;
    private javax.swing.JRadioButton radiotype2;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_end;
    private javax.swing.JTextField txt_sample;
    private javax.swing.JTextField txt_start;
    private javax.swing.JTextField txt_year;
    private javax.swing.ButtonGroup typeradio;
    // End of variables declaration//GEN-END:variables
}
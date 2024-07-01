
import DOCTOR_REPORT_R1_V2.ClassGetReport;
import DOCTOR_REPORT_R1_V2.ConnectDB2;
import DOCTOR_REPORT_R1_V2.TransportGenerate;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mahakit
 */
public class SimpleCalculator {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public Boolean testcheck2(String Years, String Month) {

        // TODO add your handling code here:
        String PathFile = System.getProperty("user.dir").toString() + "\\Report\\";
//        String name = PathFile + "SummaryDoctorMonthExcell.jasper";
//        String name = PathFile + "rptSummaryDoctorMonthXLSX.jasper";
        String name2 = PathFile + "rptSummaryDoctorMonthXLSXLocalWithAddressloc.jasper";
//        String name3 = PathFile + "rptSummaryDoctorMonthXLSX_farmpra.jasper";

        try {

            Connection conn = ConnectDB2.ConnectionDB();

            Map parameterss2 = new HashMap();
            parameterss2.put("PMonthNumber", Month);
            parameterss2.put("PYearNumber", Years);
            parameterss2.put("PMonthName", GetMonthName(Month));
//            JasperPrint print2 = JasperFillManager.fillReport(name, parameterss2, conn);
            JasperPrint print3 = JasperFillManager.fillReport(name2, parameterss2, conn);
//           JasperPrint print4 = JasperFillManager.fillReport(name3, parameterss2, conn);

//            JasperViewer view2 = new JasperViewer(print2, false);
            JasperViewer view3 = new JasperViewer(print3, false);
//            JasperViewer view4 = new JasperViewer(print4, false);
//            view2.setVisible(true);
            view3.setVisible(true);
//            view4.setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public static String GetMonthName(String MonthNo) {

        if (MonthNo.equals("01")) {
            return "มกราคม ";
        }
        if (MonthNo.equals("02")) {
            return "กุมพาพันธ์ ";
        }
        if (MonthNo.equals("03")) {
            return "มีนาคม ";
        }
        if (MonthNo.equals("04")) {
            return "เมษายน ";
        }
        if (MonthNo.equals("05")) {
            return "พฤษภาคม ";
        }
        if (MonthNo.equals("06")) {
            return "มิถุนายน ";
        }
        if (MonthNo.equals("07")) {
            return "กรกฎาคม ";
        }
        if (MonthNo.equals("08")) {
            return "สิงหาคม ";
        }
        if (MonthNo.equals("09")) {
            return "กันยายน ";
        }
        if (MonthNo.equals("10")) {
            return "ตุลาคม ";
        }
        if (MonthNo.equals("11")) {
            return "พฤศจิกายน ";
        }
        if (MonthNo.equals("12")) {
            return "ธันวาคม ";
        }

        return "";

    }
}

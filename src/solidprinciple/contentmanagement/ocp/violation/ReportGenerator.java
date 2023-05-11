package solidprinciple.contentmanagement.ocp.violation;
import solidprinciple.contentmanagement.ocp.improved.ExcelReport;
import solidprinciple.contentmanagement.ocp.improved.PdfReport;
import solidprinciple.contentmanagement.ocp.improved.Reportable;

public class ReportGenerator {
    public void generate(Reportable report) {
        if(report instanceof ExcelReport) {
            //create excel report
        } else if(report instanceof PdfReport) {
            //create pdf report
        }
    }

    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();

        Object[][] data = new Object[0][];
        generator.generate(new PdfReport(data));
        generator.generate(new ExcelReport(data));
    }
}

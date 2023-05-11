package solidprinciple.contentmanagement.ocp.improved;

public class ReportGenerator {
    public void generate(Reportable report) {
        report.generate();
    }

    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();

        Object[][] data = new Object[0][];
        generator.generate(new PdfReport(data));
        generator.generate(new ExcelReport(data));
    }
}

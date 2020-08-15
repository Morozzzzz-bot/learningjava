package inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println();
        HtmlReport reportOne = new HtmlReport();
        String textOne = reportOne.generate("Report's name", "Report's body");
        System.out.println(textOne);
        System.out.println();
        JSONReport reportTwo = new JSONReport();
        String textTwo = reportTwo.generate("Report's name", "Report's body");
        System.out.println(textTwo);
    }
}

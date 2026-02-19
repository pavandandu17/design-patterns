public class PDFExporter extends DataExporter {
    @Override
    void formatData() {
        System.out.println("Formatting data to PDF");
    }

    @Override
    boolean customerWantsLog() {
        // Ask the user if they want to log the export activity
        System.out.println("Do you want to log the export activity? (yes/no)");
        String userInput = new java.util.Scanner(System.in).nextLine();
        return userInput.equalsIgnoreCase("yes");
    }
}
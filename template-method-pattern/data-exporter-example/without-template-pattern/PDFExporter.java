public class PDFExporter {

    public void export() {
        readData();
        saveFile();
        formatData();
        logActivity();
    }

    private void readData() {
        System.out.println("Reading data from the database...");
    }

    private void saveFile() {
        System.out.println("Saving the formatted file to disk...");
    }

    private void formatData() {
        System.out.println("Formatting data into PDF");
    }

    private void logActivity() {
        System.out.println("Logging export activity.");
    }
}

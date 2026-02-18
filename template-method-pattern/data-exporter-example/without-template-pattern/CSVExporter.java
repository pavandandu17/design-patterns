public class CSVExporter {

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
        System.out.println("Formatting data into CSV");
    }

    private void logActivity() {
        System.out.println("Logging export activity.");
    }
}

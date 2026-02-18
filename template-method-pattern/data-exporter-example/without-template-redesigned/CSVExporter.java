public class CSVExporter extends DataExporter {

    void export() {
        readData();
        formatData();
        saveFile();
        logActivity();
    }

    @Override
    void formatData() {
        System.out.println("Formatting data to CSV");
    }
}
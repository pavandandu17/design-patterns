public abstract class DataExporter {

    final void export() {
        readData();
        formatData();
        saveFile();
        if(customerWantsLog()) {
            logActivity();
        }
    }

    void readData() {
        System.out.println("Reading data from the database...");
    }

    void saveFile() {
        System.out.println("Saving the formatted file to disk...");
    }

    abstract void formatData();

    boolean customerWantsLog() {
        return true;
    }

    void logActivity() {
        System.out.println("Logging export activity.");
    }   
}

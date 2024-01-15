import java.io.FileWriter;
import java.io.IOException;

public class CustomInputMismatchException extends RuntimeException {
    private static final String LOG_FILE_PATH = "C:\\Files_Laba4\\Error.txt";

    public CustomInputMismatchException(String message) {
        super(message);
        logException(message);
    }

    private void logException(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE_PATH, true)) {
            writer.write("CustomInputMismatchException: " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

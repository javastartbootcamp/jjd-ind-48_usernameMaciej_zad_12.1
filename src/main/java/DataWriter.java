import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

    public static void saveResultToFile(MathOperations[] mathOperations, String resultFileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(resultFileName));
        for (MathOperations mathOperation : mathOperations) {
            writer.write(mathOperation.getOperationWithResult());
            writer.newLine();
        }
        writer.close();
    }
}

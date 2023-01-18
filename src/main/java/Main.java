import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        final String fileName = "operations.txt";

        try {
            MathNumbers[] read = DataReader.read(fileName);
        } catch (IOException e) {
            System.err.println("Brak wskazanego pliku");
        }
    }
}
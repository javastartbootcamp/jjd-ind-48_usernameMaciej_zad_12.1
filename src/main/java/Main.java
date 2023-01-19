import java.io.IOException;

class Main {
    public static void main(String[] args) {
        final String fileName = "operations.txt";

        try {
            MathOperations[] mathOperations = DataReader.read(fileName);
            ConsolePrinter.printResults(mathOperations);
            DataWriter.saveResultToFile(mathOperations, "results.txt");
        } catch (IOException e) {
            System.err.println("Brak wskazanego pliku");
        }
    }
}
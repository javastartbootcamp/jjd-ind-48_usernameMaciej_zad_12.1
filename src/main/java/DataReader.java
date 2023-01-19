import java.io.*;
import java.util.Scanner;

public class DataReader {

    static MathOperations[] read(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        MathOperations[] result = new MathOperations[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            double number1 = Double.parseDouble(split[0]);
            String operator = split[1];
            double number3 = Double.parseDouble(split[2]);
            result[i] = new MathOperations(number1, operator, number3);
        }
        return result;
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }
}

import java.io.*;
import java.util.Scanner;

public class DataReader {

    static MathNumbers[] read(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        MathNumbers[] result = new MathNumbers[lines];
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            Double number1 = Double.parseDouble(split[0]);
            Float number2 = Float.parseFloat(split[1]);
            Double number3 = Double.parseDouble(split[2]);
            result[i] = new MathNumbers(number1, number2, number3);
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

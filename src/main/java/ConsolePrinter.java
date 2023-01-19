public class ConsolePrinter {

    public static void printResults(MathOperations[] mathOperations) {
        for (MathOperations mathOperation : mathOperations) {
            System.out.println(mathOperation.getOperationWithResult());
        }
    }
}

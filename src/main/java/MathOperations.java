public class MathOperations {
    private double a;
    private String operator;
    private double b;

    public MathOperations(double a, String operator, double b) {
        this.a = a;
        this.operator = operator;
        this.b = b;
    }

    double getResult() {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalStateException("Unexpected value");
        };
    }

    String getOperationWithResult() {
        return a + " " + operator + " " + b + " = " + getResult();
    }
}

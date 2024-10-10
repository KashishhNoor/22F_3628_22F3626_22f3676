package task1;

public class calculator {

    public calculator() {
    }

    public double addition(double num1, double num2) throws IllegalArgumentException {
        validateInput(num1, num2);
        return num1 + num2;
    }

    public double multiplication(double num1, double num2) throws IllegalArgumentException {
        validateInput(num1, num2);
        return num1 * num2;
    }

    private void validateInput(double a, double b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative.");
        }
    }

    public static void main(String[] args) {
        calculator calc = new calculator();

        try {
            double sum = calc.addition(5, 3);
            System.out.println("Sum: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            double product = calc.multiplication(4, 7);
            System.out.println("Product: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            double invalidOperation = calc.addition(-5, 3);
            System.out.println("Result: " + invalidOperation);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

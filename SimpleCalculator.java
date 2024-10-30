import java.util.Scanner;

public class SimpleCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return b == 0 ? Double.NaN : a / b;  // Handle division by zero by returning NaN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = operator == '+' ? add(num1, num2)
                : operator == '-' ? subtract(num1, num2)
                : operator == '*' ? multiply(num1, num2)
                : operator == '/' ? divide(num1, num2)
                : Double.NaN;

        System.out.println("Result: " + result);

        scanner.close();
    }
}
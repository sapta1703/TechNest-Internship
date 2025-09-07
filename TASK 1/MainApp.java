import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Calculator ---
        System.out.println("=== Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Calculator calc = new Calculator(num1, operator, num2);
        System.out.println("Result: " + calc.calculate());

        // --- Prime Checker ---
        System.out.println("\n=== Prime Checker ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        PrimeChecker prime = new PrimeChecker(n);
        if (prime.isPrime())
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is NOT a Prime Number.");

        // --- Pattern Printer ---
        System.out.println("\n=== Pattern Printing ===");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        PatternPrinter pattern = new PatternPrinter(rows);
        pattern.printPattern();
    }
}
class Calculator {
    private double num1, num2;
    private final char operator;

    public Calculator(double num1, char operator, double num2) {
        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }

    public Calculator(char operator) {
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2; 
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return num2 != 0 ? num1 / num2 : Double.NaN;
            }
            default -> {
                System.out.println("Invalid operator!");
                return Double.NaN;
            }
        }
    }
}
class PrimeChecker {
    private final int number;
    public PrimeChecker(int number) {
        this.number = number;
    }
    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }
}
class PatternPrinter {
    private final int rows;
    public PatternPrinter(int rows) {
        this.rows = rows;
    }
    public void printPattern() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

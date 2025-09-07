import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Record Management ===");
        StudentRecordManager manager = new StudentRecordManager();

        manager.addStudent(new Student(1, "Alice", 85.5));
        manager.addStudent(new Student(2, "Bob", 90.0));
        manager.addStudent(new Student(3, "Charlie", 76.3));

        manager.displayStudents();
        manager.searchStudentById(2);
        manager.searchStudentById(5);

        System.out.println("\n=== Calculator with Exception Handling ===");
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = calc.calculate(num1, op, num2);
            System.out.println("✅ Result: " + result);
        }
        catch (InvalidOperationException e) {
            System.out.println("⚠ Error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("⚠ Error: Invalid input type! Please enter numbers only.");
        }
        finally {
            System.out.println("Calculator program finished.");
        }
    }
}
class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}
class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

class StudentRecordManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("✅ Student added: " + s);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.");
        } else {
            System.out.println("📚 Student Records:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("🔍 Found: " + s);
                return;
            }
        }
        System.out.println("❌ Student with ID " + id + " not found.");
    }
}
class Calculator {
    public double calculate(double a, char operator, double b) throws InvalidOperationException {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new InvalidOperationException("Division by zero is not allowed!");
                return a / b;
            default:
                throw new InvalidOperationException("Invalid operator: " + operator);
        }
    }
}

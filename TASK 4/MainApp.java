import java.io.*;
import java.util.*;
public class MainApp {

    private static final Scanner sc = new Scanner(System.in);

    // Write content to file (overwrite if exists)
    public static void writeFile(String filename) {
        try (FileWriter fw = new FileWriter(filename)) {
            System.out.println("Enter text to write (type 'exit' on new line to finish):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                fw.write(line + System.lineSeparator());
            }
            System.out.println("✅ File written successfully!");
        } catch (IOException e) {
            System.out.println("⚠ Error writing file: " + e.getMessage());
        }
    }

    // Read content from file
    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println("📖 File Content:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠ File not found: " + filename);
        } catch (IOException e) {
            System.out.println("⚠ Error reading file: " + e.getMessage());
        }
    }

    // Append new content to file
    public static void updateFile(String filename) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            System.out.println("Enter text to append (type 'exit' on new line to finish):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                fw.write(line + System.lineSeparator());
            }
            System.out.println("✅ File updated successfully!");
        } catch (IOException e) {
            System.out.println("⚠ Error updating file: " + e.getMessage());
        }
    }

    // Main Menu
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== FILE HANDLING UTILITY ===");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Update File");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Invalid input. Please enter a number.");
                continue;
            }

            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            switch (choice) {
                case 1: writeFile(filename); break;
                case 2: readFile(filename); break;
                case 3: updateFile(filename); break;
                case 4: System.out.println("👋 Exiting program."); return;
                default: System.out.println("⚠ Invalid option.");
            }
        }
    }
}

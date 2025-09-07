# 🚀 Java Beginner Projects

This repository contains **four beginner-friendly Java tasks** that cover the basics of programming, OOP, exception handling, and file handling.  
Each task is implemented in a **single file** and can be run using any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or the command line.

---

# 📂 Project Structure

.
        ├── Task1_Basics.java # Calculator, Prime Checker, Pattern Printing
        ├── Task2_OOP.java # Classes, Inheritance, Polymorphism, Bank System
        ├── Task3_Collections_Exceptions.java # Student Record Management, Exception Handling Calculator
        ├── FileUtility.java # CLI File Handling Utility (Read, Write, Update)
        ├── README.md # Documentation

---

# 📝 Task 1 – Basics (Calculator, Prime Checker, Pattern Printing)

## Objectives
- Java installation & setup (JDK + IDE)  
- Basic syntax, variables, data types  
- Operators, conditionals, loops  
- Input/Output using `Scanner`  

## Features
- **Calculator** (Addition, Subtraction, Multiplication, Division)  
- **Prime Number Checker**  
- **Pattern Printing** (Simple star patterns)  

## Sample Output
Calculator:
Enter first number: 10
Enter second number: 5
Choose operation (+,-,*,/): *
Result = 50

Prime Checker:
Enter number: 7
7 is a Prime Number

Pattern:
*
**

markdown
Copy code

---

# 📝 Task 2 – OOP (Animal Hierarchy & Bank System)

## Objectives
- Classes and Objects  
- Inheritance, Polymorphism, Encapsulation, Abstraction  
- Constructors & Method Overloading  

## Features
- **Class Hierarchy Example** → `Animal → Dog/Cat`  
- **Bank Account System**:
  - Deposit, Withdraw, Check Balance  
  - Proper use of encapsulation with private variables and getters/setters  

## Sample Output
Dog says: Woof!
Cat says: Meow!

Bank Account Created
Deposited 1000.0
Withdrawn 300.0
Balance = 700.0

markdown
Copy code

---

# 📝 Task 3 – Collections & Exception Handling

## Objectives
- Arrays, ArrayList, HashMap, HashSet  
- Custom Exceptions  
- try-catch-finally, throw/throws  

## Features
- **Student Record Management**:
  - Store student details in an `ArrayList`  
  - Display all student records  
- **Calculator with Exception Handling**:
  - Handles divide-by-zero  
  - Handles invalid inputs  

## Sample Output
Student Records:
ID: 101, Name: Alice
ID: 102, Name: Bob

Calculator:
Enter first number: 5
Enter second number: 0
Operation: /
⚠ Error: Division by zero is not allowed.

yaml
Copy code

---

# 📝 Task 4 – File Handling Utility

## Objectives
- FileReader, FileWriter, BufferedReader  
- Reading, Writing, Updating text files  

## Features
- **CLI Menu** for file operations:
  - Write → Creates/overwrites file content  
  - Read → Displays file content  
  - Update → Appends new content to file  

## Sample Output
=== FILE HANDLING UTILITY ===

Write to File

Read from File

Update File

Exit
Choose an option: 1
Enter file name: notes.txt
Enter text to write (type 'exit' to finish):
Hello Java
This is a test file.
exit
✅ File written successfully!

Choose an option: 2
Enter file name: notes.txt
📖 File Content:
Hello Java
This is a test file.

yaml
Copy code

---

# ⚙️ Tools & Requirements
- **JDK 8 or later**  
- **IDE**: IntelliJ IDEA / Eclipse / VS Code  
- Command-line compilation supported:
  ```bash
  javac Task1_Basics.java
  java Task1_Basics
📌 Deliverables
Java source files (.java)

README.md (this file)
Sample test files (for file handling utility, e.g., notes.txt)

👨‍💻 Author
Developed by Saptarshi Sengupta.

// Topic: Constructor Chaining using this() in Java
// 
// Key Concepts:
// 1. Constructor Chaining: Process of calling one constructor from another within the same class.
// 2. this(): Keyword used to invoke another constructor in the SAME class.
// 3. Rule: this() MUST be the very FIRST statement in any constructor where it is used.
// 4. Purpose: Avoids code duplication by delegating initialization logic to a target constructor.

class Student {

    // Instance variables (fields) representing student properties
    String name;
    int rollNumber;
    int marks;

    // 1. No-Argument Constructor (Default values)
    // Flow: Chains directly to the 3-argument constructor with default values ("Unknown", -1, 0)
    Student() {
        this("Unknown", -1); // Calls 3-argument constructor
        System.out.println("  [Flow Note] No-Arg Constructor completed execution.");
    }

    // 2. One-Argument Constructor (Name specified)
    // Flow: Chains to the 3-argument constructor with provided name and default rollNumber (-1) & marks (0)
    Student(String name) {
        this(name, -1, 0); // Calls 3-argument constructor
        System.out.println("  [Flow Note] 1-Arg Constructor (Name) completed execution.");
    }

    // 3. Two-Argument Constructor (Name and Roll Number specified)
    // Flow: Chains to the 3-argument constructor with provided name, rollNumber, and default marks (0)
    Student(String name, int rollNumber) {
        this(name, rollNumber, 222); // Calls 3-argument constructor
        System.out.println("  [Flow Note] 2-Arg Constructor (Name, RollNo) completed execution.");
    }

    // 4. Three-Argument Constructor (Primary / Main Target Constructor)
    // Flow: Performs the actual assignment of parameters to instance variables
    Student(String name, int rollNumber, int marks) {
        // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        System.out.println("  [Flow Note] 3-Arg Main Constructor initialized instance variables.");
    }

    // Helper method to print student details cleanly
    public void displayInfo() {
        System.out.println("  -> Name       : " + this.name);
        System.out.println("  -> Roll Number: " + this.rollNumber);
        System.out.println("  -> Marks      : " + this.marks);
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    CONSTRUCTOR CHAINING DEMONSTRATION & TESTS    ");
        System.out.println("==================================================\n");

        // TEST CASE 1: No-arg constructor
        System.out.println("[TEST CASE 1] Instantiating via Student():");
        Student student1 = new Student();
        student1.displayInfo();

        // // TEST CASE 2: 1-arg constructor (Name)
        // System.out.println("[TEST CASE 2] Instantiating via Student(\"Alice\"):");
        // Student student2 = new Student("Alice");
        // student2.displayInfo();

        // // TEST CASE 3: 2-arg constructor (Name, Roll Number)
        // System.out.println("[TEST CASE 3] Instantiating via Student(\"Bob\", 101):");
        // Student student3 = new Student("Bob", 101);
        // student3.displayInfo();

        // // TEST CASE 4: 3-arg constructor (Name, Roll Number, Marks)
        // System.out.println("[TEST CASE 4] Instantiating via Student(\"Charlie\", 102, 95):");
        // Student student4 = new Student("Charlie", 102, 95);
        // student4.displayInfo();
    }
}




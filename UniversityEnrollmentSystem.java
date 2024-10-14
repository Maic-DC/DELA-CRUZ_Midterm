// Base class Person
class Person {
    String name; 
    int age;

    // Constructor to initialize the name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student class - Subclass of Person
class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    // Constructor to initialize student details
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate the total fee
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Overridden method to display student information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// Instructor class - Subclass of Person
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    // Constructor to initialize instructor details
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overridden method to display instructor information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Test program to demonstrate inheritance and polymorphism
public class UniversityEnrolmentSystem {
    // Method to print details of a Person object
    public static void printDetails(Person p) {
        p.displayInfo();
        System.out.println();
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Jessa", 20, "S12345", "Computer Engineering", 15);
        Student student2 = new Student("Carlo", 21, "S67890", "Computer Science", 12);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Carol", 35, "E12345", "Computer Science", 50000);
        Instructor instructor2 = new Instructor("David", 40, "E67890", "Mathematics", 60000);

        // Print details of each person using the printDetails method
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
} 

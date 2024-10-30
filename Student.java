public class Student {

    // Instance variables
    String name;          // Name of the student
    int age;              // Age of the student
    float grade;          // Grade or GPA of the student
    String major;         // Major or field of study
    boolean isFullTime;   // Whether the student is full-time

    // Static variable (common for all Student objects)
    static String schoolName = "Green Valley High School";

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("School: " + schoolName);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
        System.out.println("Full-Time: " + (isFullTime ? "Yes" : "No"));
    }

    // Main method to create and display a Student object
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();

        // Assign values to the Student object fields directly
        student1.name = "Alice Johnson";
        student1.age = 20;
        student1.grade = 3.8f;
        student1.major = "Computer Science";
        student1.isFullTime = true;

        // Display details of the student
        student1.displayStudentDetails();
    }
}
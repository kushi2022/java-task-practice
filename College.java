public class College {

    // Instance variables (Attributes of each College object)
    String collegeName;         // Non-primitive (String)
    int establishedYear;        // Primitive (int)
    float campusArea;           // Primitive (float, in acres)
    boolean isPublic;           // Primitive (boolean)
    char grade;                 // Primitive (char, e.g., 'A', 'B', 'C')

    // Static variable (Common for all College objects)
    static String country = "USA";

    // Constructor to initialize the variables
    public College(String name, int year, float area, boolean publicStatus, char grade) {
        this.collegeName = name;
        this.establishedYear = year;
        this.campusArea = area;
        this.isPublic = publicStatus;
        this.grade = grade;
    }

    // Method to display college details
    public void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Campus Area: " + campusArea + " acres");
        System.out.println("Public: " + (isPublic ? "Yes" : "No"));
        System.out.println("Grade: " + grade);
        System.out.println("Country: " + country);
    }

    // Main method to create and display college instances
    public static void main(String[] args) {
        // Create a College object
        College college1 = new College("Green Valley University", 1965, 250.5f, true, 'A');

        // Display details of the college
        college1.displayCollegeDetails();
    }
}
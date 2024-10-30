public class College {

    // Instance variables
    String collegeName;      // Name of the college
    int establishedYear;     // Year the college was established
    float campusArea;        // Campus area in acres
    boolean isPublic;        // Whether the college is public
    char grade;              // Grade or ranking of the college

    // Static variable (common for all College objects)
    static String country = "USA";

    // Method to display college details
    public void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Campus Area: " + campusArea + " acres");
        System.out.println("Public: " + (isPublic ? "Yes" : "No"));
        System.out.println("Grade: " + grade);
        System.out.println("Country: " + country);
    }

    // Main method to create and display a College object
    public static void main(String[] args) {
        // Create a College object
        College college1 = new College();

        // Assign values to the College object fields directly
        college1.collegeName = "Green Valley University";
        college1.establishedYear = 1965;
        college1.campusArea = 300.5f;
        college1.isPublic = true;
        college1.grade = 'A';

        // Display details of the college
        college1.displayCollegeDetails();
    }
}
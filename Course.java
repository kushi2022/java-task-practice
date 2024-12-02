abstract class Course {

    public abstract void qualityAssurance();

    public void basicDetails() {
        System.out.println("Information about the modes of learing the course ");
    }

    public static void main(String[] args) {
        Course onlineCourse = new onlineCourse();
        onlineCourse.qualityAssurance();
        onlineCourse.basicDetails();

        Course onsiteCourse = new onsiteCourse();
        onsiteCourse.qualityAssurance();
        onsiteCourse.basicDetails();

        Course hybridCourse = new hybridCourse();
        hybridCourse.qualityAssurance();
        hybridCourse.basicDetails();
    }
}
class onlineCourse extends Course{
    @Override
    public void qualityAssurance() {
        System.out.println(" Fully virtual and accessible from anywhere ");
    }
}
class onsiteCourse extends Course{
    @Override
    public void qualityAssurance() {
        System.out.println(" Conducted in offline classrooms ");
    }
}
class hybridCourse extends Course{
    @Override
    public void qualityAssurance() {
        System.out.println("  Combines online and onsite learning. ");
    }
}

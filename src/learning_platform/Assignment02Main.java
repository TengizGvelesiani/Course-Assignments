package learning_platform;

import learning_platform.interactions.Payment;
import learning_platform.materials.Course;
import learning_platform.service.PurchaseService;
import learning_platform.users.Instructor;
import learning_platform.users.Student;

public class Assignment02Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor("instructor@example.com", "Alice", "Smith", 4.8);
        Course course = new Course("Intro to Java", 99.0, instructor, 50, 0);

        Student student = new Student("Ana", "Johnson", "student@example.com", "anaJ");
        Payment payment = new Payment(120.0);

        PurchaseService service = new PurchaseService();

        service.previewPurchase(student, course, payment);
        service.buyCourse(student, course, payment);

        System.out.println("Total enrollments: " + PlatformRegistry.getTotalEnrollments());
    }
}


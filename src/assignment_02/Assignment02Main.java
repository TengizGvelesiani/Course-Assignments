package assignment_02;

import assignment_02.interactions.Payment;
import assignment_02.materials.Course;
import assignment_02.service.PurchaseService;
import assignment_02.users.Instructor;
import assignment_02.users.Student;

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


package learning_platform;

import java.math.BigDecimal;

import learning_platform.interactions.Payment;
import learning_platform.materials.Course;
import learning_platform.materials.Lesson;
import learning_platform.materials.Module;
import learning_platform.materials.Question;
import learning_platform.materials.Quiz;
import learning_platform.service.PurchaseService;
import learning_platform.users.Admin;
import learning_platform.users.Instructor;
import learning_platform.users.Student;

public class Assignment02Main {

    public static void main(String[] args) {
        Admin admin = new Admin("Marta", "Ivanova", "admin@example.com", 5);

        Instructor instructor = new Instructor(
                "instructor@example.com",
                "Alice",
                "Smith",
                4.8,
                new Course[1]
        );

        Lesson lesson1 = new Lesson("Variables and types");
        Lesson lesson2 = new Lesson("If/else and loops");

        Question question1 = new Question("What is the size of int in Java?");
        Question question2 = new Question("What does JVM stand for?");
        Quiz quiz = new Quiz(15, new Question[] { question1, question2 });

        Module module = new Module("Java Basics", new Lesson[] { lesson1, lesson2 }, quiz);
        Course course = new Course(
                "Intro to Java",
                new BigDecimal("99.00"),
                instructor,
                2,
                new Module[] { module }
        );

        instructor.setCoursesTaught(new Course[] { course });

        Student student = new Student("Ana", "Johnson", "student@example.com", "anaJ", 3);
        Payment payment = new Payment(new BigDecimal("120.00"));

        LearningPlatform platform = new LearningPlatform(
                "Global Learning Platform",
                new Course[] { course },
                new Student[] { student },
                new Instructor[] { instructor },
                new Admin[] { admin }
        );

        PurchaseService service = new PurchaseService();

        service.previewPurchase(student, course, payment);
        service.buyCourse(student, course, payment);

        System.out.println("Total enrollments: " + PlatformRegistry.getTotalEnrollments());
        System.out.println("Platform: " + platform.getName());
    }
}


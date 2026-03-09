package assignment_02.service;

import assignment_02.PlatformRegistry;
import assignment_02.interactions.Payment;
import assignment_02.materials.Course;
import assignment_02.users.Student;

public class PurchaseService {

    public void buyCourse(Student student, Course course, Payment payment) {
        System.out.println("\n--- Starting Transaction ---");
        if(course.getLimit() > course.getEnrolledStudentsCount()){
            if (payment.getAmount() >= course.getPrice()) {
                payment.setProcessed(true);
                PlatformRegistry.incrementEnrollment();
                System.out.println("Payment Approved for: " + student.getEmail());
                System.out.println("Course: " + course.getTitle() + " has been added to dashboard.");
            } else {
                System.out.println("Transaction Declined: Insufficient Funds.");
            }
        }else{
            System.out.println("Limit Reached.");
        }

    }

    public void previewPurchase(Student student, Course course, Payment payment) {
        System.out.println("\n--- Purchase Preview ---");
        System.out.println("Student: " + student.getUsername());
        System.out.println("Course: " + course.getTitle());
        System.out.println("Price: " + course.getPrice());
        System.out.println("Payment amount: " + payment.getAmount());
        if (payment.getAmount() >= course.getPrice()) {
            System.out.println("Status: This purchase would be APPROVED. Change: " + (payment.getAmount() - course.getPrice()));
        } else {
            System.out.println("Status: This purchase would be DECLINED (insufficient funds).");
        }
    }

}

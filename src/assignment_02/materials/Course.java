package assignment_02.materials;

import assignment_02.users.Instructor;

public class Course {

    private String title;
    private double price;
    private Instructor instructor;
    private int limit;
    private int enrolledStudentsCount;

    public Course(String title, double price, Instructor instructor, int limit, int enrolledStudentsCount) {
        this.title = title;
        this.price = price;
        this.instructor = instructor;
        this.limit = limit;
        this.enrolledStudentsCount = enrolledStudentsCount;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Instructor getInstructor(){ return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public int getLimit() { return limit; }
    public void setLimit(int limit) { this.limit = limit; }

    public int getEnrolledStudentsCount() { return enrolledStudentsCount; }
    public void setEnrolledStudentsCount(int enrolledStudentsCount) { this.enrolledStudentsCount = enrolledStudentsCount; }
}

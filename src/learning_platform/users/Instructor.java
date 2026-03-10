package learning_platform.users;

public class Instructor extends User {

    private double rating;

    public Instructor(String email, String name, String surname, double rating) {
        super(name, surname, email);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

}

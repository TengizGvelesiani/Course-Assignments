package learning_platform.users;

public class Student extends User {

    private String username;

    public Student(String name, String surname, String email, String username) {
        super(name, surname, email);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}

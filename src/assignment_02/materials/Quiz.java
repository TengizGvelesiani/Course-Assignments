package assignment_02.materials;

public class Quiz {

    private int timeLimitMinutes;
    private int numberOfQuestions;

    public Quiz(int limit, int numberOfQuestions) {
        this.timeLimitMinutes = limit;
        this.numberOfQuestions = numberOfQuestions;
    }

    public int getTimeLimit() { return timeLimitMinutes; }
    public void setTimeLimit(int limit) { this.timeLimitMinutes = limit; }

    public int getNumberOfQuestions() { return numberOfQuestions; }
    public void setNumberOfQuestions(int numberOfQuestions) { this.numberOfQuestions = numberOfQuestions; }
}

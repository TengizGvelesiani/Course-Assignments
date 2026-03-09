package assignment_02.interactions;

public class Payment {

    private double amount;
    private boolean isProcessed;

    public Payment(double amount) {
        this.amount = amount;
        this.isProcessed = false;
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public boolean isProcessed() { return isProcessed; }
    public void setProcessed(boolean p) { this.isProcessed = p; }
}

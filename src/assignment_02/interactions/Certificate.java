package assignment_02.interactions;

public class Certificate {

    private String issueDate;
    private String certificateOwner;

    public Certificate(String date, String certificateOwner) {
        this.issueDate = date;
        this.certificateOwner = certificateOwner;
    }

    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String date) { this.issueDate = date; }

    public String getCertificateOwner() { return certificateOwner; }
    public void setCertificateOwner(String certificateOwner) { this.certificateOwner = certificateOwner; }
}

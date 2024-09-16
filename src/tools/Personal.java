package tools;

public class Personal {
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String password;
    private final String jobField;
    private final String contact;
    private final double height;
    Status status;
    Gender gender;


    // constructor
    
    // dating status -----------------------------
    public enum Status{
        SINGLE, MARRIED, COMPLICATED
    } 

    // gender
    public enum Gender{
        MALE, FEMALE
    }

    public Personal(String firstname, String lastname, String email, String contact, double height, String password,String jobField,Status status, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.contact = contact;
        this.height = height;
        this.password = password;
        this.jobField = jobField;
        this.status = status;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public double getHeight() {
        return height;
    }

    public String getPassword() {
        return password;
    }

    public String getJobField() {
        return jobField;
    }

    @Override
    public String toString() {
        return "Personal [firstname : " + firstname + ", lastname : " + lastname + ", email : " + email + ", password : "
                + password + ", jobField : " + jobField + ", contact : " + contact + ", height : " + height + ", status : "
                + status + ", gender : " + gender + "]";
    }

    


}

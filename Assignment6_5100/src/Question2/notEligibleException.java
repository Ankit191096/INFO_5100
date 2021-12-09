package Question2;

public class notEligibleException extends Exception{
    public notEligibleException(){
        super("The age of the applicant is too early to apply for a driving license");
    }

    public notEligibleException(String message) {
        super(message);
    }
}

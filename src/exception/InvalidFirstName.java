package exception;

public class InvalidFirstName extends RuntimeException
{
    public InvalidFirstName(String message) {
        super(message);
    }
}

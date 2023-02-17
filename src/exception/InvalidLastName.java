package exception;

public class InvalidLastName extends RuntimeException
{
    public InvalidLastName(String message) {
        super(message);
    }
}

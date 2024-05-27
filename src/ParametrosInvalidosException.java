/**
 * This exception is thrown when invalid parameters are passed to a method or constructor.
 */
public class ParametrosInvalidosException extends Exception {

    /**
     * Constructs a new ParametrosInvalidosException with the specified detail message.
     *
     * @param message the detail message
     */
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    /**
     * Constructs a new ParametrosInvalidosException with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause   the cause
     */
    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }
}

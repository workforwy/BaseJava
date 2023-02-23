package c15_exception;

/**
 * 自定义异常
 */
public class PasswordException
        extends Exception {

    public PasswordException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PasswordException(String message, Throwable cause,
                             boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public PasswordException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}


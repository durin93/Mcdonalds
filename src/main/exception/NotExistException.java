package main.exception;

public class NotExistException extends RuntimeException {


    public NotExistException() {
    }

    public NotExistException(String message) {
        super(message);
    }
}

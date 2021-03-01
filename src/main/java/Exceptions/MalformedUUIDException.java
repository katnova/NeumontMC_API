package Exceptions;

public class MalformedUUIDException extends Throwable {
    public MalformedUUIDException(String s, Throwable error) {
        super("Malformed UUID: " + s, error);
    }
}
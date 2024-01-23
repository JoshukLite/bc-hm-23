package org.simple.exception;

public class EntityManagerException extends RuntimeException {
    public EntityManagerException(String message, Throwable cause) {
        super(message, cause);
    }
}

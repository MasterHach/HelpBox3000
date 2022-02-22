package com.example.HelpBox3000.exception;

public class UnexpectedRoleException extends RuntimeException{
    public UnexpectedRoleException() {}

    public UnexpectedRoleException(String message) {
        super(message);
    }

    public UnexpectedRoleException(String message, Throwable cause) {
        super(message, cause);
    }
}

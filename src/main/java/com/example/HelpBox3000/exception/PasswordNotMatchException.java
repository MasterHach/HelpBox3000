package com.example.HelpBox3000.exception;

public class PasswordNotMatchException extends RuntimeException{
    public PasswordNotMatchException(){}

    public PasswordNotMatchException(String message) {
        super(message);
    }

    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }
}

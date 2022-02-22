package com.example.HelpBox3000.exception;

import net.bytebuddy.implementation.bytecode.Throw;

public class UniqueKeyException extends RuntimeException{
    public UniqueKeyException(){}

    public UniqueKeyException(String message) {
        super(message);
    }

    public UniqueKeyException(String message, Throwable cause) {
        super(message, cause);
    }
}

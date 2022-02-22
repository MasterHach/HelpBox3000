package com.example.HelpBox3000.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
public class ApiError {
    private HttpStatus status;
    private Date timestamp;
    private String message;
    private String debugMessage;

    private ApiError() {
        timestamp = getTimestamp();
    }

    ApiError(HttpStatus status) {
        this();
        this.status = status;
    }

    ApiError(HttpStatus status, Throwable exception) {
        this();
        this.status = status;
        this.message = "Unexpected error";
        this.debugMessage = exception.getLocalizedMessage();
    }

    ApiError(HttpStatus status, String message, Throwable exception) {
        this();
        this.status = status;
        this.message = message;
        this.debugMessage = exception.getLocalizedMessage();
    }
}
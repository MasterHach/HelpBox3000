package com.example.HelpBox3000.exception;


import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice("com.example.HelpBox3000.controller")
public class UserExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RestClientException.class)
    protected ResponseEntity<ApiError> handRequestClientExceptions(RestClientException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e);
        return new ResponseEntity<ApiError>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    protected ResponseEntity<ApiError> handleUserNotFoundException(UserNotFoundException exception) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception);
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(SQLException.class)
    protected ResponseEntity<ApiError> handUSQLException(SQLException exception) {
        ApiError apiError = new ApiError(HttpStatus.BAD_GATEWAY, exception);
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(UniqueKeyException.class)
    protected ResponseEntity<ApiError> handUniqueKeyException(UniqueKeyException exception) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception);
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(UnexpectedRoleException.class)
    protected ResponseEntity<ApiError> handUnexpectedRoleException(UnexpectedRoleException exception) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception);
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(PasswordNotMatchException.class)
    protected ResponseEntity<ApiError> handPasswordNotMatchException(PasswordNotMatchException exception) {
        ApiError apiError = new ApiError(HttpStatus.UNAUTHORIZED, exception);
        return buildResponseEntity(apiError);
    }

    private ResponseEntity<ApiError> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<ApiError>(apiError, apiError.getStatus());
    }
}

package com.example.HelpBox3000.ExceptionHendlers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice("com.example.HelpBox3000.controllers.")
public class UserExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RestClientException.class)
    protected ResponseEntity<ApiError> handRequestClientExceptions(RestClientException e) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e);
        logger.error("############## FATAL ERROR ##############\nError:\t" + e);
        return new ResponseEntity<ApiError>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ApiError> handleException(Exception ex) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex);
        logger.error("############## FATAL ERROR ##############\nError:\t" + ex);
        return buildResponseEntity(apiError);
    }


    private ResponseEntity<ApiError> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}

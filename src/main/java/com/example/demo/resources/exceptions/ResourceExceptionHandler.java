package com.example.demo.resources.exceptions;


import com.example.demo.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {
        StandardError error = new StandardError(
                System.currentTimeMillis(),
                404,
                "Not found", e.getMessage(),
                "/users"
                );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}

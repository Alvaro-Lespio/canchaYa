package com.alvaro.savingmoney.canchaya.excepcions;

import com.alvaro.savingmoney.canchaya.entities.DTO.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionConfig {
    //Configuration for Validation MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((org.springframework.validation.FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    //User not found exception

    @ExceptionHandler(UserUpdateFailedException.class)
    public ResponseEntity<ExceptionDTO> badUpdateUser(UserUpdateFailedException ex) {
        ExceptionDTO exceptionDTO = new ExceptionDTO("The user couldn't be update");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.NOT_FOUND);
    }
}

package com.ecommerce.exception;

import java.io.NotSerializableException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ErrorDetails> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException exception) {
		
		ErrorDetails details = new ErrorDetails();
		details.setErrorDescription(exception.getLocalizedMessage());
		details.setFieldName(exception.getName());
		details.setStatusCode(HttpStatus.BAD_REQUEST.name());
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public ResponseEntity<ErrorDetails> handleEmptyResultDataAccessException(EmptyResultDataAccessException exception) {
		
		ErrorDetails details = new ErrorDetails();
		details.setErrorDescription("No Results found for given criteria");
		details.setFieldName(null);
		details.setStatusCode(HttpStatus.NOT_FOUND.name());
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}
}

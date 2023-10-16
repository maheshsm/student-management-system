package com.ecommerce.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
		
		ErrorDetails details = new ErrorDetails();
		details.setErrorDescription(exception.getFieldError().getDefaultMessage());
		details.setFieldName(exception.getParameter().getParameterName());
		details.setStatusCode(HttpStatus.NOT_FOUND.name());
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = DuplicateNameException.class)
	public ResponseEntity<ErrorDetails> handleDuplicateNameException(DuplicateNameException exception) {
		
		ErrorDetails details = new ErrorDetails();
		details.setErrorDescription(exception.getMessage());
		details.setFieldName(exception.getField());
		details.setStatusCode(HttpStatus.BAD_REQUEST.name());
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.BAD_REQUEST);
	}	
}

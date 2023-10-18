package com.ecommerce.exception;

public class DuplicateNameException extends RuntimeException {

	private String field;

	private String message;

	private String value;

	public DuplicateNameException(String field, String message, String value) {
		super();
		this.field = field;
		this.message = message;
		this.value = value;
	}

	
	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "DuplicateNameException [field=" + field + ", message=" + message + ", value=" + value + "]";
	}

}

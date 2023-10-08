package com.ecommerce.exception;

public class ErrorDetails {

	private String errorDescription;
	
	private String fieldName;
	
	private String statusCode;

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorDescription=" + errorDescription + ", fieldName=" + fieldName + ", statusCode="
				+ statusCode + "]";
	}
}

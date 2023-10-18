package com.ecommerce.enums;

public enum Status {

	ACTIVE("1"), INACTIVE("0"), NEVER_ADMITTED("2");
	
	private String id;

	private Status(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

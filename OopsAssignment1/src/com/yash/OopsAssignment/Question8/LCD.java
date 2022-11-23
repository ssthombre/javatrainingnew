package com.yash.OopsAssignment.Question8;

public class LCD extends Electronics{

	int id;
	String semiconductorType;
	String dateOfManufacturing;

	public LCD(int id, String semiconductorType, String dateOfManufacturing) {
		super(id, semiconductorType, dateOfManufacturing);
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemiconductorType() {
		return semiconductorType;
	}

	public void setSemiconductorType(String semiconductorType) {
		this.semiconductorType = semiconductorType;
	}

	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}


}

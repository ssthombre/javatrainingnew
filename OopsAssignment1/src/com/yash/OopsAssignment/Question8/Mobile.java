package com.yash.OopsAssignment.Question8;

public class Mobile extends Electronics{

	int id;
	String semiconductorType;
	String dateOfManufacturing;

	public Mobile(int id, String semiconductorType, String dateOfManufacturing) {
		super();
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

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}

}

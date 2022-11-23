package com.yash.OopsAssignment.Question10;

public class Product implements Cloneable {

	public Product(int pid, int price, int unitOfMeasurement, String pname) {
		super();
		this.pid = pid;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
		this.pname = pname;
	}

	private int pid, price, unitOfMeasurement;
	private String pname;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(int unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public String getPname() {
		return pname;
	}

}

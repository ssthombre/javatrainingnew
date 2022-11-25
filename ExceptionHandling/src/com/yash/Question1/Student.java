package com.yash.Question1;

public class Student {

	private static int rollno;
	private static String sname;
	private static String saddress;
	private static StudentResult srobj;

	public static int getRollno() {
		return rollno;
	}

	public static void setRollno(int rollno) {
		Student.rollno = rollno;
	}

	public static String getSname() {
		return sname;
	}

	public static void setSname(String sname) {
		Student.sname = sname;
	}

	public static String getSaddress() {
		return saddress;
	}

	public static void setSaddress(String saddress) {
		Student.saddress = saddress;
	}

	public static StudentResult getSrobj() {
		return srobj;
	}

	public static void setSrobj(StudentResult srobj) {
		Student.srobj = srobj;
	}

	public static void Display() {
		// TODO Auto-generated method stub

	}

}

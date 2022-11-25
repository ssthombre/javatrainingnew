package com.yash.ExceptionHandling;

public class ExceptionChecked {

	public static void main(String[] args) {

		// FileInputStream f=new FileInputStream("D:/xyz.txt");//filenotfound(checked)
		try {
			String s = null;
			System.out.println(s.length());// NullPointerException
			System.out.println("Hello");
		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("Bye");// normal termination
		// Class.forName("com.mysql.jdbc.Driver");//classnotfound exception(checked)

	}
}

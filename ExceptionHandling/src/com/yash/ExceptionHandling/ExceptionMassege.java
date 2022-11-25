package com.yash.ExceptionHandling;

public class ExceptionMassege {

	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c = 0;
			// c=a/b;
			System.out.println(c);
			System.exit(0);
		}
		/*
		 * catch(ArithmeticException e) { //e.printStackTrace();
		 * //System.out.println(e); System.out.println(e.getMessage()); System.exit(); }
		 */
		finally {
			// f.close();
			System.out.println("I am in Finally Block");
		}
	}
}

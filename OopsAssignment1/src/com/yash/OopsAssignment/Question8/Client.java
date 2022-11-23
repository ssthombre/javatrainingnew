package com.yash.OopsAssignment.Question8;

public class Client {

public static void main(String[] args) {
		
		Electronics ee = new Mobile(1, "Pure", "05/08/1997");

		System.out.println(ee);
		
		Electronics ee1 = new Laptop(1, "Pure", "05/08/1997");
		
		System.out.println(ee1);
		
		Electronics ee2 = new LCD(1, "Pure", "05/08/1997");
		
		System.out.println(ee2);

	}

}



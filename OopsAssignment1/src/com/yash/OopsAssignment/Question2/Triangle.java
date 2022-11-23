package com.yash.OopsAssignment.Question2;

public class Triangle implements Shape {

	public void area(Point[] p) {

		Point A = p[0];
		Point B = p[1];
		Point C = p[2];

		float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
		System.out.println(Math.abs(area));
	}

}

package com.yash.OnlineJavaTraining.AssignmentArrays;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Even number: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("odd number :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}
		}

	}

}

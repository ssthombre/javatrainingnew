package com.yash.OnlineJavaTraining.AssignmentArrays;

public class ThirdMaxNumber {

	public static int getThirdLargest(int[] a, int total) {

		int temp;

		for (int i = 0; i < total; i++) {

			for (int j = i + 1; j < total; j++)

			{

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		return a[total - 3];
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 77, 33, 22, 55, 99 };

		System.out.println("Third largst:" + getThirdLargest(a, 6));

		System.out.println("Third largst:" + getThirdLargest(b, 7));
	}
}

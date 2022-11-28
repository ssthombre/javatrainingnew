package com.yash.OnlineJavaTraining.AssignmentArrays;

//WAP to sort array on the basis of unit place. For example we are having following numbers:-
//10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9

public class Programno12 {

	public static void main(String[] args) {

		int[] unitArray = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
		int len = unitArray.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int k = 0; k < len; k++) {
				for (int j = 0; j < 10; j++) {
					int r = unitArray[i] % 10;
					if (r == j) {
						temp = unitArray[i];
						unitArray[i] = unitArray[k];
						unitArray[k] = temp;
					}
					// if(unitArray[i])
				}
			}
		}
		for (int r = len - 1; r >= 0; r--) {
			// if(r==2)
			System.out.println(unitArray[r]);
		}

	}

}

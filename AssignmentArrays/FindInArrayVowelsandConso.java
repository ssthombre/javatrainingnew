package com.yash.OnlineJavaTraining.AssignmentArrays;

// You are given a sequence of Character in the form of Array. Now you have to put all vowels and 
//consonants together in the array.

public class FindInArrayVowelsandConso {

	public static void main(String[] args) {

		String a = "java";

		char c[] = a.toCharArray();

		char vowels;

		char conso;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {

				vowels = c[i];
				System.out.println("vowels:" + vowels);

			} else {
				conso = c[i];

				System.out.println("conso: " + conso);
			}

		}
	}

}

package com.yashTech.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionQuestion1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Smita");
		al.add("priyal");
		al.add("avni");
		al.add("Advaith");

		Collections.sort(al);

		System.out.println(al);

		// Collections.sort(al,Collections.reverseOrder());

		// System.out.println(al);

	}

}

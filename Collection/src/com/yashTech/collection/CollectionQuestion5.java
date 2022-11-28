package com.yashTech.collection;

import java.util.Collections;
import java.util.Vector;

public class CollectionQuestion5 {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add(15);
		v.add(2);
		v.add(6);
		v.add(4);

		System.out.println("Vector element :" + v);

		Collections.sort(v);

		System.out.println("After sorting Vector element :" + v);

	}

}

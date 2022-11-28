package com.yashTech.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class CollectionQuestion6 {

public static void main(String[] args) {
		
		HashMap<String ,Integer> hm = new HashMap<>();
		
		hm.put("Aurangabad", 10000);
		hm.put("mumbai", 5000);
		hm.put("latur",2000);
		hm.put("Beed", 3000);
		
		
		System.out.println("HashMap before sorting :"+hm);
		
		// using TreeMap sorting 
		
		TreeMap<String, Integer> sort = new TreeMap<>();
		
		sort.putAll(hm);
		
		System.out.println("After sorting hashMap:"+sort);
		
		
		
		
	}


}

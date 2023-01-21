package com.akash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap <Integer,String>();
		hm.put(1, "Akash");
		hm.put(2, "Alpha");
		hm.put(3, "Beta");
		hm.put(4, "Delta");
		System.out.println(hm);
		Set<Integer> s=hm.keySet();
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			int i=itr.next();
			System.out.println("Key"+i);
			System.out.println("Value"+hm.get(i));
		}
		
		

	}

}

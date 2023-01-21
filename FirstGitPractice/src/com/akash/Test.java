package com.akash;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Akash");
		hs.add("beta");
		System.out.println(hs);
		hs.forEach((v)->System.out.println("value"+v));
		
		

	}

}

package com.collections.java;

import java.util.HashSet;

public class MyHashSetCopy {
	 public static void main(String a[]){
	        HashSet<String> hs = new HashSet<String>();
	        //add elements to HashSet
	        hs.add("first");
	        hs.add("second");
	        hs.add("third");
	        System.out.println(hs);
	        
	        HashSet<String> subSet = new HashSet<String>();
	        subSet.add("s1");
	        subSet.add("s2");
	        System.out.println("The subset elements are:\n "+subSet);
	        hs.addAll(subSet);
	        System.out.println("HashSet content after adding another collection:");
	        System.out.println(hs);
	    }
	
}

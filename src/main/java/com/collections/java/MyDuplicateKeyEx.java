package com.collections.java;

import java.util.HashMap;
import java.util.Set;

public class MyDuplicateKeyEx {
	 public static void main(String a[]){
         
	        HashMap<Price, String> hm = new HashMap<Price, String>();
	        hm.put(new Price("Banana", 20), "Banana");
	        hm.put(new Price("Apple", 40), "Apple");
	        hm.put(new Price("Orange", 30), "Orange");
	        printMap(hm);
	        Price key = new Price("Banana", 20);
	        System.out.println("Adding duplicate key...");
	        hm.put(key, "Grape");
	        System.out.println("After adding dulicate key:");
	        printMap(hm);
	    }
	     
	    public static void printMap(HashMap<Price, String> map){
	         
	        Set<Price> keys = map.keySet();
	        for(Price p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }
	    }
	}
	 
	class Price2{
	     
	    private String item;
	    private int price;
	     
	    public Price2(String itm, int pr){
	        this.item = itm;
	        this.price = pr;
	    }
	     
	    public int hashCode(){
	        int hashcode = 0;
	        hashcode = price*20;
	        hashcode += item.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        if (obj instanceof Price) {
	            Price pp = (Price) obj;
	            return (pp.getItem().equals(this.item) && pp.getPrice() == this.price);
	        } else {
	            return false;
	        }
	    }
	     
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    }
	     
	    public String toString(){
	        return "item: "+item+"  price: "+price;
	    }
	}
	


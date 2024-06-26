package com.collections.java;

import java.util.HashSet;

public class MyDistElementEx {
	public static void main(String a[]){
        
        HashSet<Price> lhm = new HashSet<Price>();
        
        lhm.add(new Price("Banana", 20));
        
        lhm.add(new Price("Apple", 40));
        
        lhm.add(new Price("Orange", 30));
        
        for(Price pr:lhm){
            System.out.println(pr);
        }
        
        Price duplicate = new Price("Banana", 20);
        
        System.out.println("inserting duplicate object...");
        
        lhm.add(duplicate);
        
        System.out.println("After insertion:");
        for(Price pr:lhm){
            System.out.println(pr);
        }
    }
}
 
class Price4{
     
    private String item;
    private int price;
    
	private Object itemPrice;
     
    public Price4(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
    	
        System.out.println("In hashcode");
        
        int hashcode = 0;
        
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        
        if (obj instanceof Price4)
        {
            Price4 pp = (Price4) obj;
            
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



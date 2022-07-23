package com.springcore.lifecycle;

public class Samosa {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	System.out.println("inside setter");
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public Samosa(int price) {
	super();
	this.price = price;
}

public void init() {
	System.out.println("Inside init function");
}
public void destroy() {
	System.out.println("Inside destroy function");
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

}

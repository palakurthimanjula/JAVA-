package com.edu;

import java.util.*;

class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer(int id, String name, double walletBalance, String address) {
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
}

class ShoppingWebsite{
	public String purchaseItem(Item i, Customer c) throws InsufficientBalanceException,ItemOutOfStockException{
		
		if(i.isInStock==false)
			throw new ItemOutOfStockException("Item is out of Stock");
		else if(i.price > c.walletBalance)
			throw new ItemOutOfStockException("Customer wallet balance in not sufficient");
		else 
			return "Order Successfull";
	}
}

class InsufficientBalanceException extends Exception{
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class ItemOutOfStockException extends Exception{
	private static final long serialVersionUID = 1L;

	public ItemOutOfStockException(String message) {
		super(message);
	}
}
public class ShopOnline {
	public static void main(String[] args) throws InsufficientBalanceException, ItemOutOfStockException {
		
		Customer cusDet = new Customer(927392, "Steve", 5000.0, "USA");
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
		
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = obj.purchaseItem(itemDet, cusDet);
		System.out.println(out);
	}
}




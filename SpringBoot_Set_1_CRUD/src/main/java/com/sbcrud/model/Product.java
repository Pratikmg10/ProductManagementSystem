package com.sbcrud.model;

public class Product {
	private int ProductNo;
	private String Name;
	private double price;
	private String username;
	private String Password;
	public int getProductno() {
		return ProductNo;
	}
	public void setProductno(int Productno) {
		this.ProductNo = Productno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}

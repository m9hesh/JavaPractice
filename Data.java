package com.javapractice;
//private fields can only be accessed within same class
public class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	// Getter method to access private member name
	public String getName() {
		return name;
	}

	// Setter method to modify private member name
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Data data = new Data("Private Data");

		// Compile time error as name is private
		// System.out.println(data.name);

		System.out.println(data.getName()); // Accessing through getter

		data.setName("Modified Data");
		System.out.println(data.getName()); // Accessing through getter after modification
	}
}

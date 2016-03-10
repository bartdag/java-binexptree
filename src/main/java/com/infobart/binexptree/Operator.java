package com.infobart.binexptree;

public class Operator {
	
	private String name;
	
	private boolean unary;
	

	public Operator(String name, boolean unary) {
		super();
		this.name = name;
		this.unary = unary;
	}

	public String getName() {
		return name;
	}

	public boolean isUnary() {
		return unary;
	}

}

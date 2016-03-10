package com.infobart.binexptree;

public class BooleanValueNode implements Node {
	
	private boolean value;
	
	public BooleanValueNode(boolean value) {
		this.value = value;
	}

	@Override
	public boolean eval(Context context) {
		return value;
	}
	
	public boolean isValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return Boolean.toString(value);
	}

}

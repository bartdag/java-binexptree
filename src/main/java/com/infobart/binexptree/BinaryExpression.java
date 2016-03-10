package com.infobart.binexptree;

public interface BinaryExpression extends Node {
	
	Node getLeft();
	
	Node getRight();
	
	Operator getOperator();

}

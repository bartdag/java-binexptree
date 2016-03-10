package com.infobart.binexptree;

public abstract class AbstractBinaryExpression implements BinaryExpression {
	
	protected final Node left;
	
	protected final Node right;
	
	protected final Operator operator;
	
	public AbstractBinaryExpression(Node left, Node right, Operator operator) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public Node getLeft() {
		return left;
	}

	@Override
	public Node getRight() {
		return right;
	}

	@Override
	public Operator getOperator() {
		return operator;
	}
	
	@Override
	public String toString() {
		if (operator.isUnary()) {
			return operator.getName() + " " + left.toString();
		} else {
			return "(" + left.toString() + " " + operator.getName() + " " + right.toString() + ")";
		}
	}

}

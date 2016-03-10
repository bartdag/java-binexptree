package com.infobart.binexptree;

public class OrExpression extends AbstractBinaryExpression {

	public OrExpression(Node left, Node right) {
		super(left, right, new Operator("or", false));
	}

	@Override
	public boolean eval(Context context) {
		return left.eval(context) || right.eval(context);
	}

}

package com.infobart.binexptree;

public class AndExpression extends AbstractBinaryExpression {
	
	public AndExpression(Node left, Node right) {
		super(left, right, new Operator("and", false));
	}

	@Override
	public boolean eval(Context context) {
		return left.eval(context) && right.eval(context);
	}

}

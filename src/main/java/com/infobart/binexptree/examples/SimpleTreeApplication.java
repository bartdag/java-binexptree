package com.infobart.binexptree.examples;

import com.infobart.binexptree.AndExpression;
import com.infobart.binexptree.BooleanValueNode;
import com.infobart.binexptree.DefaultContext;
import com.infobart.binexptree.Node;
import com.infobart.binexptree.OrExpression;

public class SimpleTreeApplication {

	public static void main(String[] args) {
		Node falseValue = new BooleanValueNode(false);
		Node trueValue = new BooleanValueNode(true);
		Node tree = new OrExpression(new AndExpression(trueValue, falseValue), trueValue);
		System.out.println(tree);
		System.out.println(tree.eval(new DefaultContext()));
	}

}

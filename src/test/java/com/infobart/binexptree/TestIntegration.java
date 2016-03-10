package com.infobart.binexptree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestIntegration {
	private Node falseValue = new BooleanValueNode(false);
	private Node trueValue = new BooleanValueNode(true);
	private Node tree = new OrExpression(new AndExpression(trueValue, falseValue), trueValue);
	
	@Test
	public void testEval() {
		assertTrue(tree.eval(new DefaultContext()));
	}
	
	@Test
	public void testToString() {
		assertEquals("((true and false) or true)", tree.toString());
	}

}

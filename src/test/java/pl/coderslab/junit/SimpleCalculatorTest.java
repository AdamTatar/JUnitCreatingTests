package pl.coderslab.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class SimpleCalculatorTest {

	private static SimpleCalculator sc = new SimpleCalculator();
	private static double a = 4.7;
	private static double b = 3.2;

	@Test
	public void testSum() {
		assertEquals(7.9, sc.sum(a, b), 0.1);

	}

	@Test
	public void testDivide() {
		assertEquals(1.47, sc.divide(a, b), 0.1);
	}

	@Test
	public void testMultiply() {
		assertEquals(15.04, sc.multiply(a, b), 0.001);
	}

	@Test
	public void testSubstract() {
		assertEquals(1.5, sc.substract(a, b), 0.1);

	}

	@Test
	public void testisGreater() {
		assertTrue(sc.isGrater(a, b));

	}
	
	
	
}

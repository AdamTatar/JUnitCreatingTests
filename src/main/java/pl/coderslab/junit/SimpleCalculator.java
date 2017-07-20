package pl.coderslab.junit;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class SimpleCalculator {

	public double sum(final double a, final double b){
		return a+b;
	}
	public double divide(final double a, final double b){
		return a/b;
	}
	public double multiply(final double a, final double b){
		return a*b;
	}
	public double substract(final double a, final double b){
		return a-b;
	}
	public boolean isGrater(final double a, final double b){
		return a>b ? true : false;
	}
	
	public int eval(final String expr){
		Expression e = new ExpressionBuilder(expr)
//		        .variables("x", "y")
		        .build();
//		        .setVariable("x", 2.3)
//		        .setVariable("y", 3.14);
		double result = e.evaluate();
		return (int) result;
	}
}

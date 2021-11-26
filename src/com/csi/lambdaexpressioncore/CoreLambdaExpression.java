package com.csi.lambdaexpressioncore;

interface Dept {
	void get();
}

public class CoreLambdaExpression {
	public static void main(String[] args) {
		Dept dd = () -> {
			System.out.println("this is lambda expression.");
		};

		dd.get();
	}
}

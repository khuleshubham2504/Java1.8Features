package com.csi.stringjoinner;

import java.util.StringJoiner;

public class StringJoinnerClass {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("*");

		sj.add("Shubham");
		sj.add("Vishal");
		sj.add("Harry");
		sj.add("Akshay");

		System.out.println(sj);
	}
}

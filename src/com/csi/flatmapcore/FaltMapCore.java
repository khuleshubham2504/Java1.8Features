package com.csi.flatmapcore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Changes Updated
public class FaltMapCore {
	public static void main(String[] args) {

		List<Integer> ll1 = Arrays.asList(56, 67, 54, 67, 56);
		List<Integer> ll2 = Arrays.asList(34, 76, 33, 90);
		List<Integer> ll3 = Arrays.asList(40, 78, 55, 99);

		List<List<Integer>> llList = Arrays.asList(ll1, ll2, ll3);

		llList.stream().flatMap(i -> i.stream()).collect(Collectors.toList()).forEach(ii -> System.out.println(ii));
	}
}

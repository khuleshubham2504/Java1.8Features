package com.csi.datefuncrion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateFunctionJDK {
	public static void main(String[] args) {
		System.out.println("today's date: " + LocalDate.now());

		System.out.println(LocalDateTime.now());

		System.out.println(LocalDate.now().minusYears(1));
	}
}

package com.demo.oop.utility;

import java.util.Scanner;

import com.demo.oop.model.Calci;

public class InputScanner {
	private static final Scanner sc = new Scanner(System.in);

	public static int intScanner() {
		return sc.nextInt();
	}

	public static void display(double ans) {
		System.out.println("Ans is: " + ans);
	}

	public static Calci inputData() {
		Calci sc = new Calci();

		System.out.println("Value of Num 1: ");
		sc.setNum1(InputScanner.intScanner());
		System.out.println("Value of Num 2: ");
		sc.setNum2(InputScanner.intScanner());
		return sc;
	}

}

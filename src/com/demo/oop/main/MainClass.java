package com.demo.oop.main;

import com.demo.oop.service.CalciService;
import com.demo.oop.service.serviceimpl.ServiceImpl;
import com.demo.oop.utility.InputScanner;

public class MainClass {
	public static void main(String[] args) {
		CalciService c = new ServiceImpl();
		int choice = 0;
		do {
			System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
			choice = InputScanner.intScanner();
			switch (choice) {
			case 1:
				c.add(InputScanner.inputData());
				break;

			case 2:
				c.sub(InputScanner.inputData());
				break;

			case 3:
				c.mul(InputScanner.inputData());
				break;

			case 4:
				c.div(InputScanner.inputData());
				break;
			case 5:
				break;
			}
		} while (choice != 5);
	}
}

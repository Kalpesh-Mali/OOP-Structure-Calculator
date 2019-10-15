package com.demo.oop.service.serviceimpl;

import com.demo.oop.model.Calci;
import com.demo.oop.service.CalciService;
import com.demo.oop.utility.InputScanner;

public class ServiceImpl implements CalciService {

	public void add(Calci sc) {
		InputScanner.display(sc.getNum1() + sc.getNum2());
	}

	public void sub(Calci sc) {
		InputScanner.display(sc.getNum1() - sc.getNum2());
	}

	public void mul(Calci sc) {
		InputScanner.display(sc.getNum1() * sc.getNum2());
	}

	public void div(Calci sc) {
		InputScanner.display(sc.getNum1() / sc.getNum2());
	}
}

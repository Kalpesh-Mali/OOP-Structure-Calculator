package com.demo.oop.service.serviceimpl;

import com.demo.oop.model.Calci;
import com.demo.oop.service.CalciService;
import com.demo.oop.utility.InputScanner;
//Polymorphism
public class ServiceImpl implements CalciService {

	//Inheritance
	@Override
	public void add(Calci sc) {
		InputScanner.display(sc.getNum1() + sc.getNum2());
	}
	
	@Override
	public void sub(Calci sc) {
		InputScanner.display(sc.getNum1() - sc.getNum2());
	}

	@Override
	public void mul(Calci sc) {
		InputScanner.display(sc.getNum1() * sc.getNum2());
	}

	@Override
	public void div(Calci sc) {
		InputScanner.display(sc.getNum1() / sc.getNum2());
	}
}

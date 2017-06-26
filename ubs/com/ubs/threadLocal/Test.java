package com.ubs.threadLocal;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ComplexNumberHolder holder = new ComplexNumberHolder();
		ComplexNumber number = new ComplexNumber();
		number.real = 5;
		number.imaginary=10;
		MyThread t1 = new MyThread(number);
		
		
		List l = new ArrayList();


	}

}

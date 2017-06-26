package com.ubs.threadLocal;

public class MyThread extends Thread {
	
	ComplexNumber num;
	
	public MyThread(ComplexNumber num){
		this.num = num;
	}
	
	public void run(){
		System.out.println("Imaginary at Thread "+Thread.currentThread().getName() +"  "+num.imaginary);
	}

}

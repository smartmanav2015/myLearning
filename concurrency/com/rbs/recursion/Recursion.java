package com.rbs.recursion;

class Factorial {

	int fact(int n) {

		int result;

		if (n == 1){
			return 1;
		}

		result = fact(n - 1) * n;

		return result;
	}
}

public class Recursion {

	public static void main(String args[]) {

		Factorial f = new Factorial();
		int val = f.fact(3);
		System.out.println("Factorial of 3 is " + val);
	}
}

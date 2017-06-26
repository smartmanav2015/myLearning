package com.rbs.exception;

public class TestException {

	Factorial f = new Factorial();
	
	public static void main(String[] args) throws CheckedException {
		TestException t = new TestException();
		t.testChecked(3);

	}

	public void testChecked(int x) throws CheckedException {
		int val = f.fact(x);
		if(val == 6){
				throw new CheckedException("CheckedException", 1001);			
		}
	}

	public void testUnChecked(int x) {
		int val = f.fact(x);
		if(val == 6){
			throw new UnCheckedException("UnCheckedException", 1001);
		}
	}
	
	public void testStaticChecked(int x) {

	}

	public void testStaticUnChecked(int x) {

	}

}

class Factorial {

	int fact(int n) {
		int result;

		if (n == 1) {
			return 1;
		}

		result = fact(n - 1) * n;
		return result;
	}
}

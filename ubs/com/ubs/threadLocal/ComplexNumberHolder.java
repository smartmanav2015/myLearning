package com.ubs.threadLocal;

public class ComplexNumberHolder {
    private final static ThreadLocal<ComplexNumber> number = new ThreadLocal<ComplexNumber>();
  
    public ComplexNumber getNumber() {
        return number.get();
    }  

    public void setNumber(ComplexNumber newNumber) {
        number.get().real = newNumber.real;
        number.get().imaginary = newNumber.imaginary;
    }
}


package com.design.patterns.behaviour.Strategy;

public class OperationMultiplyDerivation implements DerivationStrategy{
	   @Override
	   public int performDerivation(int num1, int num2) {
	      return num1 * num2;
	   }
	}

package com.design.patterns.behaviour.Strategy;

public class OperationSubstractDerivation implements DerivationStrategy{
	   @Override
	   public int performDerivation(int num1, int num2) {
	      return num1 - num2;
	   }
	}

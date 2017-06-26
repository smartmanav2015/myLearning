package com.design.patterns.behaviour.Strategy;

/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run
 * time.
 * 
 * In Strategy pattern, we create objects which represent various strategies and
 * a context object whose behavior varies as per its strategy object. The
 * strategy object changes the executing algorithm of the context object.
 * 
 * 
 * @author Akki
 * 
 */
public class StrategyPatternDemo {
	   public static void main(String[] args) {
		   DerivationPerformer derivation = new DerivationPerformer(new OperationAddDerivation());		
	      System.out.println("10 + 5 = " + derivation.executeDerivation(10, 5));

	      derivation = new DerivationPerformer(new OperationSubstractDerivation());		
	      System.out.println("10 - 5 = " + derivation.executeDerivation(10, 5));

	      derivation = new DerivationPerformer(new OperationMultiplyDerivation());		
	      System.out.println("10 * 5 = " + derivation.executeDerivation(10, 5));
	   }
	}

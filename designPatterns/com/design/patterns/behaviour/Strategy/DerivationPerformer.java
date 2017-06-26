package com.design.patterns.behaviour.Strategy;

public class DerivationPerformer {
	   private DerivationStrategy strategy;

	   public DerivationPerformer(DerivationStrategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeDerivation(int num1, int num2){
	      return strategy.performDerivation(num1, num2);
	   }
	}

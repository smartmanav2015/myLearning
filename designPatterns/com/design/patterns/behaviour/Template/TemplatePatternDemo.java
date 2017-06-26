package com.design.patterns.behaviour.Template;

/**
 * 
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to
 * execute its methods. Its subclasses can overrides the method implementations
 * as per need basis but the invocation is to be in the same way as defined by
 * an abstract class.
 * 
 * @author Akki
 * 
 */
public class TemplatePatternDemo {
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();		
	   }
	}

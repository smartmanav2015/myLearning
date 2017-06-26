package com.mkyong.test;
 
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Date;
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface TesterInfo {
 
	public enum Priority {
	   LOW, MEDIUM, HIGH
	}
 
	Priority priority() default Priority.MEDIUM;
 
	String[] tags() default "";
 
	String createdBy() default "Mkyong";
 
	String lastModified() default "03/01/2014";
	
	//String lastModified() default new Date();

 
}
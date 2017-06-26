package com.sapient.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList<Employee>();		
		Employee e1 =  new Employee("aakash");
		list.add(e1);
		
		addEmp(e1);
		checkEmp1(list);
		checkEmp2(list);
		checkEmp3(list);
		//checkEmp4(list);
		checkEmp5("abc");
		
		System.out.println("####################");
		
		List<?> li = list;
		
		addEmp(e1);
		checkEmp1(li);
		//checkEmp2(li);
		//checkEmp3(li);
		
		System.out.println("####################");
		
		addEmp(e1);
		checkEmp1(li);
		checkEmp2((List<? extends Employee>) li);
		checkEmp3((List<? super HREmployee>) li);
		
		List<? extends Employee> li1 = list;
		checkEmp1(li1);
		checkEmp2(li1);
		checkEmp3((List<? super HREmployee>) li1);
		
		
	}
	
	public static <T> void addEmp(T t){
		System.out.println("Inside addEmp()");
		System.out.println(t);
	}
	
	
	public static void checkEmp1(List <?> list){
		System.out.println("inside checkEmp1 ");
		System.out.println(list.get(0));
		
	}
	
	public static void checkEmp2(List <? extends Employee> list){
		System.out.println("inside checkEmp2 ");
		System.out.println(list.get(0));
		
		
	}
	
	public static void checkEmp3(List <? super HREmployee> list){
		
		System.out.println("inside checkEmp3 ");
		System.out.println(list.get(0));
		
		
	}
	
	public static void checkEmp4(List<Object> list){
		
		System.out.println("inside checkEmp4 ");
		System.out.println(list.get(0));
		
		
	}
	
	public static void checkEmp5(Object list){
		
		System.out.println("inside checkEmp4 ");
		System.out.println(list);		
	}
	
	

}

package com.journaldev.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompCompt {

	public static void main(String[] args) {
		EmployeeComparable e1 = new EmployeeComparable(1, "aakash1", 11, 111);
		EmployeeComparable e2 = new EmployeeComparable(2, "aakash2", 12, 112);
		EmployeeComparable e3 = new EmployeeComparable(3, "aakash3", 13, 113);
		EmployeeComparable e4 = new EmployeeComparable(4, "aakash4", 14, 114);
		
		List<EmployeeComparable> list = new ArrayList<EmployeeComparable>();
		List<EmployeeComparable> list2 = new ArrayList<EmployeeComparable>(list.size());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		//Collections.copy(list2, list);
		
		Collections.sort(list);
		
		
		System.out.println(list.toString());
		Collections.sort(list,new EmployeeComparator());
		System.out.println(list.toString());
		

	}

}

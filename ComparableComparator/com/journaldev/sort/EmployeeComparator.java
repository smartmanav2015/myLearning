package com.journaldev.sort;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeComparable> {

	@Override
	public int compare(EmployeeComparable o1, EmployeeComparable o2) {
		// TODO Auto-generated method stub
		return o2.getId() - o1.getId();
	}

}

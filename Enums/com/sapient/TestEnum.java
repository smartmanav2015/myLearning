package com.sapient;

import java.util.EnumMap;
import java.util.EnumSet;

public class TestEnum {

	public static void main(String[] args) {
		
		EnumSet<DaysofWeek> weekDays = EnumSet.range(DaysofWeek.MONDAY, DaysofWeek.FRIDAY);
		
		EnumSet<DaysofWeek> weekend = EnumSet.of(DaysofWeek.SATURDAY, DaysofWeek.SUNDAY);
		
		EnumMap<DaysofWeek, String> map = new EnumMap<DaysofWeek, String>(DaysofWeek.class);
		map.put(DaysofWeek.MONDAY, "khoon choos le");
		
		System.out.println(DaysofWeek.MONDAY.ordinal());
		System.out.println(DaysofWeek.SUNDAY.ordinal());
		
		System.out.println(DaysofWeek.SUNDAY.name());
		System.out.println(DaysofWeek.SUNDAY.getDay());
	}

}

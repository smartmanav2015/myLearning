package com.sapient;

public enum DaysofWeek {
	
	MONDAY(1), TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
	
	private int day;
	
	DaysofWeek(int i){
		this.day = i;
	}
	
	public int getDay() {
		return day;
	}
	
	

	
}

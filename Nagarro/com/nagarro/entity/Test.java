package com.nagarro.entity;

import java.util.List;

public class Test {
	
	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the list
	 */
	public List<QuestionDetail> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<QuestionDetail> list) {
		this.list = list;
	}

	private String testName;
	
	List<QuestionDetail> list;

}

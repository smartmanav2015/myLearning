package com.nagarro.entity;

import java.util.List;

public class TestGroup {
	
	/**
	 * @return the testGroupName
	 */
	public String getTestGroupName() {
		return testGroupName;
	}

	/**
	 * @param testGroupName the testGroupName to set
	 */
	public void setTestGroupName(String testGroupName) {
		this.testGroupName = testGroupName;
	}

	/**
	 * @return the list
	 */
	public List<Test> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Test> list) {
		this.list = list;
	}

	private String testGroupName;
	
	private List<Test> list;

}

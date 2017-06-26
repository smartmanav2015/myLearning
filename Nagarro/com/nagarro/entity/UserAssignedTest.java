package com.nagarro.entity;

public class UserAssignedTest {
	
	private User testee;
	
	private TestGroup testGroup;
	
	private User assignedBy;

	/**
	 * @return the testee
	 */
	public User getTestee() {
		return testee;
	}

	/**
	 * @param testee the testee to set
	 */
	public void setTestee(User testee) {
		this.testee = testee;
	}

	/**
	 * @return the testGroup
	 */
	public TestGroup getTestGroup() {
		return testGroup;
	}

	/**
	 * @param testGroup the testGroup to set
	 */
	public void setTestGroup(TestGroup testGroup) {
		this.testGroup = testGroup;
	}

	/**
	 * @return the assignedBy
	 */
	public User getAssignedBy() {
		return assignedBy;
	}

	/**
	 * @param assignedBy the assignedBy to set
	 */
	public void setAssignedBy(User assignedBy) {
		this.assignedBy = assignedBy;
	}

}

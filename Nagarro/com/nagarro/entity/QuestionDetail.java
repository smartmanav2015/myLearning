package com.nagarro.entity;

public class QuestionDetail {
	
	private Long quesId;
	private String subject;
	private String category;
	private int Level;
	private String question;
	/**
	 * @return the quesId
	 */
	public Long getQuesId() {
		return quesId;
	}
	/**
	 * @param quesId the quesId to set
	 */
	public void setQuesId(Long quesId) {
		this.quesId = quesId;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return Level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		Level = level;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}


}

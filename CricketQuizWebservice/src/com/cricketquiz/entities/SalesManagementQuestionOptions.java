/**
 * 
 */
package com.cricketquiz.entities;

/**
 * @author Shrikant Havale
 * 
 */
public class SalesManagementQuestionOptions {

	/**
	 * case study node - referential key
	 */
	String caseStudyNode;

	/**
	 * solutions to the question, four options
	 */
	int caseStudyOptionNumber;

	/**
	 * question Option description
	 */
	String questionOptionDescription;

	/**
	 * each option evaluation
	 */
	String questionOptionEvaluation;

	/**
	 * money associated with each amount
	 */
	int questionOptionMoneyAssoicated;

	/**
	 * @return the caseStudyNode
	 */
	public String getCaseStudyNode() {
		return caseStudyNode;
	}

	/**
	 * @param caseStudyNode
	 *            the caseStudyNode to set
	 */
	public void setCaseStudyNode(String caseStudyNode) {
		this.caseStudyNode = caseStudyNode;
	}

	/**
	 * @return the caseStudyOptionNumber
	 */
	public int getCaseStudyOptionNumber() {
		return caseStudyOptionNumber;
	}

	/**
	 * @param caseStudyOptionNumber
	 *            the caseStudyOptionNumber to set
	 */
	public void setCaseStudyOptionNumber(int caseStudyOptionNumber) {
		this.caseStudyOptionNumber = caseStudyOptionNumber;
	}

	/**
	 * @return the questionOptionDescription
	 */
	public String getQuestionOptionDescription() {
		return questionOptionDescription;
	}

	/**
	 * @param questionOptionDescription
	 *            the questionOptionDescription to set
	 */
	public void setQuestionOptionDescription(String questionOptionDescription) {
		this.questionOptionDescription = questionOptionDescription;
	}

	/**
	 * @return the questionOptionEvaluation
	 */
	public String getQuestionOptionEvaluation() {
		return questionOptionEvaluation;
	}

	/**
	 * @param questionOptionEvaluation
	 *            the questionOptionEvaluation to set
	 */
	public void setQuestionOptionEvaluation(String questionOptionEvaluation) {
		this.questionOptionEvaluation = questionOptionEvaluation;
	}

	/**
	 * @return the questionOptionMoneyAssoicated
	 */
	public int getQuestionOptionMoneyAssoicated() {
		return questionOptionMoneyAssoicated;
	}

	/**
	 * @param questionOptionMoneyAssoicated
	 *            the questionOptionMoneyAssoicated to set
	 */
	public void setQuestionOptionMoneyAssoicated(
			int questionOptionMoneyAssoicated) {
		this.questionOptionMoneyAssoicated = questionOptionMoneyAssoicated;
	}

}

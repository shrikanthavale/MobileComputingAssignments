/**
 * 
 */
package com.salesmanagement.entities;

/**
 * @author Shrikant Havale
 * 
 */
public class SalesManagementQuestion {

	/**
	 * primary key node of the case study
	 */
	String caseStudyNode;

	/**
	 * case study title
	 */
	String caseStudyTitle;

	/**
	 * name of the organization related to case study
	 */
	String caseStudyOrganization;

	/**
	 * case study full description
	 */
	String caseStudyDescription;

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
	 * @return the caseStudyTitle
	 */
	public String getCaseStudyTitle() {
		return caseStudyTitle;
	}

	/**
	 * @param caseStudyTitle
	 *            the caseStudyTitle to set
	 */
	public void setCaseStudyTitle(String caseStudyTitle) {
		this.caseStudyTitle = caseStudyTitle;
	}

	/**
	 * @return the caseStudyOrganization
	 */
	public String getCaseStudyOrganization() {
		return caseStudyOrganization;
	}

	/**
	 * @param caseStudyOrganization
	 *            the caseStudyOrganization to set
	 */
	public void setCaseStudyOrganization(String caseStudyOrganization) {
		this.caseStudyOrganization = caseStudyOrganization;
	}

	/**
	 * @return the caseStudyDescription
	 */
	public String getCaseStudyDescription() {
		return caseStudyDescription;
	}

	/**
	 * @param caseStudyDescription
	 *            the caseStudyDescription to set
	 */
	public void setCaseStudyDescription(String caseStudyDescription) {
		this.caseStudyDescription = caseStudyDescription;
	}

}

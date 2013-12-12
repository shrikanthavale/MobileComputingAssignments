/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelbeans;

/**
 *
 * @author Aparna
 */
public class QuestionInformationModel {
    
    private String customer;
    
    private String chapterName;
    
    private String caseName;
    
    private String caseNumber;
    
    private String questionNumber;    
    

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }
    
}

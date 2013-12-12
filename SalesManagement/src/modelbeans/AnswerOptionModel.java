/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelbeans;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aparna
 */
public class AnswerOptionModel {
    
    private String customer;
    
    private Map<String, String> optionPrize = new HashMap<String, String>();
    
    private Map<String, String> optionExplanation = new HashMap<String, String>();

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Map<String, String> getOptionPrize() {
        return optionPrize;
    }

    public void setOptionPrize(Map<String, String> optionPrize) {
        this.optionPrize = optionPrize;
    }

    public Map<String, String> getOptionExplanation() {
        return optionExplanation;
    }

    public void setOptionExplanation(Map<String, String> optionExplanation) {
        this.optionExplanation = optionExplanation;
    }     

}

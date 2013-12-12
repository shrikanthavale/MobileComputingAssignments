/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package salesmanagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelbeans.AnswerOptionModel;
import modelbeans.QuestionModel;
import modelbeans.QuestionInformationModel;


/**
 *
 * @author Aparna
 */
public class DatabaseReading {
    
    private String fileName;
    
    private String filePath;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public QuestionInformationModel getQuestionInformation(String customer){

        //FileInputStream fstream = null;
        
        QuestionInformationModel model = null;
         
        try {
            
            org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(salesmanagement.SalesManagementApp.class).getContext().getResourceMap(DatabaseReading.class);
         
            String customerAppended = customer + resourceMap.getString("qi_appender");
            
            //String completeFilePath = System.getProperty("user.dir") + resourceMap.getString("questionsinformationpath") + resourceMap.getString(customerAppended);
            String completeFilePath = resourceMap.getString("questionsinformationpath") + resourceMap.getString(customerAppended);
            InputStream is = null;  
            
            //InputStream is = getClass().getResourceAsStream(completeFilePath);
            is = DatabaseReading.class.getResourceAsStream(completeFilePath);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);        
            String strLine;
            
            List<String> fileContents = new ArrayList<String>();
            
            model = new QuestionInformationModel();
            
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
               fileContents.add(strLine);        
                
            }

            model.setCustomer(fileContents.get(0));
            model.setChapterName(fileContents.get(1));
            model.setCaseName(fileContents.get(2));
            model.setCaseNumber(fileContents.get(3));
            model.setQuestionNumber(fileContents.get(4));
            
            fileName = resourceMap.getString(customerAppended);
            filePath = completeFilePath;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch(Exception ex){
            
            Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        finally {           
                    
        }
        
        return model;
        
    }
    
    public QuestionModel getQuestion(String customer){
        
        QuestionModel model = null;        
        InputStream is = null;  
         
        try {            
            org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(salesmanagement.SalesManagementApp.class).getContext().getResourceMap(DatabaseReading.class);            
            String customerAppended = customer + resourceMap.getString("question_appender");      

            String completeFilePath = resourceMap.getString("questionpath") + resourceMap.getString(customerAppended);
            is = DatabaseReading.class.getResourceAsStream(completeFilePath);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);    
            String strLine = "";            
            String completeText = "";
            
            model = new QuestionModel();
            
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
               completeText = completeText + strLine + "\n";          
                
            }

            model.setCustomer(customer);
            model.setQuestion(completeText);            
              
            fileName = resourceMap.getString(customerAppended);
            
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch(Exception ex){
            
            Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        finally {
            
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return model;
        
    }
    
    public AnswerOptionModel getAnswerOptions(String customer){

        InputStream is = null; 
        
        AnswerOptionModel model = null;
         
        try {
            
            org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(salesmanagement.SalesManagementApp.class).getContext().getResourceMap(DatabaseReading.class);
            
            String customerAppended = customer + resourceMap.getString("answeroption_appender");
            String completeFilePath = resourceMap.getString("answeroptionpath") + resourceMap.getString(customerAppended);
            
            is = DatabaseReading.class.getResourceAsStream(completeFilePath);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);    
             
            String strLine;
            
            List<String> fileContents = new ArrayList<String>();
            
            model = new AnswerOptionModel();
            
            while ((strLine = br.readLine()) != null) {
                    
                fileContents.add(strLine);
                
                if(fileContents.size() == 3){
                    model.getOptionPrize().put(fileContents.get(0), fileContents.get(1));
                    model.getOptionExplanation().put(fileContents.get(0), fileContents.get(2));
                    fileContents.clear();
                }
            }
            
            fileName = resourceMap.getString(customerAppended);
            filePath = completeFilePath;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch(Exception ex){
            
            Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        finally {
            
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(DatabaseReading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return model;        
    }
    

}

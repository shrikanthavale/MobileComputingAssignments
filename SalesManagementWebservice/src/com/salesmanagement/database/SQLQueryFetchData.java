/**
 * 
 */
package com.salesmanagement.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.salesmanagement.entities.SalesManagementQuestion;
import com.salesmanagement.entities.SalesManagementQuestionOptions;

/**
 * @author Shrikant Havale
 * 
 */
public class SQLQueryFetchData {

	public List<SalesManagementQuestion> getSaleManagementQueestionEntity() {

		List<SalesManagementQuestion> salesManagementQuestions = new ArrayList<SalesManagementQuestion>();

		try {

			Connection sqlConnection = SQLConnectionDatabase.getConnection();

			PreparedStatement preparedStatement = sqlConnection
					.prepareStatement("SELECT CASE_STUDY_NODE, CASE_STUDY_TITLE, CASE_STUDY_ORGANIZATION, CASE_STUDY_DESCRIPTION FROM SALESMANAGEMENT_QUESTION");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				SalesManagementQuestion salesManagementQuestion = new SalesManagementQuestion();
				salesManagementQuestion.setCaseStudyNode(resultSet
						.getString("CASE_STUDY_NODE"));
				salesManagementQuestion.setCaseStudyTitle(resultSet
						.getString("CASE_STUDY_TITLE"));
				salesManagementQuestion.setCaseStudyOrganization(resultSet
						.getString("CASE_STUDY_ORGANIZATION"));
				salesManagementQuestion.setCaseStudyDescription(resultSet
						.getString("CASE_STUDY_DESCRIPTION"));

				salesManagementQuestions.add(salesManagementQuestion);
			}

			sqlConnection.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return salesManagementQuestions;

	}

	public List<SalesManagementQuestionOptions> getSaleManagementQueestionOptions() {

		List<SalesManagementQuestionOptions> salesManagementQuestionOptionsList = new ArrayList<SalesManagementQuestionOptions>();

		try {

			Connection sqlConnection = SQLConnectionDatabase.getConnection();

			PreparedStatement preparedStatement = sqlConnection
					.prepareStatement("SELECT CASE_STUDY_NODE, QUESTION_OPTION_NUMBER,"
							+ " QUESTION_OPTION_DESCRIPTION, QUESTION_OPTION_EVALUATION, "
							+ " QUESTION_OPTION_MONEY_ASSOCIATED FROM SALESMANAGEMENT_QUESTION_OPTIONS");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				SalesManagementQuestionOptions salesManagementQuestionOptions = new SalesManagementQuestionOptions();
				salesManagementQuestionOptions.setCaseStudyNode(resultSet
						.getString("CASE_STUDY_NODE"));
				salesManagementQuestionOptions
						.setCaseStudyOptionNumber(resultSet
								.getInt("QUESTION_OPTION_NUMBER"));
				salesManagementQuestionOptions
						.setQuestionOptionDescription(resultSet
								.getString("QUESTION_OPTION_DESCRIPTION"));
				salesManagementQuestionOptions
						.setQuestionOptionEvaluation(resultSet
								.getString("QUESTION_OPTION_EVALUATION"));
				salesManagementQuestionOptions
						.setQuestionOptionMoneyAssoicated(resultSet
								.getInt("QUESTION_OPTION_MONEY_ASSOCIATED"));

				salesManagementQuestionOptionsList
						.add(salesManagementQuestionOptions);
			}

			sqlConnection.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return salesManagementQuestionOptionsList;

	}
}

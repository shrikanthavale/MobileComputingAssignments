/**
 * 
 */
package com.salesmanagement.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.salesmanagement.database.SQLQueryFetchData;
import com.salesmanagement.entities.SalesManagementQuestion;
import com.salesmanagement.entities.SalesManagementQuestionOptions;

/**
 * @author Shrikant Havale
 * 
 */

@Path("/salesmanagement")
public class SalesManagementDataWebservice {

	private SQLQueryFetchData sqlQueryFetchData = new SQLQueryFetchData();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/questions")
	public String getSalesManagementQuestion() {

		List<SalesManagementQuestion> salesManagementQuestions = sqlQueryFetchData
				.getSaleManagementQueestionEntity();

		Gson gson = new Gson();
		String gsonString = gson.toJson(salesManagementQuestions);

		return gsonString;

	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/options")
	public String getSalesManagementQuestionOptions() {

		List<SalesManagementQuestionOptions> salesManagementQuestionOptions = sqlQueryFetchData
				.getSaleManagementQueestionOptions();

		Gson gson = new Gson();
		String gsonString = gson.toJson(salesManagementQuestionOptions);

		return gsonString;

	}

}

/**
 * 
 */
package com.cricketquiz.webservice;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cricketquiz.database.SQLQueryFetchData;
import com.cricketquiz.entities.SalesManagementQuestion;
import com.cricketquiz.entities.SalesManagementQuestionOptions;
import com.google.gson.Gson;

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

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_HTML })
	@Path("/writequestion")
	public String updateQuestionDetails(
			@FormParam("SalesManagementQuestion") String jsonFormatQuestionUpdated) {

		SalesManagementQuestion salesManagementQuestion;
		Gson gson = new Gson();
		salesManagementQuestion = gson.fromJson(jsonFormatQuestionUpdated,
				SalesManagementQuestion.class);
		boolean result = sqlQueryFetchData
				.updateNodeQuestionDetails(salesManagementQuestion);

		return gson.toJson(result);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_HTML })
	@Path("/writeoptions")
	public String updateQuestionOptionDetails(
			@FormParam("SalesManagementOptionList") String jsonFormatOptionListTobeUpdated) {

		List<SalesManagementQuestionOptions> salesManagementQuestionOptions;

		Gson gson = new Gson();

		salesManagementQuestionOptions = Arrays.asList(gson.fromJson(
				jsonFormatOptionListTobeUpdated,
				SalesManagementQuestionOptions[].class));

		boolean result = sqlQueryFetchData
				.updateNodeQuestionOptionDetails(salesManagementQuestionOptions);

		return gson.toJson(result);

	}
}

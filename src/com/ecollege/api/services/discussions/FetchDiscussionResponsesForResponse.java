package com.ecollege.api.services.discussions;

import java.util.List;
import java.util.logging.Logger;

import com.ecollege.api.model.UserDiscussionResponse;
import com.ecollege.api.services.BaseService;

public class FetchDiscussionResponsesForResponse extends BaseService {
	
	private static Logger l = Logger.getLogger(FetchDiscussionTopicsForCourseIds.class.getName());
	private UserDiscussionResponse response;
	private List<UserDiscussionResponse> result;

	public FetchDiscussionResponsesForResponse(UserDiscussionResponse response) {
		super();
		this.response = response;
	}

	@Override
	public String getResource() {
		return "/me/responses/" + response.getId() + "/userresponses";
	}
	
	@Override
	public void processResponse(String responseContent) {
		super.processResponse(responseContent);
		result = parseContentAsJsonArray(responseContent, "userResponses", UserDiscussionResponse.class);
		l.finest("Result is " + result);
	}

}

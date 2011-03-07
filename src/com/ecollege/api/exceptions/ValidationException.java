package com.ecollege.api.exceptions;

import com.ecollege.api.ECollegeHttpResponse;

@SuppressWarnings("serial")
public class ValidationException extends ServiceException {

	public ValidationException(ECollegeHttpResponse response) {
		super(response);
	}

}


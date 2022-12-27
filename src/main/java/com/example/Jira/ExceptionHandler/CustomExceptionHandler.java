package com.example.Jira.ExceptionHandler;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.Jira.Model.ErrorDetails;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;


@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler({DataAccessException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDetails handleDatAccessException(DataAccessException exception) {
	List<String> errors = new ArrayList<>();
		errors.add(exception.getMessage());
	    ErrorDetails errorDetails=new ErrorDetails(new Date(),errors);
	    return errorDetails;
		
	}
}

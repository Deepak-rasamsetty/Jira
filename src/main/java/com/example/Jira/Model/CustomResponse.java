package com.example.Jira.Model;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomResponse {
	
	private HttpStatus statusCode;
	private String message;

	public CustomResponse(HttpStatus statusCode, String message) {
		this.statusCode= statusCode;
		this.message = message;
		}
}

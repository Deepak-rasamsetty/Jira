package com.example.Jira.Model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JiraInfoResponse {
	
	private String Id;
	
	private String title;
	private String description;
	private String Requestor;
	private String assignee;
	private String createdOn;
	private String points;
	private String status;
}

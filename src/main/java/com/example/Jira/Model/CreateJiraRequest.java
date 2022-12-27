package com.example.Jira.Model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateJiraRequest {

	@NotNull
	private String title;
	private String description;
	@NotNull
	private String Requestor;
	private String assignee;
	private String points;
	private String status;
}

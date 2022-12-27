package com.example.Jira.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JiraInfo {
	
	@Id
	private String Id;
	
	private String title;
	private String description;
	private String Requestor;
	private String assignee;
	private String createdOn;
	private String points;
	private String status;

}

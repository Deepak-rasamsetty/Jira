package com.example.Jira.Controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jira.Model.CreateJiraRequest;
import com.example.Jira.Model.CustomResponse;
import com.example.Jira.Model.JiraInfoResponse;
import com.example.Jira.Service.JiraService;


@RestController
@RequestMapping
public class JiraController {
	private static final  Logger LOGGER=LoggerFactory.getLogger(JiraController.class);
	@Autowired
	JiraService jiraService;
	
	@GetMapping("/{jiraId}")
	public JiraInfoResponse getJiraInfo(@PathVariable("jiraId") String jiraId) {
		LOGGER.info("Enetered getJiraInfo method, {}" , jiraId);
		JiraInfoResponse jiraInfoResponse = jiraService.getJiraInfo(jiraId);
		LOGGER.info("Exiting getJiraInfo method, jiraInfoResponse - {}", jiraInfoResponse);
		return jiraInfoResponse;
	}
	
	@PostMapping("/")
	public CustomResponse createJira(@Valid @RequestBody CreateJiraRequest request) {
		LOGGER.info("Enetered getJiraInfo method,request - {}" , request);
		CustomResponse response= jiraService.createJira(request);
		LOGGER.info("Exiting getJiraInfo method, resposne - {}", response);
		return response;

	}
}

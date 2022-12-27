package com.example.Jira.Service;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Jira.Controller.JiraController;
import com.example.Jira.Entity.JiraInfo;
import com.example.Jira.Model.CreateJiraRequest;
import com.example.Jira.Model.CustomResponse;
import com.example.Jira.Model.JiraInfoResponse;
import com.example.Jira.Repository.JiraInfoRepository;

@Service
public class JiraService {
	private static final  Logger LOGGER=LoggerFactory.getLogger(JiraService.class);
	@Autowired
	JiraInfoRepository jiraInfoReposiotry;
	@Autowired
	ModelMapper modelMapper;

	public JiraInfoResponse getJiraInfo(String jiraId) {
		LOGGER.info("Enetered getJiraInfo, jiraId - {}", jiraId);
		JiraInfo jiraInfo= jiraInfoReposiotry.getReferenceById(jiraId);
		JiraInfoResponse jiraInfoResponse = modelMapper.map(jiraInfo, JiraInfoResponse.class);
		LOGGER.info("Exiting getJiraInfo, iiraInfoResponse - {}", jiraInfoResponse);
		return jiraInfoResponse;
	}

	public CustomResponse createJira(@Valid CreateJiraRequest request) {
		LOGGER.info("Enetered createJira, request - {}", request);
		JiraInfo jiraInfo = modelMapper.map(request, JiraInfo.class);
		JiraInfo createdJiraInfo= jiraInfoReposiotry.save(jiraInfo);
		
		LOGGER.info("Exiting getJiraInfo, createdJiraInfo - {}", createdJiraInfo);
		return new CustomResponse(HttpStatus.CREATED, "Success");
		
	}

}

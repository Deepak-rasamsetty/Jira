package com.example.Jira.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Jira.Entity.JiraInfo;

public interface JiraInfoRepository extends JpaRepository<JiraInfo, String> {

}

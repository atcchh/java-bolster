package com.redmine.rest.client.dto;

import java.util.ArrayList;
import java.util.List;

public class IssueTotal extends CommonTotal{
    private List<Issue> issues = new ArrayList<Issue>();

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}

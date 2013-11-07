package com.redmine.rest.client.dto;

import java.util.ArrayList;
import java.util.List;

public class Issue extends BaseDTO{
//    "done_ratio":0,
//    "id":2859,
//    "subject":"\u5b89e\u8d37\u4e8c\u7ea7\u5e02\u573a\u9875\u9762\u4fee\u6539\u4e3aEDM",
//    "status":{"id":1,"name":"New"},
//    "custom_fields":[{"id":2,"name":"\u4ea7\u54c1\u7ecf\u7406","value":"11"},{"id":3,"name":"\u5f00\u53d1\u63a5\u53e3\u4eba","value":""},{"id":4,"name":"\u6d4b\u8bd5\u63a5\u53e3\u4eba","value":""},{"id":24,"name":"\u5f00\u53d1\u4eba\u5929","value":""},{"id":25,"name":"\u6d4b\u8bd5\u4eba\u5929","value":""},{"id":27,"name":"\u662f\u5426\u9700\u8981UED","value":"\u662f"},{"id":30,"multiple":true,"name":"\u6d89\u53ca\u5b50\u7cfb\u7edf","value":[]}],
//    "tracker":{"id":1,"name":"ECR"},
//    "description":"\u6587\u6848\u6587\u6052\u90a3\u91cc\u6709\uff0c\u8bf7\u4fee\u6539\u6210EDM\uff0c\u8c22\u8c22\u3002",
//    "created_on":"2013-11-07T01:23:47Z",
//    "due_date":"2013-11-07",
//    "project":{"id":5,"name":"\u7f51\u7ad9\u5efa\u8bbe(UED\u4e13\u7528\uff09"},
//    "author":{"id":24,"name":"\u5f20\u6653\u4f1f"},
//    "assigned_to":{"id":132,"name":"\u6587\u6052"},
//    "priority":{"id":5,"name":"\u9ad8"},
//    "updated_on":"2013-11-07T01:26:07Z",
//    "start_date":"2013-11-07"
    private Long done_ratio;
    private Long id;
    private String subject;
    private IDName status;
    private List<IDName>custom_fields = new ArrayList<IDName>();
    private IDName tracker;
    private String description;
    private String created_on;
    private String  due_date;
    private IDName project;
    private IDName author;
    private IDName assigned_to;
    private IDName priority;
    private String updated_on;
    private String start_date;
    public Long getDone_ratio() {
        return done_ratio;
    }
    public void setDone_ratio(Long done_ratio) {
        this.done_ratio = done_ratio;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public IDName getStatus() {
        return status;
    }
    public void setStatus(IDName status) {
        this.status = status;
    }
    public List<IDName> getCustom_fields() {
        return custom_fields;
    }
    public void setCustom_fields(List<IDName> custom_fields) {
        this.custom_fields = custom_fields;
    }
    public IDName getTracker() {
        return tracker;
    }
    public void setTracker(IDName tracker) {
        this.tracker = tracker;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCreated_on() {
        return created_on;
    }
    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }
    public String getDue_date() {
        return due_date;
    }
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
    public IDName getProject() {
        return project;
    }
    public void setProject(IDName project) {
        this.project = project;
    }
    public IDName getAuthor() {
        return author;
    }
    public void setAuthor(IDName author) {
        this.author = author;
    }
    public IDName getAssigned_to() {
        return assigned_to;
    }
    public void setAssigned_to(IDName assigned_to) {
        this.assigned_to = assigned_to;
    }
    public IDName getPriority() {
        return priority;
    }
    public void setPriority(IDName priority) {
        this.priority = priority;
    }
    public String getUpdated_on() {
        return updated_on;
    }
    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }
    public String getStart_date() {
        return start_date;
    }
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
}

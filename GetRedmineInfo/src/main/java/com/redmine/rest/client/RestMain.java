package com.redmine.rest.client;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import thirdparty.org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.redmine.rest.client.dto.CommonTotal;
import com.redmine.rest.client.dto.Issue;
import com.redmine.rest.client.dto.IssueTotal;

public class RestMain {
    private static int LIMIT = 100;
    public static void main(String[] argu) throws IOException {
        List<Issue> issueList = new ArrayList<Issue>();
        RestTemplate template = BasicRestTemplateFactory.getBasicTemplate("caoyanfei079", "1234");
        String issueListURL = "http://lujs.cn/redmine/issues.json?offset={offset}&limit={limit}";
        Map<String, String> parameter = new HashMap<String, String>();
        parameter.put("offset", "0");
        parameter.put("limit", "1");
        ResponseEntity<String> response = template.getForEntity(issueListURL, String.class, parameter);
        // get total size
        CommonTotal total = new Gson().fromJson(response.getBody(), CommonTotal.class);
        Integer totalSize = total.getTotal_count();
        for(int i = 0; i < totalSize / LIMIT + 1; i++) {
            parameter = new HashMap<String, String>();
            parameter.put("offset", (i* LIMIT) + "");
            parameter.put("limit", LIMIT + "");
            response = template.getForEntity(issueListURL, String.class, parameter);
            System.out.println(parameter);
            IssueTotal issues = new Gson().fromJson(response.getBody(), IssueTotal.class);
            issueList.addAll(issues.getIssues());
        }
        FileUtils.writeStringToFile(new File("/tmp/issues.txt"), new Gson().toJson(issueList));
        
    }
}

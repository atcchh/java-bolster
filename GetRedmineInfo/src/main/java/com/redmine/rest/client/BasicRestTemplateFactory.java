package com.redmine.rest.client;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class BasicRestTemplateFactory {
    // TODO defined by factory 
    public static RestTemplate getBasicTemplate(String user, String password) {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        BasicCredentialsProvider credentialsProvider =  new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(user, password));
        httpClient.setCredentialsProvider(credentialsProvider);
        ClientHttpRequestFactory rf = new HttpComponentsClientHttpRequestFactory(httpClient);
        return new RestTemplate(rf);
    }
}

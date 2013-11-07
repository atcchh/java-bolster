package com.redmine.rest.client;

import java.nio.charset.Charset;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sun.xml.internal.messaging.saaj.util.Base64;

public class RestMain {
    public static void main(String[] argu) {
        RestTemplate template = new RestTemplate();
        String issueList = "http://lujs.cn/redmine/issues.json";
        ClientHttpRequestFactory
        template.g
        ResponseEntity<Map> result = template.getForEntity(issueList, Map.class);
        System.out.println(result.getBody());
    }
    HttpHeaders createHeaders( final String username, final String password ){
        return new HttpHeaders(){
           {
              String auth = username + ":" + password;
              byte[] encodedAuth = Base64.encodeBase64( 
                 auth.getBytes(Charset.forName("US-ASCII")) );
              String authHeader = "Basic " + new String( encodedAuth );
              set( "Authorization", authHeader );
           }
        };
     }
}

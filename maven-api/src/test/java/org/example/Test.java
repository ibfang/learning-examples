package org.example;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author tanxh
 * @date 2021/2/5 16:42
 */
public class Test {


    public static void main(String[] args) {
        while (true){
            prize();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void prize(){
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> headers = new HttpHeaders();
//        headers.add("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4MDU3IiwicGhvbmUiOiIxODgyMjg4MDYyNiIsImV4cCI6MTYxMjUzMjExNiwidXNlck5hbWUiOiLokpnlpKrlpYfkuI3lpYfkuLYiLCJpYXQiOjE2MTI1MTQxMTZ9.V1Bt_NPk8YXFFlDF3Vprh76zvkuP-rrDZKHNLHcRjNk");
        headers.add("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4MDI1MiIsInBob25lIjoiMTgxMTg3MDA3MDQiLCJleHAiOjE2MTI1MzA2NDIsInVzZXJOYW1lIjoiLSIsImlhdCI6MTYxMjUxMjY0Mn0.mOzrBamisBEAHJqWjNN_T9UghDW3OTfaH02gCOV3hAc");
        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<String> result = restTemplate.postForEntity("https://prmt.edianyao.com/hwactivity/activity/draw/prize?",entity,String.class);
        System.out.println(result.getBody());
    }
}

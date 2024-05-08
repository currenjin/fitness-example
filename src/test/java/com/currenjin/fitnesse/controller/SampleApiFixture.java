package com.currenjin.fitnesse.controller;

import org.springframework.web.client.RestTemplate;

class SampleApiFixture {

    private final RestTemplate restTemplate = new RestTemplate();
    private String apiUrl;

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void checkResponse(String expectedResponse) {
        String actualResponse = restTemplate.getForObject(apiUrl, String.class);
        if (!actualResponse.equals(expectedResponse)) {
            throw new RuntimeException("Response does not match expected value");
        }
    }
}
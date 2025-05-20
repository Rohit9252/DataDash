package com.api.dataforge.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MockServerURLBuilder {


    @Value("${postman.mock.url}")
    private String baseUrl;






}

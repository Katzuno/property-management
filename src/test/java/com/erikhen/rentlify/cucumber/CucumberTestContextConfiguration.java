package com.erikhen.rentlify.cucumber;

import com.erikhen.rentlify.RentlifyApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = RentlifyApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

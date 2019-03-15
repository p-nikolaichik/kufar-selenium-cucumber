package com.pandekh.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
    glue = "com.pandekh.steps",
    plugin = "pretty")
public class SeleniumRunnerTest {
}
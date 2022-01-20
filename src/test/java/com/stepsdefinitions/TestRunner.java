package com.stepsdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\asus\\IdeaProjects\\CucumberFramework\\src\\test\\Features", glue = {"com.stepsdefinitions"})
public class TestRunner {
}

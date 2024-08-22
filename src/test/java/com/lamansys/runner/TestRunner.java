package com.lamansys.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.lamansys.steps"},
        tags = "@OBTENER-PRIMER-PRODUCTO",
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumberreport.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

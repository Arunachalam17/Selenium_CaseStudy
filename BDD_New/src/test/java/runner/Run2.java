package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="steps",dryRun = false,monochrome = true,tags="@SmokeTest",
plugin = {"pretty" ,"html:Reports/cucumber.html" ,"json:Reports/cucumber.json" ,"junit:Reports/cucumber.xml"})

public class Run2 {

}
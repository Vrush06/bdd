package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Actitime\\Acti.feature",glue = {"Stepdefination"},plugin = {"pretty","html:target\\Report\\Acti.html"})
public class Runner {
	
	

}

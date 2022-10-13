package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class ActiStep {
	
	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		driver.get("https://demo.actitime.com/user/submit_tt.do");
	}

	@When("User enter valid un and pwd")
	public void user_enter_valid_un_and_pwd() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	}

	@And("click on login btn")
	public void click_on_login_btn() {
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("user should naviagate to Home page")
	public void user_should_naviagate_to_home_page() {
		String expD="Aug 29 - Sep 04, 2022";
		  String actD = driver.findElement(By.xpath("//button[text()='Aug 29 - Sep 04, 2022']")).getText();
		  if(actD.equals(expD)) {
			  System.out.println("User navigates to Home page,TC is pass");
		  }
		  else {
			  System.out.println("User is unable to navigate home page,TC is fail");
		  }
		
	}

}

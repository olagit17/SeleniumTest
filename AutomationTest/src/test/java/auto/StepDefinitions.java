package auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;  //org.junit.Assert



public class StepDefinitions {
	WebDriver driver = null;
	
	@Given("^I navigate to Selenium Site$")
	public void i_navigate_to_Selenium_Site() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new RemoteWebDriver(hubAddress.toURL(), capabilities);
		//ChromeOptions options = new ChromeOptions();  
       // options.addArguments("test-type");
       // options.addArguments("--disable-extensions");
        
        //caps.setCapability("browser_version", "54.0.2840.87");
        //driver = new ChromeDriver(options);
		driver = new ChromeDriver();
    	
        String baseUrl = "https://9a2cdb3e.azurewebsites.net/customerlist";
        driver.get(baseUrl);
		
	}

	@When("^The Homepagepage is loaded and displayed\\.$")
	public void the_Homepagepage_is_loaded_and_displayed() throws Throwable {
	    //verify page displayed and loaded
		 String expectedTitle = "Selenium Test";
	        String actualTitle = "";
	       actualTitle = driver.getTitle();
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	       
	}

	@Then("^I should be to verify homepage title  for correctpage$")
	public void i_should_be_to_verify_homepage_title_for_correctpage() throws Throwable {
	    // verify page title
		 String expectedTitle = "Selenium Test";
	        String actualTitle = "";
	        actualTitle = driver.getTitle();
		 Assert.assertTrue(actualTitle.contains("Selenium Test"));
	}
	//Verify John Smith "click to viewDetails"  section
	@When("^I click on \"([^\"]*)\"  Tab on John Smith section$")
	public void i_click_on_Tab_on_John_Smith_section(String arg1) throws Throwable {
	   WebElement button1=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/button"));
	   //WebElement button1=  driver.findElement(By.cssSelector("button[data-test='1'][type='button']"));
	   button1.click();	   		  
	   Thread.sleep(3000);
	}
         // verify Name  displayed section2
	@Then("^John Smith section screen should be displayed$")
	public void john_Smith_section_screen_should_be_displayed() throws Throwable {
		
   	 WebElement  name  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[1]"));
   	 String nameText = name.getText();
   	 Assert.assertTrue(nameText.contains("John Smith"));
   	 System.out.println("John Smith");
   	  Thread.sleep(3000);
	}
	//Verify  Email   
	@Then("^I should view email displayed$")
	public void i_should_view_email_displayed() throws Throwable {
		 WebElement  email  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[2]"));
   	  String emailText = email.getText();
   	  Assert.assertTrue(emailText.contains("jsmith@test.com"));
   	  System.out.println("jsmith@test.com");
   	  //Thread.sleep(3000);
	}
	//Verify   phone 
	@Then("^I should view phone displayed$")
	public void i_should_view_phone_displayed() throws Throwable {
		WebElement  phone  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[3]"));
  	  String phoneText = phone.getText();
  	  Assert.assertTrue(phoneText.contains("0208092029"));
  	  System.out.println("0208092029");
  	  //Thread.sleep(3000);  
	}
	//Verify  city
	@Then("^I should view city displayed$")
	public void i_should_view_city_displayed() throws Throwable {
		WebElement  city  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[4]"));
  	  String cityText = city.getText();
  	  Assert.assertTrue(cityText.contains("London"));
  	  System.out.println("London");
  	  Thread.sleep(3000);
	}
	//Verify    country
	@Then("^I should view country displayed$")
	public void i_should_view_country_displayed() throws Throwable {
		WebElement  country  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[6]"));
	    String countryText = country.getText();
	    Assert.assertTrue(countryText.contains("England"));
	    System.out.println("England");
	    Thread.sleep(3000);
	}
	//Verify   organisation
	@Then("^I should view organisation displayed$")
	public void i_should_view_organisation_displayed() throws Throwable {
		   WebElement  organisation  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[7]"));
	       String organisationText = organisation.getText();
	       Assert.assertTrue(organisationText.contains("Company 1"));
	      System.out.println("Company 1");
	    Thread.sleep(3000);
	}
	//Verify   jobprofile
	@Then("^I should view job profile displayed$")
	public void i_should_view_job_profile_displayed() throws Throwable {
		 WebElement  jobprofile  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[8]"));
   	  String jobprofileText = jobprofile.getText();
   	  Assert.assertTrue(jobprofileText.contains("Software Developer"));
   	  System.out.println("Software Developer");
   	  Thread.sleep(3000);
	}
	//Verify   Additional info
	@Then("^I should view Addition info displayed$")
	public void i_should_view_Addition_info_displayed() throws Throwable {
		WebElement  additionalInfo  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[9]"));
  	  String additionalInfoText = additionalInfo.getText();
  	  Assert.assertTrue(additionalInfoText.contains("Has Bought a lot of products"));
  	   System.out.println("Has Bought a lot of products");
  	  Thread.sleep(3000);
	}
	
	//Verify Jeff Bridges "click to viewDetails"  section
	@When("^user click on  Jeff Bridges tab verify click$")
	public void user_click_on_Jeff_Bridges_tab_verify_click() throws Throwable {
		 WebElement button2=  driver.findElement(By.cssSelector("button[data-test='2'][type='button']"));
  	   button2.click();	
         Thread.sleep(3000);
	}
	 //Verify   Jeff name and other details
	@Then("^user should be able to verify Jeff Bridge names and other detail$")
	public void user_should_be_able_to_verify_Jeff_Bridge_names_and_other_detail() throws Throwable {
     	 WebElement  jeffName  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[1]"));
     	 String jeffNameText = jeffName.getText();
     	 Assert.assertTrue(jeffNameText.contains("Jeff Bridges"));
     	 System.out.println("Jeff Bridges");
     	  Thread.sleep(3000);
     	  
     	 
	}
     
	
	//Verify Steve Jones "click to viewDetails"  section
	@When("^user click on  Steven jones  tab verify click$")
	public void user_click_on_Steven_jones_tab_verify_click() throws Throwable {
		 WebElement steveButton3=  driver.findElement(By.cssSelector("button[data-test='3'][type='button']"));
	    	steveButton3.click();	
	           Thread.sleep(3000);	
	
	}

	//Verify   Steve Jones name
	@Then("^user should be able to verify Steven jones names and other detail$")
	public void user_should_be_able_to_verify_Steven_jones_names_and_other_detail() throws Throwable {
		WebElement  steveJonesName  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/p[1]"));
     	 String steveJonesNameText = steveJonesName.getText();
     	 Assert.assertTrue(steveJonesNameText.contains("Steve Jones"));
     	 System.out.println("Steve Jones");
     	  Thread.sleep(3000);
     	  
     	   
	}
	

}

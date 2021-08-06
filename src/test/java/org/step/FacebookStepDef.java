package org.step;

import java.util.List;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookStepDef extends Baseclass {
	@Given("user is on facebook application")
	public void userIsOnFacebookApplication() {
	 getDriver(); 
	 launchUrl("http://www.facebook.com");
	}

	@When("user should enters username and password")
	public void userShouldEntersUsernameAndPassword(DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists();   
		List<String> string = asLists.get(0);
		String string2 = string.get(1);
		System.out.println(string2);
	}

	@When("user clicks login button")
	public void userClicksLoginButton() {
	 System.out.println("Invalid Login");  
	}

	@Then("user need to validate")
	public void userNeedToValidate() {
	    
	}
}

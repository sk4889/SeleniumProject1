package com.testing.lob.GlueCode;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.testing.lob.Steps.*;
import com.testing.lob.property.PropertyClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class GlueClass {
	
	AppTest at = new AppTest();
	
		
	@Given("^user is on snapdeal portal$")
	public void launch() throws IOException{
		at.launchStep();
	}
	
	@When("^user enters a productname in the search field$")
	public void productSelection() throws IOException{
		at.productSelectionStep();
	}

	@And("^user clicks on search button$")
	public void click() throws IOException{
		at.clickStep();
	}
	
	@Then("^user selects one product from the search list$")
	public void select() throws IOException, AWTException{
		at.selectStep();
	}
	
	@Then("^user clicks on add to cart button$")
	public void addtocart() throws IOException{
		at.addtocart();
	}
	
	/*@Then("^user verifies the product gets added to the cart$")
	public void verify(){
		
	}*/
}

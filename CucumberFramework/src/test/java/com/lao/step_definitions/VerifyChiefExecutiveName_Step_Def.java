package com.lao.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyChiefExecutiveName_Step_Def {
	@Given("the user is logged in succefully and is on home page")
	public void the_user_is_logged_in_succefully_and_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the user is logged in succefully and is on home page");	}

	@When("the user clicks on the directory option from the menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the user clicks on the directory option from the menu bar");	
	}

	@When("the user clicks the job title as {string} from the drop down")
	public void the_user_clicks_the_job_title_as_from_the_drop_down(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the user clicks the job title as {string} from the drop down");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("clicks the search button");
	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the user should see the CEO name as {string}");
	}

}

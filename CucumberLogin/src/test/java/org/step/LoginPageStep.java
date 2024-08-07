package org.step;

import org.global.BaseClass;
import org.page.LoginPage;
import org.page.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageStep extends BaseClass {

	public static BaseClass base = new BaseClass();
	public static LoginPage loginpage = new LoginPage();
	public static SearchHotelPage searchhotel = new SearchHotelPage();

	@Given("User should be in Login Page")
	public void user_should_be_in_login_page() {
		try {

			base.getDriver(base.readExcell(1, 3));
			base.getUrl("https://adactinhotelapp.com/");
			base.winMax();

		}
		catch (Exception e) {
			
		}

	}

        @When("User should Enter the Login Crdentials    {string},{string}")
        public void user_should_enter_the_login_crdentials(String user, String pass) {
		
	    try {
	    	loginpage=new LoginPage();
	    	
			loginpage.getUserName().sendKeys(user);
	    	loginpage.getPassword().sendKeys(pass);
	}
	    
		catch (Exception e) {

		}
	}

	@When("User should Click Login button")
	public void user_should_click_login_button() {

		try {
			loginpage = new LoginPage();

			loginpage.getLogin().click();

		} catch (Exception e) {

		}
	}

	@Then("User should validate login success")
	public void user_should_validate_login_success() {

		try {
			searchhotel = new SearchHotelPage();

			boolean displayed = searchhotel.getSearchHotel().isDisplayed();

			if (displayed) {
				System.out.println("Successfully login");
			} else {
				System.out.println("Successfully Not login");
			}

		} catch (Exception e) {

		}

	}
	@Then("User should select SearchHotel details")
	public void user_should_select_search_hotel_details() {
	    
	}






   @Then("User should Click Search button")
    public void user_should_click_search_button() {
    
}
   }
   


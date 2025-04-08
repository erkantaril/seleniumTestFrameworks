package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginPageSteps {

    LoginPage loginPage= new LoginPage();

    @Given("User navigates login page")
    public void user_navigates_login_page() throws InterruptedException {

        loginPage.navigateToLoginPage();

    }
    @When("User enters login details")
    public void user_enters_login_details() throws InterruptedException {

        loginPage.enterCredentials();
        loginPage.clickLoginButton();
        Thread.sleep(3000);

    }
    @Then("User should be able to view products page")
    public void user_should_be_able_to_view_products_page() {

        Assert.assertEquals("https://www.saucedemo.com/inventory.html", LoginPage.getCurrentUrl());
    }
}

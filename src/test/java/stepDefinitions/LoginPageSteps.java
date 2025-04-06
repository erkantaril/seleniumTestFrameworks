package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import javax.imageio.plugins.tiff.TIFFDirectory;

public class LoginPageSteps {

    WebDriver driver;
    LoginPage loginPage= new LoginPage();

    @Given("User navigates login page")
    public void user_navigates_login_page() throws InterruptedException {
        driver= new ChromeDriver();
        loginPage.navigateToLoginPage();

    }
    @When("User enters login details")
    public void user_enters_login_details() {
        loginPage.enterCredentials();
        loginPage.clickLoginButton();

    }
    @Then("User should be able to view products page")
    public void user_should_be_able_to_view_products_page() {
        String title = driver.getTitle();
        Assert.assertEquals("Swag Labs", title);
    }
}

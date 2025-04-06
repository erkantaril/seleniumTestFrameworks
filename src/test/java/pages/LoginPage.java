package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    // WebElements

    @FindBy(id="user-name")
    private WebElement usernameTxtBox;

    @FindBy(id="password")
    private WebElement passwordTxtBox;

    @FindBy(id="login-button")
    private WebElement loginButton;

    // Actions

    public void navigateToLoginPage() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }

    public void enterCredentials(){
        usernameTxtBox.sendKeys("standard_user");
        passwordTxtBox.sendKeys("secret_sauce");
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    static WebDriver driver;
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
        Thread.sleep(1000);
        driver.manage().window().maximize();
    }

    public void enterCredentials() throws InterruptedException {
        usernameTxtBox.sendKeys("standard_user");
        Thread.sleep(1000);
        passwordTxtBox.sendKeys("secret_sauce");
        Thread.sleep(1000);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }





}

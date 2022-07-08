package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(LoginPage.class.getName());
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "loginusername")
    WebElement usernameField;

    @FindBy(id = "loginpassword")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "(//button[contains(text(),'Close')])[3]")
    WebElement closeButton;

    public void enterUsername(String username) {
        type(usernameField, username);
        LOG.info("username entered");
    }
    public void enterPassword(String password){
        type(passwordField,password);
        LOG.info("password entered");
    }
    public void clickOnLoginBtn(){
        click(loginButton);
        LOG.info("click on login button success");
    }
    public void clickOnCloseBtn(){
        click(closeButton);
    }
    public void invalidUsernameErrorMessage(){

        LOG.info("user does not exist");
    }
    public void invalidPasswordErrorMessage(){

        LOG.info("wrong password");
    }
}

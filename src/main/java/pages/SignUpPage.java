package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonAPI {
    Logger LOG= (Logger) LogManager.getLogger(SignUpPage.class.getName());
    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "sign-username")
    WebElement inputTextUsername;

    @FindBy(id = "sign-password")
    WebElement inputTextPassword;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    WebElement buttonSignUp;

    @FindBy(xpath = "(//button[contains(text(),'Close')])[2]")
    WebElement buttonClose;

    @FindBy(xpath = "(//span[text()='×'])[2]")
    WebElement buttonX;

    public void setInputTextUsername(String textUsername){
        type(inputTextUsername,textUsername);
    }
    public void setInputTextPassword(String textPassword){
        type(inputTextPassword, textPassword);
    }
    public void clickOnSignUpbtn(){
        click(buttonSignUp);
        LOG.info("new username and password created");
    }

}

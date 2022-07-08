package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "img[alt='First slide']")
    WebElement firstSlide;

    @FindBy(css = "img[alt='Second slide']")
    WebElement secondSlide;

    @FindBy(css = "img[alt='Third slide']")
    WebElement thirdSlide;

    @FindBy(xpath = "//a[text()='Home ']")
    WebElement linkHome;

    @FindBy(linkText = "Contact")
    WebElement linkContact;

    @FindBy(linkText = "About us")
    WebElement linkAboutUs;

    @FindBy(linkText = "Cart")
    WebElement linkCart;

    @FindBy(linkText = "Log in")
    WebElement linkLogin;

    @FindBy(linkText = "Sign up")
    WebElement linkSignUp;

    @FindBy(css = "a[data-slide='next']")
    WebElement arrowRight;

    @FindBy(css = "a[data-slide='prev']")
    WebElement arrowLeft;

    @FindBy(linkText = "CATEGORIES")
    WebElement linkCategories;

    @FindBy(linkText = "Phones")
    WebElement linkPhones;

    @FindBy(linkText = "Laptops")
    WebElement linkLaptops;

    @FindBy(linkText = "Monitors")
    WebElement linkMonitors;

    @FindBy(linkText = "Samsung galaxy s6")
    WebElement linkSamsungGalaxyS6;

    @FindBy(linkText = "MacBook Pro")
    WebElement linkMacBookPro;

    @FindBy(linkText = "ASUS Full HD")
    WebElement linkASUSFullHD;

    @FindBy(id = "next2")
    WebElement buttonNextPage;

    public boolean checkPresenceOfFirstSlide(){
     return isPresent(firstSlide);
    }

    public boolean checkPresenceOfSecondSlide(){
         return isPresent(secondSlide);
    }
    public boolean checkPresenceOfThirdSlide(){
        return isPresent(thirdSlide);
    }

    public boolean checkPresenceOfHomeLink(){
        return isPresent(linkHome);
    }
    public boolean checkPresenceOfAboutUsLink(){
        return isPresent(linkAboutUs);
    }
    public boolean checkPresenceOfContactLink(){
        return isPresent(linkContact);
    }
    public boolean checkPresenceOfCartLink(){
        return isPresent(linkCart);
    }
    public boolean checkPresenceOfLoginLink(){
        return isPresent(linkLogin);
    }
    public boolean checkPresenceOfSignUpLink(){
        return isPresent(linkSignUp);
    }
    public void clickOnLogin(){
        click(linkLogin);
    }
    public void clickOnSignUp(){
        click(linkSignUp);
    }


}

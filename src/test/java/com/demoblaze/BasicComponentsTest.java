package com.demoblaze;


import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class BasicComponentsTest extends CommonAPI {
    @Test
    public void  userLandsOnRightWebsite() {
        String title = getPageTitle();
        System.out.println(title);
        Assert.assertEquals("", title);

    }
    @Test
    public void firstSlidePresent(){
        HomePage homePage= new HomePage(getDriver());
        System.out.println("Check if first slide is present "+ homePage.checkPresenceOfFirstSlide());
        Assert.assertTrue(homePage.checkPresenceOfFirstSlide());
    }


    @Test
    public void secondSlidePresent(){
        HomePage homePage= new HomePage(getDriver());
        System.out.println("Check if second slide is present  "+ homePage.checkPresenceOfSecondSlide());
        Assert.assertTrue(homePage.checkPresenceOfSecondSlide());

    }
    @Test
    public void thirdSlidePresent(){
        HomePage homePage= new HomePage(getDriver());
        System.out.println("Check if third slide is present  "+ homePage.checkPresenceOfThirdSlide());
        Assert.assertTrue(homePage.checkPresenceOfThirdSlide());
    }
    @Test
    public void checkThePresenceOfHeaderLink(){
        HomePage homePage= new HomePage(getDriver());
        System.out.println("Check if home link is present  "+ homePage.checkPresenceOfHomeLink());
        Assert.assertTrue(homePage.checkPresenceOfHomeLink());

        System.out.println("Check if contact link is present  "+ homePage.checkPresenceOfContactLink());
        Assert.assertTrue(homePage.checkPresenceOfContactLink());

        System.out.println("Check if about us link is present  "+ homePage.checkPresenceOfAboutUsLink());
        Assert.assertTrue(homePage.checkPresenceOfAboutUsLink());

        System.out.println("Check if cart link is present  "+ homePage.checkPresenceOfCartLink());
        Assert.assertTrue(homePage.checkPresenceOfCartLink());

        System.out.println("Check if login link is present  "+ homePage.checkPresenceOfLoginLink());
        Assert.assertTrue(homePage.checkPresenceOfLoginLink());

        System.out.println("Check if signup link is present  "+ homePage.checkPresenceOfSignUpLink());
        Assert.assertTrue(homePage.checkPresenceOfSignUpLink());

    }
    @Test
    public void goToLoginPage(){
        HomePage homePage= new HomePage(getDriver());
        homePage.checkPresenceOfLoginLink();
        homePage.clickOnLogin();
    }
    @Test
    public void goToSignUpPage(){
        HomePage homePage= new HomePage(getDriver());
        homePage.checkPresenceOfSignUpLink();
        homePage.clickOnSignUp();
    }

}

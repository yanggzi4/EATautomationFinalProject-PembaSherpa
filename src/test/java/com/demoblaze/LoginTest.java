package com.demoblaze;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.ExcelReader;
import utilities.Utility;

public class LoginTest extends CommonAPI {
    ExcelReader excelReader= new ExcelReader(Utility.currentDir +"/data/data.xlsx","data");
    String username= Utility.loadProperties().getProperty("username");
    String password= Utility.loadProperties().getProperty("password");
    @Test
    public void loginWithValidCred() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        homePage.clickOnLogin();

        loginPage.enterUsername("mypractice");
        loginPage.enterPassword("hotmailS4");
        loginPage.clickOnLoginBtn();
        Assert.assertEquals("PRODUCT STORE", productPage.getHeaderText());

    }

    @Test
    public void loginWithInvalidUsername() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickOnLogin();

        loginPage.enterUsername(" ");
        loginPage.enterPassword("hotmailS4");
        loginPage.clickOnLoginBtn();
        loginPage.invalidUsernameErrorMessage();


    }

    @Test
    public void loginWithInvalidPassword() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickOnLogin();

        loginPage.enterUsername("mypractice");
        loginPage.enterPassword("");
        loginPage.clickOnLoginBtn();
        loginPage.invalidPasswordErrorMessage();

    }
}


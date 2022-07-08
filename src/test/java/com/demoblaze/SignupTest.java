package com.demoblaze;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignupTest extends CommonAPI {
    @Test
    public void newSignUp(){
        SignUpPage signUpPage= new SignUpPage(getDriver());
        signUpPage.setInputTextUsername("newuser");
        signUpPage.setInputTextPassword("passWord1");
        signUpPage.clickOnSignUpbtn();
    }

}

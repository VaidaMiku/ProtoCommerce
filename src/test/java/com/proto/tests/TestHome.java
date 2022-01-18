package com.proto.tests;

import com.proto.base.BaseTest;
import com.proto.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHome extends BaseTest {

    HomePage homePage;


    @Test
    public void signingIn() throws IOException {
        homePage = new HomePage(driver);
        homePage.signUp();
        Assert.assertEquals(homePage.successfulSignUpAlert(), "×\n" +
                "Success! The Form has been submitted successfully!.", "Test failed");
        System.out.println(homePage.successfulSignUpAlert());
        System.out.println("Hello");

    }



}

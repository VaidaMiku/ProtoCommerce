package com.proto.pages;

import com.proto.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static com.proto.util.TestDataReader.*;

public class HomePage extends BaseTest {

    WebDriver driver;

    String username = getUsername();
    String email = getEmail();
    String password = getPassword();
    String birthday = getBirthday();


    public HomePage(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "name")
    WebElement nameBox;

    @FindBy(name = "email")
    WebElement emailBox;

    @FindBy(xpath = "//*[@id='exampleInputPassword1']")
    WebElement passwordBox;

    @FindBy(id = "exampleCheck1")
    WebElement checkBox;

    @FindBy(id = "exampleFormControlSelect1")
    WebElement genderBox;

    @FindBy(id = "inlineRadio1")
    WebElement employmentRadioButton;

    @FindBy(name = "bday")
    WebElement birthdayBox;

    @FindBy(css = ".btn.btn-success")
    WebElement submitButton;

    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement signUpAlert;

    public void signUp() {
    nameBox.sendKeys(username);
    emailBox.sendKeys(email);
    passwordBox.sendKeys(password);
    checkBox.click();

    Select gender = new Select(genderBox);
    gender.selectByVisibleText("Female");

    employmentRadioButton.click();
    birthdayBox.sendKeys(birthday);
    submitButton.click();

    }

    public String successfulSignUpAlert() {
        return signUpAlert.getText();
    }
}

package com.proto.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;

import static com.proto.util.TestDataReader.*;

public class BaseTest {

    public WebDriver driver;

    //DesiredCapabilities dc;

    @BeforeTest
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        //String browser = getBrowser();
        String baseUrl = getUrl();
        //String nodeUrl = getNode();


        //dc = new DesiredCapabilities();
        //dc.setPlatform(Platform.WINDOWS);
        //dc.setBrowserName(browser);
        //driver = new RemoteWebDriver(new URL(nodeUrl), dc);
        //System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @AfterTest
    public void tearDown() {
        //driver.close();
    }
}

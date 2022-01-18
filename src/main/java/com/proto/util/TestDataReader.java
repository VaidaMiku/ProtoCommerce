package com.proto.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {

    public static Properties getTestData() throws IOException {
        FileInputStream fp = new FileInputStream("/testdata.properties");
        Properties properties = new Properties();
        properties.load(fp);
        return properties;
    }

    public static String getUrl() throws IOException {
        return getTestData().getProperty("baseUrl");
    }


    public static String getBrowser() throws IOException {
        return getTestData().getProperty("browser");
    }

    public static String getUsername() throws IOException {
        return getTestData().getProperty("username");
    }

    public static String getPassword() throws IOException {
        return getTestData().getProperty("password");
    }

    public static String getEmail() throws IOException {
        return getTestData().getProperty("email");
    }

    public static String getBirthday() throws IOException {
        return getTestData().getProperty("birthday");
    }

}

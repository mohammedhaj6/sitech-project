package com.saucedemo.utils;

import java.util.Properties;

public class ConfigUtils {
    private static ConfigUtils configUtils;
    private Properties properties;

    private ConfigUtils() {
        String env = System.getProperty("env", "PRODUCTION");
        switch (env) {
            case "PRODUCTION":
                properties = PropertiesUtils.loadProperties("src/test/java/com/saucedemo/config/production.properties");
                break;
            case "LOCAL":
                properties = PropertiesUtils.loadProperties("src/test/java/com/saucedemo/config/local.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");

        }

    }

    public static ConfigUtils getInstance() {
        if (configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if (prop != null) return prop;
        throw new RuntimeException("Could not find the base url in the properties file");


    }

    public String getMainPageUrl() {
        String prop = properties.getProperty("main-page-url");
        if (prop != null) return prop;
        throw new RuntimeException("Could not find the main page url in the properties file");


    }

    public String getValidUsername() {
        String prop = properties.getProperty("valid-username");
        if (prop != null) return prop;
        throw new RuntimeException("Could not find the username in the properties file");


    }

    public String getValidPassword() {
        String prop = properties.getProperty("valid-password");
        if (prop != null) return prop;
        throw new RuntimeException("Could not find the password in the properties file");


    }

    public String getInvalidUsername() {
        String prop = properties.getProperty("invalid-username");
        if (prop != null) return prop;
        throw new RuntimeException("Could not find the username in the properties file");


    }

    public String getInvalidPassword() {
        String prop = properties.getProperty("invalid-password");
        if (prop != null) return prop;
        throw new RuntimeException("Could not find the password in the properties file");


    }


}

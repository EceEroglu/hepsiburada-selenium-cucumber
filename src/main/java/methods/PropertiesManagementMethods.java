package methods;

import logger.Log;

import java.io.*;
import java.util.Properties;

public class PropertiesManagementMethods {


    static String propertiesFilePath = "src/main/resources/config.properties";
    static String seleniumPropertiesFilePath = "src/main/resources/selenium.properties";

    public void setProperty(String propName, String propValue) {

        // create temp test file if not exists
        File file = new File(propertiesFilePath);

        try {
            if (file.createNewFile()) {
                Log.INFO("File: " + propertiesFilePath + " is created");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // load config file
        Properties props = null;
        try {
            FileInputStream in = new FileInputStream(propertiesFilePath);
            props = new Properties();
            props.load(in);
            in.close();
        } catch (Exception e) {

        }
        // edit config file
        try {
            FileOutputStream out = new FileOutputStream(propertiesFilePath);
            props.setProperty(propName, propValue);
            props.store(out, null);
            out.close();
        } catch (Exception e) {
        }
    }

    public String getProperty(String propName) {
        Properties prop = new Properties();

        InputStream is;
        try {
            is = new FileInputStream(propertiesFilePath);

            prop.load(is);
            String propertieValue = prop.getProperty(propName);

            is.close();

            return propertieValue;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getSeleniumProperty(String propName) {
        Properties prop = new Properties();

        InputStream is;
        try {
            is = new FileInputStream(seleniumPropertiesFilePath);

            prop.load(is);
            String propertieValue = prop.getProperty(propName);

            is.close();

            return propertieValue;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // UTILS
    public static String getOS() {
        String OS = System.getProperty("os.name").toLowerCase();
        return OS;
    }

    public boolean isWindows() {
        String OS = getOS();
        return (OS.indexOf("win") >= 0);
    }

    public boolean isMac() {
        String OS = getOS();
        return (OS.indexOf("mac") >= 0);
    }

    public boolean isUnix() {
        String OS = getOS();
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
    }

}


package environment;

import methods.BrowserUtils;
import methods.PropertiesManagementMethods;

public interface BaseTest {

    PropertiesManagementMethods props = new PropertiesManagementMethods();
    BrowserUtils browser = new BrowserUtils();


}
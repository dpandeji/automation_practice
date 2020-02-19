package selenium;

import selenium.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import selenium.helper.Tools;


public class Hooks extends DriverFactory {
    Tools tools= new Tools();
    @Before
    public void setUp() {
        openBrowser();
        navigateTo("https://www.debenhams.com/");
        maxiBrowser();
        tools.driverWait();
    }
    @After
    public void quit() {
        closeBrowser();
    }
}



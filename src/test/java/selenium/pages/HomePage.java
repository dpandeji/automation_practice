package selenium.pages;

import selenium.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends DriverFactory {

    public void doSearch(String searchTerm) {
        driver.findElement(By.cssSelector("input[data-analytics-name='search']")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("input[data-analytics-name='search']")).sendKeys(Keys.ENTER);}
    public String getCurrentUrl() {return driver.getCurrentUrl();
    }
    }
package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.drivers.DriverFactory;
import selenium.helper.Tools;

public class ProductDescriptionPage extends DriverFactory {
    Tools tool = new Tools();

    public String selectedProductDescription(String s) {
        WebElement productDescription = driver.findElement(By.cssSelector("h1[class='t-product-details-heading__title dbh-product-title ']"));
        return productDescription.getText();
    }

    public String selectFromDropDown(String select) {
        driver.findElement(By.cssSelector("div[class='css-1wy0on6 c-select-menu-wrapper__indicators']")).click();
        WebElement selectBox = driver.findElement(By.cssSelector("div[class='css-151xaom-placeholder c-select-menu-wrapper__placeholder']"));
        selectBox.getCssValue(select);
        return select;
    }
}
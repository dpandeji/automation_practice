package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.drivers.DriverFactory;
import selenium.helper.Tools;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.fail;


public class ResultPage extends DriverFactory {

    public String getPageTitle(){
       return driver.findElement(By.cssSelector("span[class='pw-link']")).getText();
         }

         //validateSearchResult
    public List<WebElement> searchResult(){
        List<WebElement> searchedProduct= driver.findElements(By.cssSelector("article[class='c-product-item u-flexbox u-direction-column u-align-center']"));
       if (searchedProduct.size()==0){
           fail("no product found with Search Result");}
       return searchedProduct;
    }
    public List<String> searchProductName(){
        List<String> listOfName= new ArrayList<>();
        List<WebElement> productWebElement= searchResult();
        for (WebElement individualList: productWebElement){
            String actualProduct= individualList.getText();
            listOfName.add(actualProduct);}
        return listOfName;
        }
        public String selectProduct(){
        List<WebElement> productWebElement= searchResult();
        int productSize=productWebElement.size();
       int randomNumber= new Tools().select(productSize);
       WebElement selectedElement = productWebElement.get(randomNumber);
       String selectedProduct = selectedElement.getText();
       selectedElement.click();
       return selectedProduct;
    }


}

package selenium.steps_Defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import selenium.pages.HomePage;
import selenium.pages.ProductDescriptionPage;
import selenium.pages.ResultPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

public class SelectProductTest {
private HomePage homePage= new HomePage();
private ResultPage resultPage= new ResultPage();
private ProductDescriptionPage descriptionPage=new ProductDescriptionPage();

    @Given("^I am on result page$")
    public void i_am_on_result_page()  {
        // Write code here that turns the phrase above into concrete actions
       resultPage.searchResult();
       List<String> productName= resultPage.searchProductName();
      // assertThat(productName,contains("baby jumpsuit"));
    }

    @When("^I select any \"([^\"]*)\"$")
    public void i_select_any(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
       resultPage.selectProduct();
           }

    @Then("^I should be able to see \"([^\"]*)\" in detail$")
    public void i_should_be_able_to_see_in_detail(String arg1)  {
       String actual = descriptionPage.selectedProductDescription(arg1);
       assertThat(actual,is(containsString("Jumpsuit")));
      // Write code here that turns the phrase above into concrete action
    }

    @Then("^I should be able to select \"([^\"]*)\"$")
    public void i_should_be_able_to_select(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        String actual =descriptionPage.selectFromDropDown(arg1);
        assertThat(actual, Matchers.<String>hasToString("0-3 months"));
            }




















//    homePage.doSearch("baby jumpsuit");
//
//    @Given("^I am on result page$")
//    public void i_am_on_result_page()  {
//        // Write code here that turns the phrase above into concrete actions
//
//        List<WebElement> listedProduct= resultPage.searchResult();
//         List<String> productList= resultPage.searchProductName();
//        assertThat(productList, Is.<List<String>>is((List<String>) equalToIgnoringCase("baby jumpsuit")));
//                    }
//
//    @When("^I select \"([^\"]*)\"$")
//    public void i_select_(String arg1) {
//          String actual= resultPage.selectProduct();
//        assertThat(actual,is(equalToIgnoringCase(arg1)));
//        // Write code here that turns the phrase above into concrete actions
//    }
//
//    @Then("^I should be able to see \"([^\"]*)\" in detail$")
//    public void i_should_be_able_to_see_in_detail(String arg1) {
//        // Write code here that turns the phrase above into concrete actions
//
//}
}

package selenium.steps_Defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.pages.HomePage;
import selenium.pages.ResultPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class searchTest {

    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        String actual = homePage.getCurrentUrl();
        assertThat(actual, endsWith(".debenhams.com/"));
    }

    @When("^I search for product baby$")
    public void i_search_for_product_baby() {
        // Write code here that turns the phrase above into concrete actions
        homePage.doSearch("baby");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I should be able to see baby products$")
    public void i_should_be_able_to_see_baby_products() {
        // Write code here that turns the phrase above into concrete actions
        String actual = resultPage.getPageTitle();
        assertThat(actual, is(equalToIgnoringCase("baby")));
      //  List<String> actualName = resultPage.searchProductName();
      //  for (String item : actualName){
        //    assertThat(item,is(equalToIgnoringCase("baby")));
        }

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        homePage.doSearch(arg1);
    }

    @Then("^I should be able to see \"([^\"]*)\" products$")
    public void i_should_be_able_to_see_products(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        String actual=resultPage.getPageTitle();
        assertThat(actual,is(equalToIgnoringCase(arg1)));
    }

}




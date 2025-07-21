/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qa.x86coder.dev;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Amed Reyes
 */
public class StepDefinitions {
    
    private WebDriver wd;
    
    @Given("I open browser")
    public void i_open_browser(){
        System.out.println("hello_from_i_open_browser()");
        wd = new FirefoxDriver();
    }
    
    @When("I go to home page")
    public void i_go_to_home_page(){
        System.out.println("hello from go_to_home_page()");
        wd.get("https://www.pcel.com");
    }
    
    @Then("I should see page title as {string}")
    public void i_should_see_page_title_as(String expectedValue){
        System.out.println("page title should be = " + expectedValue);
        String myTitle = wd.getTitle();
        Assert.assertEquals(myTitle, expectedValue);
                
    }
}

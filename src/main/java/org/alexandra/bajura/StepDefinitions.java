package org.alexandra.bajura;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private WebDriver webDriver;

    @Given("user is accessing the login page")
    public void accessLoginPage() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
    }

    @When("user enters correct credentials")
    public void userEntersCorrectCredentials() {
        webDriver.findElement(By.id("email")).sendKeys("alexandra.bajura094@gmail.com");
        webDriver.findElement(By.id("pass")).sendKeys("aA1!aaaa");
    }

    @And("user clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        webDriver.findElement(By.name("login")).click();
    }


    @Then("user should be successful Login")
    public void userShouldBeSuccessfulLogin() throws InterruptedException {
        webDriver.get("https://www.facebook.com/?sk=welcome");
        Thread.sleep(5 * 1000);
        webDriver.close();
    }
}

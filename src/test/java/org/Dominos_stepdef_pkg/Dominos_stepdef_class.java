package org.Dominos_stepdef_pkg;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Dominos_base_pkg.Dominos_baseclass;
import org.Dominos_pom_pkg.Dominos_pomclass;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;

public class Dominos_stepdef_class  extends Dominos_baseclass {

    Dominos_pomclass pom=new Dominos_pomclass();

    @Given("login the url")
    public void login_the_url() {
    driver.get("https://www.dominos.co.in/");
        driver.manage().window().maximize();
    }
    @When("Click on Order Online")
    public void click_on_order_online() {
        driver.findElement(pom.online_order).click();
       // driver.manage().timeouts().implicitlyWait(Timeout.ofSeconds(12));

    }
    @When("Click on location button and enter the location details")
    public void click_on_location_button_and_enter_the_location_details() throws InterruptedException {
        driver.findElement(pom.delivery_address).click();
        Thread.sleep(2000);
        driver.findElement(pom.enter_area).sendKeys("600045");
        driver.manage().window().maximize();


    }
    @When("To select the veg pizzas and Beverages")
    public void to_select_the_veg_pizzas_and_beverages() {

    }
    @When("To remove the Qty of the order in the add to cart")
    public void to_remove_the_qty_of_the_order_in_the_add_to_cart() {

    }
    @Then("Checkout the order and close the window")
    public void checkout_the_order_and_close_the_window() {

    }








}

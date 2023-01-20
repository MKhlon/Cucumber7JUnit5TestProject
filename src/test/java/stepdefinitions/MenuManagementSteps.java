package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumbercourse.RestaurantMenu;
import cucumbercourse.RestaurantMenuItem;

public class MenuManagementSteps {
    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();

    public MenuManagementSteps() {
        System.out.println("Constructor called");
    }

    @Given("I have a menu item with name {string} and price {int}")
    //@Given("I have a menu item with name \"([^\"]+)\" and price ([0-9]{4})") //([0-9]*) //([0-9]+) //(\\d+)   //regexp
    public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, Integer price) {
        newMenuItem = new RestaurantMenuItem(newMenuItemName, "default description", price);
        System.out.println("Step 1");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        locationMenu.addMenuItem(newMenuItem);
        System.out.println("Step 2");
    }

    @Then("Menu Item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String string) {
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step 3: " + exists);
    }
}
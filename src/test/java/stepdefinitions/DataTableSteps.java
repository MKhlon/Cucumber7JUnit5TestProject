package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("I placed an order for the following items")
    public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
        //List of Strings
//        List<String> billData = dataTable.asList(String.class);
//        for (String billItem: billData) {
//            System.out.println(billItem);
//        }
        //List of Lists of Strings
//        List<List<String>> billData = dataTable.asLists(String.class);
//
//        for(List<String> billItems:billData) {
//            for(String billItem:billItems) {
//                System.out.println(billItem);
//            }
//        }

        //List of Maps
        List<Map<String,String>>billData = dataTable.asMaps(String.class, String.class);

        for(Map<String,String>billItems:billData) {
            for(Map.Entry<String,String>billItem:billItems.entrySet()) {
                System.out.println("Key: " + billItem.getKey() + " Value: " + billItem.getValue());
            }
        }
    }

    @When("I generate the bill")
    public void i_generate_the_bill() {
    }

    @Then("a bill for ${int} should be generated")
    public void a_bill_for_$_should_be_generated(Integer int1) {
    }
}
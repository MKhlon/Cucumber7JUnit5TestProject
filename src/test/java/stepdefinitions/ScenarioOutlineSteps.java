package stepdefinitions;

import cucumbercourse.BillCalculationHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Messages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScenarioOutlineSteps {

    int initialBillAmount;
    double taxRate;
    double systemCalculatedValue;

    @Given("I have a Customer")
    public void i_have_a_Customer() {
    }

    @Given("user enters initial bill amount as {int}")
    public void user_enters_initial_bill_amount_as(Integer initialBillAmount) {
        this.initialBillAmount = initialBillAmount;
        System.out.println("InitialBillAmount: " + initialBillAmount);
    }

    @Given("Sales Tax Rate is {double} Percent")
    public void sales_Tax_Rate_is_Percent(Double taxRate) {
        this.taxRate = taxRate;
        System.out.println("Tax Rate: " + taxRate);
    }

    @Then("final bill amount calculate is {double}")
    public void final_bill_amount_calculate_is(Double expectedValue) {
        systemCalculatedValue = BillCalculationHelper.calculateBillForCustomer(this.initialBillAmount, this.taxRate);
        System.out.println("Expected value: " + expectedValue);
        System.out.println("System calculated value " + systemCalculatedValue);
        assertEquals(expectedValue, systemCalculatedValue, 0.0, Messages.VALUES_ARE_NOT_EQUAL);
    }
}
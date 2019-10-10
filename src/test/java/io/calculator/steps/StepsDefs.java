package io.calculator.steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import io.calculator.Functions;
import org.junit.Assert;


public class StepsDefs {
    Functions functions;
    int actualResult;

    @Given("^I create a new Function object$")
    public void createNewObject() {
        functions = new Functions();
    }


    @When("^I add (.*) and (.*) into the function$")
    public void addTwoNumbers(int a, int b){
        actualResult = functions.addition(a, b);
    }

    @Then("^I get (.*) as a result$")
    public void checkResult(int expectedResult){
        Assert.assertEquals(expectedResult, actualResult);
    }


}

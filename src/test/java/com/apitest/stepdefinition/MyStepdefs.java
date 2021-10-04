package com.apitest.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class MyStepdefs {

    RequestSpecification request;
    Response response;

    @Given("^User sets the base API request <.*>$")
    public void userSetsTheBaseAPIRequestURL(String url) {
        RestAssured.baseURI= url;
    }

    @And("^User authenticates the API request with <.*>$")
    public void userAuthenticatesTheAPIRequestWithAPIKey(String key) {
        request = request.given().queryParam("api-key","38BAcyUfn9ET2OlPEbCTXK0BNQ2JgSfe");
    }

    @When("User send the API request to get all results")
    public void userSendTheAPIRequestToGetAllResults() {
        String path= "/svc/books/v3/lists";
        response = request.get(path).then().extract().response();
    }

    @Then("^User validates the response status <.*>$ and results$")
     public void userValidatesTheResponseStatusCodeAndResults(int code) {
            Assert.assertEquals(code,response.getStatusCode());
    }
}

package com.apitest;
import io.restassured.RestAssured;
import io.restassured.*;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.message.HeaderValueParser;
import org.codehaus.groovy.runtime.metaclass.MetaMethodIndex;
import org.junit.Test;
import org.junit.Assert;

import javax.swing.plaf.metal.MetalBorders;
import java.sql.ClientInfoStatus;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.keyStore;

public class TestNyTimes {

    String key = "38BAcyUfn9ET2OlPEbCTXK0BNQ2JgSfe";
    String url= "https://api.nytimes.com";

    @Test   // Rest Assured Method to get the API response
    public void GetListByBookName(){

        String url_api = url + "/svc/books/v3/lists";
                 given().queryParam("api-key","38BAcyUfn9ET2OlPEbCTXK0BNQ2JgSfe")
                        .queryParam("list", "hardcover-fiction")
                        .when().get(url_api).then().log().body();

    }

}

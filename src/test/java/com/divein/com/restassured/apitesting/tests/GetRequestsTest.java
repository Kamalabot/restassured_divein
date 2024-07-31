package com.divein.com.restassured.apitesting.tests;
// Base Junit 5 Test framework
import org.junit.Test;
import org.junit.Assert;

// Rest Assured framework
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class GetRequestsTest {
    @Test
    public void getAllBookings() {
        Response myresponse = 
        RestAssured
            .given()
                .contentType(ContentType.JSON)
                .baseUri("https://restful-booker.herokuapp.com/booking")
            .when()
                .get()
            .then()
                .assertThat()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .header("Content-Type", "application/json; charset=utf-8")
            .extract()
                .response();
        // Can print out the response as string
        // System.out.println(myresponse.getBody().asString());
        // just assert it with what you want to find
        Assert.assertTrue(myresponse.getBody().asString().contains("bookingid"));
    }
}

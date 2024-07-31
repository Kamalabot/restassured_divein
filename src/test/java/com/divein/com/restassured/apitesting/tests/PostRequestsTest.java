package com.divein.com.restassured.apitesting.tests;

// Base Junit 5 Test framework
import org.junit.Test;
import org.junit.Assert;

// Rest Assured framework
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

// JsonObject
// import net.minidev.json.JSONObject;
// import com.jayway.jsonpath.json.JSONObject;

@Test
public class PostRequestsTest {
    JSObject bookingDates = new JSONObject();
    JSObject booking = new JSONObject();

    booking.put("firstname", "api testing");
    booking.put("lastname", "tutorial");
    booking.put("totalprice", 1000);
    booking.put("depositpaid", true);
    booking.put("additionalneeds", "breakfast");
    booking.put("bookingdates", bookingDates);

    bookingDates.put("checkin", "2024-07-31");
    bookingDates.put("checkout", "2024-08-03");
    system.out.println(booking.to_sting());
}

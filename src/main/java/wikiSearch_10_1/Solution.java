package wikiSearch_10_1;


import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Solution {
    public static void main(String[] args) throws IOException {
        String request;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        request = reader.readLine();
        serverRequest(request);
    }

    public static void serverRequest(String request) throws UnsupportedEncodingException {
        //request = URLEncoder.encode(request, "UTF-8");
        given()
                .when()
                .get(request)
                .then()
                .log().all();
        //return " ";
    }
}


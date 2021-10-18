package wikiSearch_10_1;


import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Solution {
    /**
     * Главный метод в котором происходит вызов методов serverRequest и getFinalReq
     * @param args
     */
    public static void main(String[] args) throws IOException {
        serverRequest("https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"" + getFinalReq() + "\"");
    }

    /**
     * Метод обращающийся к серверу википедии
     * @param request URL-запрос к серверу
     */
    public static void serverRequest(String request) throws UnsupportedEncodingException {
        given()
                .when()
                .get(request)
                .then()
                .log().all();
    }

    /**
     * Метод считывающий интересующий запрос с конслоли
     */
    public static String getFinalReq () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}


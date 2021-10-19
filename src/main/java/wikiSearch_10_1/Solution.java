package wikiSearch_10_1;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class Solution {
    /**
     * Главный метод в котором происходит вызов методов serverRequest и getFinalReq
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) throws IOException {
        Root root = serverRequest("https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"" + getFinalReq() + "\"");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < root.getQuery().getSearch().size(); i++) {
            strings.add(root.getQuery().getSearch().get(i).getSnippet().replaceAll("<[^>]+>", ""));
        }
        for (String str : strings) {
            System.out.println(str + "\n");
        }

    }

    /**
     * Метод обращающийся к серверу википедии и возвращающий распарсеный в класс Root объект
     * @return response
     * @param request URL-запрос к серверу
     */
    public static Root serverRequest(String request) {
        RestAssured.config = RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig().jackson2ObjectMapperFactory(
                (type, s) -> {
                    ObjectMapper objectMapper = new ObjectMapper();
                    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                    return objectMapper;
                }
        ));
        Root response = given()
                .when()
                .get(request)
                .then()
                .log().all()
                .extract().body().as(Root.class);
        return response;
    }

    /**
     * Метод считывающий интересующий запрос с консоли
     * @return Главная часть URL-запроса
     */
    public static String getFinalReq() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}


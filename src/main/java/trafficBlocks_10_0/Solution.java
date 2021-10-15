package trafficBlocks_10_0;


import array_iterator_7_3.ArrayIterator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
            trafficBlocks("C:/data.csv", "14.03.2014");
        }
    public static void trafficBlocks (String pathToFile, String date) throws IOException {
        int count = 0;
        List<String> dataList;
        File file = new File(pathToFile);
        dataList = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        for (String s : dataList) {
            if (s.contains(date)) {
                count++;
                System.out.println(s);
            }
        }
        System.out.println("Количество дорожных ограничений на " + date + " = " + count);
    }
    }


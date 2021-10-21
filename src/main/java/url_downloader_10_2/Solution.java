package url_downloader_10_2;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Solution {

    /**
     * Главный метод в котором происходит чтение списка ссылок из файла и запуск потоков для скачивания данных
     * @param args Аргументы командной строки
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, ParserConfigurationException, InterruptedException {
        List<String> urlList = getURLListFromFile("C:/javatests/urls.txt");
        CountDownLatch doneSignal = new CountDownLatch(urlList.size());
        for (String url : urlList) {
            DownloadRunnable downloadRunnable =  new DownloadRunnable(doneSignal, url);
            downloadRunnable.start();
        }
        doneSignal.await();
    }
    /**
     * Метод получающий список ссылок из файла
     * @param filePath Путь к файлу со ссылками
     * @return список ссылок из файла
     * @throws IOException
     */
    private static List<String> getURLListFromFile(String filePath) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            list.add(line);
            line = br.readLine();
        }
        fr.close();
        br.close();
        return list;
    }



}


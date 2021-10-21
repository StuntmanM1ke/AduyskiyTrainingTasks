package url_downloader_10_2;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/**
 * Класс содержащий в себе методы позволяющие параллельно загружать файлы по URL
 */
public class DownloadRunnable extends Thread {
    private final CountDownLatch doneSignal;
    private String URL;

    /**
     * Конструктор
     * @param doneSignal
     * @param filePath
     */
    public DownloadRunnable(CountDownLatch doneSignal, String filePath) {
        this.doneSignal = doneSignal;
        this.URL = filePath;
    }

    /**
     * Метод выполняющий действия после запуска потока
     */
    @Override
    public void run() {
        try {
            downloadUsingNIO(URL, createNewDoc());
        } catch (IOException e) {
            e.printStackTrace();
        }
        doneSignal.countDown();
    }

    /**
     * Метод загружающий данные через NIO и сохраняющий их в указанный файл
     * @param urlStr ссылка для скачивания
     * @param file   путь к файлу, куда сохранять
     * @throws IOException
     */
    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

    /**
     * Метод создающий новый XML-документ
     * @return
     */
    private static String createNewDoc() {
        String pathName = "C:/javatests/test" + UUID.randomUUID() + ".xml";
        try {
            File f = new File(pathName);
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.err.println(e);
        }
        return pathName;
    }
}

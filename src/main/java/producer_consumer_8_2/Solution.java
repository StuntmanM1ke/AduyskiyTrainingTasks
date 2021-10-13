package producer_consumer_8_2;


import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Double> sharedQueue = new LinkedList<>();
        int size = 4;
        Thread prod = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread cons = new Thread(new Consumer(sharedQueue), "Consumer");
        prod.start();
        cons.start();
    }
}


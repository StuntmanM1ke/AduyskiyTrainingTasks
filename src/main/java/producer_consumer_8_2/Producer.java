package producer_consumer_8_2;

import java.util.Queue;

public class Producer implements Runnable{
    private final Queue<Double> sharedQueue;
    private final int size;

    public Producer(Queue<Double> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Produced: " + produce());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private double produce() throws InterruptedException {
        synchronized (sharedQueue) {
            if (sharedQueue.size() == size) {
                sharedQueue.wait();
            }
            double newValue = Math.random();
            sharedQueue.add(newValue);
            sharedQueue.notifyAll();

            return newValue;
        }
    }
}

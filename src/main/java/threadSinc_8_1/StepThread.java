package threadSinc_8_1;

public class StepThread extends Thread{
    private Object lock;

    public StepThread(Object lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        while (true){
            synchronized (lock){
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

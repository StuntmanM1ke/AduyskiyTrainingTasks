package annotation_9_0;

@Repeat(3)
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

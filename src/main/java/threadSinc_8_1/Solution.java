package threadSinc_8_1;


public class Solution {
    public static void main(String[] args) {
        Object lock = new Object();
        new StepThread(lock).start();
        new StepThread(lock).start();
    }
}


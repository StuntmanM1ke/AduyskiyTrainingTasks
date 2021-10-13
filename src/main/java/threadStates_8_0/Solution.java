package threadStates_8_0;


public class Solution {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run(){
                System.out.println(getState());
            }
        };
        System.out.println(thread.getState());
        thread.start();
        try{
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }

}


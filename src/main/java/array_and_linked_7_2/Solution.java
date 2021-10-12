package array_and_linked_7_2;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Solution {
    public static ArrayList <Integer> arrayList = new ArrayList<>();
    public static LinkedList <Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        addElements();
        for (int i = 0; i < 100000; i++) {
            getRandomFromArr();
        }
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            getRandomFromLink();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void addElements () {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }
    public static int getRandomFromArr(){
        int length = arrayList.size();
        Random rnd = new Random();
        return rnd.nextInt(length);
    }
    public static int getRandomFromLink(){
        int length = linkedList.size();
        Random rnd = new Random();
        return rnd.nextInt(length);
    }
}


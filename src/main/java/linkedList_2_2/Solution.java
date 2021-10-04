package linkedList_2_2;


public class Solution {

    public static void main(String[] args) {
        MyList list = new MyList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

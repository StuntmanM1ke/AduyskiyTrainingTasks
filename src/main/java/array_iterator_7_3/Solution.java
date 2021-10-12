package array_iterator_7_3;


public class Solution {
    public static void main(String[] args) {
        String text = "Частотность — термин лексикостатистики, предназначенный для определения наиболее употребительных слов.";
        String [] arr = text.split(" ");
        ArrayIterator it = new ArrayIterator(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

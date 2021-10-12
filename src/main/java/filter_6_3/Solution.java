package filter_6_3;


import java.util.Arrays;


public class Solution {
    public static void main(String[] args) {
        String array[] =
                new String[]{"1rewf ", "feefewf", "a", null, "1"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });

        for (String s : newArray) {
            System.out.println(s);
        }
    }

    public static Object[] filter(Object[] arr, Filter filter){
        int offset = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!filter.apply(arr[i])){
                offset++;
        } else {
                arr[i - offset] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - offset);
    }


}

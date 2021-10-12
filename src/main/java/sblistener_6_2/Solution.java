package sblistener_6_2;




public class Solution {
    public static void main(String[] args) {
        OvservableStringBuilder UndoableStringBuilder =
                new OvservableStringBuilder();
        UndoableStringBuilder.setOnStringBuilderChangeListener(new MyListener());
        UndoableStringBuilder.append("Hello");
        UndoableStringBuilder.append(", ");
        UndoableStringBuilder.append("World!");
    }
}

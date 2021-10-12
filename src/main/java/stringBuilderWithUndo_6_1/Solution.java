package stringBuilderWithUndo_6_1;



public class Solution {
    public static void main(String[] args) {
        SBWithUndo sbwu = new SBWithUndo();
        String str = "Это будет реализацией";
        sbwu.append(str.toCharArray());

        sbwu.append(" шаблона «Команда»");
        sbwu.undo();
        System.out.println(sbwu);
    }
}

package binaryTreeSearch_3_2;

public class Solution {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(45);
        tree.insert(10);
        tree.insert(7);
        tree.insert(12);
        tree.insert(90);
        tree.insert(50);
        tree.inorder();
        tree.search(7);
        tree.search(8);
    }
}

package binaryTreeSearch_3_2;

public class MyTree {
    Node root;

    public MyTree() {
        this.root = null;
    }


    void insert(int key) {
        root = insert_Recursive(root, key);
    }


    Node insert_Recursive(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)
            root.right = insert_Recursive(root.right, key);

        return root;
    }

    boolean search(int key) {
        root = search_Recursive(root, key);
        if (root != null) {
            System.out.println("Элемент " + key + " найден в дереве");
            return true;
        }
        else
            System.out.println("Элемент " + key + " отсутствует в дереве");
            return false;
    }


    Node search_Recursive(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return search_Recursive(root.left, key);

        return search_Recursive(root.right, key);
    }

    void inorder() {
        inorder_Recursive(root);
    }


    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

}

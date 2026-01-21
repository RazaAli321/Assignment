class BSTNode {
    int data;
    BSTNode left, right;
    BSTNode(int d) { data = d; }
}

public class BSTDemo {
    static BSTNode root;

    static BSTNode insert(BSTNode r, int d) {
        if (r == null) return new BSTNode(d);
        if (d < r.data) r.left = insert(r.left, d);
        else r.right = insert(r.right, d);
        return r;
    }

    static void inorder(BSTNode r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    public static void main(String[] args) {
        int[] a = {50,30,70,20,40,60,80};
        for (int x : a) root = insert(root, x);
        inorder(root);
    }
}
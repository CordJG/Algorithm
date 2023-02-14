package 연습.Practice;

class Tree {
    int count = 0;
    class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }

    }
    Node root;
    public void makeTree(int[] a) {
        root = makeTreeR(a, 0, a.length -1);
    }
    public Node makeTreeR(int[] a, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) /2;
        Node node = new Node(a[mid]);
        node.left = makeTreeR(a, start, mid - 1);
        node.right = makeTreeR(a, mid+1,end);
        return node;
    }
    public void searchBTree (Node n, int find) {
        if (find <n.data) {
            System.out.println("Data is smaller than " + n.data);
            searchBTree(n.left, find);

        }else if (find >n.data) {
            System.out.println("Data is bigger than " + n.data );
            searchBTree(n.right, find);
        }else {
            System.out.println("Data found!");
        }
        count++;
        System.out.println("반복횟수는 " +count + " 입니다");
    }
}

public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Tree t = new Tree();
        t.makeTree(a);
        t.searchBTree(t.root,1);
    }
}

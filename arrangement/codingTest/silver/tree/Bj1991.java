package codingTest.silver.tree;

import java.util.*;

/**
 * 트리 순회 문제  / 전위 순회, 중위 순회, 후위 순회한 결과를 출력함
 */
public class Bj1991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        Node root = null;
        HashMap<Character, Node> tree = new HashMap<>();

        // 이진 트리 구성
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            char parent = input[0].charAt(0);
            char leftChild = input[1].charAt(0);
            char rightChild = input[2].charAt(0);

            Node parentNode;
            if (tree.containsKey(parent)) {
                parentNode = tree.get(parent);
            } else {
                parentNode = new Node(parent);
                tree.put(parent, parentNode);
            }

            if (leftChild != '.') {
                Node leftNode;
                if (tree.containsKey(leftChild)) {
                    leftNode = tree.get(leftChild);
                } else {
                    leftNode = new Node(leftChild);
                    tree.put(leftChild, leftNode);
                }
                parentNode.left = leftNode;
            }

            if (rightChild != '.') {
                Node rightNode;
                if (tree.containsKey(rightChild)) {
                    rightNode = tree.get(rightChild);
                } else {
                    rightNode = new Node(rightChild);
                    tree.put(rightChild, rightNode);
                }
                parentNode.right = rightNode;
            }

            if (i == 0) {
                root = parentNode;
            }
        }

        // 전위 순회 결과 출력
        preorder(root);
        System.out.println();

        // 중위 순회 결과 출력
        inorder(root);
        System.out.println();

        // 후위 순회 결과 출력
        postorder(root);
        System.out.println();
    }

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.value);
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value);
    }
}

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
    }
}

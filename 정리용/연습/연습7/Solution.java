package 연습.연습7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {

        tree root = new tree("1");
        tree rootChild1 =root.addChildNode(new tree("2"));
        tree rootChild2 =root.addChildNode(new tree("3"));
        tree rootChild3 = root.addChildNode(new tree("4"));
        tree leaf1 = rootChild1.addChildNode(new tree("5"));
        tree leaf2 = rootChild1.addChildNode(new tree("6"));
        tree leaf3 = rootChild2.addChildNode(new tree("4"));
        tree leaf3Child1 = leaf3.addChildNode(new tree("10"));
        ArrayList<String> list = bfs(root);

        System.out.println(Arrays.deepToString(new ArrayList[]{list}));

    }

    static ArrayList<String> bfs(tree node) {

        Queue<tree> queue = new LinkedList<>();

        ArrayList<String> bfsList = new ArrayList<>();

        queue.add(node);

        while(queue.size()> 0) {
            tree curNode = queue.poll();

            bfsList.add(curNode.getValue());

            if(curNode.getChildrenNode()!= null){
                queue.addAll(curNode.getChildrenNode());
            }
        }
        return bfsList;
    }





    static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}

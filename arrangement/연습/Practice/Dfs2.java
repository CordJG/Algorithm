package 연습.Practice;

import java.util.*;
public class Dfs2 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        Solution.tree root;
        ArrayList<String> list = new ArrayList<>();
        root = new Solution.tree("A");

        Solution.tree b = root.addChildNode(new Solution.tree("B"));
        Solution.tree c = root.addChildNode(new Solution.tree("C"));
        b.addChildNode(new Solution.tree("D"));
        b.addChildNode(new Solution.tree("F"));
        c.addChildNode(new Solution.tree("E"));
        c.addChildNode(new Solution.tree("G"));


        list = solution.dfs(root);
        System.out.println(list);

    }
}



class Solution{
    public ArrayList<String> dfs(tree node) {

        ArrayList<String> result = new ArrayList<>();
        if(node !=null) {
            result.add(node.getValue());
            ArrayList<tree> children = node.getChildrenNode();
            if(children !=null){
                for (tree child: children) {
                    result.addAll(dfs(child));
                }
            }
        }
        return result;
    }


    public static class tree {
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

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}


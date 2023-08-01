package 코플릿_Java.DailyCoding;
import java.util.*;
public class treeDFS {
    public static void main(String[] args) {



    }

    public  class Solution {
        public ArrayList<String> dfs(tree node) {


            ArrayList<String> values = new ArrayList<>();
            values.add(node.getValue());

            if (node.getChildrenNode() != null) {
                for (int i = 0; i < node.getChildrenNode().size(); i++) {
                    ArrayList<String> curList = dfs(node.getChildrenNode().get(i));
                    values.addAll(curList);
                }
            }

            return values;
        }


        public  class tree {
            private String value;
            private ArrayList<tree> children;

            private tree result;

            public tree(String data) {
                this.value = data;
                this.children = null;

            }

            public tree addChildNode(tree node) {
                if (children == null) children = new ArrayList<>();
                children.add(node);
                return children.get(children.size() - 1);
            }

            public String getValue() {      //현재 노드의 데이터를 반환
                return value;
            }

            public tree getResult(int a) {      //현재 노드의 데이터를 반환
                return result;
            }

            public ArrayList<tree> getChildrenNode() {
                return children;
            }
        }
    }
}



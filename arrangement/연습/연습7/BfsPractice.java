package 연습.연습7;

import java.util.*;

public class BfsPractice {
    public static void main(String[] args) {
        int[][] graph = new int[5][5];

        Random random = new Random();

        for (int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                graph[i][j] = random.nextInt(2); // 0또는 1 랜덤 값 할당
            }
        }

        System.out.println(Arrays.deepToString(graph));

        ArrayList<Integer> list = shortestPath(graph, 0, 3);

        System.out.println(Arrays.deepToString(new ArrayList[]{list}));

    }

    static ArrayList<Integer> shortestPath(int[][] graph, int start, int end) {
        boolean[] visited = new boolean[graph.length];
        return bfs(graph, start, end, visited);
    }

    static ArrayList<Integer> bfs(int[][] graph, int start, int end, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[graph.length];

        queue.offer(start);
        visited[start] = true;
        parent[start]  = -1;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if(node == end) {
                ArrayList<Integer> path = new ArrayList<>();
                while (node != -1){
                    path.add(node);
                    node = parent[node];
                }

                Collections.reverse(path);
                return path;
            }

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    parent[i] = node;
                }
            }
        }
        return null;
    }

}


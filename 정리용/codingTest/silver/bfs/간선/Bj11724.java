package codingTest.silver.bfs.간선;

import java.io.*;
import java.util.*;

public class Bj11724 {
    static List<List<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int n1 = Integer.parseInt(input[0]);
            int n2 = Integer.parseInt(input[1]);

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }

        visited = new boolean[N + 1];
        int count =0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);

    }

    static void dfs(int n){
        visited[n] = true;

        for (int next : graph.get(n)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

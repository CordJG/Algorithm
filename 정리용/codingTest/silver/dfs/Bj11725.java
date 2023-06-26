package codingTest.silver.dfs;

import java.io.*;
import java.util.*;

/**
 * 트리의 부모 찾기
 * 그래프 이론, 그래프 탐색, 트리, dfs,bfs 문제
 */

public class Bj11725 {
    static ArrayList<Integer>[] graph;
    static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            String[] input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(1, 0);

        for (int i = 2; i <= N; i++) {
            bw.write(parents[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int node, int parent) {
        parents[node] = parent;

        for (int child : graph[node]) {
            if (child != parent) {
                dfs(child, node);
            }
        }
    }
}

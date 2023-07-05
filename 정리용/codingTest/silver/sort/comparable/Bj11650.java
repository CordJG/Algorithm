package codingTest.silver.sort.comparable;

import java.io.*;
import java.util.*;

/**
 * sort 중 comparable 이용하는 코테
 * Comparable 사용법을 숙지해야함
 */


public class Bj11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Graph> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            list.add(new Graph(x, y));
        }

        Collections.sort(list);

        for (Graph graph : list) {
            System.out.println(graph.getX()+" "+ graph.getY());
        }
    }

    static class Graph implements Comparable<Graph> {
        private int x;
        private int y;

        public Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(Graph other) {
            if (this.x == other.x) {
                return Integer.compare(this.y, other.y);
            } else {
                return Integer.compare(this.x, other.x);
            }
        }
    }

}



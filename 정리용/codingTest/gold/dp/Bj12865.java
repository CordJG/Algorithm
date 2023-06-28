package codingTest.gold.dp;

import java.io.*;


public class Bj12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
    }

    static class Bag {
        private int weight;
        private int value;

        public Bag(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public int getWeight(){
            return weight;
        }

        public int getValue() {
            return value;
        }
    }

}



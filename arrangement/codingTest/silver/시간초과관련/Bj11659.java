package codingTest.silver.시간초과관련;

import java.io.*;

/**
 * 시간복잡도 문제 이렇게 큰 숫자가 들어가는 경우 이중반복문이 들어가면 무조건 시간초과가 걸린다고 생각하면된다.
 * 시간복잡도 문제는 이제보니 대부분 새로운 배열에 값들을 집어넣어서 그 배열의 값을 이용한다.
 * 이전에 집합문제에서는 값을 boolean 배열을 이용해서 찾았었고
 * 여기서는 숫자의 합을 int[] 배열을 이용해서 구한다 (dp 활용)
 *
 */

public class Bj11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] nums = br.readLine().split(" ");

        int[] prefixSum = new int[N + 1];
        prefixSum[0] = 0;

        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + Integer.parseInt(nums[i - 1]);
        }


        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int startN = Integer.parseInt(input[0]);
            int endN = Integer.parseInt(input[1]);

            int sumNum = prefixSum[endN] - prefixSum[startN - 1];

            bw.write(sumNum+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

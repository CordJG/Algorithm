package codingTest.silver;

import java.io.*;

import java.util.*;
import java.util.stream.Collectors;


public class Bj2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        System.out.println(getAverage(nums));
        System.out.println(getMiddleValue(nums));
        System.out.println(getMode(nums));
        System.out.println(getRange(nums));


    }

    static int getAverage(int[] nums) {
        int sum =0;
        for (int num : nums) {
            sum += num;
        }
        int result = (int) Math.round((double) sum / nums.length);
        return result;
    }

    static int getMiddleValue(int[] nums){
        return nums[(nums.length - 1) / 2];
    }

    static int getMode(int[] nums) {

        Map<Integer, Long> countMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Long maxCount = countMap.values().stream().max(Long::compareTo).orElseThrow();

        List<Integer> mostFrequentNums = countMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxCount))
                .map(Map.Entry::getKey)
                .sorted()
                .toList();


        if (mostFrequentNums.size() > 1) {
            return mostFrequentNums.get(1);
        } else {
            return mostFrequentNums.get(0);
        }
    }

    static int getRange(int[] nums) {
        int minN = Integer.MAX_VALUE;
        int maxN = Integer.MIN_VALUE;
        for (int num : nums) {
            minN = Math.min(num, minN);
            maxN = Math.max(num, maxN);
        }
        return maxN - minN;
    }
}

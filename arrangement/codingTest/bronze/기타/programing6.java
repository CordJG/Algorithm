package codingTest.bronze.기타;

import java.util.*;
import java.util.stream.Collectors;

public class programing6 {

    public static void main(String[] args) {

    }
    public int solution(int[] prices, int k) {

        int minN = 100000;
        for(int i=0; i<prices.length-k; i++){
            minN=Math.min(prices[i],minN);
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<k; i++){
            list.add(prices[prices.length - 1 - i]);
        }

        int sumN=0;

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < k; i++) {
            sumN += minN - sortedList.get(i);
        }

        return sumN;
    }
}

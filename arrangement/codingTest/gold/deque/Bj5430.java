package codingTest.gold.deque;

import java.io.*;
import java.util.*;



public class Bj5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            int M = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split("\\[|,|\\]");
            Integer[] nums = new Integer[M];
            boolean checkError = false;
            int j=0;
            for (String a : line) {
                if(!a.equals("")) {
                    nums[j] = Integer.parseInt(a);
                    j++;
                }
            }

            List<Integer> list = new ArrayList<>(Arrays.asList(nums));
            int countD =0;
            for (String s1 : str) {
                if (s1.equals("D")) {
                    countD++;
                    if (countD >= list.size()) {
                        checkError=true;
                        break;
                    }
                }
            }

            boolean[] checkR = new boolean[str.length];
            int index =0;
            for (String s : str) {

                if (s.equals("R")) {
                    checkR[index] = true;
                    if (index >= 1) {
                        if (checkR[index - 1]) {
                            checkR[index]=false;
                        }
                    }
                    if (str.length == 1 || index == str.length - 1) {
                        if (checkR[index]) {
                            reverseArray(list);
                        }
                    }
                }else{
                    if (checkError) {
                        System.out.println("error");
                        break;
                    }
                    if (index - 1 >= 0 && checkR[index - 1]) {
                        reverseArray(list);
                        list.remove(0);
                    }else{
                        list.remove(0);
                    }
                }
                index++;
            }
            if(!checkError) {
                System.out.println(list);
            }

        }
    }
    public static void reverseArray(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

}

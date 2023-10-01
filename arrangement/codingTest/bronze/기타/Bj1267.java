package codingTest.bronze.기타;


import java.util.*;

public class Bj1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] nums = new int[N];

        String[] line = sc.nextLine().split(" ");

        for (int i = 0; i < N; i++) {

            nums[i] = Integer.parseInt(line[i]);
        }
        sc.close();

        ArrayList<String> list = findMinimalRate(nums);
        String str = "";
        for (int i = 0; i < list.size();  i++) {
            str += list.get(i);
        }

        System.out.println(str);

    }

    static ArrayList<String> findMinimalRate(int[] nums){
        int Y = 0;
        int M = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int num : nums){
            Y += calculateY(num);
            M += calculateM(num);
        }

        if(Y>M){
            list.add("M");
            list.add(" "+M);
            return list;
        }
        if(Y<M){
            list.add("Y");
            list.add(" "+Y);
            return list;
        }
        if(Y==M){
            list.add("Y");
            list.add(" M");
            list.add(" "+Y);
        }
        return list;

    }

    static int calculateY(int num){
        int Y = (int) (Math.ceil((double) (num+1)/30)*10);

        return Y;
    }

    static int calculateM(int num){
        int M = (int) Math.ceil((double) (num+1)/60)*15;
        return M;
    }
}

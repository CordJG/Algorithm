package codingTest.silver;


import java.util.Scanner;

public class Bj1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.nextLine();

        String[] line = new String[num];

        for (int i = 0; i < num; i++) {
            line[i] = String.valueOf(sc.nextLine());
        }
        sc.close();

        int count = countGroupNum(line,num);
        System.out.println(count);
    }

    static int countGroupNum(String[] line, int num){
        int count =0;
        boolean[] check = new boolean[num];
        for (int i = 0; i < line.length; i++) {
            String str = line[i];

            for (int j = 0; j < str.length(); j++) {
                for (int k = 1; k < str.length(); k++) {
                    if(str.charAt(j)==str.charAt(k)){
                        if(k==j+1){
                            break;
                        }
                        for (int m = 1; m <= k - j; m++) {
                            if (str.charAt(j + m)!=str.charAt(j)) {
                                check[i] = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < line.length; i++) {
            if(check[i]==false){
                count++;
            }
        }
        return count;
    }
}

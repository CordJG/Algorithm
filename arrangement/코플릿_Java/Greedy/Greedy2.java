package 코플릿_Java.Greedy;

public class Greedy2 {
    public static void main(String[] args) {
        // 500 100 50 10 5 1
        //오름차순으로 정렬 되어 있음 (개수는 무제한인듯?)
        Integer[] coin = {500,100,50,10,5,1};


        int count=0;
        int k=4020;
        int result=0;
        boolean a= true;
        for(int i=0; i<coin.length; i++) {
            while (a) {
                count++;
                int num = coin[i] * count;
                if (k != 0) {
                    if (num == k) {
                        result += count;
                        k= 0;
                        break;
                    }
                    if (num > k) {
                        result += count - 1;
                        k = k - coin[i] * (count - 1);
                        count=0;
                        break;

                    }
                }
                if(k==0) a=false;
            }
        }
        System.out.println(result);
    }
}

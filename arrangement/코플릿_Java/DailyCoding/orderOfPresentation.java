package 코플릿_Java.DailyCoding;
import java.util.*;

public class orderOfPresentation {

    public static void main(String[] args) {

        Cat1 cat1 = new Cat1();


        List<Integer> list = new ArrayList<>();


        int[] K = {7,3,4,2,5,1,6};


        for (int i = 0; i < K.length; i++) {
            list.add(K[i]);
        }

        System.out.println(list);

        int number = cat1.play(list, K.length);

        System.out.println(number);

    }

     static class Cat1 {

         int count=0;
         int i=1;

         int count2=0;

         Cat2 cat2 = new Cat2();

        List<Integer> list2 = new ArrayList<>();
         int play(List<Integer> list, int n) {

             if(list.size()>0){
            list2.add(list.get(0));

                Iterator<Integer> it = list2.iterator();
                while (it.hasNext()) {
                    if (it.next() > list.get(0)) {
                        count2++;
                    }
                }
            }


            if (n == 0) {
                return count;
            }


                count += (list.get(0) - i +count2) * cat2.factorial(n - 1);


            list.remove(0);

            n--;
            i++;
            count2=0;

            play(list, n);



            return count;
        }
    }

     static class Cat2 {
          int factorial(int N) {
            int num = 1;
            for (int i = 1; i <= N; i++) {
                num = i * num;
            }
            return num;
        }
    }
}

 /*
    1234
    1을 제외한 뒤에는 6가지가 있겠지
    그럼 총은 6x4 해서 24가지가 되겟네
    12 -> 2가지
    123 -> 6가지(2*3) 231
    1234 -> 6*4 24 가지
    12345 -> 24*5
    첫번째 자리의 숫자에 따라 (i-1)*(n-1)!
    두번째 자리 숫자에 따라 (i-2)*(n-2)!
    ... 이런식으로 하면 될듯?








     */
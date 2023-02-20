package codingTest;

import java.math.BigInteger;
import java.util.Scanner;

// N! 뒤에서부터 처음 0이 아닌 숫자가 나올 떄까지 0의 개수를 구하는 프로그램
// 나처럼 구하는 경우 int,Integer 타입으로는 팩토리얼값으로 나오는 큰 수들을 다 표현할 수 없기 때문에
// BigInteger를 통해 해주면 된다.
// 아니면 String타입으로 넣어줘도 될 것도 같음
// 하지만 내가 구한 건 일반적인 방법은 아님
// 일반적인 방법은 0의 개수를 구하는 거인 거 만큼
// 10의 배수임을 알면 되고
// 2,5로 각 각 끝까지 계속 나눠서 각 count 값들을 계산한 뒤 둘 중 작은 값을
// 구하면 됨 ( 결국 2,5가 세트로 되면 10으로 나뉘어 진다는 거니까)
public class FactorialZeroNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       int countNum = getZeroCount(num);
        System.out.println(countNum);

    }

    static BigInteger getFactorialNum(int num){

        BigInteger result = BigInteger.ONE;
        for(int i=2; i<= num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static int getZeroCount(int num) {

        String strFactNum= String.valueOf(getFactorialNum(num));
        int n1=0;
        int result=0;



        for(int i=strFactNum.length()-1; i>=0; i--){
            if(strFactNum.charAt(i)!='0') {
                n1=i;
                break;
            }
        }

        result = (strFactNum.length()-1)-n1;

        if(n1==0) result=0;

        return result;
    }

}

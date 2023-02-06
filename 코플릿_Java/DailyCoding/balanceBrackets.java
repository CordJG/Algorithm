package 코플릿_Java.DailyCoding;

public class balanceBrackets {
    public static void main(String[] args) {
        // '(' ')'
        // 순회로 찾으면 중복적으로 발견되는 게 문제
        // (())  그렇다면 '(' 와 ')' 의 개수가 같다는 걸로 찾으면?
        // 문제될만한 점은?
        // ())( 이런 식으로 개수만 같을 경우가 존재
        // 해결법은?
        // '(' 가 나오는 부분 다음부터 순회 ')'도 마찬가지로 순회
        //그렇게 하고서 개수가 같으면 문제해결?x
        // '()()' 도 되는건가?(((()))) 이렇게만 되는거면 ->...하 ()()도 가능하다 이러면 어떻게 하지
        // 이러면 (뒤에 )가 나와야 되고 그 사이에 (나 { 나 이런 게 나오면 안되는 거지
        //
        // '('가 찾아지는 부분에 break를 걸어서
        // 인덱스를 찾아서 그 이후부터 ) 를 찾으면 된다


        //음 개수가 맞아야 한다 -> count로 구현
        // 짝이 맞아야 한다 -> ?
        //


        String str = "(())()(())";
        int count2=0;
        int count1=0;
        boolean output = true;
        char[] chars = {'(',')','{','}','[',']'};
        for(int k=0; k<chars.length; k+=2) {


            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == chars[k]) {
                    count1++;
                }
            }




            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == chars[k+1]) {
                    count2++;
                }
            }


            int n=1;
            for(int i= 0; i< str.length(); i++) {
                for (int j = n; j < str.length(); j++) {
                    if (str.charAt(i) == chars[k] && str.charAt(j) == chars[k + 1]) {
                        n = j + 1;

                        System.out.println(n);

                        break;
                    } else if (str.charAt(i) != chars[k] && str.charAt(j) == chars[k + 1]) {
                        output = false;

                    } else if (str.charAt(i) == chars[k] && str.charAt(j) != chars[k + 1]) {
                        output = false;

                    }
                }
            }


            if (count2 != count1) {
                output = false;
                break;
            }

            if(count1==0 && count2==0) {output=true;}
            if(str.length()==0) {output=true;}


            count2=0;
            count1=0;

        }
        System.out.println(output);
    }
}

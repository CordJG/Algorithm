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


        String str = "[(]{)}";
        int num=0;
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

            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == chars[k]) {
                    num = i;
                    break;
                }
            }

            for (int j = num; j < str.length(); j++) {
                if (str.charAt(j) == chars[k+1]) {
                    count2++;

                }
            }

            // 2중 for문으로 ( 와 ) 를 찾고 흠...재귀함수로 괄호 세개 해주면 될 거 같은데? ...일단 스킵
            int n=1;
            for(int i= 0; i< str.length(); i++){
                for(int j=n; j< str.length(); j++){
                    if(str.charAt(i)==chars[k]&& str.charAt(j)==chars[k+1]){
                        n=j+1;

                        for(int m=i+1; m<n; m++ ){

                        }
                        break;
                    }
                }
            }


            if (count2 != count1) {
                output = false;

                break;
            }
            if(count1==0 && count2==0) output=true;
            if(str.length()==0) output=true;

        }
        System.out.println(output);
    }
}

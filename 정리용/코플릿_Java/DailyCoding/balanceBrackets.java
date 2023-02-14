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

        // 아까 아이디어
        // 조건 1. 양 괄호의 개수가 같다 ㅇ
        // 조건 2. '('을 뒤에서 부터 순회하고 ')'을 앞에서 순회 했을 때 i 값이 j보다 크면 false  ㅇ
        // 조건 3. '(' ')' 사이에 다른 괄호의 개수들을 확인 했을 때 같지 않으면 false




        String str = "[(({))()((})])";
        int count3=0;
        int count4=0;
        int count2=0;
        int count1=0;
        int num=0;
        boolean output = true;
        char[] chars = {'(',')','{','}','[',']'};
        for(int k=0; k<chars.length; k+=2) {

            for(int i=0; i<str.length(); i++){
                if((str.contains("(")&&str.contains(")")) || (str.contains("{")&&str.contains("}")) || (str.contains("{")&&str.contains("}")) ) //하나씩만 들어간 경우 죄다 false
                 {
                    if (str.charAt(i) == chars[k]) {
                        count1++;
                        num = i+1 ;
                        i = num-1 ;
                        for (int j = num; j < str.length(); j++) {
                            if (str.charAt(j) == chars[k + 1]) {
                                count2++;
                                break;
                            }
                        }
                    }
                } else{ output = false;}
            }



            int num1 = str.length()-1;
            int num2 = str.length()-1;
            for(int i= num1; i>= 0; i--) {
                for (int j = num2; j >=0; j--) {
                    if (str.charAt(i) == chars[k] &&str.charAt(j) == chars[k + 1]){


                        if(i>j) {output = false;}
                        if(i<j){
                            for(int p=0; p<6; p+=2) {
                                for (int m = i + 1; m < j ;  m++) {
                                    if (str.charAt(m) == chars[p] && str.charAt(m) !=chars[k] ) {
                                        count3++;

                                    }
                                    if (str.charAt(m) == chars[p + 1]  && str.charAt(m) !=chars[k+1]) {
                                        count4++;
                                    }
                                }
                                if(count3!=count4) {output=false;}



                                count3=0;
                                count4=0;
                            }

                        }
                        num1=i;
                        num2=j-1;
                        break;
                    }
                }
            }


            if (count2 != count1) {
                output = false;
                break;
            }

            if(str.length()==0) {output=true;}

            count2=0;
            count1=0;

        }
        System.out.println(output);
    }
}

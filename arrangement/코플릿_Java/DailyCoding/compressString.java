package 코플릿_Java.DailyCoding;

public class compressString {
    public static void main(String[] args) {
        //흠...i , i+1 같으면 count++
        //이중포문으로 해서 i,i+1이 같지 않으면 break;
        //j 포문이 돌 때 count를 해주면 count 3이상이면 i에는 count값을 넣어주고 제거해주면될듯

        String str = "wwwggoppopppp";
        int count=1;
        String result = "";


        for(int i = 0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)) {
                    i++;
                    count++;
                }
                if(str.charAt(i)!=str.charAt(j)) {
                    break;
                }
            }
            if(count>=3) {
                result+=String.valueOf(count);
                result+=String.valueOf(str.charAt(i));
            }
            if(count==2){
                result+=String.valueOf(str.charAt(i));
                result+=String.valueOf(str.charAt(i));
            }
            if(count==1){
                result+=String.valueOf(str.charAt(i));
            }
            count=1;

        }
        System.out.println(result);
    }
}


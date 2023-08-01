package 코플릿_Java.DailyCoding;

public class ABCheck {
    public static void main(String[] args) {

        String str = "lane Borrowed";
        str = str.toLowerCase();
        System.out.println(str);
        boolean a = false;

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)=='a'&&str.charAt(j)=='b'){
                    if(i-j==4 || i-j==-4){
                        a= true;
                    }
                }
            }
        }

        System.out.println(a);

    }
}

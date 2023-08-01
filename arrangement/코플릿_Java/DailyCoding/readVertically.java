package 코플릿_Java.DailyCoding;

public class readVertically {
    public static void main(String[] args) {
        String[] arr= {"hi","wozz"};

        int i=0;
        int max = arr[0].length();
        while(i<arr.length){
            if(arr[i].length()>max) {
                max = arr[i].length();
            }
            i++;
        }
        String result="";
        for(int n=0; n<max; n++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length()>n) {
                    result += String.valueOf(arr[j].charAt(n));
                }
            }
        }

        System.out.println(result);
    }
}


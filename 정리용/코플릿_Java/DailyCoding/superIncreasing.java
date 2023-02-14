package 코플릿_Java.DailyCoding;

public class superIncreasing {
    public static void main(String[] args) {
        int[] arr = {979,1737,-2146,-337,1316};

        int num = 0;
        boolean a = true;

        for(int i=0; i<arr.length-1; i++){
           num+=arr[i];
           if(arr[i+1]>num){
               a=true;
           }
           else{
               a=false;
               break;
           }
        }

        System.out.println(a);
    }
}

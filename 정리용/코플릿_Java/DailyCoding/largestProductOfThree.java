package 코플릿_Java.DailyCoding;

public class largestProductOfThree {
    public static void main(String[] args) {
        int[] arr = {2,1,3,7};

        int max=arr[0]*arr[1]*arr[2];

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int z=j+1; z<arr.length; z++){
                    if(arr[i]*arr[j]*arr[z]>max) max=arr[i]*arr[j]*arr[z];
                }
            }
        }
        System.out.println(max);
    }
}

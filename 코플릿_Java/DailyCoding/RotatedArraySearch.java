package 코플릿_Java.DailyCoding;

public class RotatedArraySearch {
    public static void main(String[] args) {

        CordJgRotate cj = new CordJgRotate();

        int n = cj.play(new int[]{4,5,6,0,1,2,3},100);
        System.out.println(n);


    }
}

class CordJgRotate{

    int num=0;
    int count=0;
    int play(int[] rotated, int target){


        for(int i=0; i<rotated.length; i++){
            if(rotated[i]==target){
                num=i;
            }
            if(rotated[i]!=target){
                count++;
            }
        }
        if(count== rotated.length) num=-1;
        return num;
    }
}
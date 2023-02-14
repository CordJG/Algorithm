package 코플릿_Java;

public class isSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1,2,3,4,5};
        int[] sample = new int[]{1,3};

        int count=0;
        boolean a=false;

        for(int i=0; i<sample.length; i++){
            for(int j=0; j<base.length; j++){
                if(sample[i]==base[j]) {
                    count++;
                    break;
                }
            }
        }
        if(count==sample.length) a=true;
        System.out.println(a);
    }
}

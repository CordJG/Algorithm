package 코플릿_Java.Graph;

public class Dfs {
    public static void main(String[] args) {

        int[][] edges = {{0,5},{1,2},{3,4},{5,0},{1,3}};

        int arr[] = new int[edges.length*edges[0].length];
        for(int i=0; i< edges.length; i++){
            for (int j=0; j< edges[i].length; j++){
                arr[edges[i].length*i+j]=edges[i][j];
            }
        }
        int count =0;
        int result = 1;
        int n=0;
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<arr.length; j++){
                if(edges[i][0]==arr[j] || edges[i][1]==arr[j]){
                    count++;  //중복된 게 없다면 count는 2가 나올 것이다(본인들)
                }
            }
            if(count==2) result+=1;
            if(count>2) {
                n++;
                result=result;
            }
            count=0;
        }
        if(n==0) result=result-1;
        System.out.println(result);
    }
}


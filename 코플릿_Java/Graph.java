package 코플릿_Java;

import java.util.Arrays;
import java.util.stream.*;

public class Graph {
    public static void main(String[] args) {
        int[][] edges = {{0,2,0},{0,1,0},{1,5,1},{2,1,0}};
        int sumLength=0;
        for(int i=0; i<edges.length; i++){
            sumLength+= edges[i].length;
        }
        System.out.println(sumLength);
        int[] edges2 = new int[sumLength];
        for(int i=0; i<edges.length; i++){
            for(int j=0; j< edges[i].length; j++){
                edges2[edges[i].length*i +j] =edges[i][j];
            }
        }

        int max=edges2[0];
        for(int i=1; i< edges2.length; i++){
            if(edges2[i]>max){
                max=edges2[i];
            }
        }
        int[] resultArr = Arrays.stream(edges2).distinct().toArray();
        int[][] graph = new int[max+1][max+1];
        for(int i=0; i<resultArr.length; i++){
            for(int j=0; j< resultArr.length; j++){
                graph[i][j]=0;
            }

            }
        for(int i=0; i<edges.length; i++) {
            for (int j = 0; j < edges[i].length-1; j++) {
                    if (edges[i][2] == 0) {
                        graph[edges[i][0]][edges[i][1]] = 1;
                    } else if (edges[i][2] == 1) {
                        graph[edges[i][0]][edges[i][1]] = 1;
                        graph[edges[0][i]][edges[0][i]] = 1;
                    }

            }
        }
        System.out.println(Arrays.deepToString(graph));
    }
}

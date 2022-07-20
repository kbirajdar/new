import java.util.Scanner;
import java.util.*;

class usingAdjasunteMatrix{
    static int graph[][];

    public static void addInGraph(int u,int v){
        graph[u][v]=1;
    }

    public static void main(String a[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        graph=new int[n+1][m+1];

       for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            System.out.print(u+" "+v);
            //addInGraph(u,v);

        }
        
       /* for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }*/
    }
}
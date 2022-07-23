import java.util.*;
public class detectCycleInDirctedGraphDFS {

    public static void buildGraph(int u,int v,HashMap<Integer,ArrayList<Integer>>adj){
        adj.get(u).add(v);
    }
    public static boolean detectCycleDFS(int node,boolean[] visited,boolean[] dfsvisited,HashMap<Integer,ArrayList<Integer>>adj){
        visited[node]=true;
        dfsvisited[node]=true;
        for(int i=0;i<adj.get(node).size();i++){
            if(!visited[i]){
                boolean ans=detectCycleDFS(i,visited,dfsvisited,adj);
                if(ans){
                    return true;
                }

            }
            else if(dfsvisited[i]){
                return true;
            }
        }
        dfsvisited[node]=false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertice=sc.nextInt();
        int edge=sc.nextInt();

        HashMap<Integer,ArrayList<Integer>>adj=new HashMap<>();
        for(int i=0;i<vertice;i++){
            adj.put(i,new ArrayList<Integer>());
        }

        for(int i=0;i<edge;i++){
            int start=sc.nextInt();
            int dest=sc.nextInt();

            buildGraph(start,dest,adj);
        }

        boolean visited[]=new boolean[vertice];
        boolean dfsvisited[]=new boolean[vertice];

        boolean ans=detectCycleDFS(0,visited,dfsvisited,adj);
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

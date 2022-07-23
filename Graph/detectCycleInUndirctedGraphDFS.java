import java.util.*;
public class detectCycleInUndirctedGraphDFS {
    public static void buildGraph(int u,int v,HashMap<Integer,ArrayList<Integer>>adj){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean detectCycleDfs(int node,int parant,boolean[] visited,HashMap<Integer,ArrayList<Integer>>adj) {
        visited[node]=true;
        for(int i=0;i<adj.get(node).size();i++){
            if(!visited[i]){
                boolean ans=detectCycleDfs(i, node, visited, adj);
                if(ans){
                    return true;
                }
            }
            if(i!=parant){
                return true;
            }
        }
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
        boolean[] visited=new boolean[vertice];
        boolean ans=detectCycleDfs(0,-1,visited,adj);
        if(ans){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        sc.close();
    }
    
}

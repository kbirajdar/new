import java.util.*;

public class detectCycleInUndirctedGraphBFS {

    public static boolean detectCycleBfs(int node,boolean[] visited,HashMap<Integer,ArrayList<Integer>>adj){

        int paratnt[]=new int[visited.length];
        paratnt[node]=-1;
        visited[node]=true;
        Queue<Integer>q=new LinkedList<Integer>();
        q.add(node);
        while(!q.isEmpty()){
            int front=q.poll();

            for(int i=0;i<adj.get(front).size();i++){
                if(visited[i]==true && i!=paratnt[front]){
                    return true;
                }else if(!visited[i]){
                    q.add(i);
                    visited[i]=true;
                    paratnt[i]=front;

                }
            }
        }
        return false;


    }
    public static void buildGraph(int u,int v,HashMap<Integer,ArrayList<Integer>>adj){
        adj.get(u).add(v);
        adj.get(v).add(u);
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
        boolean ans=detectCycleBfs(0,visited,adj);

        if(ans){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        sc.close();

    }
}

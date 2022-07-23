import java.util.*;

public class BFS {
    public static void createGraph(int u,int v,HashMap<Integer,ArrayList<Integer>>graph){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static ArrayList<Integer> getBfs(int node,HashMap<Integer,ArrayList<Integer>>graph,boolean[] visited){
        ArrayList<Integer>result=new ArrayList<Integer>();
        Queue<Integer>q=new LinkedList<Integer>();
        q.add(node);
        visited[node]=true;
        while(!q.isEmpty()){
            int front=q.poll();
            result.add(front);
            for(int i=0;i<graph.get(front).size();i++){
                if(!visited[graph.get(front).get(i)]){
                    q.add(graph.get(front).get(i));
                    visited[graph.get(front).get(i)]=true;                }
            }
        }
        return result;

        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertic=sc.nextInt();
        int edge=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>>graph=new HashMap<>();
        for(int i=0;i<vertic;i++){
            graph.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<edge;i++){
            int start=sc.nextInt();
            int dest=sc.nextInt();
            createGraph(start,dest,graph);

        }
        sc.close();
        boolean visited[]=new boolean[vertic];
        ArrayList<Integer>ans=getBfs(0,graph,visited);
        System.out.print(ans);
    }
    
}

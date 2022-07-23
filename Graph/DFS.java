
import java.util.*;
public class DFS {
    static ArrayList<Integer>res=new ArrayList<Integer>();
    public static void buildGraph(int u,int v,HashMap<Integer,ArrayList<Integer>>graph){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void getDFS(int node,HashMap<Integer,ArrayList<Integer>>graph,boolean[] visited){
        res.add(node);
        visited[node]=true;
        for(int i=0;i<graph.get(node).size();i++){
            if(!visited[graph.get(node).get(i)]){
                getDFS(graph.get(node).get(i), graph, visited);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertice=sc.nextInt();
        int edge=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>>graph=new HashMap<>();
        for(int i=0;i<vertice;i++){
            graph.put(i,new ArrayList<Integer>());
        }

        //create the graph
        for(int i=0;i<edge;i++){
            int start=sc.nextInt();
            int dest=sc.nextInt();
            buildGraph(start,dest,graph);
        }

        boolean visited[]=new boolean[vertice];

        getDFS(0,graph,visited);
        System.out.print(res);
        sc.close();

    }
}

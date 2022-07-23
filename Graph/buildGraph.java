import java.util.*;
class buildGraph{

    public static void createGraph(int u,int v,HashMap<Integer,ArrayList<Integer>>Graph){
        Graph.get(u).add(v);
        Graph.get(v).add(u);
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v =sc.nextInt();
        int e=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>>graph=new HashMap<>();
        for(int i=0;i<e;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int start =sc.nextInt();
            int dest=sc.nextInt();
            createGraph(start,dest,graph);
        }
        sc.close();

        System.out.print(graph);
    }
}
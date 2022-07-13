import java.util.*;

public class createTree {
    static Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    } 
    static void levelOrder(Node root){
        Queue<Node>q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }

        }
    }
    public static void buildTree(int data){
        if(root==null){
            root=new Node(data);
            return;
        }
        Queue<Node>q=new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left==null){
                temp.left=new Node(data);
                break;
            }
            else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new Node(data);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }
    public static void main(String arr[]){
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int value=sc.nextInt();
            buildTree(value);
        }
        
        levelOrder(root);
        sc.close();

    }
}

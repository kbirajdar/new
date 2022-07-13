public class diameter {
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
    static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    // Approach 1: TC=O(N^2)
    /*static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);
        
        return (Math.max(lh,rh)+1);
    }
    static int DiameterTree(Node root){
        if(root==null){
            return 0;

        }
        int op1=DiameterTree(root.left);
        int op2= DiameterTree(root.right);
        int op3=heightOfTree(root.left)+heightOfTree(root.right)+1;

        int ans=Math.max(op1,Math.max(op2,op3));
        return ans;
    }
    */



    //Approach 2 Optimaize the Code T C=O(N) ;

    static Pair diameterFast(Node root){
        if(root==null){
            Pair p=new Pair(0,0);
            return p;
        }
        Pair left=diameterFast(root.left);
        Pair right=diameterFast(root.right);
        int op1=left.first;
        int op2=right.first;
        int op3=left.second +right.second+1;
        Pair ans=new Pair(0, 0);
        ans.first=Math.max(op1,Math.max(op2,op3));
        ans.second=Math.max(left.second,right.second)+1;
        return ans;
    }

    static int DiameterTree(Node root){
        Pair ans=diameterFast(root);
        return ans.first;
    }


    
    public static void main(String a[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int d=DiameterTree(root);
        System.out.print(d);

    }
    
}


public class balence {
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
        boolean first;
        int second;
        Pair(boolean first, int second){
            this.first=first;
            this.second=second;
        }
    }
    //Approch 1: TimeComplexity O(N);
    /*static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);
        return (Math.max(lh,rh)+1);
    }
    static boolean balanceTree(Node root){
        if(root==null){
            return true;
        }
        boolean left=balanceTree(root.left);
        boolean right=balanceTree(root.right);
        boolean diff=Math.abs(heightOfTree(root.left)-heightOfTree(root.right))<=1;

        if(left && right && diff){
            return true;
        }else{
            return false;
        }

    }*/


    //Approch 2: Time Complexity O(N)

    static Pair balanceTreeFast(Node root){
        if(root==null){
            Pair p=new Pair(true,0);
            return p;
        }
        Pair left=balanceTreeFast(root.left);
        Pair right=balanceTreeFast(root.right);

        boolean leftans=left.first;
        boolean rightans=right.first;
        boolean diff= Math.abs(left.second-right.second)<=1;

        Pair ans=new Pair(true,0);
        ans.second=Math.max(left.second,right.second)+1;
        if(leftans && rightans && diff){
            ans.first=true;
        }else{
            ans.first=false;
        }
        return ans;
    } 
    static boolean balanceTree(Node root){
        return balanceTreeFast(root).first;
        
    }
    public static void main(String a[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        if(balanceTree(root)){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        
    }
    
}

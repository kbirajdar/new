import java.util.*;

public class minCOstClimbingStair {

    //Using Rescursion
    /*public static int mincost(int n,int cost[]){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        int ans=cost[n]+Math.min(mincost(n-1, cost),mincost(n-2,cost));

        return ans;
    }
    */

    // using DP Memoization
     static int dp[];
    /*public static int mincost(int n,int cost[]){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=cost[n]+Math.min(mincost(n-1, cost),mincost(n-2,cost));

        return dp[n];
    }*/

    // using Tabulation

    public static int mincost(int n,int cost[]){
        int prev2=cost[0];
        int prev1=cost[1];
        for(int i=2;i<n;i++){
            int curr=cost[i]+Math.min(prev1,prev2);
            prev2=prev1;
            prev1=curr;
        }
        return Math.min(prev1,prev2);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cost[]=new int[n];
        dp=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int ans =mincost(n,cost);
        System.out.print(ans);
        sc.close();


    }
    
}

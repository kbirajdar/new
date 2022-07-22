class fibonaic{

    // This is using memoization approch
    /*static int dp[];
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];

        }
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }*/


    // this is using tebulation approaches
    public static int fib(int n){
        int firstprev=0;
        int secondprev=1;

        for(int i=2;i<=n+1;i++){
            int res=firstprev+secondprev;
            secondprev=firstprev;
            firstprev=res;

        }
        return firstprev;
    }
    public static void main(String[] args) {
        int n=7;
        //dp=new int[n+1];
        System.out.print(fib(n));
        
    }
}
class nthStair {

    //First Recursion
    public static int solve(int n,int i){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        return (solve(n,i+1)+solve(n,i+2));
    }
    public static int Stair(int n){
        return solve(n,0);
    }


    public static void main(String[] args) {
        int n=5;
        System.out.print(Stair(n));
        
    }
    
}

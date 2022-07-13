package Recursion;
import java.util.*;

public class factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String arr[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reslut=fact(n);
        System.out.print(reslut);

        
    }
    
}

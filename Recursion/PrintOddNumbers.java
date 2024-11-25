package GithunDSA.Recursion;

public class PrintOddNumbers {

    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        int m = n + (n-1);
        System.out.println(m);
    }

    public static void main(String[] args) {
        fun(5);
    }

}

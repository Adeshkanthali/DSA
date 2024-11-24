package GithunDSA.Recursion;

public class FibonacciSequence {

    static void fun(int a,int b,int n){

        if (n==0) {                   // base case
            return;
        }

        int c = a + b;
        System.out.println(c);

        fun(b,c,n-1);         // recursive function

    }


    public static void main(String[] args) {

        int a =0 , b = 1;

        System.out.println("first no is " + a);
        System.out.println("second no is " + b);

        fun(a,b,5);                          // function call
        
    }

}

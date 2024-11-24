package GithunDSA.Recursion;

public class factorial {

    static int fun1(int n) {

        if(n == 0){
            return 1;
        }
        return(n * fun1(n-1) );      // recursive function

    }

    public static void main(String[] args) {

        int fact = 1;

        fact = fun1(3);

        System.out.println("factorial :- " + fact);
    }
    
}

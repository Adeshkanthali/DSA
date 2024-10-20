package GithunDSA.Recursion;

import java.util.Scanner;

public class Demo {

    public static int fun(int n){

        if (n == 0){
            return 1;
        }

        return (n * fun(n-1));
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :- ");
        int n = sc.nextInt();

        int result = fun(n);

        System.out.println("Factorial of Given Number is :- ");
        System.out.println(result);

    }

}

/*

*/
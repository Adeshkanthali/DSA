package GithunDSA.Array.ArrayElmentSum;

import java.util.Scanner;

public class Demo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter the Elements of Array :- ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array Elements is :- " + sum);

    }
}

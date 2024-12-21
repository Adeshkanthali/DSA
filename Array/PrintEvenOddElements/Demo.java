package GithunDSA.Array.PrintEvenOddElements;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        ArrayList list = new ArrayList(n);
        ArrayList list1 = new ArrayList(n);

        System.out.println("Enter the Elements of Array :- ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            if (arr[i]%2 == 0){
                list.add(arr[i]);
            }
            else{
                list1.add(arr[i]);
            }
        }

        System.out.println("Even Elements are :- " + list);

        System.out.println("Odd Elements are :- " + list1);

    }
}

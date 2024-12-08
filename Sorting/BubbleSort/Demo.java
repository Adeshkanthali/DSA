package GithunDSA.Sorting.BubbleSort;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Bubble sort

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println("Sorted Array is :- ");

        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }

}

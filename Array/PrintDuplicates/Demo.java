package GithunDSA.Array.PrintDuplicates;

import java.util.Arrays;

public class Demo {

    public static void main(String args[]){

        int arr[] = {9,2,10,1,9,3,2,1};

        Arrays.sort(arr);

        int j=0;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] == arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }

        for (int k=0; k<j; k++){
            System.out.print(arr[k] + " ");
        }

    }
}

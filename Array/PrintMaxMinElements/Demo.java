package GithunDSA.Array.PrintMaxMinElements;

public class Demo {

    public static void main(String[] args) {

        int arr[] = {40,30,42,10,55,200,8};

        int max = 0;
        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        for (int j=0; j<arr.length; j++){
            if (arr[j] <= min){
                min = arr[j];
            }
        }

        System.out.println("Maximum :- " + max + " " + "Minimum :- " + min);

    }

}

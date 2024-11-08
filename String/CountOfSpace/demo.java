package GithunDSA.String.CountOfSpace;

public class demo {

    public static void main(String[] args) {

        String str = " I am Adesh ";

        char arr[] = str.toCharArray();

        int count = 0;

        //.......... Simple For Loop .................//

        for (int i=0; i<arr.length; i++){
            if (arr[i] == ' '){
                count++;
            }
        }

        //............. For Each Loop .................//
//
//        for (char i : arr){
//            if (i == ' '){
//                count++;
//            }
//        }

        System.out.println("Count of Spaces is :- " + count);

    }

}

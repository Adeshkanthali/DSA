package GithunDSA.String.ReverseString;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :- ");
        String ab = sc.nextLine();
        //....................................................................................//

        String bc = "";

        for (int i = ab.length()-1 ; i>=0; i--){
            bc = bc + ab.charAt(i);
        }

        //....................................................................................//
        System.out.println("Reverse String is :- ");
        System.out.print(bc);
    }

}

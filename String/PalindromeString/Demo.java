package GithunDSA.String.PalindromeString;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :- ");
        String ab = sc.nextLine();

        String bc = "";

        //....................................................................................//

        for (int i = ab.length()-1 ; i>=0; i--){
            bc = bc + ab.charAt(i);
        }

        if(ab.equals(bc)){
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given String is NOT Palindrome");
        }

        //....................................................................................//
    }

}

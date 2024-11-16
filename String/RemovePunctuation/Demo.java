package GithunDSA.String.RemovePunctuation;

import java.util.Scanner;

public class Demo {

    //............................................................................//
    public static boolean isPunctuation(char c){                  //function declaration
        return c=='.' || c==',' || c=='?' || c=='!' || c=='-' || c==':';
    }

    public static String removePunctuation(String ab){

        StringBuilder res = new StringBuilder();

        for (char c : ab.toCharArray()){
            if (!isPunctuation(c)){
                res.append(c);
            }
        }
        return res.toString();
    }
    //............................................................................//

    public static void main(String[] args) {

        System.out.println("Enter String With Punctuations :- ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = removePunctuation(str);

        System.out.println("String without Punctuations :- " + result);
    }

}

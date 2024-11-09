package GithunDSA.String.LastWordLength;

import java.util.Scanner;

public class Demo {

    //............................................................................//
    public static int lastWordlength(String s){        //function declaration

        int length = 0;

        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i) != ' '){
                length++;
            }
            else {
                break;
            }
        }
        return length;
    }
    //............................................................................//

    public static void main(String[] args) {

        System.out.println("Enter String :- ");

        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();

        int len = lastWordlength(ab);                  //function call

        System.out.println("The Length of last word is :- " + len);

    }

}

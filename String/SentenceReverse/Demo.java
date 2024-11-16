package GithunDSA.String.SentenceReverse;

public class Demo {


    //............................................................................//

    public static String reversentence(String str){

        String st[] = str.split(" ");

        String ab = "";

        for (int i=st.length-1; i>=0; i--)
        {
            if (i == 0)
            {
                ab = ab + st[i];
            }
            else{
                ab = ab + st[i] + " ";
            }
        }
        return ab;

        //............................................................................//
    }

    public static void main(String[] args) {

        String str = "I am Adesh";

        String result = reversentence(str);

        System.out.println(result);

    }
    
}

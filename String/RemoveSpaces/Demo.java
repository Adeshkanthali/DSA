package GithunDSA.String.RemoveSpaces;

public class Demo {

    public static void main(String[] args) {

        String str = " I am Adesh ";

        String result = str.replaceAll("[ ]","");

        System.out.println(result);
    }

}

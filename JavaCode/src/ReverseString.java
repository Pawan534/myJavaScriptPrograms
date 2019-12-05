import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        String myStr = "Pawan Kumar Mohite";
        String myResult = "";

        char mychars[] = myStr.toCharArray();
        System.out.println(mychars);
        for (int i = mychars.length - 1; i >= 0; i--) {
            System.out.println(mychars[i]);
            myResult = myResult + mychars[i];
        }
        System.out.println("My String after reverse: " + myResult);
        System.out.println(Math.round(19.599));
        System.out.println(Math.ceil(19.211));
        System.out.println(Math.floor(19.699));
        System.out.println();
        int t = 10;
    }
}

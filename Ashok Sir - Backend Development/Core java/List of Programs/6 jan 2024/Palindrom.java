
import java.util.*;
public class Palindrom {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter Character");

        String getData = read.next();



        String str = getData;
        String rev = "";



        for (int i = str.length() -1 ; i >= 0 ; i--  ){
               rev += str.charAt(i);
        }

        System.out.println(str);
        System.out.println(rev);


        if(str.equals(rev) ){
            System.out.println("Palindrome ");
        }else {
            System.out.println("Not Palindrome ");
        }

    }
}









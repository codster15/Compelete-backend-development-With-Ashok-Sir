
import java.util.Scanner;
public class CheckPalindromeString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter here ");
         String store = read.nextLine();

        StringBuilder sb = new StringBuilder(store);



        StringBuilder reverseStr = new StringBuilder(store) ;
            reverseStr.reverse();  //storing reversed String in --> reverseStr variable

        System.out.println( "form sb  - " +sb);
        System.out.println(  "for reverseStr  -  " + reverseStr);

        if(sb.toString().equals(reverseStr.toString())){   // here we are checking two strings  are equal or not
            System.out.println("this is palindrome String - " + store);

        }else {
            System.out.println("Not Palindrome - "  + store);
        }

    }
}



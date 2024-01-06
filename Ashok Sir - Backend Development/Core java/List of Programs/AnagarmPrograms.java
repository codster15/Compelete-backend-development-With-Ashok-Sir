
import java.util.*;

public class AnagarmPrograms {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter first String");
        String first = read.next();

        System.out.println("Enter Second String");
        String second = read.next();
        int count = 0;

        for (int i = 0; i < first.length(); i++) {


            for (int j = 0; j < second.length(); j++) {

                if (first.charAt(i) == second.charAt(j)) {


                    count = 0;
                    break;

                } else {
                    count++;
                }

            }

            if (count != 0) {
                System.out.println(count);
                System.out.println(" Not Anagram");
                return;
            }


        }

        if (first.length() == second.length()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }
}
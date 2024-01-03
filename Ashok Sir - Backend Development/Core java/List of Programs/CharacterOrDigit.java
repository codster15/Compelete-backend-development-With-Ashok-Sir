
import java.util.Scanner;
public class CharacterOrDigit {
   public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter any character ");
        char store = read.next().charAt(0);

        if ((store >= 'a' && store <= 'z') || (store >= 'A' && store <= 'Z')) {
            System.out.println(store + " is an alphabet character.");
        } else if (store >= '0' && store <= '9') {
            System.out.println(store + " is a digit.");
        } else {
            System.out.println(store + " is neither an alphabet character nor a digit.");
        }

        read.close();
    }
}



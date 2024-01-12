
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Any Digit Below To get the Sum ");
            int no = read.nextInt();
            int sum  = 0 ;
            while(no > 0){

                int rem = no % 10 ;
                sum += rem ;

               no = no / 10 ;



            }
            System.out.println("Sum of digit - " + sum);
    }
}

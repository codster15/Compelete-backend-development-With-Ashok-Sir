
import java.util.Scanner;
public class MathmaticalTable {

    public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            System.out.println(" Enter the numer to see table ");
                int num = read.nextInt();

                for (int i = 1 ; i <= 10 ; i ++){

                    int table = num *  i ;
                    System.out.println(num + " x " + i + " = " + table );
                }
    }

}

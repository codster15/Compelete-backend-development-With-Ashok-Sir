import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        int a ;
        int b ;
        int sum = 0;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = read.nextInt();

        System.out.print("Enter another number: ");
        int number2 = read.nextInt();

        sum = number + number2;

        System.out.println("The sum is: " + sum);

        read.close();





    }
}

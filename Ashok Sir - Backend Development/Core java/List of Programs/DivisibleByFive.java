
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args){
        int sum ;
            Scanner read = new Scanner(System.in);

            System.out.print("Enter any number - ");
            sum = read.nextInt();

            if(sum % 5 == 0 ){
                System.out.print("Number is completly divisible by 5 = " + sum);
            }else{
                System.out.println("NOt divisible by 5 - "+ sum);
            }
    }
}


import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int no ;
        int count = 0 ;
        Scanner readNo = new Scanner(System.in);

    System.out.print("Enter the number - ");
    no = readNo.nextInt();

    if(no > 1){

        for (int i  = 1 ; i <= no ; i++){
            if(no % i == 0 ){
                count++;

            }

        }
        System.out.println(count);
        if (count == 2){
            System.out.println("This is a prime number");
        }else {
            System.out.println(" Not A prime number ");
        }

    }else{
        System.out.println("Number Cannot be less than zero");
    }


    }

}

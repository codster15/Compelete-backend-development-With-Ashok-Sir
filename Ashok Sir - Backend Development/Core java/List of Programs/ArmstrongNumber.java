
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println(" Enter number " );
        int no = read.nextInt();
        int arm = no ;
        int value = no ;
        int temp ;
        int count = 0 ;
        int StoreNumber = 0;


        while (no > 0){

            int rem = no % 10 ;
            count++ ;

            no  = no / 10 ;




        }

        while(value > 0){
            int rem2 = value % 10 ;


            temp = (int) Math.pow(rem2 , count);
            StoreNumber += temp;



            value = value / 10 ;

        }
        if(StoreNumber == arm){

            System.out.println("this is Armstrong Number - " + StoreNumber);
        }else {


            System.out.println("Not a Armstrong Number - "  + StoreNumber);
        }


    }
}



import java.util.Scanner;
public class PersonAgeSalaryMarriage {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the your age ");
        int age  = read.nextInt();

        int sal ;


        if(age < 30){
            System.out.println(" Enter Your Salary ");
             sal = read.nextInt();

                 if(sal > 100000){
                     System.out.println("Congratulation You are Eligible for Marriage");
                 }else{
                     System.out.println(" You are Not Eligible for Marriage ");
                 }

        }else{
            System.out.println(" You are Not Eligible for Marriage ");
        }



    }
}

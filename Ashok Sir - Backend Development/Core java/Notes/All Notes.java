


=======================================================

                Sum OF Number

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


============================================================

.           OddEven program


import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int store ;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Any Number ");
        store = read.nextInt();


        if(store % 2 == 0){
            System.out.println("this is even number = " + store);

        }else {
            System.out.println("Not a Even number = " + store);
        }
    }
}


=============================================================================

        Divisible By 5

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

============================================================================

                    Day 3

3rd jan 2023

        Prime number



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


-------------------------------------------------------

    program 1       check given charater is alphabet or digit


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
================================================================================

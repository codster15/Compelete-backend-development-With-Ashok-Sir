

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Any Number ");
        int store = read.nextInt();
        int show = store ;

        int fac = 1;
        while(store >= 1){


            fac = fac * store;
            store-- ;


        }
        System.out.println("Factorial of "+ show +" is = " + fac );
    }
}



factorial program

package co.pro.programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int read = sc.nextInt();
        Factorial f = new Factorial();
        f.facto(read);
    }

    void facto(int n ){
        int no = n;



      while(n >= 1){

          n--;

          if(n == 0){
              break;
          }
          no = no*n;

      }

        System.out.println(no);

    }



}
----------------------------------------------------

2nd way
============

public class factorial2ndWay {
    public static void main(String[] args) {

        int fac = 1;

        for (int i = 1; i <= 5 ; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}


----------------------------------------------------------

using recursion -- inteligent code (//Back tracking)



package co.pro.programs;

public class factoUsingRecusion {
    public static void main(String[] args) {




        System.out.println(output(5));

    }


   public static int output(int n){

        if(n == 1){
            return 1;
        }else{
            return n * output(n-1);
        }

    }

}

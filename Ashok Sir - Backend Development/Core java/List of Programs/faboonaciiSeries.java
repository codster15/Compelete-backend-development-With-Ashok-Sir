




//   faboonacci series

import java.util.Scanner;

public class fabbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int read =  sc.nextInt();
       fabbonaci fb = new fabbonaci();
        fb.Faboonacci(read);
    }

    void Faboonacci( int n ){
        int first = 0;
        int second = 1;
        int sum = 0;




        for (int i = 1; i <= n ; i++) {

            sum = first + second;

            System.out.println(sum);
            first = second;
            second = sum;
        }
    }


}

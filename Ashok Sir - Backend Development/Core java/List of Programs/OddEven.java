

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

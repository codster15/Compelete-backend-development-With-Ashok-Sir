
//intersting program


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayValue {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter number");
        int takeValue = read.nextInt();
        int arr []  = new int[takeValue];

        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter array " + "[" + i + "] = " );
            arr [i] = read.nextInt();

        }
        Arrays.sort(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
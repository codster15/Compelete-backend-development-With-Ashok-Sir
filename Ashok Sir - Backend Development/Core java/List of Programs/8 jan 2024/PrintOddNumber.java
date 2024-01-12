

// print odd number in array

public class PrintOddNumber {
    public static void main(String[] args) {

        int arr [] = {23, 45, 67, 34, 78};

        for(int i = 0 ; i < arr.length; i++){

            boolean flag = arr[i] % 2 != 0 ;
                if(flag ){
                    System.out.print( arr[i] + " " );
                }

        }
    }
}
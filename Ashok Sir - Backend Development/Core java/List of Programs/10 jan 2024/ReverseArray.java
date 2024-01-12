import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        ReverseArray obj = new ReverseArray();

        int [] arr = {1,2,3,4,5};

      int a1[] =   obj.reverseArray(arr);

      for(int value : a1 ){
          System.out.print(value + " ");
      }


    }

//    String reverseArray(int [] arr){
//
//        String a = "";
//
//       for(int i = arr.length-1; i >= 0 ; i--){
//           a += arr[i] + " ";
//       }
//
//
//
//        return a;
//
//    }


    int[] reverseArray(int[]  arr){


            int a[] = new int[arr.length];
            int count = 0;

        for(int i = arr.length-1;  i >= 0; i--){
             a[count] = arr[i];   // intelligent line
                count++;
        }
//        for(int value : a ){
//        System.out.print(value + " ");
//    }
        return a;
    }
}


public class PRintCubicValue {
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};

        System.out.print(" original Array - " );
        for(int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i] + " ");

              int cube =  arr[i];
              cube = cube*cube*cube;
              arr[i] = cube;



        }
        System.out.println();

        System.out.print( " Array element cube - " );
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
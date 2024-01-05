public class ReverseArray {
    public static void main(String[] args) {

        int temp = 0;

        int [] arr = {2,5,1,3,7,8};
        for (int test : arr){
            System.out.print(test + " ");
        }



        for(int i=0; i< arr.length /2; i++){

            temp = arr[i];
            arr[i] = arr[arr.length -1 -i ];
            arr[arr.length -1 -i] = temp;


            temp = 0 ;
        }
        System.out.println();



        for (int value : arr){
            System.out.print(value + " ");
        }



    }
}

public class minAndMax {
    public static void main(String[] args) {

        int min = 0;
        int [] arr = {2,5,1,3,7,8,0};
        min  = arr[0];

        int max = 0 ;
        max = arr[0];

        for(int i=1; i< arr.length; i++){


            if(arr[i] < min){
                min = arr[i];

            }

            if(arr[i] > max){
                max = arr[i];

            }


        }
            System.out.println( "mai - "+ min);
            System.out.println( "max - " + max);

    }
}


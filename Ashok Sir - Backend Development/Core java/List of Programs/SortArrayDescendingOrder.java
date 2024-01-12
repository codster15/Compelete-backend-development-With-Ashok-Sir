import java.util.Arrays;

public class SortArrayDescendingOrder {
    public static void main(String[] args) {

        int arr[] = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

            Arrays.sort(arr);

            for(int i = arr.length-1; i >= 0; i-- ){

                System.out.print(arr[i] + " ");
            }

    }
}
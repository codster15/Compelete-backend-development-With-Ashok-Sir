

public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arrNew[] = new int[arr.length];

        for(int i = 0 ; i < arr.length; i++){
            arrNew[i] = arr[i];
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for(int a : arrNew){
            System.out.print(a + " ");
        }
    }

}
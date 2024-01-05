public class SUmOFArray {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,7,8};

        int sumOfArray = 0;



        for(int i=0; i< arr.length; i++){

            sumOfArray += arr[i];

        }
        System.out.println(sumOfArray);
    }
}

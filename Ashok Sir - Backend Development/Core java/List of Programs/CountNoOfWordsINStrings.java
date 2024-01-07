



public class CountNoOfWordsINStrings {
    public static void main(String[] args) {

            String a = "I       Love       Java       Programmming";


            String arr[] = a.split(" ");

//            for(String value : arr){
//                System.out.println(value);
//            }


            int count = 0;
            for(int i = 0 ; i < arr.length ; i++){

//                System.out.println("no - " + i+  "------------"+   arr[i]);
//
                if(arr[i] == ""){
                    continue;
                }else{
                    count++;
                    System.out.print(arr[i] + " ");
                }

            }

        System.out.println();
        System.out.println(count);
    }
}

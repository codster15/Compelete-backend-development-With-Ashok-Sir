


import java.util.Scanner;

public class UseMethodToFIndMAx {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter your name");
        String passNAme = read.next();


//        System.out.println("Enter your name");
//        String passNAme = read.next();





        UseMethodToFIndMAx  obj = new UseMethodToFIndMAx();

//        int max = obj.maxElement(arr);
//        //System.out.println(max);

        int ShowLength = obj.nameLength(passNAme);
        System.out.println(ShowLength);

    }

    int maxElement(int[] arr){
        int maxvalue = 0;
                for(int i = 0; i< arr.length; i++){


                    if(maxvalue < arr[i]){
                        maxvalue = arr[i];
                    }
                }

        return maxvalue;
    }


    int nameLength(String sname){
        char[] arr1 = sname.toCharArray();
        int totallength = arr1.length;

        return totallength;

    }






}


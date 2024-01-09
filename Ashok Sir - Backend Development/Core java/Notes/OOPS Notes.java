




.// ----------------------------------------------------------------         O O P S     C O N C E P T           -------------------------------------------


.                      Day 7 (7 dec 2024)



// OOPS CONCEPT


lec - 31 done

            oops basics
                    Encapsulation 
                    Abstraction
                    Polimorphism
                    Inheritence
            
            CLASS 

            OBJECTS


    just understand the basics of loop  principles


Encapsulation --> is  combination of variables and methods in single identity

Abstraction -- > means hiding-un-necessary data and providing only required data

polymorphism -- behaving accorting to the situation

Inheritence -- > child class using property of parent class

============================================================================================================



.                      Day 8 (8 dec 2024)


// OOPS CONCEPT

        oops concept
        
            -hashcode

        variable
            instance variable
            static variable
            local variable

lec - 32 done








==========================================================================================================



.                      Day 9 (9 dec 2024)



// OOPS CONCEPT
        Methods()-- Introduction



=====================================================================================================




..                      Day 10 (10 dec 2024)    ALL program Using Methods

lec - 34



Program --find the max in array .



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

--------------------------------------------------------------------------------




program  - to concate  string 


public class MethodCalling {
    public static void main(String[] args) {

        MethodCalling obj1 = new MethodCalling();
        String c = "Every one";
       String abc = obj1.msg1(c);
        System.out.println(abc);
//        MethodCalling.msg();
    }

    static void msg (){
        String a = "Hi Every one";
        System.out.println(a);
    }

    String msg1 (String c){
        String b = "Welcome";
        String con = b + " " + c  ;
        return con;
    }
}


-----------------------------------------------------------------------------------------

program -- sum of two number .


public class SumOfTwoNumberUsingMethod {
    public static void main(String[] args) {

        SumOfTwoNumberUsingMethod obj1 = new SumOfTwoNumberUsingMethod();



//    int sum =obj1.SumofNumber(10,20);
//        System.out.println(sum);

            String concatename = obj1.ShowName("Deepak" , "Singh");
        System.out.println(concatename);

    }




    int SumofNumber (int a , int b){

        int equal = a + b;

        return equal;
    }

            String ShowName(String fname , String lname){
                String finalName = fname + " " +  lname;
                return finalName;
            }


}

--------------------------------------------------------------------------------------------


program to checjk person age for vote eligible




public class MEthodAGEforVote {
    public static void main(String[] args) {

        MEthodAGEforVote obj = new MEthodAGEforVote();

        boolean eligible = obj.VoteEligible(17);

        if(eligible){
            System.out.println(" You Are Eligible for Vote ");
        }else{
            System.out.println(" You Are Not Eligible for Vote ");
        }


    }

    boolean VoteEligible(int age) {

        if(age >= 18){

            return true;
        }else{
            return false;
        }
    }


}

---------------------------------------------------------------------------------------------




   ***important program

progarm  -- write  a method to reverse the array



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


    // ----------------------------------------------------------------------
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
// ----------------------------------------------------------------------

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


----------------------------------------------------------------------


wrt a method to convert string to upper case


import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter name");
        String name = read.next();

        Uppercase obj = new Uppercase();
        String upper = obj.convertTOUpperCase(name);

        System.out.println(upper);
    }

    String convertTOUpperCase(String uname){

        String a = uname.toUpperCase();

        return a;
    }

}



===========================================================================================
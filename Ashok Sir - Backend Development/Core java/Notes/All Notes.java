


=======================================================

                Sum OF Number

import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        int a ;
        int b ;
        int sum = 0;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = read.nextInt();

        System.out.print("Enter another number: ");
        int number2 = read.nextInt();

        sum = number + number2;

        System.out.println("The sum is: " + sum);

        read.close();





    }
}


============================================================

.           OddEven program


import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int store ;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Any Number ");
        store = read.nextInt();


        if(store % 2 == 0){
            System.out.println("this is even number = " + store);

        }else {
            System.out.println("Not a Even number = " + store);
        }
    }
}


=============================================================================

        Divisible By 5

        import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args){
        int sum ;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter any number - ");
        sum = read.nextInt();

        if(sum % 5 == 0 ){
            System.out.print("Number is completly divisible by 5 = " + sum);
        }else{
            System.out.println("NOt divisible by 5 - "+ sum);
        }
    }
}

============================================================================

                    Day 3

3rd jan 2023

        Prime number



import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int no ;
        int count = 0 ;
        Scanner readNo = new Scanner(System.in);

        System.out.print("Enter the number - ");
        no = readNo.nextInt();

        if(no > 1){

            for (int i  = 1 ; i <= no ; i++){
                if(no % i == 0 ){
                    count++;

                }

            }
            System.out.println(count);
            if (count == 2){
                System.out.println("This is a prime number");
            }else {
                System.out.println(" Not A prime number ");
            }

        }else{
            System.out.println("Number Cannot be less than zero");
        }


    }

}


-------------------------------------------------------

    program 1       check given charater is alphabet or digit


import java.util.Scanner;
public class CharacterOrDigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter any character ");
        char store = read.next().charAt(0);

        if ((store >= 'a' && store <= 'z') || (store >= 'A' && store <= 'Z')) {
            System.out.println(store + " is an alphabet character.");
        } else if (store >= '0' && store <= '9') {
            System.out.println(store + " is a digit.");
        } else {
            System.out.println(store + " is neither an alphabet character nor a digit.");
        }

        read.close();
    }
}
================================================================================


.               4 Day (4 jan 2024)





program 1

write a brand name based on brand name sologan needs to be printed along with brand name 


   import java.util.Scanner;



    public class SwitchCaseSHowBrandName {
        public static void main(String[] args) {
            Scanner readUser = new Scanner(System.in);
            System.out.println("Enter the Brand Name Here ");
            String store = readUser.next();
            String brandName = store;

            switch (brandName){
                case "nike" :
                    System.out.println("NIke -> Just DO it ");
                    break;

                case "Adidas" :
                    System.out.println(" Impossible is Nothing ");
                    break;

                case "Puma" :
                    System.out.println(" Forever Faster ");
                    break;

                case "Reebok" :
                    System.out.println("NIke -> Just DO it ");
                    break;

                default:
                    System.out.println(" Enter the correct Brand Name ");
            }
        }
    }
    
    -----------------------------------------------------------------------------

    program 2

    calculate pf from basic salry



 import java.util.Scanner;
        public class CalculateBasicSalary {
            public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
                System.out.println(" Enter the basic Salary ");
                    int sal = read.nextInt();
                    int pf = 12 * sal / 100 ;
                    System.out.println( "Provident Fund - " + pf + "Rs Of your basic salary " + sal);
            }
        }
-----------------------------------------------------------


program 3

read preson age and sallry to check marriage eligibilty



import java.util.Scanner;
public class PersonAgeSalaryMarriage {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the your age ");
        int age  = read.nextInt();

        int sal ;


        if(age < 30){
            System.out.println(" Enter Your Salary ");
             sal = read.nextInt();

                 if(sal > 100000){
                     System.out.println("Congratulation You are Eligible for Marriage");
                 }else{
                     System.out.println(" You are Not Eligible for Marriage ");
                 }

        }else{
            System.out.println(" You are Not Eligible for Marriage ");
        }



    }
}
-----------------------------------------------------------

program 4

factorial of given number



import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Any Number ");
        int store = read.nextInt();
        int show = store ;

        int fac = 1;
        while(store >= 1){


            fac = fac * store;
            store-- ;


        }
        System.out.println("Factorial of "+ show +" is = " + fac );
    }
}
------------------------------------------------------=

program 5

table


import java.util.Scanner;
public class MathmaticalTable {

    public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            System.out.println(" Enter the numer to see table ");
                int num = read.nextInt();

                for (int i = 1 ; i <= 10 ; i ++){

                    int table = num *  i ;
                    System.out.println(num + " x " + i + " = " + table );
                }
    }

}
 ----------------------------------------------------

 proghram 6

 print the number 100 to 1

 public class PrintNumber {
    public static void main(String[] args) {

        int num = 100;

        while(num >= 1){
            System.out.println(num);
                num--;
        }
    }
}
 ----------------------------------------------------

 program 7

 sum of digit

 
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Any Digit Below To get the Sum ");
            int no = read.nextInt();
            int sum  = 0 ;
            while(no > 0){

                int rem = no % 10 ;
                sum += rem ;

               no = no / 10 ;



            }
            System.out.println("Sum of digit - " + sum);
    }
}


--------------------------------------------------------

program 8


w r t a program to check Armstrong  Number


import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println(" Enter number " );
        int no = read.nextInt();
        int arm = no ;
        int value = no ;
        int temp ;
        int count = 0 ;
        int StoreNumber = 0;


        while (no > 0){

            int rem = no % 10 ;
            count++ ;

            no  = no / 10 ;




        }

        while(value > 0){
            int rem2 = value % 10 ;


            temp = (int) Math.pow(rem2 , count);
            StoreNumber += temp;



            value = value / 10 ;

        }
        if(StoreNumber == arm){

            System.out.println("this is Armstrong Number - " + StoreNumber);
        }else {


            System.out.println("Not a Armstrong Number - "  + StoreNumber);
        }


    }
}
---------------------------------------------------------

proram 9

print prime number 1 to 100

public class PrimeNumberlist {
    public static void main(String[] args) {


        int no = 1;
        while(no < 100){



            int temp = 0;
            int count = 0;


            for (int i = 1; i <= no ; i++){
                temp = no % i ;

                if(no % i == 0){
                    count++;

                }

            }
            if(count == 2){
                System.out.println(" prime number -----------" + no);
            }




            no++;
        }


    }
}


+++++++++++++++++++++++++++++++++++++++++++++++++++

public class PrintNumber {
    public static void main(String[] args) {

        int num = 100;

        while(num >= 1){
            System.out.println(num);
                num--;
        }
    }
}

--------------------------------------------------------------

program 10

print the paterns 

public class printStart {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++  ){

            for(int j = 1; j <= 5 ; j ++){
               System.out.print( "*  ");

            }
            System.out.println();
        }
    }
}


----------------------------------------------------------


paterns pyramid

public class Piramid {
    public static void main(String[] args) {

int n = 5;
        for(int i=1; i <= n ; i++ ){

               for(int j = 5 ; j >= i; j--){
                   System.out.print("  ");
               }

               for(int a = 0; a < i ; a++ ){
                   System.out.print(" @  ");
               }




          System.out.println();

           }
        }
    }


---------------------------------------------------------------

patern part 2

public class Starpart2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++  ){



            for(int j = 5; j >= i ; j--){


                System.out.print( "  ");


            }
            for(int a = 1; a <= i ; a++){


                System.out.print( " *");


            }

            System.out.println();
        }

    }

}


-----------------------------------------------------------------



 .                    5 Day (5 jan 2024)

  ARRAY

    
    print array elements

        public class printArrayElements {
    public static void main(String[] args) {


        int [] arr = {2,5,1,3,7,8};

        for(int i=0; i< arr.length; i++){

            System.out.println(arr[i]);
        }

    }
}
-------------------------------------------

 print sum of array

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


-------------------------------------

 reverse the given array

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


-------------------------------------

print min and max value from array

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

--------------------------------------------










// .                                     S T R I N G    M E T H O R D















lec 24


//   note - Static method is call by class name 
//          NonStatic method will be called by Object name 


valueOf() ------> to convert int into Array
                    valueOf() = is a Satic method so it will called by Class name; 



startWith() -----> to check given String is starting with particular charcter or not (a)
            String str = "ashok"
            str.startWith("a"); =====> true



endsWith() ----> to check given String is ends with particular charcter or not (k)
                       String str = "ashok"
                       str.endsWith(k);========> true



trim()=====> it is use to remove starting and ending spaces of String
                    String str = "  hello  ";
                    str.trim();=====>"hello"


intern()==> it is used to access the object form scp(String constent pool);

toString()==> it  used to convert any object into string format  

toCharArray() ===> to convert string into array
        String s1 = "java";
        char arr[] = s1.toCharArray();
        output==> [j,a,v,a]


.equals() ==> to compare the content of two strings only 
                (string to string) --> it will  compare
                (string to StringBuilder) --> not compare because String and StringBuilder is not same.




    





===================================================================================================================


.                                               STRING BUFFER
LEC 24

string buffer-- it is mutable means (we can modify the content)
             -- it thread-safe means one person can access at a time


        StringBuffer  sb = new StringBuffer("hello");
        sb.append("hi")
        output==> hello hi ;  // its mutable because its mutable


        ------------------------------------------


        String s1 = "Ashok";
        s1.concat("it")
        output ==> Ashok ; // its not concating reason is its immutable


        ------------------------------------------



======================================================================================================

        .                                   String Program

    
    combine to two String

        public class CombineString {
    public static void main(String[] args) {

        String s1 = "Deepak";
        String s2 = " Singh";
        String combine = s1 + s2; //first way to combine string
        String combine1 = s1.concat(s2);  //second way to combine string
        System.out.println(combine);

    }
}



----------------------------------------------


 reverse a string

    public class ReverseAString {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Deepak");
            str.reverse();
            System.out.println(str);


    }
}


------------------------------------------------



program --->    check given string is palindrome or not 


!important program !


import java.util.Scanner;
public class CheckPalindromeString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter here ");
         String store = read.nextLine();

        StringBuilder sb = new StringBuilder(store);



        StringBuilder reverseStr = new StringBuilder(store) ;
            reverseStr.reverse();  //storing reversed String in --> reverseStr variable

        System.out.println( "form sb  - " +sb);
        System.out.println(  "for reverseStr  -  " + reverseStr);

        if(sb.toString().equals(reverseStr.toString())){   // here we are checking two strings  are equal or not
            System.out.println("this is palindrome String - " + store);

        }else {
            System.out.println("Not Palindrome - "  + store);
        }

    }
}




==============================================================================


.                                 6 dec 2024                                                    !  motivation --> 27 lec time -42:00

reverse string

        

public class stringPrograms {
    public static void main(String[] args) {

        String s = "java";
        int count  = 0;

        for(int i=0; i < s.length(); i++){

            char show = s.charAt(i);


            if(show == 'a'){
                count++;
            }

        }
        System.out.println();
        System.out.println("total occurence of a is = " + count);
    }
}


--------------------------------------------------------------------------



program --- reverse the String




import java.util.*;
public class Palindrom {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter Character");

        String getData = read.next();



        String str = getData;
        String rev = "";

        

        for (int i = str.length() -1 ; i >= 0 ; i--  ){
               rev += str.charAt(i);
        }

        System.out.println(str);
        System.out.println(rev);


        if(str.equals(rev) ){
            System.out.println("Palindrome ");
        }else {
            System.out.println("Not Palindrome ");
        }

    }
}


----------------------------------------------------


.                               Anagram program First way

progra -- wrt java program given two string are anagrams are not 

ex- keep & peek ==> Anagram



import java.util.*;

public class AnagarmPrograms {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter first String");
        String first = read.next();

        System.out.println("Enter Second String");
        String second = read.next();
        int count = 0;
      
        for (int i = 0; i < first.length(); i++) {


            for (int j = 0; j < second.length(); j++) {

                if (first.charAt(i) == second.charAt(j)) {


                    count = 0;
                    break;

                } else {
                    count++;
                }

            }

            if (count != 0) {
                System.out.println(count);
                System.out.println(" Not Anagram");
                return;
            }


        }

        if (first.length() == second.length()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }
}

-------------------------------------------------------

.                               Anagram program Second way

progra -- wrt java program given two string are anagrams are not 




import java.util.*;

public class AnagramSecondWay {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter first String");
        String s1 = read.next();

        System.out.println("Enter Second String");
        String s2 = read.next();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean flag = Arrays.equals(c1,c2);

        if(flag){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }


    }
}


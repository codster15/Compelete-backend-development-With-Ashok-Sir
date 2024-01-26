    
    .                                 -->    day 23  (23 - 1 - 2024)



.                                                 C O R E   J A V A



lec -49


                packages
                Exception handling stared



programm
=========



package com.oracle;

public class engine {

    public void start(){
        System.out.println("engine start");
    }
}

------------------
package com.ibm;

import com.oracle.engine;

public class car {


    public static void main(String[] args) {
        engine e = new engine();
        e.start();
    }
}

------------------------------------------------------------------------------------------------------------


    
    .                                 -->    day 24  (24 - 1 - 2024)



.                                                 C O R E   J A V A



lec -51



        exception handling 
        //try
        //catch
        //finally
        //throw
        //throws


programm
==========


throws
========
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test2 {
    public static void main(String[] args) throws FileNotFoundException , ClassNotFoundException { // insted of this we these two we can give --> Exception only all checked Exception will get ignored
        FileReader fr = new FileReader("abc.txt");
          Class.forName("");      
    }
}
----------------------------------------------------------------

public class test {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("this line will not be executed");
        }catch (ArithmeticException e){
            System.out.println("Catch block : divided by zero");

        }finally {
            System.out.println("I am from  finnally no one can stop me to to execute");
        }
        System.out.println("After execution is handled");
      
    }
}


-----------------------------------------------------------------------------------------------     


    
    .                                 -->    day 25  (25 - 1 - 2024)



.                                                 C O R E   J A V A



lec -52

                Exception handling completed
                

program
========

package com.deepak;

public class demo {
    // -----------------------------------------------------      method  1
    void m2(int a , int b){
        System.out.println("m2() - method  started");
      int c = a / b;
        System.out.println( " result - "+c);
        System.out.println("m2() - method  Ended");
// ---------------------------------------------------------     method  2

    }    void m1(int a , int b){
        System.out.println("m1() - method  started");
        m2(a, b );
        System.out.println("m1() - method  Ended");

    }
// --------------------------------------------------------      Main  method  
    public static void main(String[] args) {

        System.out.println("main () - Started");

        try{
            demo d = new demo();
            d.m1(10 , 0);
        }catch (Exception e){

            System.err.println(e);
        }

        System.out.println("main () - ended");
    }
}

---------------------------------------------------------------------------------------------


.                                                   Very Important Program 
.                                                ==============================

program - creating User defined exception
==========================================

// ---------------------------------------------------------------------------------  Separate class 
package com.deepak;

public class InvalidNumberException extends Exception {
    InvalidNumberException(String msg){
        super (msg);

    }
}

--------------------------------------------------------------------------------------

package com.deepak;

public class demo {
    void m2(int a , int b) throws Exception{  //  here we are passing the throws Exception to ignore compile time Exception  and now jvm will look who call this m2 method
        System.out.println("m2() - method  started");
        try{
            int c = a / b;
            System.out.println( " result - "+c);
        }catch(Exception e){
            throw new InvalidNumberException("invalid number");  // i am creating the Exception so compiler  will give waring for that exception .now we have to handle the exception by Passing
            // throws
            // keyword in method
          //  throw new InvalidNumberException("invalid number"); --> here  we are creating the user defined Exception  -- By taking another class of
            //-----------------------------------------------------------------
            //  package com.deepak;
            //
            //public class InvalidNumberException extends Exception {
            //    InvalidNumberException(String msg){
            //        super (msg); // passing the parameter to super class means passing to Exception class constructor   => Msg
            //
            //    }
            //}

            //------------------------------------------------------------

            // this is how we are creating the user defined Exception

        }


        System.out.println("m2() - method  Ended");

    }    void m1(int a , int b) throws Exception{ // now here jvm will check Is m1 method handling the exception or Ignoring  the Exception . So here we are ignoring the exception by passing throws
        // keyword . So now jvm will check who called the mi method
        System.out.println("m1() - method  started");
        m2(a, b );
        System.out.println("m1() - method  Ended");

    }

    public static void main(String[] args) {

        System.out.println("main () - Started");
// now here jvm will check the excetion occured in the m1 .So main method is handling the Exception or not .So finnal main method is handling the Exception
        try{
            demo d = new demo();
            d.m1(10 , 0);
        }catch (Exception e){ // the msg we pass ==>  throw new InvalidNumberException("invalid number"); that will be store in  ( e )  object of Exception class

            System.err.println(e);
        }

        System.out.println("main () - ended");
    }
}




--------------------------------------------------------------------------------------------------------------------



    
    .                                 -->    day 26  (26 - 1 - 2024)



.                                                 C O R E   J A V A



lec -53



program
=========

---------------------------------------------    without static Import  ----------------------------
package com.ibm.adhar;

public class test {

    public static void speak(){
        System.out.println("Hi i am deepak");
    }
    public static void m1(){
        System.out.println("m1() method called");
    }
    public static void m2(){
        System.out.println("m2() method called");
    }


}
-------------------------------------------------------


package com.demo;
import com.ibm.adhar.test;
public class user {
    public static void main(String[] args) {
        test.speak();
        test.m1();
        test.m2();

    }
}

--------------------------------------------





//                                                                         with using  static Import

package com.ibm.adhar;

public class test {

    public static void speak(){
        System.out.println("Hi i am deepak");
    }
    public static void m1(){
        System.out.println("m1() method called");
    }
    public static void m2(){
        System.out.println("m2() method called");
    }


}
-----------------------------------------------------

package com.demo;
import static com.ibm.adhar.test.*;  // static keywod used
public class user {
    public static void main(String[] args) {
        speak();       // method called withoud class name 
        
        m1();          // method called withoud class name 

        m2();         // method called withoud class name 

    }
}
=============================================================================================================







.                                                                       Variable arguments --> beautiful concept - 1.5v 


when to go with variable arguments ?
Ans ==> //when we don't know how many parameter to take for the a method then we can use var-args


note -  only 3 dots allowed
     -  variable arguments should be the last arguments of the method 
     -  method should contain only one  variable arguments perameter


valid
// syntax -- public int add (int... x){

// }
Invalid
// syntax -- public int add (int... x ,string b){

// }

valid
// syntax -- public int add (string b , int... x ){

// }

public int add (int b , String... x )        // valid
public int add (string b , int... x )        //valid
public int add (string b , boolean... x )    //valid
public int add (string... x , int j )    //Invalid because var-args Should be last
 public int add (string b , int... z )    //valid


 



-----------------------------------------------------------------------------------------------


     package com.demo;

public class user {

    public void calculator(int... a){


        int sum = 0;
        for (int x : a){
            sum += x;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        user u = new user();
        u.calculator(10,20);
        u.calculator(10,20,30);
        u.calculator(10,20,50,60);

//        int a[] = {2,4,6,1,7};
//
//
//        for(int x : a){
//            System.out.println(x);
//
//        }




    }
}
-----------------------------------------------------------------------------------------



.                           wrapper class --> concept



program
=========




package com.demo;

public class wrapperclass {
    public static void main(String[] args) {
        int a = 10;

        Integer i = new Integer(a); // boxing // here we are converting primitive data type into object formate this process is called as wrapper class
        System.out.println(i);

        String c = "120";
        Integer q = new Integer(c); // boxing // here we are converting primitive data type into object formate this process is called as wrapper class
        System.out.println(q);
    }


}
--------------------------------------------------------------------------------------
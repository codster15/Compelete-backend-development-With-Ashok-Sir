    
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




    
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
                


---------------------------------------------------------------------------------------------
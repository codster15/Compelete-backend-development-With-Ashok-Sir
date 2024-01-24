    
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
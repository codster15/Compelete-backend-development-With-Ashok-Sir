
.                                             Muti threading  covering



    
    .                                 -->    day 29  (29 - 1 - 2024)



.                                                 C O R E   J A V A



lec -59


        Muti threading



-------------------------------------------------------------------------------------------------------





    
    .                                 -->    day 30  (30 - 1 - 2024)



.                                                 C O R E   J A V A



lec -60


        Muti threading


        program  -- > using thread class extends
        ========

-----------------------------------------------------------------

        package date31jan_2024;

public class pro1 extends Thread {

    public void run(){
        System.out.println("run() - executed");
        try{
            Thread.sleep(3000);

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("execution ended");
    }

    public static void main(String[] args) {
        pro1 p = new pro1();
        Thread t = new Thread(p);
            t.start();
    }
}
--------------------------------------------------------------------------------

using interface  -- > runable




package date31jan_2024;

public class pro1 implements Runnable {

    public void run(){
        System.out.println("run() - executed");
        try{
            Thread.sleep(3000);

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("execution ended");
    }

    public static void main(String[] args) {
        pro1 p = new pro1();
        Thread t = new Thread(p);
            t.start();
    }
}
--------------------------------------------------------------

    MOST at reccommaned way to is to create thread is -->  using callable interface 



    package date31jan_2024;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class pro1 implements Callable {

    public Object call() {
        System.out.println("run() - executed");


        return "hi";
    }

    public static void main(String[] args) {
        pro1 p = new pro1();
        ExecutorService es = Executors.newFixedThreadPool(5);


        for (int i = 0; i <=30 ; i++) {
            es.submit(p);

        }
        es.shutdown();

    }
}


        



--------------------------------------------------------------------------------------------------------




    
    .                                 -->    day 31  (31 - 1 - 2024)



.                                                 C O R E   J A V A



lec -61


        Muti threading






--------------------------------------------------------------------------------------------------------
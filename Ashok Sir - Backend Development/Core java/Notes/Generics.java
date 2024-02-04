

=========
generics
==========

public class demo<t>{

    t obj;
        void m1 (t obj){
            this.obj = obj;
        }
        t pass(){
           return obj;
        }



    public static void main(String[] args) {
//        demo<Integer> d = new demo<>();
//        d.m1(23 );
//        System.out.println(d.pass());

        demo<String> d1 = new demo<>();
       d1.m1("hello every one");
        System.out.println(d1.pass());
    }


}
----------------------------------------------------------------------



public class temp<t1 ,t2> {
    t1 obj1;
    t2 obj2;

    temp(t1 obj1 , t2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;

    }

    void print (){
        System.out.println(obj1 + " , " + obj2);

    }

    public static void main(String[] args) {
            temp <Integer , String> t = new temp<>(34 , "hello every one");
            t.print();

        System.out.println("------------------     Method 1 ----------------------");


        temp < String , Integer> t1 = new temp<>( "hello every one" , 34344);
        t1.print();

        System.out.println("------------------     Method 1 ----------------------");


        temp < String , Boolean> t2 = new temp<>( "hello every one" , false);
        t2.print();
    }




}


---------------------------------------------------------------------------------------------------------------------




























==============
enam program
==============

package in.enampack1;


    public enum Course{
        java , Python, DEVEOPS , DOCKER , KUBERNETES;
    }


-----------------------------------------

package in.EnamPack2;

import in.enampack1.Course;

public class enam2 {

        public enum WEEKEND{
            SATURDAY , SUNDAY;
        }

        public static void main(String[] args) {
             Course val[] =  Course.values();

             for(Course c : val){
                 System.out.println(c);
             }

        }
    }


------------------------------------------------------------------------------------------------------------------







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



.                      Day 10 (10 dec 2024)


 ->   core java 
 lec - 35



 wrt the method to print data available in the object



public class PassObj {
    public static void main(String[] args) {

        PassObj a = new PassObj();

        Student b = new Student();
        b.id = 211221;
        b.name = "Deepak";

        a.print(b);


    }
//---------------------- Method ----------------------------
    void print(Student b){
        System.out.println("Student Id - " + b.id);
        System.out.println("Student Name - " + b.name);
    }
}

class Student{
    int id ;
    String name;
}


---------------------------------------------------------------------------------

.                               Program 


problem - 

    //take emp class with id and salary as properties
    //Take driver class and write the method to print emp object data
    //call the print method from the main method





public class Driver {
    public static void main(String[] args) {


        employee a = new employee();     // creating object
        Driver d = new Driver();        // creating object

        a.id = 232443;                // assigning the value to id using object name --> a
        a.Salary = "Rs-56000";       // assigning the value to Salary using object name --> a


        d.PrintEmpData(a); // calling method using object name --> d


    }

// creating function
    void PrintEmpData(employee a){
        System.out.println("Employee id - " + a.id);
        System.out.println("Employee id - " + a.Salary);
        System.out.println("Program Sucessfull");
    }
}

//   creating seprate class
class employee{
    int id ;
    String Salary;
}



---------------------------------------------------------------------------------

.                                       Program 

-->      //take Product class with productID , productName , productPrice 
        //create Driver class with print() method to print product data


        



class Product {        // creating class
    int ProductId;                      // instance variable
    String ProductName;                 // instance variable
    String Price;                       // instance variable
}


//-------------------------------------------------------------------------------------------------------------



public class Driver1 {
    public static void main(String[] args) {

        Driver1 d = new Driver1(); // creating the object from the (Driver class) and storing in --> d (Variable)

        Product p = new Product();   // creating the object from the (Product class) and storing in --> p (Variable)
        p.ProductId = 8767232;      // assigning the  value to instance variable of product class
        p.ProductName = "Nirma";   // assigning the  value to instance variable of product class
        p.Price = "Rs-250000";      // assigning the  value to instance variable of product class

        d.PrintProduct(p); // --> calling method using object name-->  d
    }

//----------------------------------------------------------------------------------------------------------------

    void PrintProduct(Product p){   // creating method to print the data and passing object
        System.out.println("Product id - " + p.ProductId);
        System.out.println("Product id - " + p.ProductName);
        System.out.println("Product id - " + p.Price);
    }
}


---------------------------------------------------------------------------



.                      Day 11 (11 dec 2024)


 ->   core java 
 lec - 36






==> write a java method which will give person object with data .




// important program i did this program at once  (Intelligent program )

public class methodReturnObject {
    public static void main(String[] args) {
        methodReturnObject mrb = new methodReturnObject();

        person p = new person(); // object creation

       person store =  mrb.dataReturn(p);  //calling dataReturn (method) using mrb --> object and storing into Store variable as an object

        System.out.println(" Person age - " + store.age);
        System.out.println(" Person id - " +store.id);
        System.out.println( " Person name - " + store.name);
        System.out.println( " Person salary - " + store.salary);

    }

    person dataReturn(person p){         // passing object as person p  and take return type as object
        p.age = 25;                     // assiging the value to instance variable
        p.id = 324234;
        p.name = "Ashok";
        p.salary = "Rs-23000";

        return  p;                           // returning object 
    }

    //----------------------------------------------------------  person classs   -----------------------------
}

class person{   // creating class
    int id ;
    int age;
    String name;

    String salary;

}

---------------------------------------------------------------------------------------------------




==> // write a java method to return College data (id , name)





// ==> write a java method to return College data (id , name)

public class collegeDataReturn {
    public static void main(String[] args) {
        collegeDataReturn cdr = new collegeDataReturn(); //object creation
            College store  =   cdr.dataReturn();         //calling method dataReturn with the help of cdr object  and storing in new --> (store) object with college datatype

        System.out.println("id - " + store.id);
        System.out.println("name - " + store.name);
    }

    College dataReturn (){                    // return type is object --> College
        College c = new College();             //object creation
        c.id = 32323;                   //assigne  value
        c.name = "John";

        return c;                        //returning object --> c
    }

}

class College{                            // class creation
    int id;
    String name;
}



=============================================================================================

logical program

==>     Raju data ( 101 , Raju , 30)
        Rani data ( 102 , rani , 32)

        write a java method which will  take id as input .Based on id return person data

--------------------------------------
// beautiful program id



        import java.util.Scanner;

public class BasedOnIDReturnData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entyer id - " );

        int eId = sc.nextInt();



        BasedOnIDReturnData brd = new BasedOnIDReturnData();

        if(eId == 101){
           Raju ShowRaju =  brd.rajuData();
            System.out.println( "Raju age - "+ ShowRaju.age);
            System.out.println("Raju id - " + ShowRaju.id);
            System.out.println(  "Raju name - "+ ShowRaju.name);

        }else if(eId == 102){
            Rani ShowRani =brd.raniData();
            System.out.println( "Rani age - "+ ShowRani.age);
            System.out.println("Rani id - " + ShowRani.id);
            System.out.println(  "Rani name - "+ ShowRani.name);
        }else{
            System.out.println("Enter the correct id ");
        }


    }

    Raju rajuData (){
        Raju rj = new Raju();

        return rj;
    }


    Rani raniData (){
        Rani rn = new Rani();
        return rn;
    }




}

class Raju{
    int id = 101;
    String name = "Raju";

    int age = 30;


}class Rani{
    int id = 102;
    String name = "Rani";

    int age = 32;


}



--------------------------------------------------------------------------------------

.                       2nd way to do above program








public class RaniRajuPart2 {
    public static void main(String[] args) {

      RaniRajuPart2 rrp = new RaniRajuPart2();


      persons str = rrp.showOne(102);
        System.out.println(str.name);
        System.out.println(str.id);
        System.out.println(str.age);


    }
    persons showOne(int id) {
        if (id == 101) {
            persons rj = new persons();
            rj.age = 30;
            rj.name = "Raju";
            rj.id = 101;
            return rj;

        } else  {
            persons rn = new persons();
            rn.id = 102;
            rn.name = "Rani";
            rn.age = 32;
            return rn;

        }

    }



}




class persons {
    int id;
    String name;

    int age;
}

-------------------------------------------------------------------------------------

.                              3nd way to do above program






public class RaniRajuPart3 {
    public static void main(String[] args) {

        RaniRajuPart3 rrp = new RaniRajuPart3();


        persons1 str = rrp.showOne(102);
        System.out.println(str.name);
        System.out.println(str.id);
        System.out.println(str.age);


    }
    persons1 showOne(int id) {
        persons1 p = new persons1();

        if (id == 101) {

            p.age = 30;
            p.name = "Raju";
            p.id = 101;


        } else  {

            p.id = 102;
            p.name = "Rani";
            p.age = 32;


        }
        return p;
    }




}




class persons1 {
    int id;
    String name;

    int age;
}

--------------------------------------------------------------------------------------

logical program

program => write a java method which will return player data based  n player id

player Data --> id , name ,age

7--- > dhoni

18 --> kohali

45 --> rohit sharma





Solution ---> 




//logical program
//
//program => write a java method which will return player data based  n player id
//
//player Data --> id , name ,age
//
//7--- > dhoni
//
//18 --> kohali
//
//45 --> rohit sharma



public class PlayerData {
    public static void main(String[] args) {

        PlayerData pd = new PlayerData();

       player great =  pd.ShowPlayer(7);

        System.out.println(great.name);
        System.out.println(great.age);
        System.out.println(great.id);


    }
    player ShowPlayer (int id){
        player p = new player();


        if(id == 7){
            p.age = 42;
            p.name = "Dhoni";
            p.id = 7;
        } else if (id == 18) {
            p.age = 35;
            p.name = "Kohli";
            p.id = 18;
        }else if(id == 45){
            p.age = 37;
            p.name = "Rohit Sharma";
            p.id = 45;
        }

        return p;
    }
}


class player{
    int age ;
    String name ;

    int id;
}


-------------------------------------------------------------------------------------




.                      Day 12 (12 dec 2024)


 ->   core java 
 lec - 37


===> wrt java method to return university data based id
    101 --) id - 101 name Oxford
    102--)  id - 102 name Stanford
 

 solution
 =========


public class UniversityId {
    public static void main(String[] args) {
        UniversityId uid = new UniversityId();
         University str  = uid.show(102);
        System.out.println(str.id);
        System.out.println(str.UnivName);
    }

    University show (int a){
        University un = new University();
        if(a == 101){
            un.id = 101;
            un.UnivName = " Oxford";
        }else if(a == 102){
            un.id = 102;
            un.UnivName = "Stanford";
        }
        return un;
    }

}


class University  {
    int id ;
    String UnivName;

}



---------------------------------------------------------------------------------

logical program
==> write two java method inside one class 
        1- first method should take to two input parameter as object
        2 -second method sholud return 3 object 


solution
=========
   public class personclass {

    int age ;
    String Name ;

    void m1(){

    }



    personclass[] m2 (){
        personclass p1 = new personclass();
            p1.age = 21;
            p1.Name = "Ram";

        personclass p2 =new personclass();
            p2.age = 31;
            p2.Name = "John";

        personclass p3 = new personclass();
            p3.age = 68;
            p3.Name = "Chaju laal";

            personclass[] arr = {p1,p2,p3};

            return arr;
    }

       public static void main(String[] args) {

        personclass pc = new personclass();

           personclass[] len = pc.m2();

           for(int i = 0 ; i < len.length ; i++){

               personclass a = len[i];  // intelligent line by me

               System.out.println( "Name--> " + a.Name + "    age--> " + a.age);
           }

       }
}


---------------------------------------------------------------------------------



.                      Day 13 (13 dec 2024)


 ->   core java 
 lec - 38

 topics
 =======

        constructor
            types of constructor
            constructor overloading
            this keyword

---------------------------------------------------

lec -39 

topics
=========== 

        access modifier
            public
            private
            protected
            default


============================================================================================



.                                 -->    day 14   (14 - 1 - 2024)



.                                                 C O R E   J A V A



lec -40



topics
=========

getter setter program

(this is Encapsulation concept)



PROGRAM -- 1

getter setter program
(this is Encapsulation concept)



\



//  first classs instancve variables are private  so other classs cant access them directly. we need take the help of getter and setter to make use of the private variable in other classes. 
public class getterSetter {


    private int accNum;
    private String name ;


    public void setAccNum(int accNum){   // using Setter method so that other class can make use of private variable .But they cant"t change the value of private variable .onlu use it 
        this.accNum = accNum;
    }

    public int getAccNum(){   // using getter  method so that other class can make use of private variable .simply call ther get method and use the variable in the classs
        return this.accNum;
    }

//    -----------------------------

    public void setName (String name){
        this.name = name;

    }

    public String getName(){

        return name;
    }



}


// ----------------------------


//class 2

public class testForSetter {


    public static void main(String[] args) {
        getterSetter obj = new getterSetter();  // creating object of gettersetter class to call the method 


        obj.setAccNum(34343);  //setting the value by calling the setter method along with passing the parameter  
        obj.setName("Deepak"); //setting the value by calling the setter method along with passing the parameter  

                    int StudentId = obj.getAccNum(); // fetching the value of private varible with the help of getter method  and storing into StudentId variable
                String Studentname = obj.getName();  // fetching the value of private varible with the help of getter method and storing into Studentname variable


                System.out.println(name);
                System.out.println(Id);


    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------





.                                 -->    day 15   (15 - 1 - 2024)



.                                                 C O R E   J A V A



lec -41


        Inheritence
            
        types of inheritence
        ====================
                - single inheritence
                - multilevel inheritence
                - hierachical inheritence
                - multiple inheritence ( not supporting in java  ! )



                
        

      program---> inheritence
      =========================




      public class user {
    int id ;
    String name ;

}

----------------------------------------------


public class Student extends user {
    int rank;

    void Show (Student s){   // recieving the object 
        System.out.println(s.id);   // printing the data 
        System.out.println(s.name);
        System.out.println(s.rank);
    }

    public static void main(String[] args) {
        Student s = new Student(); //creating child class object
        s.id =12343; // assiging the value to child variable  of parent class
        s.name = "Ashok";
        s.rank = 784683;
        s.Show(s);  // classing the child class method and pass the object as parameter 

    }
}
------------------------------------------------------------------------------------------------------


.                                 -->    day 16   (16 - 1 - 2024)



.                                                 C O R E   J A V A



lec -42


        
         Inheritence

         polymorphism 
                static - compile time polymorphism

------------------------------------------------------------------------------------------------------------

   .                                 -->    day 17   (17 - 1 - 2024)



.                                                 C O R E   J A V A



lec -43


                Polimorphism
                        overloading
                        overriding


------------------------------------------------------------------------------------------------------------


   .                                 -->    day 18   (18 - 1 - 2024)



.                                                 C O R E   J A V A



lec -44



    (DOUBT SESSION)


    some programs i solved for practice 

    

 ----------------------------------------------------------------------------------------------------------

    .                                 -->    day 19   (19 - 1 - 2024)



.                                                 C O R E   J A V A



lec -45

    
        IS-A  relation
        HAS-A relation

        final keyword

        Abstraction 
        Interfaces   



program on Interfaces
===========================


interface

public interface  bank {

    public abstract void balancetranfer();

    public abstract void  checkBalance();

}
-----------------------------------------





hdfc class

public class HDFC implements bank {


    @Override
    public void balancetranfer() {
        System.out.println("hdfc bank balance tranfer");
    }

    @Override
    public void checkBalance() {

        System.out.println("hdfc check balance");
    }

    public static void main(String[] args) {
        HDFC hd = new HDFC();
        hd.balancetranfer();
        hd.checkBalance();
    }
}
------------------------------------------------



axis class

public class AXIS implements bank {

    @Override
    public void balancetranfer() {

        System.out.println("axis balance transfer");
    }

    @Override
    public void checkBalance() {

        System.out.println("axis check balance");

    }

    public static void main(String[] args) {
        AXIS a = new AXIS();
        a.balancetranfer();
        a.checkBalance();
    }
}




----------------------------------------------------------------------------------------------------------




    .                                 -->    day 20   (20 - 1 - 2024)



.                                                 C O R E   J A V A



lec -46


        //interface compeleted 
        abstraction started




---------------------------------------------------------------------------------------------




    
    .                                 -->    day 21   (21 - 1 - 2024)



.                                                 C O R E   J A V A



lec -47


        blocks
        object class started




------------------------------------------------------------------------------------------------
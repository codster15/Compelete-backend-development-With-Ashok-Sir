

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

    person dataReturn(person p){ // passing object as person p  and take return type as object
        p.age = 25; // assiging the value to instance variable
        p.id = 324234;
        p.name = "Ashok";
        p.salary = "Rs-23000";

        return  p;                          // returning object
    }
}

class person{   // creating class
    int id ;
    int age;
    String name;

    String salary;

}
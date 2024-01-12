

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


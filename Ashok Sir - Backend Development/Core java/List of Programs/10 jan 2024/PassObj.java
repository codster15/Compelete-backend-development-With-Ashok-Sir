

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
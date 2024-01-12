

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


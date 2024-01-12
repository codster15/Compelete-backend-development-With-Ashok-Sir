

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


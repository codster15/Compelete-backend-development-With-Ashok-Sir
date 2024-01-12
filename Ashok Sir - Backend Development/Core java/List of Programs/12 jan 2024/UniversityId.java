


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
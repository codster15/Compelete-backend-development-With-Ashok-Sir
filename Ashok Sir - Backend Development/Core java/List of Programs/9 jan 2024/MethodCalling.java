


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
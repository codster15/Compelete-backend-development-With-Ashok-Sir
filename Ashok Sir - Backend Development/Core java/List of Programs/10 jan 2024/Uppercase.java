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
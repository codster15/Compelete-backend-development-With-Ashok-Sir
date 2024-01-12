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
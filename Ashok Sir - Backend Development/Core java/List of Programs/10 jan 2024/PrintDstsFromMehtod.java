



public class PrintDstsFromMehtod {
    public static void main(String[] args) {


            demo obj = new demo();  // creating object from the class


        String sum = obj.SumOFString();     // Storing the return value from (Sum of string) method and storing in sum variable.
        System.out.println(sum);



    }



}


class demo {
    String a = "Hello";
    String b = "brother";
    String SumOFString (){
        String c = a + " " + b ;
        return c;
    }

}
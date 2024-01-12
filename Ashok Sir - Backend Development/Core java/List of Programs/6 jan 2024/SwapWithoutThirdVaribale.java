

public class SwapWithoutThirdVaribale {
    public static void main(String[] args) {



//        String a = "java";
//        String b = "program";




        StringBuilder a1 = new StringBuilder("java");
        StringBuilder b1 = new StringBuilder("program");

        System.out.println( "String a - " + a1);
        System.out.println( "String b - " + b1);

        a1.replace(0 , a1.length() ,"program");
        b1.replace(0 , b1.length() , "java");

        System.out.println();
        System.out.println();

        System.out.println( "String a - " + a1);
        System.out.println( "String b - " + b1);










    }



}
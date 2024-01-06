



    public class SecondWayTOSwap {
        public static void main(String[] args) {


            String a = "java";
            String b = "program";
            System.out.println( "String a - "+ a);
            System.out.println(  "String b - "+ b);

            a = a + b;



            b =  a.substring(0 , a.length() - b.length());
            a = a.substring(4);

            System.out.println();

            System.out.println( "String a - "+ a);
            System.out.println(  "String b - "+ b);


        }
    }
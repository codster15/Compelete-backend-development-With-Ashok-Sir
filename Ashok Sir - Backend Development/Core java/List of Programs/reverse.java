import java.util.Locale;

public class reverse {
    public static void main(String[] args) {

        String a = "jAva";
        String temp = "";
        StringBuilder rev = new StringBuilder(a);

        for(int i = rev.length() -1  ; i >= 0; i--){
            temp += a.charAt(i);

        }

        System.out.println(temp);


//        String a = "hello";
//
//        char arr[] = a.toCharArray();
//
//        for( char value : arr){
//            System.out.println(value);
//        }
//        //System.out.println(arr[1]);


    }
}
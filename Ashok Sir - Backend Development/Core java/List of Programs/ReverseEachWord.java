

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "hello my friend ";
        String arr[] = s.split(" ");
        String x = "";
           for(int i = 0 ; i < arr.length ; i ++){
         x = arr[i];
            StringBuilder sb = new StringBuilder(x);
            sb.reverse();
               System.out.print(sb + " ");
               

           }


    }
}
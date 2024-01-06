import java.util.*;

public class AnagramSecondWay {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter first String");
        String s1 = read.next();

        System.out.println("Enter Second String");
        String s2 = read.next();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean flag = Arrays.equals(c1,c2);

        if(flag){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }


    }
}


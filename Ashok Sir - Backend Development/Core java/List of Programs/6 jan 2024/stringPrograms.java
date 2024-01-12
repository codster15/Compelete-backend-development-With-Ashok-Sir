

public class stringPrograms {
    public static void main(String[] args) {

        String s = "java";
        int count  = 0;

        for(int i=0; i < s.length(); i++){

            char show = s.charAt(i);


            if(show == 'a'){
                count++;
            }

        }
        System.out.println();
        System.out.println("total occurence of a is = " + count);
    }
}

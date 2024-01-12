


public class SumOfTwoNumberUsingMethod {
    public static void main(String[] args) {

        SumOfTwoNumberUsingMethod obj1 = new SumOfTwoNumberUsingMethod();



//    int sum =obj1.SumofNumber(10,20);
//        System.out.println(sum);

            String concatename = obj1.ShowName("Deepak" , "Singh");
        System.out.println(concatename);

    }




    int SumofNumber (int a , int b){

        int equal = a + b;

        return equal;
    }

            String ShowName(String fname , String lname){
                String finalName = fname + " " +  lname;
                return finalName;
            }


}
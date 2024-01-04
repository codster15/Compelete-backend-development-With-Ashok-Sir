public class PrimeNumberlist {
    public static void main(String[] args) {


        int no = 1;
        while(no < 100){



            int temp = 0;
            int count = 0;


            for (int i = 1; i <= no ; i++){
                temp = no % i ;

                if(no % i == 0){
                    count++;

                }

            }
            if(count == 2){
                System.out.println(" prime number -----------" + no);
            }




            no++;
        }


    }
}

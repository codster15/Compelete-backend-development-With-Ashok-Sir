



public class MEthodAGEforVote {
    public static void main(String[] args) {

        MEthodAGEforVote obj = new MEthodAGEforVote();

        boolean eligible = obj.VoteEligible(17);

        if(eligible){
            System.out.println(" You Are Eligible for Vote ");
        }else{
            System.out.println(" You Are Not Eligible for Vote ");
        }


    }

    boolean VoteEligible(int age) {

        if(age >= 18){

            return true;
        }else{
            return false;
        }
    }


}
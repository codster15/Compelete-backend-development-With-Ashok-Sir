public class SwitchProgram {


    public static void main(String[] args) {
        int day = 2;
        String dayName;
        switch (day){

            case 1:
                dayName = "Today is monday";
                break;

            case 2:
                dayName = "Today is Tuesday";
                break;

            case 3:
                dayName = "Today is Wednesday";
                break;

            default:

                dayName = "Invalid day";
                break;
        }
        System.out.println(dayName);
    }
}

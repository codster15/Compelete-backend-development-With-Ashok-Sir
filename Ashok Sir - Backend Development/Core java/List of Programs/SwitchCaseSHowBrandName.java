
   import java.util.Scanner;

    public class SwitchCaseSHowBrandName {
        public static void main(String[] args) {
            Scanner readUser = new Scanner(System.in);
            System.out.println("Enter the Brand Name Here ");
            String store = readUser.next();
            String brandName = store;

            switch (brandName){
                case "nike" :
                    System.out.println("NIke -> Just DO it ");
                    break;

                case "Adidas" :
                    System.out.println(" Impossible is Nothing ");
                    break;

                case "Puma" :
                    System.out.println(" Forever Faster ");
                    break;

                case "Reebok" :
                    System.out.println("NIke -> Just DO it ");
                    break;

                default:
                    System.out.println(" Enter the correct Brand Name ");
            }
        }
    }


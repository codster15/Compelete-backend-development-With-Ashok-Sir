
 import java.util.Scanner;
        public class CalculateBasicSalary {
            public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
                System.out.println(" Enter the basic Salary ");
                    int sal = read.nextInt();
                    int pf = 12 * sal / 100 ;
                    System.out.println( "Provident Fund - " + pf + "Rs Of your basic salary " + sal);
            }
        }

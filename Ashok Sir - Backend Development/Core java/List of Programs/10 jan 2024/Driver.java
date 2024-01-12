


public class Driver {
    public static void main(String[] args) {


        employee a = new employee();     // creating object
        Driver d = new Driver();        // creating object

        a.id = 232443;                // assigning the value to id using object name --> a
        a.Salary = "Rs-56000";       // assigning the value to Salary using object name --> a


        d.PrintEmpData(a); // calling method using object name --> d


    }

// creating function
    void PrintEmpData(employee a){
        System.out.println("Employee id - " + a.id);
        System.out.println("Employee id - " + a.Salary);
        System.out.println("Program Sucessfull");
    }
}

//   creating seprate class
class employee{
    int id ;
    String Salary;
}
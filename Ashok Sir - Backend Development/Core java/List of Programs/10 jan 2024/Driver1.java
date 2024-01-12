

class Product {        // creating class
    int ProductId;                      // instance variable
    String ProductName;                 // instance variable
    String Price;                       // instance variable
}


//-------------------------------------------------------------------------------------------------------------



public class Driver1 {
    public static void main(String[] args) {

        Driver1 d = new Driver1(); // creating the object from the (Driver class) and storing in --> d (Variable)

        Product p = new Product();   // creating the object from the (Product class) and storing in --> p (Variable)
        p.ProductId = 8767232;      // assigning the  value to instance variable of product class
        p.ProductName = "Nirma";   // assigning the  value to instance variable of product class
        p.Price = "Rs-250000";      // assigning the  value to instance variable of product class

        d.PrintProduct(p); // --> calling method using object name-->  d
    }

//----------------------------------------------------------------------------------------------------------------

    void PrintProduct(Product p){   // creating method to print the data and passing object
        System.out.println("Product id - " + p.ProductId);
        System.out.println("Product id - " + p.ProductName);
        System.out.println("Product id - " + p.Price);
    }
}

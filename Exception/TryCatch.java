import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        /*
        System.out.println("Start");
        try {
            int a = 1/0;
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        finally {   //this block will always execute no matter what happens in try or catch block
            
            System.out.println("Finally");
        }
        System.out.println("End");
        */

        // System.out.println("Start");
        // try {
        //     int a = 1/0;
        // } finally {   //this block will always execute no matter what happens in try or catch block   
        //     System.out.println("Finally");
        // }
        // System.out.println("End");

        // System.out.println("Start");
        // try {
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int c = 1/0;
        // } catch(InputMismatchException e) {
        //     System.out.println("Exception: " + e);
        // } catch(ArithmeticException e) {
        //     System.out.println("Exception: " + e);
        // }
        // System.out.println("End");

        //try with resources
        // System.out.println("Start");
        // try(Scanner sc = new Scanner(System.in)) {  //using this we don't need to close the scanner object, we can only allocate resources like scanner, file, etc.
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int c = 1/0;
        // } catch(InputMismatchException e) {
        //     System.out.println("Exception: " + e);
        // } catch(ArithmeticException e) {
        //     System.out.println("Exception: " + e);
        // }
        // System.out.println("End");

        // System.out.println("Start");
        // try {
        //     TryCatch tc = new TryCatch();
        //     tc = null;  //now, the object is eligible for garbage collection
        //     System.gc();    //garbage collector
        //     System.out.println("End");
        // } catch(Exception e) {
        //     System.out.println("Exception: " + e.getMessage());
        // } finally {
        //     System.out.println("Finally");
        // }
        // System.out.println("End");

        System.out.println("Start");
        try {
            MyException me = new MyException();

            if(me != null) {
                throw me;   //throw is used to throw an exception
            }
        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");

    }

    @Override
    protected void finalize() throws Throwable {    //throws is used to throw an exception
        System.out.println("Finalize method called");
    }
}

class MyException extends Exception {
    public MyException() {
        super("Exception is raised");
    }
}
/*
InputMismatchException: occurs when the user enters a token that is not valid or when the user enters a value outside the range for the specified data type.

ArithmeticException: occurs when an exceptional arithmetic condition has occurred. For example, an integer "divide by zero" throws an instance of this class.


1. try catch block
2. try catch finally block
3. try finally block
4. try with resources
5. try with multiple catch blocks
6. finalize method
7. throw, throws (custom exception)


Tasks:

1. Online Shopping Cart:
   - Scenario: In an online shopping application, a customer tries to add a product to their cart, but the product is out of stock.
   - Exception: Create a custom "OutOfStockException" and handle it when adding items to the cart.

2. Bank Account Transactions:
   - Scenario: A customer attempts to withdraw more money from their bank account than the available balance.
   - Exception: Implement exception handling to catch and handle the "InsufficientFundsException."

3. GPS Navigation:
   - Scenario: A GPS navigation system is calculating the route between two points, but due to network issues, it cannot retrieve map data.
   - Exception: Handle a "NoMapDataException" when attempting to fetch map data.

4. Flight Booking:
   - Scenario: During flight booking, the user provides an invalid passport number, such as one with incorrect formatting.
   - Exception: Implement exception handling for "InvalidPassportNumberException."

5. Medical Records System:
   - Scenario: A medical records system is storing patient data, but a network interruption occurs while saving data.
   - Exception: Handle a "DataStorageException" when data cannot be saved due to network issues.

6. Weather Forecasting:
   - Scenario: A weather forecasting application encounters a data parsing error when retrieving weather data from an external source.
   - Exception: Implement exception handling for "DataParsingException."

7. Online Registration:
   - Scenario: During user registration on a website, the user tries to register with an email address that is already in use.
   - Exception: Handle a "DuplicateEmailException."

8. Inventory Management:
   - Scenario: In an inventory management system, an employee attempts to add a product with a negative quantity.
   - Exception: Implement exception handling for "NegativeQuantityException."

9. Restaurant Reservation:
   - Scenario: When making a restaurant reservation online, the system encounters a database connection error.
   - Exception: Handle a "DatabaseConnectionException."

10. Social Media Posting:
    - Scenario: A user tries to post a message on a social media platform, but the message exceeds the character limit.
    - Exception: Implement exception handling for "MessageTooLongException."

*/
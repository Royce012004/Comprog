package ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("This program will perform basic arithmetic operations.");
        try{
            System.out.print("Please Enter the first number: ");
            a = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid Number...");
        }try{
            System.out.print("Please Enter the first number: ");
            a = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid Number...");
        }
        System.out.println("Choose the operation: ");
        System.out.println("1. Division");
        System.out.println("2. Addition");
        System.out.println("3. Subtraction");
        System.out.println("4. Multiplication");
        System.out.print("Enter your choice: ");
        switch (sc.nextInt()) {
            case 1:
            try {
                c = a / b;
                System.out.println("The Quotient: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed.");
            }finally{
                System.out.println("Thank you for using this program.");
                System.out.println("Rerun to perform another operation.");
            }
            sc.close();
                break;
            case 2:
            try{
                c = a + b;
                System.out.println("The Sum: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Addition is not allowed.");
            }finally{
                System.out.println("Thank you for using this program.");
                System.out.println("Rerun to perform another operation.");
            }
            sc.close();
                break;
            case 3:
            try{
                c = a - b;
                System.out.println("The Difference: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Subtraction is not allowed.");
            }finally{
                System.out.println("Thank you for using this program.");
                System.out.println("Rerun to perform another operation.");
            }
            sc.close();
                break;
            case 4:
            try{
                c = a * b;
                System.out.println("The Product: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Multiplication is not allowed.");
            }finally{
                System.out.println("Thank you for using this program.");
                System.out.println("Rerun to perform another operation.");
            }
                break;
            default:
            System.out.println("Invalid Input...");
            System.out.println("Rerun to try again.");
            sc.close();
                break;
        }
        System.out.print("The Product is: ");
        System.out.print(c = a*b "n/");
        
    }
}
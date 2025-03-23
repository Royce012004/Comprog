package ExceptionActivity;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Mismatch {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int age = 0;
        String name = "";
            try{
                System.out.print("Enter your age: ");
                age = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
                input.close();
            }
            try{
                System.out.print("Enter your name: ");
                name = input.next();
            } catch (InputMismatchException b){
                System.out.println("Invalid input. Please enter a valid name.");
                input.close();
            }finally{
                System.out.println("Thank you for using this program.");
            }
            System.out.println("You entered: " + age + " and name: " + name);
        }
    }


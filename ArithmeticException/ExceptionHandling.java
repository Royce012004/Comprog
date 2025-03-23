import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int Numerator = 0, Denominator = 0;
        try{
            System.out.print("Enter the Numerator: ");
            Numerator = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please Enter a Valid Integer for the Numerator...");
            input.next();
            return;
        }try{
            int Result = Numerator / Denominator;
            System.out.print(Numerator + " / " + Denominator + " = " + Result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by Zero is not allowed...");
        }
        System.out.println("End of Program...");
    }
}

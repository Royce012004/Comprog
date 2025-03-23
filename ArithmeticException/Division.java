import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Numerator, Denominator;
        float Result;
        System.out.println("Enter the Numerator: ");
        Numerator = input.nextInt();
        System.out.println("Enter the Denominator: ");
        Denominator = input.nextInt();
        Result = Numerator / Denominator;
        System.out.println(Numerator + " / " + Denominator + " = " + Result);
    }
}

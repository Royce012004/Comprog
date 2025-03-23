package Activity2;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class ArrayIndexOutofBounds {
    public static void main(String[] args) {
        System.out.println("This Program Will Demonstrate ArrayIndexOutOfBoundsException, NoSuchElementException and IndexoutofboundsException.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite number: ");
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (NoSuchElementException e) {
            System.out.println("No such element exception caught: ");
            scanner.close();
        }finally {
            System.out.println("Thank you for inputting your favourite number.");
        }
        System.out.println("Choose your favourite name from the list: ");
        System.out.println("0. John");
        System.out.println("1. Basty");
        System.out.println("2. Royce");
        System.out.println("3. Kniel");
        System.out.println("Enter the index of your favourite name: ");
        String[] names = {"John", "Basty", "Royce", "Kniel"};
        try {
            int index = scanner.nextInt();
            System.out.println("Your favourite name is: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception caught: ");
            scanner.close();
        }  catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception caught: ");
        } finally {
            System.out.println("Thank you for choosing your favourite name.");
        }
    }
}

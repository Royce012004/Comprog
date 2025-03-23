import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMaker{
    public static void main(String[] args){
        System.out.println("Welcome to FileMaker...");
        System.out.println("Please enter what Do you wanna Do? (create/delete/read)");
        Scanner Scanner = new Scanner(System.in);
        String choose = Scanner.nextLine();
        switch(choose){
            case "create":
            System.out.println("Creating a file...");
            try{
                System.out.println("Enter Your File Name: ");
                Scanner scanner = new Scanner(System.in);
                String fileName = scanner.nextLine();
                File file = new File(fileName);
                if (file.createNewFile()) {
                    System.out.println("You have created a file...");
                    System.out.println("Enter the content of the file: ");
                    String content = scanner.nextLine();
                    FileWriter writer = new FileWriter(file);
                    writer.write(content);
                    System.out.println("Content written successfully...");
                    writer.close();
                } else {
                    System.out.println("File already exists...");
                }
                scanner.close();
        }catch(IOException e){
            System.err.println("An error occurred..." + e.getMessage());
        }
                break;
            case "read":
            System.out.println("Enter your file name to read: ");
            Scanner scannerread = new Scanner(System.in);
            String fileNameread = scannerread.nextLine();
            File fileread = new File(fileNameread);
            System.out.println("Reading the file...");
            try{
                Scanner fileReader = new Scanner(fileread);
                while(fileReader.hasNextLine()){
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }
                fileReader.close();
            }catch(IOException e){
                System.err.println("An error occurred..." + e.getMessage());
            }
                break;
            case "delete":
            System.out.println("Enter your file name to delete: ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            File file = new File(fileName);
            if(file.delete()){
                System.out.println("File deleted successfully...");
            }else{
                System.out.println("File does not exist...");
            }
                break;
            default:
                System.out.println("Invalid command...");
        }
}
}

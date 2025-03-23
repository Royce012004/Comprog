import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
public class FileRetriever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        System.out.println("Choose an option: ");
        System.out.println("1. Check file and get the absolute path");
        System.out.println("2. Exit");
        int choose = scanner.nextInt();
        switch(choose){
            case 1:
            try {
                File file = new File(fileName);
                if (file.exists()) {
                    System.out.println("File exists");
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getAbsolutePath());
                    System.out.println("File Parent Directory: " + file.getParent());
                    System.out.println("File size: " + file.length() + " bytes");
                    System.out.println("File Creation Time: " + Files.getAttribute(file.toPath(), "creationTime"));
                } else {
                    System.out.println("File does not exist");
                    System.out.println("Creating file...");
                    file.createNewFile();
                    System.out.println("File created successfully");
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getAbsolutePath());
                    System.out.println("File Parent Directory: " + file.getParent());
                    System.out.println("File size: " + file.length() + " bytes");
                    System.out.println("File Creation Time: " + Files.getAttribute(file.toPath(), "creationTime"));
                }
            } catch (IOException e) {
                System.out.println("An error occurred." + e.getMessage());
        }
        break;
        case 2:
           try {
                File file = new File(fileName);
                if (file.exists()) {
                    System.out.println("File exists");
                    System.out.println("Getting The file details...");
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getRelativePath());
                    System.out.println("File Parent Directory: " + file.getParent());
                    System.out.println("File size: " + file.length() + " bytes");
                    System.out.println("File Creation Time: " + Files.getAttribute(file.toPath(), "creationTime"));
                } else {
                    System.out.println("File does not exist");
                    System.out.println("Creating file...");
                    file.createNewFile();
                    System.out.println("File created successfully");
                    System.out.println("Getting The file details...");
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getRelativePath());
                    System.out.println("File Parent Directory: " + file.getParent());
                    System.out.println("File size: " + file.length() + " bytes");
                    System.out.println("File Creation Time: " + Files.getAttribute(file.toPath(), "creationTime"));
                }
            } catch (IOException e) {
                System.out.println("An error occurred." + e.getMessage());
        }
        default:
                System.out.println("Invalid option");
                break;
        }
}
}

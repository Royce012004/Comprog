import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
public class DeleteFileExample {
    public static void main(String[] args) {
     Path pathToDelete = Paths.get("C:\\Users\\titen\\Desktop\\New folder");
        try{
            if(Files.exists(pathToDelete)){
                if(Files.exists(pathToDelete)){
                    Files.delete(pathToDelete);
                    System.out.println("File deleted successfully...");
                }else {
                    System.out.println("File does not exist...");
                }
            }
        }catch(IOException e){
            System.err.println("An error occurred..." + e.getMessage());
        }
    }
}

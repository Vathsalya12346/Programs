import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileSearcher {

    
    public static boolean fileContainsString(File file, String searchString) {
        try {
            
            String content = new String(Files.readAllBytes(file.toPath()));

            
            return content.contains(searchString);
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName() + " - " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the directory path: ");
        String dirPath = scanner.nextLine();

        
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        
        File dir = new File(dirPath);

        
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("The specified directory does not exist or is not a directory.");
            return;
        }

       
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in the directory.");
            return;
        }

         
        boolean found = false;
        for (File file : files) {
            if (file.isFile() && fileContainsString(file, searchString)) {
                System.out.println("File containing the string \"" + searchString + "\": " + file.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No files found containing the string \"" + searchString + "\".");
        }

        scanner.close();
    }
}
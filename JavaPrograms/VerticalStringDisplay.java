import java.util.Scanner;

public class VerticalStringDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); 
        
        System.out.println("The string displayed vertically:");
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i)); 
        }
    }
}

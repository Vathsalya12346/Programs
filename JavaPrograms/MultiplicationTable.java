public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 15;
        int length = 10;

        System.out.println("Multiplication Table for " + number + ":");
        System.out.println("--------------------------");

        for (int i = 1; i <= length; i++) {
            System.out.printf("%2d x %2d = %3d%n", number, i, number * i); 
        }
    }
}
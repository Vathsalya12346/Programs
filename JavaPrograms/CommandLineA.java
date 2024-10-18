public class CommandLineA {

    public static void main(String[] args) {
        // Check if at least one argument (num) is passed
        if (args.length < 1) {
            System.out.println("Please provide at least one argument (num).");
            return; // Exit the program if no arguments are provided
        }

        // Parse the first argument as the number
        int num = Integer.parseInt(args[0]);

        // Check if the second argument (length) is provided
        int length;
        if (args.length >= 2) {
            length = Integer.parseInt(args[1]); // Use provided length
        } else {
            length = 10; // Default length value if not provided
        }

        // Display the table of the number 'num' up to 'length'
        System.out.printf("Table of %d with length %d:%n", num, length);
        for (int i = 1; i <= length; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
    }
}

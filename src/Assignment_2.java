public class Assignment_2 {
    public static void main(String[] args) {
        // Adrian Flores Rangel
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number;

        // Infinite loop that will break when the user enters a negative number
        while (true) {
            System.out.print("Enter a positive integer: ");

            // Validation of input int
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next(); // Clear the invalid input
            }

            number = scanner.nextInt();

            // Exit if negative number is entered
            if (number < 0) {
                System.out.println("Negative number entered.");
                break; // Exit loop
            }

            int sum = 0;
            int temp = number;  // Temporary variable

            while (temp > 0) {
                int digit = temp % 10; // Get the last digit
                sum += digit;          // Add the digit to the sum
                temp /= 10;            // Remove the last digit
            }

            System.out.println("The sum of the digits is: " + sum);
        }

        scanner.close();
    }
}

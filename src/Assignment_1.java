public class Assignment_1 {
    public static void main(String[] args) {
        // Adrian Flores Rangel
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println("sum of the first 10 positive integers: "+sum);

        System.out.println("Multiplication Table: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number+"x"+i+"="+(i*number));
        }
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        // Adrian Flores Rangel
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int option;
        double number1,number2 = 0;

        do {
            System.out.println("\nPlease select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            option = scanner.nextInt();

            if (option >=1 && option<= 4){
                System.out.println("Enter First Number");
                number1 = scanner.nextDouble();

                System.out.println("Enter Second Number");
                number2 = scanner.nextDouble();

                switch (option){
                    case 1:
                        System.out.println(number1+"+"+number2+"="+(number1+number2));
                        break;

                    case 2:
                        System.out.println(number1+"-"+number2+"="+(number1-number2));
                        break;

                    case 3:
                        System.out.println(number1+"x"+number2+"="+(number1*number2));
                        break;
                    case 4:
                        if (number2 == 0){
                            System.out.println("Divide by zero no defined");
                        }else {
                            System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
                        }
                        break;
                }

                } else if (option !=5) {
                System.out.println("invalid option select a number between 1 & 5");
            }

        }while (option !=5);
        System.out.println("---Good Bye---");
    }
}

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
      
        if (num1 > num2) {
            System.out.println("The first number (" + num1 + ") is bigger.");
        } else if (num1 < num2) {
            System.out.println("The second number (" + num2 + ") is bigger.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}

import java.util.*;
class randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;
        int sum = num1 + num2;
        System.out.println("Numbers are: " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
    }
}

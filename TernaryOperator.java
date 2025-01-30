public class GreatestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        // Using ternary operator to find the greatest number
        int greatest = (num1 >= num2 && num1 >= num3) ? num1 :
                       (num2 >= num3) ? num2 : num3;

        // Print the result
        System.out.println("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);
    }
}

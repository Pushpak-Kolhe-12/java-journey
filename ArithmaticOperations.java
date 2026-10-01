public class ArithmaticOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Division
        if (num2 != 0)
        {
            int division = num1 / num2;
            System.out.println("The division of " + num1 + " by " + num2 + " is: " + division);
        } 
        else 
        {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class FactorialCalculation {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate the factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

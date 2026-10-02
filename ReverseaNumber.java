public class ReverseaNumber {
    public static void main(String[] args) {
        int number = 12345; // Change this number to reverse a different number
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}

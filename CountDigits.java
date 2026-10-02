public class CountDigits {
    public static void main(String[] args) {
        int number = 12345; // Change this number to count digits of a different number
        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("The number of digits in " + number + " is: " + count);
    }
}

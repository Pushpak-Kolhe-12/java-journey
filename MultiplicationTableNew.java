public class MultiplicationTableNew {
    public static void main(String[] args) {
        int number = 5; // Change this number to generate a different multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
